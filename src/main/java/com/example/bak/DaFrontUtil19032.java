package com.example.bak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.example.dto.FrontBall;
import com.example.util.DaFrontHis;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class DaFrontUtil19032 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2019032  和值=53;过滤错误30(历史频率第五)；
		int lianLimit = 2;
		int sumMinLimit = 50;// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		int sumMaxLimit = 110;// 40-150=154（全）；80-110=82；80-90=31；90-100=29；80-100=60；
		int kuaduMin = 16;// 最小跨度
		int kuaduMax = 30;// 最大跨度
		int fenqu1Min = 12;// 三分区，t1不能大于
		int fenqu5Max = 24;// 三分区，t5不能小于
		List<FrontBall> frontBalls = DaFrontHis.frontBall2007to2019(5000);
		System.out.println("历史过滤frontBalls个数：" + frontBalls.size());

		SortedSet<Integer> setFilters = new TreeSet<Integer>();
//		int[] filtersMost = { 29, 30, 32, 33, 35 };// 出现总次数：29=349；30=310；32=321；33=335；35=322
		int[] filtersMost = { 29,  32, 33, 35 };// 2019032  出现了30
		for (int i = 0; i < filtersMost.length; i++) {
			setFilters.add(filtersMost[i]);
		}
		int[] filtersLast = { 3, 8, 21, 26, 33 };// 过滤上期
		for (int i = 0; i < filtersLast.length; i++) {
			setFilters.add(filtersLast[i]);
		}
		Object[] filtersObj = (Object[]) setFilters.toArray();
		int[] filterBalls = new int[filtersObj.length];
		System.out.print("过滤号码：");
		for (int i = 0; i < filtersObj.length; i++) {
			filterBalls[i] = (int) filtersObj[i];
			System.out.print("，"+filterBalls[i]);
		}
		System.out.println("过滤号码：");

		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, frontBalls,
		// filterBalls);// 精确匹配多个
		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, frontBalls,
		// filterBalls, kuaduMin, kuaduMax);// 精确匹配多个

		List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit, sumMinLimit, sumMaxLimit, frontBalls,
				filterBalls, kuaduMin, kuaduMax, fenqu1Min, fenqu5Max);// 精确匹配多个

		System.out.println("前区组合个数:" + "no" + lianLimit + "连;和值最小" + sumMinLimit + ";最大" + sumMaxLimit + ";匹配："
				+ combsNo2LianMax90Min100ex1.size());

		int[] curBalls = { 1, 4, 7, 11, 30 };// 当期开奖
		int yes5 = 0;// 5球全中
		int yes4 = 0;// 4球中
		int yes3 = 0;// 3球中
		for (Iterator<FrontBall> iterator = combsNo2LianMax90Min100ex1.iterator(); iterator.hasNext();) {
			FrontBall ball = (FrontBall) iterator.next();
			// System.out.println("前区1：" + ball.getFrontBall1() + "，前区2：" +
			// ball.getFrontBall2() + "前区3："
			// + ball.getFrontBall3() + "，前区4：" + ball.getFrontBall4() + "前区5：" +
			// ball.getFrontBall5());
			int f1 = ball.getFrontBall1();
			int f2 = ball.getFrontBall2();
			int f3 = ball.getFrontBall3();
			int f4 = ball.getFrontBall4();
			int f5 = ball.getFrontBall5();
			// // 前区出球
			// System.out.println(ball.getFrontBall1() + "," + ball.getFrontBall2() + "," +
			// ball.getFrontBall3() + ","
			// + ball.getFrontBall4() + "," + ball.getFrontBall5());

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
		System.out.println("3球中===" + yes3 + "===" + yes3 * 5);
		System.out.println("4球中===" + yes4 + "===" + yes4 * 100);
		System.out.println("5球中===" + yes5 + "===" + yes5 * 10000);
		System.out.println("合计奖金：" + (yes3 * 5 + yes4 * 100 + yes5 * 10000));

	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumMinLimit, int sumMaxLimit, List<FrontBall> filters,
			int[] filter, int kuaduMin, int kuaduMax, int fenqu1Min, int fenqu5Max) {
		int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35, front5limit = 35;
		int allCount = 0;// 个数
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		int pipeiCount = 0;// 个数
		int pipei5FilerCount = 0;// 精确匹配5个过滤
		int pipei4FilerCount = 0;// 精确匹配4个过滤
		int pipei3FilerCount = 0;// 精确匹配4个过滤
		int filterCount = 0;// 个数
		int oddCount = 0;
		int evenCount = 0;
		int kuadu16MinCount = 0;// 最小跨度
		int kuadu29MaxCount = 0;// 最大跨度
		int fenqu1MinCount = 0;// 三分区，t1不能大于个数
		int fenqu5MaxCount = 0;// 三分区，t5不能小于个数

		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int t1 = 1; t1 <= front1limit; t1++) {
			for (int t2 = (t1 + 1); t2 <= front2limit; t2++) {
				for (int t3 = (t2 + 1); t3 <= front3limit; t3++) {
					for (int t4 = (t3 + 1); t4 <= front4limit; t4++) {
						for (int t5 = (t4 + 1); t5 <= front5limit; t5++) {
							FrontBall backBall = new FrontBall();
							allCount++;

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

							if (lianLimit == 2) {
								if ((t1 + 1) == t2 || ((t2 + 1) == t3 || (t3 + 1) == t4) || (t4 + 1) == t5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((t1 + 1) == t2 && (t2 + 1) == t3) || ((t2 + 1) == t3 && (t3 + 1) == t4)
										|| ((t3 + 1) == t4 && (t4 + 1) == t5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4)
										|| ((t2 + 1) == t3 && (t3 + 1) == t4) && (t4 + 1) == t5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4 && (t4 + 1) == t5) {
									// 去除5连号
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

							// 精确匹配一组
							if (filters != null) {
								for (Iterator<FrontBall> iterator = filters.iterator(); iterator.hasNext();) {
									FrontBall exactObj = (FrontBall) iterator.next();
									if (exactObj.getFrontBall1() == t1 && exactObj.getFrontBall2() == t2
											&& exactObj.getFrontBall3() == t3 && exactObj.getFrontBall4() == t4
											&& exactObj.getFrontBall5() == t5) {
										// System.out.println("精确匹配：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
										pipeiCount++;
										break;
									}
								}
							}

							// // 精确匹配5过滤
							// boolean pipei5FilerFlag = false;
							// if (filters != null) {
							// for (Iterator<FrontBall> iterator = filters.iterator(); iterator.hasNext();)
							// {
							// FrontBall exactObj = (FrontBall) iterator.next();
							// if (exactObj.getFrontBall1() == t1 && exactObj.getFrontBall2() == t2
							// && exactObj.getFrontBall3() == t3 && exactObj.getFrontBall4() == t4
							// && exactObj.getFrontBall5() == t5) {
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

							// // 精确匹配过滤4个
							// boolean pipei4FilerFlag = false;
							// if (filters != null) {
							// for (Iterator<FrontBall> iterator = filters.iterator(); iterator.hasNext();)
							// {
							// FrontBall exactObj = (FrontBall) iterator.next();
							// int ex1 = exactObj.getFrontBall1();
							// int ex2 = exactObj.getFrontBall2();
							// int ex3 = exactObj.getFrontBall3();
							// int ex4 = exactObj.getFrontBall4();
							// int ex5 = exactObj.getFrontBall5();
							// if ((ex1 == t1 && ex2 == t2 && ex3 == t3 && ex4 == t4)
							// || (ex2 == t2 && ex3 == t3 && ex4 == t4 && ex5 == t5)) {
							// pipei4FilerFlag = true;
							// // System.out
							// // .println("精确匹配4个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4 + "," +
							// // ex5);
							// // System.out
							// // .println("精确匹配4个过滤-当前：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
							// break;
							// }
							// }
							// }
							// if (pipei4FilerFlag) {
							// pipei4FilerCount++;
							// continue;
							// }

//							// 精确匹配过滤3个--此匹配过滤太多，慎用
//							boolean pipei3FilerFlag = false;
//							if (filters != null) {
//								for (Iterator<FrontBall> iterator = filters.iterator(); iterator.hasNext();) {
//									FrontBall exactObj = (FrontBall) iterator.next();
//									int ex1 = exactObj.getFrontBall1();
//									int ex2 = exactObj.getFrontBall2();
//									int ex3 = exactObj.getFrontBall3();
//									int ex4 = exactObj.getFrontBall4();
//									int ex5 = exactObj.getFrontBall5();
//									if ((ex1 == t1 && ex2 == t2 && ex3 == t3) || (ex2 == t2 && ex3 == t3 && ex4 == t4)
//											|| (ex3 == t3 && ex4 == t4 && ex5 == t5)) {
//										pipei3FilerFlag = true;
////										if((1 == t1) && (4 == t2 )
////												&& (7 == t3 )) {
////											System.out.println(
////													"精确匹配3个过滤-已出：" + ex1 + "," + ex2 + "," + ex3 + "," + ex4 + "," + ex5);
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

							// 去除4个奇数
							if ((t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1)
									|| (t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1)) {
								oddCount++;
								continue;
							}
							// // 去除5个奇数
							// if (t1 % 2 == 1 && t2 % 2 == 1 && t3 % 2 == 1 && t4 % 2 == 1 && t5 % 2 == 1)
							// {
							// oddCount++;
							// continue;
							// }

							// 去除4个偶数
							if ((t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0)
									|| (t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0)) {
								evenCount++;
								continue;
							}
							// // 去除5个偶数
							// if (t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0)
							// {
							// evenCount++;
							// continue;
							// }

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

							// 三分区，t1不能大于个数
							if (t1 > fenqu1Min) {
								// System.out.println("三分区，t1不能大于" + fenqu1Min + ":" + t1 + "," + t2 + "," + t3
								// + "," + t4
								// + "," + t5);
								fenqu1MinCount++;
								continue;
							}
							// 三分区，t5不能小于个数
							if (t5 < fenqu5Max) {
								// System.out.println("三分区，t5不能小于个数" + fenqu5Max + ":" + t1 + "," + t2 + "," +
								// t3 + ","
								// + t4 + "," + t5);
								fenqu5MaxCount++;
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
		// for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();)
		// {
		// BackBall backBall = (BackBall) iterator.next();
		// System.out.println("前区111："+backBall.getBackBall1()+"，前区222："+backBall.getBackBall2());
		// }

		System.out.println("全部个数：" + allCount);
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

		System.out.println("  4个奇数过滤个数：" + oddCount);
		System.out.println("  4个偶数过滤个数：" + evenCount);

		System.out.println("  限定号码过滤个数：" + filterCount);

		System.out.println("  kuadu16MinCount：" + kuadu16MinCount);
		System.out.println("  kuadu29MaxCount：" + kuadu29MaxCount);

		System.out.println("  已出5个-限定过滤个数：" + pipei5FilerCount);
		System.out.println("  已出4个-限定过滤个数：" + pipei4FilerCount);
		System.out.println("  已出3个-限定过滤个数：" + pipei3FilerCount);

		System.out.println("  三分区，t1不能大于个数：" + fenqu1MinCount);
		System.out.println("  三分区，t5不能小于个数：" + fenqu5MaxCount);

		System.out.println("  匹配个数：" + pipeiCount);

		System.out.println("  剩余个数：" + balls.size());
		return balls;
	}

}
