package com.example.bak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.example.dto.FrontLimit;
import com.example.dto.FrontBall;
import com.example.util.DaFrontHis;

/**
 * 后区全部组合个数：324632
 * 
 * @author admin
 */
public class DaFrontUtil1903600 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 当期2019035:yes:lianLimit2345;sumMaxLimit = 100;kuaduMin = 16;kuaduMax = 30;
		// 当期2019035:no:sumMinLimit = 80(30);oddLimit = 4(5);filtersLast100 = { 3, 7, 14
		// }(14);
		int[] curBalls = { 1, 3, 5, 7, 18 }; 
		// int[] curBalls = { 8, 12, 15, 27, 30 };// 当期2019034：历史频率4错30；历史模糊3错；前一大限7；

		int lianLimit = 2;// 去除2连
		int sumMinLimit = 80;// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		int sumMaxLimit = 100;// 40-150=154（全）；80-110=82；80-90=31；90-100=29；80-100=60；
		int kuaduMin = 16;// 最小跨度
		int kuaduMax = 30;// 最大跨度
		int oddLimit = 4;// 奇数限定
		int evenLimit = 4;// 偶数限定
		
		SortedSet<Integer> setFilters = new TreeSet<Integer>();// 过滤
		int[] filtersLast = { 1, 3, 5, 7, 18 };// 过滤上期201903
		int[] filtersAdjoin = { 6 };// 过滤3adjoin
