package com.erasmusnetwork;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ErasmusnetworkApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void searchUsersReturnsEmptyListWhenNoUsersFound() {

		String location = "NonExistentLocation";
		String program = "NonExistentProgram";
		String university = "NonExistentUniversity";
		String country = "country";


		ResponseEntity<List> response = restTemplate.getForEntity("/api/users/searchUsers?location=" + location + "&program=" + program + "&university=" + university + "&country=" + country, List.class);


		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isEmpty();
	}
}
