package com.example.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.example.dto.FrontLimit;
import com.example.dto.FrontLimitArea5;
import com.example.dto.FrontBall;

/**
 * 后区全部组合个数：324632
 * 
 * @author admin
 */
public class DaFrontUtil19052a0 {
	private static boolean showLast = false;
//	private static boolean showLast = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 当期2019
		FrontBall curBall = new FrontBall(11, 15, 16, 20, 29);
		int c1 = curBall.getFrontBall1(), c2 = curBall.getFrontBall2(), c3 = curBall.getFrontBall3(),
				c4 = curBall.getFrontBall4(), c5 = curBall.getFrontBall5();
		int[] filtersLast = { 11, 15, 16, 20, 29 };// 过滤上期

		int[] filtersAdjoin3 = { 14,17 };// 过滤3adjoin-特殊形态

		int[] tempArea5 = { 3, 4, 5 };//分区5-过滤3、4、5个

		// 每个范围限定
		FrontLimit frontLimit = new FrontLimit();
		frontLimit.setLianLimit(2);// 连号数量限定：
		// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		frontLimit.setSumMinLimit(85);//
		frontLimit.setSumMaxLimit(95);// 40-150=154（全）；80-110=82；80-90=31；90-100=29；80-100=60；

		frontLimit.setF1Min(1);
		frontLimit.setF2Min(3);
		frontLimit.setF3Min(10);
		frontLimit.setF4Min(13);
		frontLimit.setF5Min(14);
		frontLimit.setF1Max(7);// 1-7百分比=1240/1819=68.17%
		frontLimit.setF2Max(22);
		frontLimit.setF3Max(30);
		frontLimit.setF4Max(32);
		frontLimit.setF5Max(35);
		int kuaduMin = 1;// 最小跨度
		int kuaduMax = 33;// 最大跨度
		int oddLimit = 4;// 奇数限定
		int evenLimit = 4;// 偶数限定

		// 前区-分区5-限定:每个分区不能多于4个
		FrontLimitArea5 area5 = new FrontLimitArea5();
		int[] area1 = tempArea5, area2 = tempArea5, area3 = tempArea5, area4 = tempArea5, area55 = tempArea5;
		area5.setArea1(area1);
		area5.setArea2(area2);
		area5.setArea3(area3);
		area5.setArea4(area4);
		area5.setArea5(area55);
		// area5.setEveryAreaCounts(everyAreaCounts11111);
		List<int[]> fiter5s = new ArrayList<int[]>();
		// 过滤分区5-11111
		int[] everyAreaCounts11111 = { 1, 1, 1, 1, 1 };
		fiter5s.add(everyAreaCounts11111);
		// 过滤分区5-最近n期-5
		int[] everyAreaCounts01301 = { 0, 1, 3, 0, 1 };
		fiter5s.add(everyAreaCounts01301);
		int[] everyAreaCounts10301 = { 1, 0, 3, 0, 1 };
		fiter5s.add(everyAreaCounts10301);
		int[] everyAreaCounts01130 = { 0, 1, 1, 3, 0 };
		fiter5s.add(everyAreaCounts01130);
		int[] everyAreaCounts11102 = { 1, 1, 1, 0, 2 };
		fiter5s.add(everyAreaCounts11102);
		int[] everyAreaCounts21101 = { 2, 1, 1, 0, 1 };
		fiter5s.add(everyAreaCounts21101);
		int[] everyAreaCounts12101 = { 1, 2, 1, 0, 1 };
		fiter5s.add(everyAreaCounts12101);
		int[] everyAreaCounts20201 = { 2, 0, 2, 0, 1 };
		fiter5s.add(everyAreaCounts20201);
		int[] everyAreaCounts22001 = { 2, 2, 0, 0, 1 };
		fiter5s.add(everyAreaCounts22001);
		int[] everyAreaCounts31100 = { 3, 1, 1, 0, 0 };
		fiter5s.add(everyAreaCounts31100);
		int[] everyAreaCounts12011 = { 1, 2, 0, 1, 1 };
		fiter5s.add(everyAreaCounts12011);
		area5.setFiterCounts(fiter5s);
		frontLimit.setArea5(area5);

		List<FrontBall> filterHists = DaFrontHis.frontBall2007to2019(5000);// history全过滤4个以上；历史100过滤3个；历史10过滤2个
		// System.out.println("历史过滤frontBalls个数：" + filterHists.size());

		SortedSet<Integer> setFilters = new TreeSet<Integer>();// 过滤

		System.out.print("[filtersAdjoin3]size():" + filtersAdjoin3.length + "=");
		for (int i = 0; i < filtersAdjoin3.length; i++) {
			System.out.print("," + filtersAdjoin3[i]);
		}
		System.out.println("");
		for (int i = 0; i < filtersAdjoin3.length; i++) {
			setFilters.add(filtersAdjoin3[i]);
		}
		// int[] filtersLast100 = { 7,14 };// 过滤Last100 int[] filtersLast100 = {
		// 7,14,3,16,18 };
		// for (int i = 0; i < filtersLast100.length; i++) {
		// setFilters.add(filtersLast100[i]);
		// }
		// int[] filtersLast20 = { 14, 33 };// 过滤Last20 filtersLast20 = {8 };
		// for (int i = 0; i < filtersLast20.length; i++) {
		// setFilters.add(filtersLast20[i]);
		// }

		// 遗漏次数：23=47；17=22；25=21
		int[] filtersLastCool100 = { 23 };
		for (int i = 0; i < filtersLastCool100.length; i++) {
			if (i == 0) {
				System.out.print("[Cool100]filter。size():" + filtersLastCool100.length + "=");
			}
			setFilters.add(filtersLastCool100[i]);
			System.out.print("," + filtersLastCool100[i]);
		}
		System.out.println("");

		int[] filtersMost = { 29, 33 };// 出现总次数：29=349；33=338；35=324；32=321；30=312；35遗漏39期处于历史峰值

		for (int i = 0; i < filtersMost.length; i++) {
			if (i == 0) {
				System.out.print("[history]filter。size():" + filtersMost.length + "=");
			}
			setFilters.add(filtersMost[i]);
			System.out.print("," + filtersMost[i]);
		}
		System.out.println("");
		for (int i = 0; i < filtersLast.length; i++) {
			if (i == 0) {
				System.out.print("[last]filter。size()：" + filtersLast.length + "=");
			}
			System.out.print("," + filtersLast[i]);
			setFilters.add(filtersLast[i]);
			if ((i == filtersLast.length - 1)) {
				System.out.println("");
			}
		}

