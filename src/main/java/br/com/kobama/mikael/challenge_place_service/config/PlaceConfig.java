package br.com.kobama.mikael.challenge_place_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.kobama.mikael.challenge_place_service.domain.PlaceRepository;
import br.com.kobama.mikael.challenge_place_service.domain.PlaceService;

@Configuration
public class PlaceConfig {

  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }

}
