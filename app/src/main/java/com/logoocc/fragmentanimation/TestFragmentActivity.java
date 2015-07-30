package com.logoocc.fragmentanimation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestFragmentActivity extends FragmentActivity {

	private Button btn;

	private int i = 1;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.btn);
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction ft = manager.beginTransaction();
		ft.setCustomAnimations(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter,
				R.anim.fragment_slide_right_exit);
		ft.replace(R.id.ll, new FirstFragment());
		ft.addToBackStack(null);
		ft.commit();
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i++;
				FragmentManager manager = getSupportFragmentManager();
				FragmentTransaction ft = manager.beginTransaction();
				ft.setCustomAnimations(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter,
						R.anim.fragment_slide_right_exit);
				SecondFragment fragment = new SecondFragment();
				Bundle bundle = new Bundle();
				bundle.putInt("index", i);
				fragment.setArguments(bundle);
				ft.replace(R.id.ll, fragment);
				ft.addToBackStack(null);
				ft.commit();
			}
		});

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		i--;
	}
}