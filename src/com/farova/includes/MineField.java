package com.farova.includes;

import java.util.Timer;

import com.farova.gridmine.R;

import android.content.Context;

public class MineField {

	private int m_difficulty;
	private FieldBox[][] m_mineGrid;
	private int m_numBombs;
	private int m_numMarkedBombs;
	private Timer m_timer;
	private Context m_context;
	private int m_gridDimension;
	private Preferences m_preferenceManager;

	public MineField(Context context) {
		m_context = context;
		m_preferenceManager = new Preferences(m_context);
		m_difficulty = m_preferenceManager.getDifficulty();
		m_gridDimension = Difficulty.getDifficultyGridSize(m_difficulty);
		m_numBombs = Difficulty.getDifficultyNumBombs(m_difficulty);

	}

	private void assignBombs() {
		for (int numAssigned = 1; numAssigned <= m_numBombs; numAssigned++)
		{
			boolean bombAssigned = false;
			while(bombAssigned)
			{
				int row = (int) Math.ceil(Math.random()*(m_gridDimension - 1)) +1;
				int col = (int) Math.ceil(Math.random()*(m_gridDimension - 1)) +1;
				
				if(!m_mineGrid[row][col].isBomb())
				{
					m_mineGrid[row][col].m_isBomb = true;
					bombAssigned = true;
					
				}
			}
		}
	}

	public FieldBox[][] getMineField() {
		return m_mineGrid;
	}
	
	public void setMineField(FieldBox[][] field) {
		m_mineGrid = field;
		assignBombs();
	}

	public int getNumBombs() {
		return m_numBombs;
	}

	public void setNumBombs(int numBombs) {
		m_numBombs = numBombs;
	}

	public int getGridSize() {
		return m_gridDimension;
	}

	public int getNumMarkedBombs() {
		return m_numMarkedBombs;
	}

	public void setNumMarkedBombs(int numBombs) {
		m_numMarkedBombs = numBombs;
	}

}
