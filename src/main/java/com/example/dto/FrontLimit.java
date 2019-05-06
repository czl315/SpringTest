package com.example.dto;

/**
 * 每个范围限定
 * 
 * @author admin
 *
 */
public class FrontLimit {
	/**
	 * 去除连号
	 */
	private int lianLimit;
	/**
	 * 和值最小
	 */
	private int sumMinLimit ;// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
	/**
	 * 和值最大
	 */
	private int sumMaxLimit ;
	/**
	 * 前区
	 */
	private int f1Min;
	/**
	 * 前区
	 */
	private int f1Max;
	/**
	 * 前区
	 */
	private int f2Min;
	/**
	 * 前区
	 */
	private int f2Max;
	/**
	 * 前区
	 */
	private int f3Min;
	/**
	 * 前区
	 */
	private int f3Max;
	/**
	 * 前区
	 */
	private int f4Min;
	/**
	 * 前区
	 */
	private int f4Max;
	/**
	 * 前区
	 */
	private int f5Min;
	/**
	 * 前区
	 */
	private int f5Max;
	
	/**
	 * 分区5-限定
	 */
	private FrontLimitArea5 area5;
	
	public int getLianLimit() {
		return lianLimit;
	}
	public void setLianLimit(int lianLimit) {
		this.lianLimit = lianLimit;
	}
	public int getF1Min() {
		return f1Min;
	}
	public void setF1Min(int f1Min) {
		this.f1Min = f1Min;
	}
	public int getF1Max() {
		return f1Max;
	}
	public void setF1Max(int f1Max) {
		this.f1Max = f1Max;
	}
	public int getF2Min() {
		return f2Min;
	}
	public void setF2Min(int f2Min) {
		this.f2Min = f2Min;
	}
	public int getF2Max() {
		return f2Max;
	}
	public void setF2Max(int f2Max) {
		this.f2Max = f2Max;
	}
	public int getF3Min() {
		return f3Min;
	}
	public void setF3Min(int f3Min) {
		this.f3Min = f3Min;
	}
	public int getF3Max() {
		return f3Max;
	}
	public void setF3Max(int f3Max) {
		this.f3Max = f3Max;
	}
	public int getF4Min() {
		return f4Min;
	}
	public void setF4Min(int f4Min) {
		this.f4Min = f4Min;
	}
	public int getF4Max() {
		return f4Max;
	}
	public void setF4Max(int f4Max) {
		this.f4Max = f4Max;
	}
	public int getF5Min() {
		return f5Min;
	}
	public void setF5Min(int f5Min) {
		this.f5Min = f5Min;
	}
	public int getF5Max() {
		return f5Max;
	}
	public void setF5Max(int f5Max) {
		this.f5Max = f5Max;
	}
	public int getSumMinLimit() {
		return sumMinLimit;
	}
	public void setSumMinLimit(int sumMinLimit) {
		this.sumMinLimit = sumMinLimit;
	}
	public int getSumMaxLimit() {
		return sumMaxLimit;
	}
	public void setSumMaxLimit(int sumMaxLimit) {
		this.sumMaxLimit = sumMaxLimit;
	}
	public FrontLimitArea5 getArea5() {
		return area5;
	}
	public void setArea5(FrontLimitArea5 area5) {
		this.area5 = area5;
	}
}