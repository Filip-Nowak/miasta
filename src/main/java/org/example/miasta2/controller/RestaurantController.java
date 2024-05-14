package org.example.miasta2.controller;

import lombok.RequiredArgsConstructor;
import org.example.miasta2.entity.Restaurant;
import org.example.miasta2.model.ResponseModel;
import org.example.miasta2.model.Section;
import org.example.miasta2.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantRepository restaurantRepository;
    @GetMapping("/api")
    public ResponseEntity<ResponseModel> getRestaurantsByCity(@RequestParam("miasto") String city) {
        List<Restaurant> restaurants = restaurantRepository.findAllByCity(city);
        ResponseModel model = ResponseModel.builder()
                .header("Restauracje w " + city)
                .sections(new LinkedList<>())
                .build();
        for(Restaurant restaurant : restaurants) {
            model.getSections().add(Section.builder()
                    .text(restaurant.getName()+"\n"+restaurant.getDescription())
                    .image(restaurant.getImageUrl())
                    .build());
        }
        return new ResponseEntity<>(model, org.springframework.http.HttpStatus.OK);
    }

}