		Object[] filtersObj = (Object[]) setFilters.toArray();
		int[] filterBalls = new int[filtersObj.length];
		System.out.print("过滤号码：【");
		for (int i = 0; i < filtersObj.length; i++) {
			filterBalls[i] = (int) filtersObj[i];
			System.out.print("，" + filterBalls[i]);
		}
		System.out.println("】");
		if (showLast)
			System.out.println("当期和值===" + (c1 + c2 + c3 + c4 + c5));
		// 过滤号码与当期比较，是否错误
		if (showLast) {
			for (int i = 0; i < filtersObj.length; i++) {
				if (c1 == filterBalls[i]) {
					System.out.println("当期号码c1错误：" + filterBalls[i]);
				}
				if (c2 == filterBalls[i]) {
					System.out.println("当期号码c2错误：" + filterBalls[i]);
				}
				if (c3 == filterBalls[i]) {
					System.out.println("当期号码c3错误：" + filterBalls[i]);
				}
				if (c4 == filterBalls[i]) {
					System.out.println("当期号码c4错误：" + filterBalls[i]);
				}
				if (c5 == filterBalls[i]) {
					System.out.println("当期号码c5错误：" + filterBalls[i]);
				}
			}
		}

		/**
		 * 剩余组合
		 */
		List<FrontBall> combs = combNolian(curBall, filterHists, filterBalls, kuaduMin, kuaduMax, oddLimit, evenLimit,
				frontLimit);// 精确匹配多个

		System.out.println("前区组合限定:" + "no" + frontLimit.getLianLimit() + "连;和值最小" + frontLimit.getSumMinLimit() + ";最大"
				+ frontLimit.getSumMaxLimit() + ";剩余组合：" + combs.size());

		int yes5 = 0;// 5球全中
		int yes4 = 0;// 4球中
		int yes3 = 0;// 3球中
		int yuce1 = 0, yuce2 = 0;// 预测

		for (Iterator<FrontBall> iterator = combs.iterator(); iterator.hasNext();) {
			FrontBall ball = (FrontBall) iterator.next();
			int f1 = ball.getFrontBall1(), f2 = ball.getFrontBall2(), f3 = ball.getFrontBall3(),
					f4 = ball.getFrontBall4(), f5 = ball.getFrontBall5();
			if (showLast) {
//				 System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
				// 前区出球
				if (f1 == yuce1 && f2 == yuce2) {
					// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
				} else {
					// TODO CZL
					 System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
				}
				yuce1 = f1;
				yuce2 = f2;
			}

			if (curBall != null) {
				// 中5球
				if (c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5) {
					System.out.println("5球全中！！！！！！！！");
					yes5++;
				}
				// 中4球
				if ((c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4) || (c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5)) {
					System.out.println("4球中!!!!");
					yes4++;
				}
				// // 中3球
				// if ((c1 == f1 && c2 == f2 && c3 == f3) || (c1 == f1 && c2 == f2 && c3 == f4)
				// || (c1 == f1 && c2 == f2 && c3 == f5) || (c1 == f1 && c2 == f3 && c3 == f4)
				// || (c1 == f1 && c2 == f3 && c3 == f5) || (c1 == f1 && c2 == f4 && c3 == f5)
				// || (c1 == f1 && c3 == f4 && c4 == f5) || (c1 == f1 && c3 == f2 && c4 == f3)
				// || (c1 == f1 && c3 == f2 && c4 == f4) || (c1 == f1 && c3 == f2 && c4 == f5)
				// || (c1 == f1 && c3 == f3 && c4 == f4) || (c1 == f1 && c3 == f3 && c4 == f5)
				// || (c1 == f1 && c3 == f4 && c4 == f5) || (c1 == f1 && c3 == f4 && c4 == f5)
				// || (c1 == f1 && c4 == f2 && c5 == f3) || (c1 == f1 && c4 == f2 && c5 == f4)
				// || (c1 == f1 && c4 == f2 && c5 == f5) || (c1 == f1 && c4 == f3 && c5 == f4)
				// || (c1 == f1 && c4 == f3 && c5 == f5) || (c1 == f1 && c4 == f4 && c5 == f5)
				// || (c1 == f1 && c4 == f4 && c5 == f5) || (c2 == f2 && c3 == f3 && c4 == f4)
				// || (c3 == f3 && c4 == f4 && c5 == f5)) {
				// // System.out.println("3球中!!!");
				// yes3++;
				// }
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
			}

		}
		System.out.println();
		System.out.print("3ok===" + yes3 + "===" + yes3 * 5 + "，4ok===" + yes4 + "===" + yes4 * 100 + "，5ok===" + yes5
				+ "===" + yes5 * 10000);
		System.out.println("，合计：" + (yes3 * 5 + yes4 * 100 + yes5 * 10000));

