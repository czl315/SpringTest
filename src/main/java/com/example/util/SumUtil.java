package com.example.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.example.dto.FrontBall;
import com.example.dto.FrontLast;
import com.example.dto.FrontLimit;
import com.example.dto.FrontLimitArea5;

/**
 * 
 * @author admin
 */
public class SumUtil {
	// private static boolean showLast = false;
	private static boolean showLast = true;

	public static void main(String[] args) {
		// 当期2019
		FrontBall curBall = new FrontBall(8, 14, 16, 34, 35);
		int c1 = curBall.getFrontBall1(), c2 = curBall.getFrontBall2(), c3 = curBall.getFrontBall3(),
				c4 = curBall.getFrontBall4(), c5 = curBall.getFrontBall5();
		// 限定
		FrontLimit frontLimit = new FrontLimit();
		// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		frontLimit.setSumMinLimit(89);//
		frontLimit.setSumMaxLimit(90);// 40-150=154（全）；80-110=82；80-90=31；90-100=29；80-100=60；
		
		/**
		 * 剩余组合
		 */
		List<FrontBall> combs = filterSumMinToMax(curBall,frontLimit);// 
		int yes5 = 0;// 5球全中
		int yes4 = 0;// 4球中
		int yes3 = 0;// 3球中
		int yes2 = 0;// 2球中
		int yes1 = 0;// 1球中
		int yuce1 = 0, yuce2 = 0;// 预测

		for (Iterator<FrontBall> iterator = combs.iterator(); iterator.hasNext();) {
			FrontBall ball = (FrontBall) iterator.next();
			int f1 = ball.getFrontBall1(), f2 = ball.getFrontBall2(), f3 = ball.getFrontBall3(),
					f4 = ball.getFrontBall4(), f5 = ball.getFrontBall5();
			if (showLast) {
				if (f1 == c1 && f2 == c2 && f3 == c3 && f4 == c4 && f5 == c5) {
					System.out.println("过滤后当期：：：" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5);
				}
				// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
				// 前区出球
				if (f1 == yuce1 && f2 == yuce2) {
					// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
				} else {
					// TODO CZL
					// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
				}
				yuce1 = f1;
				yuce2 = f2;
			}

			if (curBall != null) {
				// 中5球
				if (c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5) {
					System.out.println("5球全中！！！！！！！！" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
					yes5++;
				}
				// 中4球
				if ((c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4) || (c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5)) {
					System.out.println("4球中!!!!" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
					yes4++;
				}
				// 中3球
				int tempCount = 0;
				if ((c1 == f1 || c1 == f2 || c1 == f3 || c1 == f4 || c1 == f5)) {
					tempCount++;
				}
				if ((c2 == f1 || c2 == f2 || c2 == f3 || c2 == f4 || c2 == f5)) {
					tempCount++;
				}
				if ((c3 == f1 || c3 == f2 || c3 == f3 || c3 == f4 || c3 == f5)) {
					tempCount++;
				}
				if ((c4 == f1 || c4 == f2 || c4 == f3 || c4 == f4 || c4 == f5)) {
					tempCount++;
				}
				if ((c5 == f1 || c5 == f2 || c5 == f3 || c5 == f4 || c5 == f5)) {
					tempCount++;
				}
				if (tempCount == 3) {
					yes3++;
				}
				if (tempCount == 2) {
					yes2++;
				}
				if (tempCount == 1) {
					yes1++;
				}
			}

		}
		System.out.println("1ok===" + yes1 + "=====" + "，2ok===" + yes2 + "=====");
		System.out.print("3ok===" + yes3 + "===" + yes3 * 5 + "，4ok===" + yes4 + "===" + yes4 * 100 + "，5ok===" + yes5
				+ "===" + yes5 * 10000);
		System.out.println("，合计：" + (yes3 * 5 + yes4 * 100 + yes5 * 10000));

	}

	/**
	 * 过滤和值从最小到最大
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> filterSumMinToMax(FrontBall curBall, FrontLimit frontLimit) {
		int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35, front5limit = 35;
		int sumMinLimit = frontLimit.getSumMinLimit();
		int sumMaxLimit = frontLimit.getSumMaxLimit();

		List<FrontBall> balls = new ArrayList<FrontBall>();

		int cur1 = curBall.getFrontBall1();
		int cur2 = curBall.getFrontBall2();
		int cur3 = curBall.getFrontBall3();
		int cur4 = curBall.getFrontBall4();
		int cur5 = curBall.getFrontBall5();

		int allCount = 0;// 全部个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		// 前区第2个,第二个不能小于第一个
		for (int t1 = 1; t1 <= front1limit; t1++) {
			for (int t2 = (t1 + 1); t2 <= front2limit; t2++) {
				for (int t3 = (t2 + 1); t3 <= front3limit; t3++) {
					for (int t4 = (t3 + 1); t4 <= front4limit; t4++) {
						for (int t5 = (t4 + 1); t5 <= front5limit; t5++) {
							FrontBall backBall = new FrontBall();
							allCount++;

							if (showLast) {
								if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
									// TODO
									System.out.println("当期：：：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								}
							}

							// 和值最大限定
							if ((t1 + t2 + t3 + t4 + t5) >= sumMaxLimit) {
								sumMaxCount++;
								continue;
							}
							// 和值最小限定
							if ((t1 + t2 + t3 + t4 + t5) < sumMinLimit) {
								sumMinCount++;
								continue;
							}

							backBall.setFrontBall1(t1);
							backBall.setFrontBall2(t2);
							backBall.setFrontBall3(t3);
							backBall.setFrontBall4(t4);
							backBall.setFrontBall5(t5);
							balls.add(backBall);
						}
					}
				}

			}
		}
		System.out.println("全部个数：" + allCount);

		System.out.println(sumMaxLimit + "  和值限定过滤个数：" + sumMaxCount);
		System.out.println(sumMinLimit + "  和值限定过滤个数：" + sumMinCount);

		System.out.println(" 剩余个数：" + balls.size());
		return balls;
	}

}
