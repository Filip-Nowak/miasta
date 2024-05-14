package org.example.miasta2;

import org.example.miasta2.entity.Restaurant;
import org.example.miasta2.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Miasta2Application {

	public static void main(String[] args) {
		SpringApplication.run(Miasta2Application.class, args);
	}
	@Bean
	CommandLineRunner init(RestaurantRepository restaurantRepository){
		return args -> {
			restaurantRepository.save(
					Restaurant.builder()
							.name("KEBAB ZAJEBISTY")
							.description("Dojebany kebab w wadowicach")
							.city("wadowice")
							.imageUrl("https://static.zpleszewa.pl/rawicz24/articles/image/a480f168-d3ff-4c2d-a387-1db79b1c5d27")
							.build()
			);
			restaurantRepository.save(
					Restaurant.builder()
							.name("KFC")
							.description("Kurczak na ostro")
							.city("krakow")
							.imageUrl("https://www.freightwaves.com/wp-content/uploads/2018/02/KFC-1.jpg")
							.build()
			);
			restaurantRepository.save(
					Restaurant.builder()
							.name("McDonald")
							.description("Burgery")
							.city("warszawa")
							.imageUrl("https://bi.im-g.pl/im/8a/25/1c/z29515658IEG,Przecietna--wolno-stojaca-restauracja-McDonald-s--.jpg")
							.build()
			);
			restaurantRepository.save(
					Restaurant.builder()
							.name("chinczyk")
							.description("koty, psy i inne przysmaki")
							.city("wadowice")
							.imageUrl("https://th.bing.com/th/id/R.fabcb9776b2c13b87cd17b76b8e0508d?rik=33oDqt0CkPSoFw&riu=http%3a%2f%2fsilesiasmakuje.pl%2fwp-content%2fuploads%2fRestauracja-Chinska.jpg&ehk=C19NNl0MHXSz90d%2f5XKgojovsdfOxSiVRyj1xPLxgT8%3d&risl=&pid=ImgRaw&r=0")
							.build());

		};
	}

}
