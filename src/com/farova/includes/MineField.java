package com.farova.includes;

import java.util.Timer;

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
	
	public MineField(Context context)
	{
		m_context = context;
		m_preferenceManager = new Preferences(m_context);
		m_difficulty = m_preferenceManager.getDifficulty();
		m_gridDimension = Difficulty.getDifficultyGridSize(m_difficulty);
		m_mineGrid = new FieldBox[m_gridDimension][m_gridDimension];
		m_numBombs = getNumbBombsForGrid(m_gridDimension);
		
		
	}
	
	private int getNumbBombsForGrid(int gridDimension)
	{
		int difficulty = m_preferenceManager.getDifficulty();
		
		
		
		return gridDimension;
	}
	
	public FieldBox[][] getMineField()
	{
		return m_mineGrid;
	}
	public int getNumBombs()
	{
		return m_numBombs;
	}
	
	public void setNumBombs(int numBombs)
	{
		m_numBombs = numBombs;
	}
	
	public int getGridSize()
	{
		return m_gridDimension;
	}
	
	public int getNumMarkedBombs()
	{
		return m_numMarkedBombs;
	}
	
	public void setNumMarkedBombs(int numBombs)
	{
		m_numMarkedBombs = numBombs;
	}
	
	
	
	
}
