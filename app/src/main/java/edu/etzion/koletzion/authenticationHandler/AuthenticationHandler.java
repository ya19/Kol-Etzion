package edu.etzion.koletzion.authenticationHandler;

import android.app.Activity;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;

import static android.content.ContentValues.TAG;

public class AuthenticationHandler {
	private static FirebaseAuth mAuth = FirebaseAuth.getInstance();
	
	
	public static void createAccount(String email, String password, Activity activity) {
		mAuth.createUserWithEmailAndPassword(email, password)
				.addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
					@Override
					public void onComplete(@NonNull Task<AuthResult> task) {
						if (task.isSuccessful()) {
							// Sign in success, update UI with the signed-in user's information
							Log.d(TAG, "createUserWithEmail:success");
							FirebaseUser user = mAuth.getCurrentUser();
							updateUI(user);
						} else {
							// If sign in fails, display a message to the user.
							Log.w(TAG, "createUserWithEmail:failure", task.getException());
							//todo
							//	Toast.makeText(/*toast activity*/, "Authentication failed.",
							//			Toast.LENGTH_SHORT).show();
							updateUI(null);
						}
						
						// ...
					}
				});
	}
	
	public static void userLogIn(String email, String password, Activity activity) {
		mAuth.signInWithEmailAndPassword(email, password)
				.addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
					@Override
					public void onComplete(@NonNull Task<AuthResult> task) {
						if (task.isSuccessful()) {
							// Sign in success, update UI with the signed-in user's information
							Log.d(TAG, "signInWithEmail:success");
							FirebaseUser user = mAuth.getCurrentUser();
							updateUI(user);
						} else {
							// If sign in fails, display a message to the user.
							Log.w(TAG, "signInWithEmail:failure", task.getException());
							//todo: make toast on current activity
//							Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
//									Toast.LENGTH_SHORT).show();
							updateUI(null);
						}
						
						// ...
					}
				});
	}
	
	public static void updateUI(FirebaseUser user) {
		//TODO
	}
}
