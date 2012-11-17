package com.farova.gridmine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.farova.includes.MineField;

public class GameLayout extends Activity {

	private MineField m_minefield;
	private int m_gridSize;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gamelayout);

		m_minefield = new MineField(this);
		m_gridSize = m_minefield.getGridSize();

		PopulateTable();

	}

	private void PopulateTable() {
		TableLayout table = (TableLayout) findViewById(R.id.mainGameTable);
		for (int r = 1; r <= m_gridSize; r++) {
			TableRow tr = new TableRow(this);
			for (int c = 1; c <= m_gridSize; c++) {
				
				
				ImageView im = new ImageView(this);
				im.setImageDrawable(getResources().getDrawable(R.drawable.image_name));
				im.setPadding(0, 0, 0, 0);
				
				
				
				tr.addView(im, imageWidth, imageHeight);
			}
			table.addView(tr);
		}
	}

}
