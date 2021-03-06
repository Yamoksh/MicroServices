package org.ms.ratinginfoservice.resource;

import java.util.Arrays;
import java.util.List;

import org.ms.ratinginfoservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingDataService {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("movieId",3);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getRatings(@PathVariable("userId") String userId) {
		List<Rating> ratings =  Arrays.asList(new Rating("m123", 3), new Rating("m124", 4));
		UserRating userRating = new UserRating();
		userRating.setRatings(ratings);
		return userRating;
	}
}
