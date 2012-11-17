package com.farova.includes;

public class FieldBox {

	public enum BoxStatus {
		NotClicked, ClickedEmpty, ClickedBomb, MarkedUnknown, MarkedBomb
	}

	public BoxStatus m_status;
	public boolean m_isBomb;
	public int m_bombCount;

	public FieldBox() {
		m_status = BoxStatus.NotClicked;
		m_isBomb = false;
		m_bombCount = 0;
	}

	public BoxStatus getStatus() {
		return m_status;
	}

	public void setStatus(BoxStatus status) {
		m_status = status;
	}

	public boolean isBomb() {
		return m_isBomb;
	}

	public void setIfBomb(boolean isBomb) {
		m_isBomb = isBomb;
	}

	public int getBombCount() {
		return m_bombCount;
	}

	public void setStatus(int count) {
		m_bombCount = count;
	}

}
