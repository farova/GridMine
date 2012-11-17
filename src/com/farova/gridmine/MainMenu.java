package com.farova.gridmine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);
	}

	protected void SettingsClicked(View v) {
		Intent intent = new Intent(this, Settings.class);
		startActivity(intent);
	}
	
	protected void PlayClicked(View v) {
		Intent intent = new Intent(this, GameLayout.class);
		startActivity(intent);
	}

	protected void HighScoresClicked(View v) {
		Intent intent = new Intent(this, HighScores.class);
		startActivity(intent);
	}

}
