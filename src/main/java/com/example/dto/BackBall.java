package com.example.dto;

/**
 * 后区
 * 
 * @author admin
 *
 */
public class BackBall {
	
	public BackBall(){
		super();
	}

	/**
	 * 初始化2个数字
	 * @param i1
	 * @param i2
	 */
	public BackBall(int i1, int i2) {
		backBall1= i1;
		backBall2= i2;
	}

	/**
	 * 后区1
	 */
	private int backBall1;
	/**
	 * 后区2
	 */
	private int backBall2;

	public int getBackBall1() {
		return backBall1;
	}

	public void setBackBall1(int backBall1) {
		this.backBall1 = backBall1;
	}

	public int getBackBall2() {
		return backBall2;
	}

	public void setBackBall2(int backBall2) {
		this.backBall2 = backBall2;
	}
}
