package org.example.miasta2.repository;

import org.example.miasta2.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findAllByCity(String city);
}
