package br.com.kobama.mikael.challenge_place_service.domain;

import br.com.kobama.mikael.challenge_place_service.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
  private PlaceRepository placeRepository;

  public PlaceService(PlaceRepository placeRepository) {
    this.placeRepository = placeRepository;
  }


  public Mono<Place> create(PlaceRequest placeRequest) {
    var createdPlace = new Place(null, placeRequest.name(), placeRequest.slug(),
        placeRequest.state(), placeRequest.createdAt(), placeRequest.updatedAt());
    return placeRepository.save(CreatedPlace);
  }
}
