package com.example.developmentpatternstest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class NomalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = (TextView) findViewById(R.id.txt_test);
		textView.setText("Non-Click");

		findViewById(R.id.btn_test).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				TextView textView = (TextView) findViewById(R.id.txt_test);
				textView.setText(getClickedText());

			}

		});

	}

	private CharSequence getClickedText() {
		return "Clicked!";
	}

}