		// 当期2019033；验证通过：历史模糊4；奇数4；
		// int[] curBalls = { 1, 2, 4, 16, 24 };// 当期2019033；4偶；上期1,4；最近20高频；和值85;2连号;
		// int[] curBalls = { 4, 8, 18, 20, 32 };// 当期2019003；5偶；过滤错误32(历史频率第3)；
		// int[] curBalls = { 7, 9, 13, 14, 33 };// 当期2019030
		// 过滤错误33(历史频率第2)；去除2连；4个奇数；历史匹配4个;和值76
		// int[] curBalls = { 3, 8, 21, 26, 33 };// 当期2019031 过滤错误33(历史频率第2)；最大跨度30
		// int[] curBalls = { 1, 4, 7, 11, 30 }; // 当期2019032
		// 过滤错误30(历史频率第5)；和值=53;历史匹配过滤3个
	}

	// /**
	// * 组合
	// *
	// * @param lianLimit
	// * @param sumLimit
	// * @return
	// */
	// private static List<FrontBall> combNolian(FrontBall curBall, int lianLimit,
	// int sumMinLimit, int sumMaxLimit,
	// List<FrontBall> filterHists, int[] filter, int kuaduMin, int kuaduMax, int
	// oddLimit, int evenLimit,
	// FrontAreaLimit frontAreaLimit) {
	// int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35,
	// front5limit = 35;
	// // int allCount = 0;// 个数
	// int lianCount2 = 0;// 连号个数
	// boolean lianCount2IsYesShowed = false;
	// int lianCount3 = 0;// 连号个数
	// int lianCount4 = 0;// 连号个数
	// int lianCount5 = 0;// 连号个数
	// int sumMaxCount = 0;// 和值个数
	// int sumMinCount = 0;// 和值个数
	//
	// // int pipei5FilerCount = 0;// 精确匹配5个过滤
	// int pipei5FilerCount = 0, pipei4FilerCount = 0, pipei3FilerCount = 0;//
	// 精确匹配n个过滤
	// int filterCount = 0;// 个数
	// @SuppressWarnings("unused")
	// int oddCount = 0;
	// @SuppressWarnings("unused")
	// int evenCount = 0;
	// @SuppressWarnings("unused")
	// int kuadu16MinCount = 0;// 最小跨度
	// @SuppressWarnings("unused")
	// int kuadu29MaxCount = 0;// 最大跨度
	// @SuppressWarnings("unused")
	// int fenqu1MinCount = 0;// 三分区，t1不能大于个数
	// @SuppressWarnings("unused")
	// int fenqu5MaxCount = 0;// 三分区，t5不能小于个数
	// int f1limtMinCount = 0;// 每个范围限定t1小于
	// int f1limtMaxCount = 0;// 每个范围限定t1大于
	// int f2limtMinCount = 0;// 每个范围限定t2小于
	// int f2limtMaxCount = 0;// 每个范围限定t2大于
	// int f3limtMinCount = 0;// 每个范围限定t3小于
	// int f3limtMaxCount = 0;// 每个范围限定t3大于
	// int f4limtMinCount = 0;// 每个范围限定t4小于
	// int f4limtMaxCount = 0;// 每个范围限定t4大于
	// int f5limtMinCount = 0;// 每个范围限定t5小于
	// int f5limtMaxCount = 0;// 每个范围限定t5大于
	//
	// List<FrontBall> balls = new ArrayList<FrontBall>();
	//
	// int cur1 = curBall.getFrontBall1();
	// int cur2 = curBall.getFrontBall2();
	// int cur3 = curBall.getFrontBall3();
	// int cur4 = curBall.getFrontBall4();
	// int cur5 = curBall.getFrontBall5();
	//
	// // 前区第2个,第二个不能小于第一个
	// for (int t1 = 1; t1 <= front1limit; t1++) {
	// for (int t2 = (t1 + 1); t2 <= front2limit; t2++) {
	// for (int t3 = (t2 + 1); t3 <= front3limit; t3++) {
	// for (int t4 = (t3 + 1); t4 <= front4limit; t4++) {
	// for (int t5 = (t4 + 1); t5 <= front5limit; t5++) {
	// FrontBall backBall = new FrontBall();
	// // allCount++;
	//
	// // 过滤号码
	// boolean filterFlag = false;
	// if (filter != null && filter.length > 0) {
	// for (int i = 0; i < filter.length; i++) {
	// if (t1 == filter[i] || t2 == filter[i] || t3 == filter[i] || t4 == filter[i]
	// || t5 == filter[i]) {
	// filterCount++;
	// filterFlag = true;
	// break;
	// }
	// }
	// if (filterFlag) {
	// continue;
	// }
	// }
	//
	// if (lianLimit == 2) {// 去除2连号
	// if ((t1 + 1) == t2 || ((t2 + 1) == t3 || (t3 + 1) == t4) || (t4 + 1) == t5) {
	// lianCount2++;
	// if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
	// if (!lianCount2IsYesShowed) {// 限定条件是否正确
	// System.out.println("去除" + lianLimit + "连号,错误！！！");
	// lianCount2IsYesShowed = true;
	// }
	// }
	// continue;
	// }
	// }
	// if (lianLimit == 3) {// 去除3连号
	// if (((t1 + 1) == t2 && (t2 + 1) == t3) || ((t2 + 1) == t3 && (t3 + 1) == t4)
	// || ((t3 + 1) == t4 && (t4 + 1) == t5)) {
	// lianCount3++;
	// if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
	// if (!lianCount2IsYesShowed) {// 限定条件是否正确
	// System.out.println("去除" + lianLimit + "连号,错误！！！");
	// lianCount2IsYesShowed = true;
	// }
	// }
	// continue;
	// }
	// }
	// if (lianLimit == 4) {// 去除4连号
	// if (((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4)
	// || ((t2 + 1) == t3 && (t3 + 1) == t4) && (t4 + 1) == t5) {
	// lianCount4++;
	// continue;
	// }
	// }
	// if (lianLimit == 5) {// 去除5连号
	// if ((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4 && (t4 + 1) == t5) {
	// lianCount5++;
	// continue;
	// }
	// }
	//
	// // 和值最大限定
	// if ((t1 + t2 + t3 + t4 + t5) >= sumMaxLimit) {
	// sumMaxCount++;
	// continue;
	// }
	// // 和值最小限定
	// if ((t1 + t2 + t3 + t4 + t5) < sumMinLimit) {
	// sumMinCount++;
	// continue;
	// }
	//
	// // // 精确匹配5过滤
	// // boolean pipei5FilerFlag = false;
	// // if (filterHists != null) {
	// // for (Iterator<FrontBall> iterator = filterHists.iterator();
	// // iterator.hasNext();) {
	// // FrontBall his = (FrontBall) iterator.next();
	// // if (his.getFrontBall1() == t1 && his.getFrontBall2() == t2
	// // && his.getFrontBall3() == t3 && his.getFrontBall4() == t4
	// // && his.getFrontBall5() == t5) {
	// // pipei5FilerFlag = true;
	// // break;
	// // }
	// // }
	// // }
	// // if (pipei5FilerFlag) {
	// // System.out.println("精确匹配5个过滤：" + t1 + "," + t2 + "," + t3 + "," + t4 + ","
	// +
	// // t5);
	// // pipei5FilerCount++;
	// // continue;
	// // }
	//
	// boolean pipei4FilerFlag = false;// 精确匹配过滤4个
	// if (filterHists != null) {
	// for (Iterator<FrontBall> iterator = filterHists.iterator();
	// iterator.hasNext();) {
	// FrontBall exactObj = (FrontBall) iterator.next();
	// int ex1 = exactObj.getFrontBall1();
	// int ex2 = exactObj.getFrontBall2();
	// int ex3 = exactObj.getFrontBall3();
	// int ex4 = exactObj.getFrontBall4();
	// int ex5 = exactObj.getFrontBall5();
	// if ((ex1 == t1 && ex2 == t2 && ex3 == t3 && ex4 == t4)
	// || (ex2 == t2 && ex3 == t3 && ex4 == t4 && ex5 == t5)) {
	// pipei4FilerFlag = true;
	// if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
	// || (5 == t3 && 7 == t4 && 18 == t5)) {
	// System.out.println("精确匹配4个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4
	// + "," + ex5);
	// System.out.println(
	// "精确匹配4个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
	// }
	//
	// break;
	// }
	// }
	// }
	// if (pipei4FilerFlag) {
	// pipei4FilerCount++;
	// continue;
	// }
	//
	// // // 历史匹配过滤3个--此匹配过滤太多，慎用
	// // boolean pipei3FilerFlag = false;
	// // if (filterHists != null) {
	// // for (Iterator<FrontBall> iterator = filterHists.iterator();
	// // iterator.hasNext();) {
	// // FrontBall exactObj = (FrontBall) iterator.next();
	// // int ex1 = exactObj.getFrontBall1();
	// // int ex2 = exactObj.getFrontBall2();
	// // int ex3 = exactObj.getFrontBall3();
	// // int ex4 = exactObj.getFrontBall4();
	// // int ex5 = exactObj.getFrontBall5();
	// // if ((ex1 == t1 && ex2 == t2 && ex3 == t3) || (ex2 == t2 && ex3 == t3 &&
	// ex4
	// // == t4)
	// // || (ex3 == t3 && ex4 == t4 && ex5 == t5)) {
	// // pipei3FilerFlag = true;
	// //// if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
	// //// || (5 == t3 && 7 == t4 && 18 == t5)) {
	// //// System.out.println("精确匹配3个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," +
	// ex4
	// //// + "," + ex5);
	// //// System.out.println(
	// //// "精确匹配3个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
	// ////
	// //// }
	// // break;
	// // }
	// // }
	// // }
	// // if (pipei3FilerFlag) {
	// // pipei3FilerCount++;
	// // continue;
	// // }
	//
	// if (oddLimit == 4) {// 去除4个奇数
	// if ((t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1)
	// || (t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1)) {
	// oddCount++;
	// continue;
	// }
	// }
	// if (oddLimit == 5) {// 去除5个奇数
	// if (t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1)
	// {
	// oddCount++;
	// continue;
	// }
	// }
	// if (evenLimit == 4) {// 去除4个偶数
	// if ((t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0)
	// || (t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0)) {
	// evenCount++;
	// continue;
	// }
	// }
	// if (evenLimit == 5) {// 去除5个偶数
	// if (t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0)
	// {
	// evenCount++;
	// continue;
	// }
	// }
	//
	// // 最小跨度
	// if (t5 - t1 <= kuaduMin) {
	// kuadu16MinCount++;
	// // System.out.println("最小跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," +
	// t5);
	// continue;
	// }
	// // 最大跨度
	// if (t5 - t1 >= kuaduMax) {
	// kuadu29MaxCount++;
	// // System.out.println("最大跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," +
	// t5);
	// continue;
	// }
	//
	// // 每个范围限定
	// if (frontAreaLimit != null) {
	// if (t1 < frontAreaLimit.getF1Min()) {
	// // System.out.println("每个范围限定t1小于" + frontAreaLimit.getF1Min() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f1limtMinCount++;
	// continue;
	// }
	// if (t1 > frontAreaLimit.getF1Max()) {
	// // System.out.println("每个范围限定t1大于" + frontAreaLimit.getF1Max() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f1limtMaxCount++;
	// continue;
	// }
	// if (t2 < frontAreaLimit.getF2Min()) {
	// // System.out.println("每个范围限定t2小于" + frontAreaLimit.getF2Min() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f2limtMinCount++;
	// continue;
	// }
	// if (t2 > frontAreaLimit.getF2Max()) {
	// // System.out.println("每个范围限定t2大于" + frontAreaLimit.getF2Max() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f2limtMaxCount++;
	// continue;
	// }
	// if (t3 < frontAreaLimit.getF3Min()) {
	// // System.out.println("每个范围限定t3小于" + frontAreaLimit.getF3Min() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f3limtMinCount++;
	// continue;
	// }
	// if (t3 > frontAreaLimit.getF3Max()) {
	// // System.out.println("每个范围限定t3大于" + frontAreaLimit.getF3Max() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f3limtMaxCount++;
	// continue;
	// }
	// if (t4 < frontAreaLimit.getF4Min()) {
	// // System.out.println("每个范围限定t4小于" + frontAreaLimit.getF4Min() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f4limtMinCount++;
	// continue;
	// }
	// if (t4 > frontAreaLimit.getF4Max()) {
	// // System.out.println("每个范围限定t4大于" + frontAreaLimit.getF4Max() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f4limtMaxCount++;
	// continue;
	// }
	// if (t5 < frontAreaLimit.getF5Min()) {
	// // System.out.println("每个范围限定t5小于" + frontAreaLimit.getF5Min() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f5limtMinCount++;
	// continue;
	// }
	// if (t5 > frontAreaLimit.getF5Max()) {
	// // System.out.println("每个范围限定t5大于" + frontAreaLimit.getF5Max() + ":" + t1 +
	// ","
	// // + t2
	// // + "," + t3 + "," + t4 + "," + t5);
	// f5limtMaxCount++;
	// continue;
	// }
	//
	// }
	//
	// backBall.setFrontBall1(t1);
	// backBall.setFrontBall2(t2);
	// backBall.setFrontBall3(t3);
	// backBall.setFrontBall4(t4);
	// backBall.setFrontBall5(t5);
	// balls.add(backBall);
	// }
	// }
	// }
	//
	// }
	// }
	// // for (Iterator<BackBall> iterator = backBalls.iterator();
	// iterator.hasNext();)
	// // {
	// // BackBall backBall = (BackBall) iterator.next();
	// //
	// System.out.println("前区111："+backBall.getBackBall1()+"，前区222："+backBall.getBackBall2());
	// // }
	//
	// // System.out.println("全部个数：" + allCount);
	// if (lianLimit == 2) {
	// System.out.println("2连号个数" + lianCount2);
	// }
	// if (lianLimit == 3) {
	// System.out.println("3连号个数" + lianCount3);
	// }
	// if (lianLimit == 4) {
	// System.out.println("4连号个数" + lianCount4);
	// }
	// if (lianLimit == 5) {
	// System.out.println("5连号个数" + lianCount5);
	// }
	//
	// System.out.println(sumMaxLimit + " 和值限定过滤个数：" + sumMaxCount);
	// System.out.println(sumMinLimit + " 和值限定过滤个数：" + sumMinCount);
	//
	// // System.out.println(" 4个奇数过滤个数：" + oddCount);
	// // System.out.println(" 4个偶数过滤个数：" + evenCount);
	//
	// System.out.println(" 限定号码过滤个数：" + filterCount);
	//
	// // System.out.println(" kuadu16MinCount：" + kuadu16MinCount);
	// // System.out.println(" kuadu29MaxCount：" + kuadu29MaxCount);
	//
	// // System.out.println(" 已出5个-限定过滤个数：" + pipei5FilerCount);
	// System.out.println(" 已出4个-限定过滤个数：" + pipei4FilerCount);
	// System.out.println(" 已出3个-限定过滤个数：" + pipei3FilerCount);
	//
	// // System.out.println(" 三分区，t1不能大于个数：" + fenqu1MinCount);
	// // System.out.println(" 三分区，t5不能小于个数：" + fenqu5MaxCount);
	//
	// System.out.println(" 每个范围限定t1小于：" + f1limtMinCount);
	// System.out.println(" 每个范围限定t1大于：" + f1limtMaxCount);
	// System.out.println(" 每个范围限定t2小于：" + f2limtMinCount);
	// System.out.println(" 每个范围限定t2大于：" + f2limtMaxCount);
	// System.out.println(" 每个范围限定t3小于：" + f3limtMinCount);
	// System.out.println(" 每个范围限定t3大于：" + f3limtMaxCount);
	// System.out.println(" 每个范围限定t4小于：" + f4limtMinCount);
	// System.out.println(" 每个范围限定t4大于：" + f4limtMaxCount);
	// System.out.println(" 每个范围限定t5小于：" + f5limtMinCount);
	// System.out.println(" 每个范围限定t5大于：" + f5limtMaxCount);
	//
	// System.out.println(" 剩余个数：" + balls.size());
	// return balls;
	// }

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(FrontBall curBall, List<FrontBall> filterHists, int[] filter,
			int kuaduMin, int kuaduMax, int oddLimit, int evenLimit, FrontLimit frontAreaLimit) {
		int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35, front5limit = 35;
		int sumMinLimit = frontAreaLimit.getSumMinLimit();
		int sumMaxLimit = frontAreaLimit.getSumMaxLimit();
		// int allCount = 0;// 个数
		int lianLimit = frontAreaLimit.getLianLimit();// 默认连号限定
		int lianCount2 = 0;// 连号个数
		boolean lianCountIsYesShowed = false;
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		// int pipei5FilerCount = 0;// 精确匹配5个过滤
		int pipei5FilerCount = 0, pipei4FilerCount = 0, pipei3FilerCount = 0;// 精确匹配n个过滤
		int filterCount = 0;// 个数
		@SuppressWarnings("unused")
		int oddCount = 0;
		@SuppressWarnings("unused")
		int evenCount = 0;
		@SuppressWarnings("unused")
		int kuadu16MinCount = 0;// 最小跨度
		@SuppressWarnings("unused")
		int kuadu29MaxCount = 0;// 最大跨度
		@SuppressWarnings("unused")
		int fenqu1MinCount = 0;// 三分区，t1不能大于个数
		@SuppressWarnings("unused")
		int fenqu5MaxCount = 0;// 三分区，t5不能小于个数
		int f1limtMinCount = 0;// 每个范围限定t1小于
		int f1limtMaxCount = 0;// 每个范围限定t1大于
		int f2limtMinCount = 0;// 每个范围限定t2小于
		int f2limtMaxCount = 0;// 每个范围限定t2大于
		int f3limtMinCount = 0;// 每个范围限定t3小于
		int f3limtMaxCount = 0;// 每个范围限定t3大于
		int f4limtMinCount = 0;// 每个范围限定t4小于
		int f4limtMaxCount = 0;// 每个范围限定t4大于
		int f5limtMinCount = 0;// 每个范围限定t5小于
		int f5limtMaxCount = 0;// 每个范围限定t5大于

		int area5EveryCount = 0;// 分区5每区过滤个数
		int everyAreaCount = 0;// 分区5每区过滤个数

		List<FrontBall> balls = new ArrayList<FrontBall>();

		int cur1 = curBall.getFrontBall1();
		int cur2 = curBall.getFrontBall2();
		int cur3 = curBall.getFrontBall3();
		int cur4 = curBall.getFrontBall4();
		int cur5 = curBall.getFrontBall5();

		// 前区第2个,第二个不能小于第一个
		for (int t1 = 1; t1 <= front1limit; t1++) {
			for (int t2 = (t1 + 1); t2 <= front2limit; t2++) {
				for (int t3 = (t2 + 1); t3 <= front3limit; t3++) {
					for (int t4 = (t3 + 1); t4 <= front4limit; t4++) {
						for (int t5 = (t4 + 1); t5 <= front5limit; t5++) {
							FrontBall backBall = new FrontBall();
							FrontBall tempBall = new FrontBall(t1, t2, t3, t4, t5);
							// allCount++;

							// 过滤号码
							boolean filterFlag = false;
							if (filter != null && filter.length > 0) {
								for (int i = 0; i < filter.length; i++) {
									if (t1 == filter[i] || t2 == filter[i] || t3 == filter[i] || t4 == filter[i]
											|| t5 == filter[i]) {
										filterCount++;
										filterFlag = true;
										break;
									}
								}
								if (filterFlag) {
									continue;
								}
							}

							boolean checkLian = checkLianLimit(lianLimit, t1, t2, t3, t4, t5);
							if (lianLimit == 2 && checkLian) {// 去除2连号
								lianCount2++;
								continue;
							}
							if (lianLimit == 3 && checkLian) {// 去除3连号
								lianCount3++;
								continue;
							}
							if (lianLimit == 4 && checkLian) {// 去除4连号
								lianCount4++;
								continue;
							}
							if (lianLimit == 5 && checkLian) {// 去除5连号
								lianCount4++;
								continue;
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

							// // 精确匹配5过滤
							// boolean pipei5FilerFlag = false;
							// if (filterHists != null) {
							// for (Iterator<FrontBall> iterator = filterHists.iterator();
							// iterator.hasNext();) {
							// FrontBall his = (FrontBall) iterator.next();
							// if (his.getFrontBall1() == t1 && his.getFrontBall2() == t2
							// && his.getFrontBall3() == t3 && his.getFrontBall4() == t4
							// && his.getFrontBall5() == t5) {
							// pipei5FilerFlag = true;
							// break;
							// }
							// }
							// }
							// if (pipei5FilerFlag) {
							// System.out.println("精确匹配5个过滤：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," +
							// t5);
							// pipei5FilerCount++;
							// continue;
							// }

							boolean pipei4FilerFlag = false;// 精确匹配过滤4个
							if (filterHists != null) {
								for (Iterator<FrontBall> iterator = filterHists.iterator(); iterator.hasNext();) {
									FrontBall exactObj = (FrontBall) iterator.next();
									int ex1 = exactObj.getFrontBall1();
									int ex2 = exactObj.getFrontBall2();
									int ex3 = exactObj.getFrontBall3();
									int ex4 = exactObj.getFrontBall4();
									int ex5 = exactObj.getFrontBall5();
									if ((ex1 == t1 && ex2 == t2 && ex3 == t3 && ex4 == t4)
											|| (ex2 == t2 && ex3 == t3 && ex4 == t4 && ex5 == t5)) {
										pipei4FilerFlag = true;
										// if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
										// || (5 == t3 && 7 == t4 && 18 == t5)) {
										// System.out.println("精确匹配4个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4
										// + "," + ex5);
										// System.out.println(
										// "精确匹配4个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
										// }

										break;
									}
								}
							}
							if (pipei4FilerFlag) {
								pipei4FilerCount++;
								continue;
							}

							// 历史匹配过滤3个--此匹配过滤太多，慎用
							// boolean pipei3FilerFlag = false;
							// if (filterHists != null) {
							// for (Iterator<FrontBall> iterator = filterHists.iterator();
							// iterator.hasNext();) {
							// FrontBall exactObj = (FrontBall) iterator.next();
							// int ex1 = exactObj.getFrontBall1();
							// int ex2 = exactObj.getFrontBall2();
							// int ex3 = exactObj.getFrontBall3();
							// int ex4 = exactObj.getFrontBall4();
							// int ex5 = exactObj.getFrontBall5();
							// if ((ex1 == t1 && ex2 == t2 && ex3 == t3) || (ex2 == t2 && ex3 == t3 && ex4
							// == t4)
							// || (ex3 == t3 && ex4 == t4 && ex5 == t5)) {
							// pipei3FilerFlag = true;
							// // if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
							// // || (5 == t3 && 7 == t4 && 18 == t5)) {
							// // System.out.println("精确匹配3个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," +
							// ex4
							// // + "," + ex5);
							// // System.out.println(
							// // "精确匹配3个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
							// //
							// // }
							// break;
							// }
							// }
							// }
							// if (pipei3FilerFlag) {
							// pipei3FilerCount++;
							// continue;
							// }

							if (oddLimit == 4) {// 去除4个奇数
								if ((t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1)
										|| (t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1)) {
									oddCount++;
									continue;
								}
							}
							if (oddLimit == 5) {// 去除5个奇数
								if (t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1) {
									oddCount++;
									continue;
								}
							}
							if (evenLimit == 4) {// 去除4个偶数
								if ((t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0)
										|| (t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0)) {
									evenCount++;
									continue;
								}
							}
							if (evenLimit == 5) {// 去除5个偶数
								if (t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0) {
									evenCount++;
									continue;
								}
							}

							// 最小跨度
							if (t5 - t1 <= kuaduMin) {
								kuadu16MinCount++;
								// System.out.println("最小跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								continue;
							}
							// 最大跨度
							if (t5 - t1 >= kuaduMax) {
								kuadu29MaxCount++;
								// System.out.println("最大跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								continue;
							}

							// 每个范围限定
							if (frontAreaLimit != null) {
								if (t1 < frontAreaLimit.getF1Min()) {
									// System.out.println("每个范围限定t1小于" + frontAreaLimit.getF1Min() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f1limtMinCount++;
									continue;
								}
								if (t1 > frontAreaLimit.getF1Max()) {
									// System.out.println("每个范围限定t1大于" + frontAreaLimit.getF1Max() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f1limtMaxCount++;
									continue;
								}
								if (t2 < frontAreaLimit.getF2Min()) {
									// System.out.println("每个范围限定t2小于" + frontAreaLimit.getF2Min() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f2limtMinCount++;
									continue;
								}
								if (t2 > frontAreaLimit.getF2Max()) {
									// System.out.println("每个范围限定t2大于" + frontAreaLimit.getF2Max() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f2limtMaxCount++;
									continue;
								}
								if (t3 < frontAreaLimit.getF3Min()) {
									// System.out.println("每个范围限定t3小于" + frontAreaLimit.getF3Min() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f3limtMinCount++;
									continue;
								}
								if (t3 > frontAreaLimit.getF3Max()) {
									// System.out.println("每个范围限定t3大于" + frontAreaLimit.getF3Max() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f3limtMaxCount++;
									continue;
								}
								if (t4 < frontAreaLimit.getF4Min()) {
									// System.out.println("每个范围限定t4小于" + frontAreaLimit.getF4Min() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f4limtMinCount++;
									continue;
								}
								if (t4 > frontAreaLimit.getF4Max()) {
									// System.out.println("每个范围限定t4大于" + frontAreaLimit.getF4Max() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f4limtMaxCount++;
									continue;
								}
								if (t5 < frontAreaLimit.getF5Min()) {
									// System.out.println("每个范围限定t5小于" + frontAreaLimit.getF5Min() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f5limtMinCount++;
									continue;
								}
								if (t5 > frontAreaLimit.getF5Max()) {
									// System.out.println("每个范围限定t5大于" + frontAreaLimit.getF5Max() + ":" + t1 + ","
									// + t2
									// + "," + t3 + "," + t4 + "," + t5);
									f5limtMaxCount++;
									continue;
								}

							}

							// TODO 检查5分区
							FrontLimitArea5 frontLimitArea5 = frontAreaLimit.getArea5();
							boolean area5Every = checkArea5Every(tempBall, frontLimitArea5);
							if (area5Every) {//
								area5EveryCount++;
								continue;
							}
							boolean everyAreaCounts = checkArea5EveryAreaCounts(tempBall, frontLimitArea5);
							if (everyAreaCounts) {//
								everyAreaCount++;
								continue;
							}

							if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
								System.out.println("当期选中！！！" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
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
		// for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();)
		// {
		// BackBall backBall = (BackBall) iterator.next();
		// System.out.println("前区111："+backBall.getBackBall1()+"，前区222："+backBall.getBackBall2());
		// }

		// System.out.println("全部个数：" + allCount);
		if (lianLimit == 2) {
			System.out.println("2连号过滤个数" + lianCount2);
		}
		if (lianLimit == 3) {
			System.out.println("3连号过滤个数" + lianCount3);
		}
		if (lianLimit == 4) {
			System.out.println("4连号过滤个数" + lianCount4);
		}
		if (lianLimit == 5) {
			System.out.println("5连号过滤个数" + lianCount5);
		}

		System.out.println(sumMaxLimit + "  和值限定过滤个数：" + sumMaxCount);
		System.out.println(sumMinLimit + "  和值限定过滤个数：" + sumMinCount);

		// System.out.println(" 4个奇数过滤个数：" + oddCount);
		// System.out.println(" 4个偶数过滤个数：" + evenCount);

		System.out.println("  限定号码过滤个数：" + filterCount);

		// System.out.println(" kuadu16MinCount：" + kuadu16MinCount);
		// System.out.println(" kuadu29MaxCount：" + kuadu29MaxCount);

		// System.out.println(" 已出5个-限定过滤个数：" + pipei5FilerCount);
		System.out.println("  已出4个-限定过滤个数：" + pipei4FilerCount);
		// System.out.println(" 已出3个-限定过滤个数：" + pipei3FilerCount);

		// System.out.println(" 三分区，t1不能大于个数：" + fenqu1MinCount);
		// System.out.println(" 三分区，t5不能小于个数：" + fenqu5MaxCount);

		// System.out.println(" 每个范围限定t1小于：" + f1limtMinCount);
		System.out.println("  每个范围限定t1大于：" + f1limtMaxCount);
		// System.out.println(" 每个范围限定t2小于：" + f2limtMinCount);
		// System.out.println(" 每个范围限定t2大于：" + f2limtMaxCount);
		// System.out.println(" 每个范围限定t3小于：" + f3limtMinCount);
		// System.out.println(" 每个范围限定t3大于：" + f3limtMaxCount);
		// System.out.println(" 每个范围限定t4小于：" + f4limtMinCount);
		// System.out.println(" 每个范围限定t4大于：" + f4limtMaxCount);
		// System.out.println(" 每个范围限定t5小于：" + f5limtMinCount);
		// System.out.println(" 每个范围限定t5大于：" + f5limtMaxCount);

		System.out.println("  分区5每区集中45过滤个数：" + area5EveryCount);
		System.out.println("  分区5-每区形态个数相同过滤：" + everyAreaCount);

		// System.out.println(" 剩余个数：" + balls.size());
		return balls;
	}

	/**
	 * 分区5-每区个数
	 * 
	 * @param tempBall
	 * @param frontLimitArea5
	 * @return
	 */
	private static boolean checkArea5EveryAreaCounts(FrontBall tempBall, FrontLimitArea5 frontLimitArea5) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int area1Min = 1, area1Max = 7;
		int area2Min = 8, area2Max = 14;
		int area3Min = 15, area3Max = 21;
		int area4Min = 22, area4Max = 28;
		int area5Min = 29, area5Max = 35;

		List<int[]> list = frontLimitArea5.getFiterCounts();
		if (list != null) {

			for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
				int[] is = (int[]) iterator.next();
				int[] everyAreaCounts = is;
				if (everyAreaCounts != null) {
					// 分区1-个数：
					int countArea1 = countArea(tempBall, everyAreaCounts[0], area1Min, area1Max);
					// if (everyAreaCounts[0] == countArea1 ) {
					// System.out.println("分区1-个数相同：:" + countArea1);
					// }

					// 分区2
					int countArea2 = countArea(tempBall, everyAreaCounts[1], area2Min, area2Max);
					// if (everyAreaCounts[1] == countArea2 ) {
					// System.out.println("分区2-个数相同：:" + countArea1);
					// }
					// 分区3
					int countArea3 = countArea(tempBall, everyAreaCounts[2], area3Min, area3Max);
					// if (everyAreaCounts[2] == countArea3 ) {
					// System.out.println("分区3-个数相同：:" + countArea1);
					// }
					// 分区4
					int countArea4 = countArea(tempBall, everyAreaCounts[3], area4Min, area4Max);
					// 分区5
					int countArea5 = countArea(tempBall, everyAreaCounts[4], area5Min, area5Max);

					if (everyAreaCounts[0] == countArea1 && everyAreaCounts[1] == countArea2
							&& everyAreaCounts[2] == countArea3 && everyAreaCounts[3] == countArea4
							&& everyAreaCounts[4] == countArea5) {
						// System.out.println("分区5-每区个数相同:【" + countArea1 + countArea2 + countArea3 +
						// countArea4 + countArea5
						// + "】" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * 统计个数-
	 * 
	 * @param tempBall
	 * @param countLimitArea1
	 * @param area1Min
	 * @param area1Max
	 */
	private static int countArea(FrontBall tempBall, int countLimitArea1, int areaMin, int areaMax) {
		int rs = 0;
		int t1 = tempBall.getFrontBall1(), t2 = tempBall.getFrontBall2(), t3 = tempBall.getFrontBall3(),
				t4 = tempBall.getFrontBall4(), t5 = tempBall.getFrontBall5();
		if (t1 >= areaMin && t1 <= areaMax) {
			rs++;
		}
		if (t2 >= areaMin && t2 <= areaMax) {
			rs++;
		}
		if (t3 >= areaMin && t3 <= areaMax) {
			rs++;
		}
		if (t4 >= areaMin && t4 <= areaMax) {
			rs++;
		}
		if (t5 >= areaMin && t5 <= areaMax) {
			rs++;
		}
		return rs;
	}

	/**
	 * 检查-分区5-每个分区 分区1:1-7;
	 * 
	 * @param tempBall
	 * @param frontLimitArea5
	 */
	private static boolean checkArea5Every(FrontBall tempBall, FrontLimitArea5 frontLimitArea5) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int area1Min = 1, area1Max = 7;
		int area2Min = 8, area2Max = 14;
		int area3Min = 15, area3Max = 21;
		int area4Min = 22, area4Max = 28;
		int area5Min = 29, area5Max = 35;
		// 分区1
		int[] area1s = frontLimitArea5.getArea1();
		for (int i = 0; i < area1s.length; i++) {
			if (area1s[i] == 5) {
				if ((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max)
						&& (t5 >= area1Min && t5 <= area1Max)) {
					System.out.println("分区1-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area1s[i] == 4) {
				if (((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max))
						|| ((t2 >= area1Min && t2 <= area1Max) && (t3 >= area1Min && t3 <= area1Max)
								&& (t4 >= area1Min && t4 <= area1Max) && (t5 >= area1Min && t5 <= area1Max))) {
					System.out.println("分区1-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area1s[i] == 3) {
				if (((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max))
						|| ((t2 >= area1Min && t2 <= area1Max) && (t3 >= area1Min && t3 <= area1Max)
								&& (t4 >= area1Min && t4 <= area1Max)
								|| ((t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max)
										&& (t5 >= area1Min && t5 <= area1Max)))) {
					System.out.println("分区1-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}

		}
		// 分区2
		int[] area2s = frontLimitArea5.getArea2();
		for (int i = 0; i < area2s.length; i++) {
			if (area2s[i] == 5) {
				if ((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max)
						&& (t5 >= area2Min && t5 <= area2Max)) {
					System.out.println("分区2-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area2s[i] == 4) {
				if (((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max))
						|| ((t2 >= area2Min && t2 <= area2Max) && (t3 >= area2Min && t3 <= area2Max)
								&& (t4 >= area2Min && t4 <= area2Max) && (t5 >= area2Min && t5 <= area2Max))) {
					System.out.println("分区2-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area2s[i] == 3) {
				if (((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max))
						|| ((t2 >= area2Min && t2 <= area2Max) && (t3 >= area2Min && t3 <= area2Max)
								&& (t4 >= area2Min && t4 <= area2Max)
								|| ((t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max)
										&& (t5 >= area2Min && t5 <= area2Max)))) {
					System.out.println("分区2-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}

		}
		// 分区3
		int[] area3s = frontLimitArea5.getArea2();
		for (int i = 0; i < area3s.length; i++) {
			if (area3s[i] == 5) {
				if ((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max)
						&& (t5 >= area3Min && t5 <= area3Max)) {
					// System.out.println("分区3-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area3s[i] == 4) {
				if (((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max))
						|| ((t2 >= area3Min && t2 <= area3Max) && (t3 >= area3Min && t3 <= area3Max)
								&& (t4 >= area3Min && t4 <= area3Max) && (t5 >= area3Min && t5 <= area3Max))) {
					// System.out.println("分区3-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area3s[i] == 3) {
				if (((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max))
						|| ((t2 >= area3Min && t2 <= area3Max) && (t3 >= area3Min && t3 <= area3Max)
								&& (t4 >= area3Min && t4 <= area3Max)
								|| ((t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max)
										&& (t5 >= area3Min && t5 <= area3Max)))) {
//					System.out.println("分区3-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}

		}
		// 分区4
		int[] area4s = frontLimitArea5.getArea2();
		for (int i = 0; i < area4s.length; i++) {
			if (area4s[i] == 5) {
				if ((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max)
						&& (t5 >= area4Min && t5 <= area4Max)) {
					// System.out.println("分区4-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area4s[i] == 4) {
				if (((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max))
						|| ((t2 >= area4Min && t2 <= area4Max) && (t3 >= area4Min && t3 <= area4Max)
								&& (t4 >= area4Min && t4 <= area4Max) && (t5 >= area4Min && t5 <= area4Max))) {
					// System.out.println("分区4-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area4s[i] == 3) {
				if (((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max))
						|| ((t2 >= area4Min && t2 <= area4Max) && (t3 >= area4Min && t3 <= area4Max)
								&& (t4 >= area4Min && t4 <= area4Max)
								|| ((t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max)
										&& (t5 >= area4Min && t5 <= area4Max)))) {
//					System.out.println("分区4-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}

		}
		// 分区5
		int[] area5s = frontLimitArea5.getArea2();
		for (int i = 0; i < area5s.length; i++) {
			if (area5s[i] == 5) {
				if ((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max)
						&& (t5 >= area5Min && t5 <= area5Max)) {
					System.out.println("分区5-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area5s[i] == 4) {
				if (((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max))
						|| ((t2 >= area5Min && t2 <= area5Max) && (t3 >= area5Min && t3 <= area5Max)
								&& (t4 >= area5Min && t4 <= area5Max) && (t5 >= area5Min && t5 <= area5Max))) {
					System.out.println("分区5-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}
			if (area5s[i] == 3) {
				if (((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max))
						|| ((t2 >= area5Min && t2 <= area5Max) && (t3 >= area5Min && t3 <= area5Max)
								&& (t4 >= area5Min && t4 <= area5Max)
								|| ((t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max)
										&& (t5 >= area5Min && t5 <= area5Max)))) {
					System.out.println("分区5-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * 检查连号限定
	 * 
	 * @param lianLimit
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 */
	private static boolean checkLianLimit(int lianLimit, int t1, int t2, int t3, int t4, int t5) {
		boolean rs = false;
		if (lianLimit == 2) {// 去除2连号
			if ((t1 + 1) == t2 || ((t2 + 1) == t3 || (t3 + 1) == t4) || (t4 + 1) == t5) {
				rs = true;
				// if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
				// if (!lianCount2IsYesShowed) {// 限定条件是否正确
				// System.out.println("去除" + lianLimit + "连号,错误！！！");
				// lianCount2IsYesShowed = true;
				// }
				// }
			}
		}
		if (lianLimit == 3) {// 去除3连号
			if (((t1 + 1) == t2 && (t2 + 1) == t3) || ((t2 + 1) == t3 && (t3 + 1) == t4)
					|| ((t3 + 1) == t4 && (t4 + 1) == t5)) {
				rs = true;
			}
		}
		if (lianLimit == 4) {// 去除4连号
			if (((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4)
					|| ((t2 + 1) == t3 && (t3 + 1) == t4) && (t4 + 1) == t5) {
				rs = true;
			}
		}
		if (lianLimit == 5) {// 去除5连号
			if ((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4 && (t4 + 1) == t5) {
				rs = true;
			}
		}
		return rs;
	}

}
