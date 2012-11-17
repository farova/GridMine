package com.farova.gridmine;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.farova.includes.FieldBox;
import com.farova.includes.MineField;

public class GameLayout extends Activity implements OnClickListener {

	private MineField m_minefield;
	private int m_gridSize;
	private FieldBox[][] m_gridImages;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gamelayout);

		m_minefield = new MineField(this);
		m_gridSize = m_minefield.getGridSize();
		m_gridImages = new FieldBox[m_gridSize][m_gridSize];

		PopulateTable();
		m_minefield.setMineField(m_gridImages);

	}

	private void PopulateTable() {
		TableLayout Headertable = (TableLayout) findViewById(R.id.mainGameHeaderTable);

		TableRow header = new TableRow(this);
		
		TextView txt = new TextView(this);
		txt.setText("#bombs:" + m_minefield.getNumBombs());
		
		header.addView(txt);
		
		Headertable.addView(header);
		
		

		TableLayout table = (TableLayout) findViewById(R.id.mainGameTable);
		for (int r = 1; r <= m_gridSize; r++) {
			TableRow tr = new TableRow(this);
			for (int c = 1; c <= m_gridSize; c++) {
				
				 
				FieldBox im = new FieldBox(this);
				im.setImageDrawable(getResources().getDrawable(R.drawable.grid_notclicked));
				im.setPadding(0, 0, 0, 0);
				im.setOnClickListener((android.view.View.OnClickListener) this);
				
				m_gridImages[r-1][c-1] = im;
				
				tr.addView(im,50, 50);
			}
			table.addView(tr);
		}
	}
	
	private void gameFinished(boolean bombClicked)
	{
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		alertDialogBuilder.setTitle("Your Title");
		alertDialogBuilder
		.setMessage("Click yes to exit!")
		.setCancelable(false)
		.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				// if this button is clicked, close
				// current activity
				GameLayout.this.finish();
			}
		  });

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

	@Override
	public void onClick(View v) {

		FieldBox clickedField = (FieldBox)v;
		
		if(clickedField.isBomb())
			clickedField.setImageDrawable(getResources().getDrawable(R.drawable.grid_clickedbomb));
//			gameFinished(false);
		else
			clickedField.setImageDrawable(getResources().getDrawable(R.drawable.grid_clickedempty));
			
		
		FieldBox.BoxStatus status = clickedField.m_status;
		
		switch(status)
		{
		case ClickedEmpty:
			break;
		case ClickedBomb:
			break;
		case MarkedBomb:
			break;
		case MarkedUnknown:
			break;
		}

	}

}
