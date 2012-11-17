package com.farova.includes;

public class Score {
	
	private int m_score;
	private String m_name;
	
	public Score(int score, String name)
	{
		m_score = score;
		m_name = name;
	}
	
	public void setName(String name)
	{
		m_name = name;
	}
	
	public String getName()
	{
		return m_name;
	}
	
	public void setScore(int score)
	{
		m_score = score;
	}
	
	public int getScore()
	{
		return m_score;
	}

}
