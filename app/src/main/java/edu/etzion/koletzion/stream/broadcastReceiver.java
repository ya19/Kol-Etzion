package edu.etzion.koletzion.stream;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class restHandler {
	private Retrofit retrofit;
	
	public restHandler() {
		retrofit = new Retrofit.Builder()
				.baseUrl("https://antmedia.io/rest/?fbclid=IwAR0b2NMOz3Q5VrNELvD1cnKApca8InUgmqzWs5-PWTqwse6va-P5Km4cVA8")
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
				.build();
	}
}
