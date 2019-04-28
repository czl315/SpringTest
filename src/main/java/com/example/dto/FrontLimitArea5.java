
package com.example.dto;

import java.util.List;

/**
 * 前区-分区5-限定
 * 每个分区不能多于4个
 * 
 * @author admin
 *
 */
public class FrontLimitArea5 {
	/**
	 * 分区1:1-7
	 */
	private int[] area1;
	/**
	 * 分区:8-14
	 */
	private int[] area2;
	/**
	 * 分区:15-21
	 */
	private int[] area3;
	/**
	 * 分区:22-28
	 */
	private int[] area4;
	/**
	 * 分区:29-35
	 */
	private int[] area5;
	
	/**
	 * 每区个数
	 */
	private int[] everyAreaCounts;
	
	/**
	 * 每区个数过滤
	 */
	private List<int[]> fiterCounts;
	
	
	public int[] getArea1() {
		return area1;
	}
	public void setArea1(int[] area1) {
		this.area1 = area1;
	}
	public int[] getArea2() {
		return area2;
	}
	public void setArea2(int[] area2) {
		this.area2 = area2;
	}
	public int[] getArea3() {
		return area3;
	}
	public void setArea3(int[] area3) {
		this.area3 = area3;
	}
	public int[] getArea4() {
		return area4;
	}
	public void setArea4(int[] area4) {
		this.area4 = area4;
	}
	public int[] getArea5() {
		return area5;
	}
	public void setArea5(int[] area5) {
		this.area5 = area5;
	}
	public int[] getEveryAreaCounts() {
		return everyAreaCounts;
	}
	public void setEveryAreaCounts(int[] everyAreaCounts) {
		this.everyAreaCounts = everyAreaCounts;
	}
	public List<int[]> getFiterCounts() {
		return fiterCounts;
	}
	public void setFiterCounts(List<int[]> fiterCounts) {
		this.fiterCounts = fiterCounts;
	}
	
}
