package com.farova.includes;

public class Difficulty {

	private static int m_defaultDifficulty = 1;
	private static String[] m_diffculty = { "Easy", "Medium", "Hard", "Inasne" };
	private static int[] m_diffcultyGridSize = { 10, 20, 30, 40 };
	private static float[] m_diffcultyMultiplier = { 1, 2, 3, 6 };

	public static String getDifficulty(int difficulty) {
		return m_diffculty[difficulty];
	}

	public static float getDifficultyMultiplier(int difficulty) {
		return m_diffcultyMultiplier[difficulty];
	}

	public static int getDefaultDifficulty() {
		return m_defaultDifficulty;
	}

	public static int getDifficultyGridSize(int difficulty) {
		return m_diffcultyGridSize[difficulty];
	}

	public static String[] getDifficulties() {
		return m_diffculty;
	}
	
	public static int getDifficultyNumBombs(int difficulty)
	{
		return Math.round(m_diffcultyGridSize[difficulty] * m_diffcultyMultiplier[difficulty]);
	}

}
