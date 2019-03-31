package com.example.dto;

/**
 * 前区
 * 
 * @author admin
 *
 */
public class FrontBall {

	public FrontBall() {
		super();
	}

	/**
	 * 初始化2个数字
	 * 
	 */
	public FrontBall(int i1, int i2, int i3, int i4, int i5) {
		frontBall1 = i1;
		frontBall2 = i2;
		frontBall3 = i3;
		frontBall4 = i4;
		frontBall5 = i5;
	}

	/**
	 * 前区1
	 */
	private int frontBall1;
	/**
	 * 前区2
	 */
	private int frontBall2;
	/**
	 * 前区3
	 */
	private int frontBall3;
	/**
	 * 前区4
	 */
	private int frontBall4;
	/**
	 * 前区5
	 */
	private int frontBall5;

	public int getFrontBall1() {
		return frontBall1;
	}

	public void setFrontBall1(int frontBall1) {
		this.frontBall1 = frontBall1;
	}

	public int getFrontBall2() {
		return frontBall2;
	}

	public void setFrontBall2(int frontBall2) {
		this.frontBall2 = frontBall2;
	}

	public int getFrontBall3() {
		return frontBall3;
	}

	public void setFrontBall3(int frontBall3) {
		this.frontBall3 = frontBall3;
	}

	public int getFrontBall4() {
		return frontBall4;
	}

	public void setFrontBall4(int frontBall4) {
		this.frontBall4 = frontBall4;
	}

	public int getFrontBall5() {
		return frontBall5;
	}

	public void setFrontBall5(int frontBall5) {
		this.frontBall5 = frontBall5;
	}
}