//		int[] filtersLast100 = { 7,14 };// 过滤Last100 int[] filtersLast100 = { 7,14,3,16,18 };
//		for (int i = 0; i < filtersLast100.length; i++) {
//			setFilters.add(filtersLast100[i]);
//		}
//		int[] filtersLast20 = { 14, 33 };// 过滤Last20 filtersLast20 = {8 };
//		for (int i = 0; i < filtersLast20.length; i++) {
//			setFilters.add(filtersLast20[i]);
//		}
		int[] filtersLastCool100 = { 35,23,20,31 };// 遗漏次数：35=42；23=34；20=21；31=21
		int[] filtersMost = { 29, 33,35 };// 出现总次数：29=349；33=336；35=322；32=321；30=312；35遗漏39期处于历史峰值

		FrontBall curBall = new FrontBall();
		curBall.setFrontBall1(curBalls[0]);
		curBall.setFrontBall2(curBalls[1]);
		curBall.setFrontBall3(curBalls[2]);
		curBall.setFrontBall4(curBalls[3]);
		curBall.setFrontBall5(curBalls[4]);

		// 每个范围限定
		FrontLimit frontAreaLimit = new FrontLimit();
		frontAreaLimit = null;
		 frontAreaLimit = new FrontLimit();
		 frontAreaLimit.setKillLianLimit(lianLimit);// 连号数量限定
		 frontAreaLimit.setF1Min(1);
		 frontAreaLimit.setF1Max(7);// 11
		 frontAreaLimit.setF2Min(4);
		 frontAreaLimit.setF2Max(22);
		 frontAreaLimit.setF3Min(10);
		 frontAreaLimit.setF3Max(29);
		 frontAreaLimit.setF4Min(18);
		 frontAreaLimit.setF4Max(33);
		 frontAreaLimit.setF5Min(25);
		 frontAreaLimit.setF5Max(35);

		List<FrontBall> filterHists = DaFrontHis.frontBall2007to2019(5000);// history全过滤4个以上；历史100过滤3个；历史10过滤2个
		System.out.println("历史过滤frontBalls个数：" + filterHists.size());

		for (int i = 0; i < filtersMost.length; i++) {
			if (i == 0) {
				System.out.print("[history]filter。size()：" + filtersMost.length + "=");
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
		for (int i = 0; i < filtersAdjoin.length; i++) {
			setFilters.add(filtersAdjoin[i]);
		}
		
		for (int i = 0; i < filtersLastCool100.length; i++) {
			setFilters.add(filtersLastCool100[i]);
		}
		
		Object[] filtersObj = (Object[]) setFilters.toArray();
		int[] filterBalls = new int[filtersObj.length];
		System.out.print("过滤号码：");
		for (int i = 0; i < filtersObj.length; i++) {
			filterBalls[i] = (int) filtersObj[i];
			System.out.print("，" + filterBalls[i]);
		}
		System.out.println("过滤号码：");

		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, frontBalls,
		// filterBalls);// 精确匹配多个
		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, frontBalls,
		// filterBalls, kuaduMin, kuaduMax);// 精确匹配多个

		List<FrontBall> combs = combNolian(curBall, lianLimit, sumMinLimit, sumMaxLimit, filterHists, filterBalls,
				kuaduMin, kuaduMax, oddLimit, evenLimit, frontAreaLimit);// 精确匹配多个

		System.out.println(
				"前区组合限定:" + "no" + lianLimit + "连;和值最小" + sumMinLimit + ";最大" + sumMaxLimit + ";匹配：" + combs.size());

		int yes5 = 0;// 5球全中
		int yes4 = 0;// 4球中
		int yes3 = 0;// 3球中
		int yuce1 = 0, yuce2 = 0;// 预测
		for (Iterator<FrontBall> iterator = combs.iterator(); iterator.hasNext();) {
			FrontBall ball = (FrontBall) iterator.next();
			int f1 = ball.getFrontBall1(), f2 = ball.getFrontBall2(), f3 = ball.getFrontBall3(),
					f4 = ball.getFrontBall4(), f5 = ball.getFrontBall5();
			// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
			// 前区出球
			if (f1 == yuce1 && f2 == yuce2) {
				// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
			} else {
				 System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
			}
			yuce1 = f1;
			yuce2 = f2;

			if (curBalls != null && curBalls.length > 0) {
				// 中5球
				if (curBalls[0] == f1 && curBalls[1] == f2 && curBalls[2] == f3 && curBalls[3] == f4
						&& curBalls[4] == f5) {
					System.out.println("5球全中！！！！！！！！");
					yes5++;
				}
				// 中4球
				if ((curBalls[0] == f1 && curBalls[1] == f2 && curBalls[2] == f3 && curBalls[3] == f4)
						|| (curBalls[1] == f2 && curBalls[2] == f3 && curBalls[3] == f4 && curBalls[4] == f5)) {
					System.out.println("4球中!!!!");
					yes4++;
				}
				// 中3球
				if ((curBalls[0] == f1 && curBalls[1] == f2 && curBalls[2] == f3)
						|| (curBalls[1] == f2 && curBalls[2] == f3 && curBalls[3] == f4)
						|| (curBalls[2] == f3 && curBalls[3] == f4 && curBalls[4] == f5)) {
					// System.out.println("3球中!!!");
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

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(FrontBall curBall, int lianLimit, int sumMinLimit, int sumMaxLimit,
			List<FrontBall> filterHists, int[] filter, int kuaduMin, int kuaduMax, int oddLimit, int evenLimit,
			FrontLimit frontAreaLimit) {
		int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35, front5limit = 35;
		// int allCount = 0;// 个数
		int lianCount2 = 0;// 连号个数
		boolean lianCount2IsYesShowed = false;
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

							if (lianLimit == 2) {// 去除2连号
								if ((t1 + 1) == t2 || ((t2 + 1) == t3 || (t3 + 1) == t4) || (t4 + 1) == t5) {
									lianCount2++;
									if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
										if (!lianCount2IsYesShowed) {// 限定条件是否正确
											System.out.println("去除" + lianLimit + "连号,错误！！！");
											lianCount2IsYesShowed = true;
										}
									}
									continue;
								}
							}
							if (lianLimit == 3) {// 去除3连号
								if (((t1 + 1) == t2 && (t2 + 1) == t3) || ((t2 + 1) == t3 && (t3 + 1) == t4)
										|| ((t3 + 1) == t4 && (t4 + 1) == t5)) {
									lianCount3++;
									if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
										if (!lianCount2IsYesShowed) {// 限定条件是否正确
											System.out.println("去除" + lianLimit + "连号,错误！！！");
											lianCount2IsYesShowed = true;
										}
									}
									continue;
								}
							}
							if (lianLimit == 4) {// 去除4连号
								if (((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4)
										|| ((t2 + 1) == t3 && (t3 + 1) == t4) && (t4 + 1) == t5) {
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {// 去除5连号
								if ((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4 && (t4 + 1) == t5) {
									lianCount5++;
									continue;
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
										if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
												|| (5 == t3 && 7 == t4 && 18 == t5)) {
											System.out.println("精确匹配4个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4
													+ "," + ex5);
											System.out.println(
													"精确匹配4个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
										}

										break;
									}
								}
							}
							if (pipei4FilerFlag) {
								pipei4FilerCount++;
								continue;
							}

//							// 历史匹配过滤3个--此匹配过滤太多，慎用
//							boolean pipei3FilerFlag = false;
//							if (filterHists != null) {
//								for (Iterator<FrontBall> iterator = filterHists.iterator(); iterator.hasNext();) {
//									FrontBall exactObj = (FrontBall) iterator.next();
//									int ex1 = exactObj.getFrontBall1();
//									int ex2 = exactObj.getFrontBall2();
//									int ex3 = exactObj.getFrontBall3();
//									int ex4 = exactObj.getFrontBall4();
//									int ex5 = exactObj.getFrontBall5();
//									if ((ex1 == t1 && ex2 == t2 && ex3 == t3) || (ex2 == t2 && ex3 == t3 && ex4 == t4)
//											|| (ex3 == t3 && ex4 == t4 && ex5 == t5)) {
//										pipei3FilerFlag = true;
////										if ((1 == t1 && 3 == t2 && 5 == t3) || (3 == t2 && 5 == t3 && 7 == t4)
////												|| (5 == t3 && 7 == t4 && 18 == t5)) {
////											System.out.println("精确匹配3个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4
////													+ "," + ex5);
////											System.out.println(
////													"精确匹配3个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
////
////										}
//										break;
//									}
//								}
//							}
//							if (pipei3FilerFlag) {
//								pipei3FilerCount++;
//								continue;
//							}

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
			System.out.println("2连号个数" + lianCount2);
		}
		if (lianLimit == 3) {
			System.out.println("3连号个数" + lianCount3);
		}
		if (lianLimit == 4) {
			System.out.println("4连号个数" + lianCount4);
		}
		if (lianLimit == 5) {
			System.out.println("5连号个数" + lianCount5);
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
		System.out.println("  已出3个-限定过滤个数：" + pipei3FilerCount);

		// System.out.println(" 三分区，t1不能大于个数：" + fenqu1MinCount);
		// System.out.println(" 三分区，t5不能小于个数：" + fenqu5MaxCount);

		System.out.println("  每个范围限定t1小于：" + f1limtMinCount);
		System.out.println("  每个范围限定t1大于：" + f1limtMaxCount);
		System.out.println("  每个范围限定t2小于：" + f2limtMinCount);
		System.out.println("  每个范围限定t2大于：" + f2limtMaxCount);
		System.out.println("  每个范围限定t3小于：" + f3limtMinCount);
		System.out.println("  每个范围限定t3大于：" + f3limtMaxCount);
		System.out.println("  每个范围限定t4小于：" + f4limtMinCount);
		System.out.println("  每个范围限定t4大于：" + f4limtMaxCount);
		System.out.println("  每个范围限定t5小于：" + f5limtMinCount);
		System.out.println("  每个范围限定t5大于：" + f5limtMaxCount);

		System.out.println("  剩余个数：" + balls.size());
		return balls;
	}

}
