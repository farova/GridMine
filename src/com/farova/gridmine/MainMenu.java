package com.farova.gridmine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);

		((Button) findViewById(R.id.buttonHighscores)).setOnClickListener(this);
		((Button) findViewById(R.id.buttonPlay)).setOnClickListener(this);
		((Button) findViewById(R.id.buttonSettings)).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.buttonHighscores:
			intent = new Intent(this, HighScores.class);
			break;
		case R.id.buttonPlay:
			intent = new Intent(this, GameLayout.class);
			break;
		case R.id.buttonSettings:
			intent = new Intent(this, Settings.class);
			break;
		}
		startActivity(intent);
	}

}
