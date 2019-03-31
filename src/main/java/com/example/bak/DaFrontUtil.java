package com.example.bak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.example.dto.BackBall;
import com.example.dto.FrontBall;
import com.example.util.DaFrontHis;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class DaFrontUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// List<FrontBall> allCombs = allComb(35, 35, 35, 35, 35);
		// System.out.println("前区组合个数：" + allCombs.size());
		// List<FrontBall> combsNo5Lian = combNolian(5);
		// System.out.println("前区组合个数no5连：" + combsNo5Lian.size());
		// List<FrontBall> combsNo4Lian = combNolian(4, 1000);
		// System.out.println("前区组合个数no4连：" + combsNo4Lian.size());
		// List<FrontBall> combsNo3Lian = combNolian(3, 1000);
		// System.out.println("前区组合个数no3连：" + combsNo3Lian.size());
		// List<FrontBall> combsNo2Lian = combNolian(2,110);//主要在70-110
		// System.out.println("前区组合个数no2连最大110：" + combsNo2Lian.size());
		// List<FrontBall> combsNo2LianMaxMin = combNolian(2, 70, 110);// 主要在70-110
		// System.out.println("前区组合个数no2连和值最小70最大110：" + combsNo2LianMaxMin.size());
		// List<FrontBall> combsNo2LianMax70Min110ex1 = combNolian(2, 70, 110, new
		// FrontBall(1, 4, 18, 24, 28));// 精确匹配一组
		// System.out.println("前区组合个数no2连和值最小70最大110匹配一组：" +
		// combsNo2LianMax70Min110ex1.size());

		int lianLimit = 3;
		int sumMinLimit = 80;// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		int sumMaxLimit = 110;// 40-150=154（全）；80-110=82；80-90=31；90-100=29；80-100=60；
		List<FrontBall> frontBalls = DaFrontHis.frontBall2018(200);

		// FrontBall exactObj = new FrontBall(1, 4, 18, 24, 28);
		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, exactObj);// 精确匹配一组

		// List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit,
		// sumMinLimit, sumMaxLimit, frontBalls);// 精确匹配多个

		// int[] filters = { 7, 9, 13, 14, 33 };
		// int[] filters = { 7, 9, 13, 14, 33,1,4,18,24,28 };//最近2期
		// 出现总次数：29=349；30=310；32=321；33=335；35=322
		// int[] filters = { 7, 9, 13, 14, 1, 4, 18, 24, 28, 29, 30, 32,33,35 };//
		// filters = filters.
		Set<Integer> setFilters = new HashSet<Integer>();
		// 过滤频率最多的
		int[] filtersMost = { 29, 30, 32, 33, 35 };
		for (int i = 0; i < filtersMost.length; i++) {
			setFilters.add(filtersMost[i]);
		}
		// 过滤上期
		int[] filtersLast = { 3, 8, 21, 26, 33 };
		for (int i = 0; i < filtersLast.length; i++) {
			setFilters.add(filtersLast[i]);
		}
		Object[] filtersObj = (Object[]) setFilters.toArray();
		int[] filterBalls = new int[filtersObj.length];
		for (int i = 0; i < filtersObj.length; i++) {
			filterBalls[i] = (int) filtersObj[i];
		}

		List<FrontBall> combsNo2LianMax90Min100ex1 = combNolian(lianLimit, sumMinLimit, sumMaxLimit, frontBalls,
				filterBalls);// 精确匹配多个

		System.out.println("前区组合个数:" + "no" + lianLimit + "连;和值最小" + sumMinLimit + ";最大" + sumMaxLimit + ";匹配："
				+ combsNo2LianMax90Min100ex1.size());

		int[] curBalls = { 3, 8, 21, 26, 33 };// 当期开奖
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

	/*
	 * 前区所有可能组合
	 */
	private static List<FrontBall> allComb(int front1limit, int front2limit, int front3limit, int front4limit,
			int front5limit) {
		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							// if (backTemp2 == backTemp1) {
							// // 两数不能相同
							// continue;
							// }
							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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
		return balls;
	}

	/**
	 * 获取最近n个后区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<BackBall> backBallLast2018(int limitCount) {
		List<BackBall> rs = new ArrayList<BackBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1) {
				rs.add(new BackBall(3, 4));
			}
			if (i == 2) {
				rs.add(new BackBall(01, 06));
			}
			if (i == 3) {
				rs.add(new BackBall(9, 10));
			}
			if (i == 4) {
				rs.add(new BackBall(1, 10));
			}
			if (i == 5) {
				rs.add(new BackBall(8, 11));
			}
			if (i == 6) {
				rs.add(new BackBall(3, 5));
			}
			if (i == 7) {
				rs.add(new BackBall(4, 11));
			}
			if (i == 8) {
				rs.add(new BackBall(10, 11));
			}
			if (i == 9) {
				rs.add(new BackBall(3, 4));
			}
			if (i == 10) {
				rs.add(new BackBall(4, 12));
			}

			if (i == 11) {
				rs.add(new BackBall(1, 10));
			}
			if (i == 12) {
				rs.add(new BackBall(7, 11));
			}
			if (i == 13) {
				rs.add(new BackBall(7, 10));
			}
			if (i == 14) {
				rs.add(new BackBall(1, 8));
			}
			if (i == 15) {
				rs.add(new BackBall(5, 11));
			}
			if (i == 16) {
				rs.add(new BackBall(9, 2));
			}
			if (i == 17) {
				rs.add(new BackBall(4, 9));
			}
			if (i == 18) {
				rs.add(new BackBall(6, 12));
			}
			if (i == 19) {
				rs.add(new BackBall(5, 12));
			}
			if (i == 20) {
				rs.add(new BackBall(9, 12));
			}

			if (i == 21) {
				rs.add(new BackBall(4, 11));
			}
			if (i == 22) {
				rs.add(new BackBall(5, 6));
			}
			if (i == 23) {
				rs.add(new BackBall(2, 8));
			}
			if (i == 24) {
				rs.add(new BackBall(4, 7));
			}
			if (i == 25) {
				rs.add(new BackBall(7, 8));
			}
			if (i == 26) {
				rs.add(new BackBall(3, 5));
			}
			if (i == 27) {
				rs.add(new BackBall(4, 11));
			}
			if (i == 28) {
				rs.add(new BackBall(4, 7));
			}
			if (i == 29) {
				rs.add(new BackBall(1, 8));
			}
			if (i == 30) {
				rs.add(new BackBall(9, 11));
			}

			if (i == 31) {
				rs.add(new BackBall(5, 11));
			}
			if (i == 32) {
				rs.add(new BackBall(5, 12));
			}
			if (i == 33) {
				rs.add(new BackBall(4, 9));
			}
			if (i == 34) {
				rs.add(new BackBall(3, 7));
			}
			if (i == 35) {
				rs.add(new BackBall(7, 11));
			}
			if (i == 36) {
				rs.add(new BackBall(7, 8));
			}
			if (i == 37) {
				rs.add(new BackBall(2, 11));
			}
			if (i == 38) {
				rs.add(new BackBall(1, 3));
			}
			if (i == 39) {
				rs.add(new BackBall(10, 11));
			}
			if (i == 40) {
				rs.add(new BackBall(1, 8));
			}

			if (i == 41)
				rs.add(new BackBall(1, 12));
			if (i == 42)
				rs.add(new BackBall(5, 9));
			if (i == 43)
				rs.add(new BackBall(4, 11));
			if (i == 44)
				rs.add(new BackBall(5, 8));
			if (i == 45)
				rs.add(new BackBall(5, 9));
			if (i == 46)
				rs.add(new BackBall(5, 10));
			if (i == 47)
				rs.add(new BackBall(4, 8));
			if (i == 48)
				rs.add(new BackBall(2, 7));
			if (i == 49)
				rs.add(new BackBall(6, 12));
			if (i == 50)
				rs.add(new BackBall(6, 12));

			if (i == 51)
				rs.add(new BackBall(3, 11));
			if (i == 52)
				rs.add(new BackBall(2, 7));
			if (i == 53)
				rs.add(new BackBall(2, 12));
			if (i == 54)
				rs.add(new BackBall(1, 7));
			if (i == 55)
				rs.add(new BackBall(9, 10));
			if (i == 56)
				rs.add(new BackBall(5, 7));
			if (i == 57)
				rs.add(new BackBall(5, 6));
			if (i == 58)
				rs.add(new BackBall(4, 10));
			if (i == 59)
				rs.add(new BackBall(6, 11));
			if (i == 50)
				rs.add(new BackBall(2, 10));

			if (i == 51)
				rs.add(new BackBall(3, 11));
			if (i == 52)
				rs.add(new BackBall(2, 7));
			if (i == 53)
				rs.add(new BackBall(2, 12));
			if (i == 54)
				rs.add(new BackBall(1, 7));
			if (i == 55)
				rs.add(new BackBall(9, 10));
			if (i == 56)
				rs.add(new BackBall(5, 7));
			if (i == 57)
				rs.add(new BackBall(5, 6));
			if (i == 58)
				rs.add(new BackBall(4, 10));
			if (i == 59)
				rs.add(new BackBall(6, 11));
			if (i == 60)
				rs.add(new BackBall(2, 10));

			if (i == 61)
				rs.add(new BackBall(8, 11));
			if (i == 62)
				rs.add(new BackBall(2, 7));
			if (i == 63)
				rs.add(new BackBall(3, 10));
			if (i == 64)
				rs.add(new BackBall(2, 4));
			if (i == 65)
				rs.add(new BackBall(8, 10));
			if (i == 66)
				rs.add(new BackBall(1, 4));
			if (i == 67)
				rs.add(new BackBall(7, 10));
			if (i == 68)
				rs.add(new BackBall(5, 6));
			if (i == 69)
				rs.add(new BackBall(2, 11));
			if (i == 70)
				rs.add(new BackBall(4, 7));
			if (i == 71)
				rs.add(new BackBall(3, 9));
			if (i == 72)
				rs.add(new BackBall(1, 2));
			if (i == 73)
				rs.add(new BackBall(2, 8));
			if (i == 74)
				rs.add(new BackBall(4, 12));
			if (i == 75)
				rs.add(new BackBall(4, 12));
			if (i == 76)
				rs.add(new BackBall(6, 8));
			if (i == 77)
				rs.add(new BackBall(8, 9));
			if (i == 78)
				rs.add(new BackBall(3, 6));
			if (i == 79)
				rs.add(new BackBall(1, 5));
			if (i == 80)
				rs.add(new BackBall(10, 11));
			if (i == 81)
				rs.add(new BackBall(1, 12));
			if (i == 82)
				rs.add(new BackBall(8, 10));
			if (i == 83)
				rs.add(new BackBall(10, 11));
			if (i == 84)
				rs.add(new BackBall(11, 12));
			if (i == 85)
				rs.add(new BackBall(5, 7));
			if (i == 86)
				rs.add(new BackBall(4, 5));
			if (i == 87)
				rs.add(new BackBall(1, 4));
			if (i == 88)
				rs.add(new BackBall(1, 8));
			if (i == 89)
				rs.add(new BackBall(6, 10));
			if (i == 90)
				rs.add(new BackBall(4, 11));
			if (i == 91)
				rs.add(new BackBall(1, 7));
			if (i == 92)
				rs.add(new BackBall(4, 10));
			if (i == 93)
				rs.add(new BackBall(3, 11));
			if (i == 94)
				rs.add(new BackBall(8, 10));
			if (i == 95)
				rs.add(new BackBall(5, 12));
			if (i == 96)
				rs.add(new BackBall(6, 10));
			if (i == 97)
				rs.add(new BackBall(1, 4));
			if (i == 98)
				rs.add(new BackBall(5, 7));
			if (i == 99)
				rs.add(new BackBall(1, 7));
			if (i == 100)
				rs.add(new BackBall(6, 9));
			if (i == 101)
				rs.add(new BackBall(4, 5));
			if (i == 102)
				rs.add(new BackBall(10, 12));
			if (i == 103)
				rs.add(new BackBall(2, 3));
			if (i == 104)
				rs.add(new BackBall(7, 11));
			if (i == 105)
				rs.add(new BackBall(2, 7));
			if (i == 106)
				rs.add(new BackBall(1, 4));
			if (i == 107)
				rs.add(new BackBall(3, 4));
			if (i == 108)
				rs.add(new BackBall(7, 12));
			if (i == 109)
				rs.add(new BackBall(2, 5));
			if (i == 110)
				rs.add(new BackBall(3, 11));
			if (i == 111)
				rs.add(new BackBall(4, 5));
			if (i == 112)
				rs.add(new BackBall(9, 10));
			if (i == 113)
				rs.add(new BackBall(4, 8));
			if (i == 114)
				rs.add(new BackBall(5, 6));
			if (i == 115)
				rs.add(new BackBall(1, 2));
			if (i == 116)
				rs.add(new BackBall(7, 10));
			if (i == 117)
				rs.add(new BackBall(3, 8));
			if (i == 118)
				rs.add(new BackBall(6, 9));
			if (i == 119)
				rs.add(new BackBall(2, 5));
			if (i == 120)
				rs.add(new BackBall(8, 9));
			if (i == 121)
				rs.add(new BackBall(1, 10));
			if (i == 122)
				rs.add(new BackBall(5, 12));
			if (i == 123)
				rs.add(new BackBall(2, 4));
			if (i == 124)
				rs.add(new BackBall(10, 11));
			if (i == 125)
				rs.add(new BackBall(4, 6));
			if (i == 126)
				rs.add(new BackBall(5, 6));
			if (i == 127)
				rs.add(new BackBall(8, 12));
			if (i == 128)
				rs.add(new BackBall(8, 9));
			if (i == 129)
				rs.add(new BackBall(3, 6));
			if (i == 130)
				rs.add(new BackBall(1, 11));
			if (i == 131)
				rs.add(new BackBall(2, 11));
			if (i == 132)
				rs.add(new BackBall(1, 4));
			if (i == 133)
				rs.add(new BackBall(1, 10));
			if (i == 134)
				rs.add(new BackBall(2, 12));
			if (i == 135)
				rs.add(new BackBall(6, 12));
			if (i == 136)
				rs.add(new BackBall(5, 11));
			if (i == 137)
				rs.add(new BackBall(8, 11));
			if (i == 138)
				rs.add(new BackBall(4, 5));
			if (i == 139)
				rs.add(new BackBall(6, 9));
			if (i == 140)
				rs.add(new BackBall(3, 4));
			if (i == 141)
				rs.add(new BackBall(4, 9));
			if (i == 142)
				rs.add(new BackBall(10, 11));
			if (i == 143)
				rs.add(new BackBall(1, 2));
			if (i == 144)
				rs.add(new BackBall(7, 11));
			if (i == 145)
				rs.add(new BackBall(6, 11));
			if (i == 146)
				rs.add(new BackBall(1, 2));
			if (i == 147)
				rs.add(new BackBall(2, 10));
			if (i == 148)
				rs.add(new BackBall(2, 3));
			if (i == 149)
				rs.add(new BackBall(3, 6));
			if (i == 150)
				rs.add(new BackBall(10, 12));
			if (i == 151)
				rs.add(new BackBall(3, 7));
			if (i == 152)
				rs.add(new BackBall(8, 11));
			if (i == 153)
				rs.add(new BackBall(1, 8));
			if (i == 154)
				rs.add(new BackBall(3, 5));

		}

		return rs;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumCount = 0;// 和值个数
		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							if (lianLimit == 2) {
								if ((temp1 + 1) == temp2 || ((temp2 + 1) == temp3 || (temp3 + 1) == temp4)
										|| (temp4 + 1) == temp5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp3 + 1) == temp4 && (temp4 + 1) == temp5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4) && (temp4 + 1) == temp5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4
										&& (temp4 + 1) == temp5) {
									// 去除5连号
									lianCount5++;
									continue;
								}
							}

							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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

		return balls;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumLimit) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumCount = 0;// 和值个数
		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							if (lianLimit == 2) {
								if ((temp1 + 1) == temp2 || ((temp2 + 1) == temp3 || (temp3 + 1) == temp4)
										|| (temp4 + 1) == temp5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp3 + 1) == temp4 && (temp4 + 1) == temp5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4) && (temp4 + 1) == temp5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4
										&& (temp4 + 1) == temp5) {
									// 去除5连号
									lianCount5++;
									continue;
								}
							}

							// 和值限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) > sumLimit) {
								sumCount++;
								continue;
							}

							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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

		System.out.println(sumLimit + "和值限定过滤个数：" + sumCount);

		return balls;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumMinLimit, int sumMaxLimit) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							if (lianLimit == 2) {
								if ((temp1 + 1) == temp2 || ((temp2 + 1) == temp3 || (temp3 + 1) == temp4)
										|| (temp4 + 1) == temp5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp3 + 1) == temp4 && (temp4 + 1) == temp5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4) && (temp4 + 1) == temp5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4
										&& (temp4 + 1) == temp5) {
									// 去除5连号
									lianCount5++;
									continue;
								}
							}

							// 和值最大限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) > sumMaxLimit) {
								sumMaxCount++;
								continue;
							}
							// 和值最小限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) < sumMinLimit) {
								sumMinCount++;
								continue;
							}

							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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

		System.out.println(sumMaxLimit + "和值限定过滤个数：" + sumMaxCount);
		System.out.println(sumMinLimit + "和值限定过滤个数：" + sumMinCount);

		return balls;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumMinLimit, int sumMaxLimit, FrontBall exactObj) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							if (lianLimit == 2) {
								if ((temp1 + 1) == temp2 || ((temp2 + 1) == temp3 || (temp3 + 1) == temp4)
										|| (temp4 + 1) == temp5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp3 + 1) == temp4 && (temp4 + 1) == temp5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4) && (temp4 + 1) == temp5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4
										&& (temp4 + 1) == temp5) {
									// 去除5连号
									lianCount5++;
									continue;
								}
							}

							// 和值最大限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) > sumMaxLimit) {
								sumMaxCount++;
								continue;
							}
							// 和值最小限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) < sumMinLimit) {
								sumMinCount++;
								continue;
							}

							// 精确匹配一组
							if (exactObj != null) {
								if (exactObj.getFrontBall1() == temp1 && exactObj.getFrontBall2() == temp2
										&& exactObj.getFrontBall3() == temp3 && exactObj.getFrontBall4() == temp4
										&& exactObj.getFrontBall5() == temp5) {
									System.out.println(
											"精确匹配：" + temp1 + "," + temp2 + "," + temp3 + "," + temp4 + "," + temp5);
								}
							}

							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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

		return balls;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumMinLimit, int sumMaxLimit,
			List<FrontBall> exactObjs) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int allCount = 0;// 个数
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		int pipeiCount = 0;// 个数

		List<FrontBall> balls = new ArrayList<FrontBall>();
		// 前区第2个,第二个不能小于第一个
		for (int temp1 = 1; temp1 <= front1limit; temp1++) {
			for (int temp2 = (temp1 + 1); temp2 <= front2limit; temp2++) {
				for (int temp3 = (temp2 + 1); temp3 <= front3limit; temp3++) {
					for (int temp4 = (temp3 + 1); temp4 <= front4limit; temp4++) {
						for (int temp5 = (temp4 + 1); temp5 <= front5limit; temp5++) {
							FrontBall backBall = new FrontBall();
							allCount++;
							if (lianLimit == 2) {
								if ((temp1 + 1) == temp2 || ((temp2 + 1) == temp3 || (temp3 + 1) == temp4)
										|| (temp4 + 1) == temp5) {
									// 去除2连号
									lianCount2++;
									continue;
								}
							}
							if (lianLimit == 3) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp3 + 1) == temp4 && (temp4 + 1) == temp5)) {
									// 去除3连号
									lianCount3++;
									continue;
								}
							}
							if (lianLimit == 4) {
								if (((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4)
										|| ((temp2 + 1) == temp3 && (temp3 + 1) == temp4) && (temp4 + 1) == temp5) {
									// 去除4连号
									lianCount4++;
									continue;
								}
							}
							if (lianLimit == 5) {
								if ((temp1 + 1) == temp2 && (temp2 + 1) == temp3 && (temp3 + 1) == temp4
										&& (temp4 + 1) == temp5) {
									// 去除5连号
									lianCount5++;
									continue;
								}
							}

							// 和值最大限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) >= sumMaxLimit) {
								sumMaxCount++;
								continue;
							}
							// 和值最小限定
							if ((temp1 + temp2 + temp3 + temp4 + temp5) < sumMinLimit) {
								sumMinCount++;
								continue;
							}

							// 精确匹配一组
							if (exactObjs != null) {
								for (Iterator<FrontBall> iterator = exactObjs.iterator(); iterator.hasNext();) {
									FrontBall exactObj = (FrontBall) iterator.next();
									if (exactObj.getFrontBall1() == temp1 && exactObj.getFrontBall2() == temp2
											&& exactObj.getFrontBall3() == temp3 && exactObj.getFrontBall4() == temp4
											&& exactObj.getFrontBall5() == temp5) {
										System.out.println("精确匹配：" + temp1 + "," + temp2 + "," + temp3 + "," + temp4
												+ "," + temp5);
										pipeiCount++;
									}
								}
							}

							backBall.setFrontBall1(temp1);
							backBall.setFrontBall2(temp2);
							backBall.setFrontBall3(temp3);
							backBall.setFrontBall4(temp4);
							backBall.setFrontBall5(temp5);
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

		System.out.println("  匹配个数：" + pipeiCount);

		return balls;
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(int lianLimit, int sumMinLimit, int sumMaxLimit, List<FrontBall> filters,
			int[] filter) {
		int front1limit = 35;
		int front2limit = 35;
		int front3limit = 35;
		int front4limit = 35;
		int front5limit = 35;
		int allCount = 0;// 个数
		int lianCount2 = 0;// 连号个数
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		int pipeiCount = 0;// 个数
		int filterCount = 0;// 个数
		int oddCount = 0;
		int evenCount = 0;

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
										System.out.println("精确匹配：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
										pipeiCount++;
									}
								}
							}

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
//							// 去除5个偶数
//							if (t1 % 2 == 0 && t2 % 2 == 0 && t3 % 2 == 0 && t4 % 2 == 0 && t5 % 2 == 0) {
//								evenCount++;
//								continue;
//							}

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

		System.out.println("  匹配个数：" + pipeiCount);

		System.out.println("  剩余个数：" + balls.size());
		return balls;
	}

}
