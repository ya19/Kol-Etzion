package edu.etzion.koletzion.stream;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
	@GET("person/{person_id}")
	Single<Broadcast> getBroadcastData(@Path("broadcast_id") int broadcastId,
	                                   @Query("api_key") String apiKey);
}
