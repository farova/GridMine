package com.farova.includes;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

	private SharedPreferences m_manager;

	private static String m_Pref_Difficulty = "FieldDifficulty";
	private static String[] m_Pref_Score = { "Score1", "Score2", "Score3", "Score4", "Score5" };

	public Preferences(Context context) {
		m_manager = PreferenceManager.getDefaultSharedPreferences(context);
	}

	public int getDifficulty() {
		return m_manager.getInt(m_Pref_Difficulty, Difficulty.getDefaultDifficulty());
	}

	public Score[] getScores() {
		Score[] scores = new Score[m_Pref_Score.length];
		for (int i = 0; i < m_Pref_Score.length; i++) {
			scores[i].setName(m_manager.getString(m_Pref_Score[i], "---"));
			scores[i].setScore(m_manager.getInt(m_Pref_Score[i], 0));
		}
		return scores;
	}

}
