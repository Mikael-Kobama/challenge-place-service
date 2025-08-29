package br.com.kobama.mikael.challenge_place_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.kobama.mikael.challenge_place_service.api.PlaceRequest;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ChallengePlaceServiceApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreatePlaceSuccess() {
		var name = "Valid Name";
		var state = "Valid state";
		var slug = "valid-name";

		webTestClient.post().uri("/places").bodyValue(new PlaceRequest(name, state)).exchange()
				.expectStatus().isCreated() // Sugestão: adicione a validação do status HTTP
				.expectBody().jsonPath("name").isEqualTo(name).jsonPath("state").isEqualTo(state)
				.jsonPath("slug").isEqualTo(slug).jsonPath("createdAt").isNotEmpty().jsonPath("updatedAt")
				.isNotEmpty();
	}

	@Test
	public void testCreatePlaceFaailure() {
		nar name = "";
		var state = "";


		webTestClient.post().uri("/places").bodyValue(new PlaceRequest(name, state)).exchange()
				.expectStatus().isBadRequest();
	}
}

