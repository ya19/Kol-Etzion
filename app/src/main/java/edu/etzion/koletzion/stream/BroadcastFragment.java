package edu.etzion.koletzion.stream;

import androidx.fragment.app.Fragment;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BroadcastFragment extends Fragment {
	private Retrofit retrofit;
	private CompositeDisposable compositeDisposable;
	
	//init block
	public void init(){
		retrofit = new Retrofit.Builder()
				.baseUrl("https://antmedia.io/rest/?fbclid=IwAR0b2NMOz3Q5VrNELvD1cnKApca8InUgmqzWs5-PWTqwse6va-P5Km4cVA8")
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
				.build();
		
		compositeDisposable = new CompositeDisposable();
	}
	
	//gets a broadcast object from server api
	public void getBroadcast(int broadcastId, String API_KEY) {
		ApiService apiService = retrofit.create(ApiService.class);
		Single<Broadcast> broadcast = apiService.getBroadcastData(broadcastId, API_KEY);
		broadcast.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new SingleObserver<Broadcast>() {
					@Override
					public void onSubscribe(Disposable d) {
						compositeDisposable.add(d);
					}
					
					@Override
					public void onSuccess(Broadcast broadcast) {
						//todo: update ui based on data, we have a broadcast!
					}
					
					@Override
					public void onError(Throwable e) {
						//todo: handle exception
					}
				});
	}
	
	
	@Override
	public void onDestroy() {
		if (!compositeDisposable.isDisposed()) {
			compositeDisposable.dispose();
		}
		super.onDestroy();
	}
}
