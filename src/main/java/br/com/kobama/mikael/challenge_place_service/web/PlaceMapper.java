package br.com.kobama.mikael.challenge_place_service.web;

import br.com.kobama.mikael.challenge_place_service.api.PlaceResponse;
import br.com.kobama.mikael.challenge_place_service.domain.Place;

public class PlaceMapper {
  public static PlaceResponse fromPlaceTResponse(Place place) {
    return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(),
        place.updatedAt());
  }
}
