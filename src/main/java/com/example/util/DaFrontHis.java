package com.example.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.dto.BackBall;
import com.example.dto.FrontBall;

/**
 * 前区全部组合
 * 
 * @author admin
 *
 */
public class DaFrontHis {

	public static void main(String[] args) {
		historyCount(new String[1]);
	}

	public static void historyCount(String[] args) {
		List<FrontBall> frontBalls = DaFrontHis.frontBall2007to2019(5000);// history
		int[] hisCounts1 = new int[36], hisCounts2 = new int[36], hisCounts3 = new int[36], hisCounts4 = new int[36],
				hisCounts5 = new int[36];
		for (Iterator<FrontBall> iterator = frontBalls.iterator(); iterator.hasNext();) {
			FrontBall frontBall = (FrontBall) iterator.next();
			int h1 = frontBall.getFrontBall1();
			int h2 = frontBall.getFrontBall2();
			int h3 = frontBall.getFrontBall3();
			int h4 = frontBall.getFrontBall4();
			int h5 = frontBall.getFrontBall5();
			for (int i = 1; i <= 35; i++) {
				if (h1 == i) {
					hisCounts1[i] = hisCounts1[i] + 1;
				}
				if (h2 == i) {
					hisCounts2[i] = hisCounts2[i] + 1;
				}
				if (h3 == i) {
					hisCounts3[i] = hisCounts3[i] + 1;
				}
				if (h4 == i) {
					hisCounts4[i] = hisCounts4[i] + 1;
				}
				if (h5 == i) {
					hisCounts5[i] = hisCounts5[i] + 1;
				}
			}
			// if (h1 == 30) {
			// System.out.println("当前：" + h1 + "," + h2 + "," + h3 + "," + h4 +"," + h5);
			// }
		}
		for (int i = 1; i < hisCounts1.length; i++) {
			System.out.println("第1[" + i + "]个：" + hisCounts1[i]);
		}
		for (int i = 1; i < hisCounts2.length; i++) {
			System.out.println("第2[" + i + "]个：" + hisCounts2[i]);
		}
		for (int i = 1; i < hisCounts3.length; i++) {
			System.out.println("第3[" + i + "]个：" + hisCounts3[i]);
		}
		for (int i = 1; i < hisCounts4.length; i++) {
			System.out.println("第4[" + i + "]个：" + hisCounts4[i]);
		}
		for (int i = 1; i < hisCounts5.length; i++) {
			System.out.println("第5[" + i + "]个：" + hisCounts5[i]);
		}

	}

	/**
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2007to2019(int limitCount) {
		List<FrontBall> frontBalls = new ArrayList<FrontBall>();
		List<FrontBall> frontBalls2019 = DaFrontHis.frontBall2019(160);
		List<FrontBall> frontBalls2018 = DaFrontHis.frontBall2018(160);
		List<FrontBall> frontBalls2017 = DaFrontHis.frontBall2017(160);
		List<FrontBall> frontBalls2016 = DaFrontHis.frontBall2016(160);
		List<FrontBall> frontBalls2015 = DaFrontHis.frontBall2015(160);
		List<FrontBall> frontBalls2014 = DaFrontHis.frontBall2014(160);
		List<FrontBall> frontBalls2013 = DaFrontHis.frontBall2013(160);
		List<FrontBall> frontBalls2012 = frontBall2012(160);
		List<FrontBall> frontBalls2011 = frontBall2011(160);
		List<FrontBall> frontBalls2010 = frontBall2010(160);
		List<FrontBall> frontBalls2009 = frontBall2009(160);
		List<FrontBall> frontBalls2008 = frontBall2008(160);
		List<FrontBall> frontBalls2007 = frontBall2007(160);
		frontBalls.addAll(frontBalls2019);
		frontBalls.addAll(frontBalls2018);
		frontBalls.addAll(frontBalls2017);
		frontBalls.addAll(frontBalls2016);
		frontBalls.addAll(frontBalls2015);
		frontBalls.addAll(frontBalls2014);
		frontBalls.addAll(frontBalls2013);
		frontBalls.addAll(frontBalls2012);
		frontBalls.addAll(frontBalls2011);
		frontBalls.addAll(frontBalls2010);
		frontBalls.addAll(frontBalls2009);
		frontBalls.addAll(frontBalls2008);
		frontBalls.addAll(frontBalls2007);

		return frontBalls;
	}


	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2019(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
//			if (i == 53) rs.add(new FrontBall(1, 11, 19, 26, 35));
			if (i == 52) rs.add(new FrontBall(4, 15, 16, 20, 35));
			if (i == 51) rs.add(new FrontBall(11, 15, 16, 20, 29));
			if (i == 50) rs.add(new FrontBall(4, 15, 16, 20, 35));
			
			if (i == 49) rs.add(new FrontBall(10, 16, 22, 26, 27));
			if (i == 48) rs.add(new FrontBall(6, 10, 16, 29, 33));
			if (i == 47) rs.add(new FrontBall(3, 4, 10, 16, 32));
			if (i == 46) rs.add(new FrontBall(2, 8, 14, 15, 35));
			if (i == 45) rs.add(new FrontBall(1, 4, 16, 19, 33));
			if (i == 44) rs.add(new FrontBall(3, 6, 10, 12, 31));
			if (i == 43) rs.add(new FrontBall(2, 6, 7, 12, 15));
			if (i == 42) rs.add(new FrontBall(4, 10, 13, 28, 33));
			if (i == 41) rs.add(new FrontBall(12, 19, 20, 22, 28));
			if (i == 1)
				rs.add(new FrontBall(6, 18, 23, 26, 28));//历史模糊4；ok；历史模糊3：2009
			if (i == 2)
				rs.add(new FrontBall(2, 7, 14, 22, 31));//历史模糊4；ok；历史模糊3：2018/2017
			if (i == 3)
				rs.add(new FrontBall(4, 8, 18, 20, 32));//历史模糊4；ok；历史模糊3：2018/2011
			if (i == 4)
				rs.add(new FrontBall(15, 16, 17, 31, 32));//历史模糊4；ok；历史模糊3：ok
			if (i == 5)
				rs.add(new FrontBall(21, 26, 27, 29, 34));//历史模糊4；ok；历史模糊3：2016/2012/2010
			if (i == 6)
				rs.add(new FrontBall(14, 17, 19, 25, 30));//历史模糊4；ok；历史模糊3：2016/2010/2008
			if (i == 7)
				rs.add(new FrontBall(3, 12, 16, 29, 32));//历史模糊4；ok；历史模糊3：2013
			if (i == 8)
				rs.add(new FrontBall(3, 8, 17, 20, 24));//历史模糊4；ok；历史模糊3：ok
			if (i == 9)
				rs.add(new FrontBall(3, 9, 15, 18, 26));//历史模糊4；ok；历史模糊3：2015
			if (i == 10)
				rs.add(new FrontBall(3, 7, 24, 25, 27));//历史模糊4；ok；历史模糊3：2007
			if (i == 11)
				rs.add(new FrontBall(4, 12, 13, 16, 17));
			if (i == 12)
				rs.add(new FrontBall(5, 9, 17, 18, 19));
			if (i == 13)
				rs.add(new FrontBall(8, 10, 15, 17, 18));
			if (i == 14)
				rs.add(new FrontBall(12, 14, 20, 28, 31));
			if (i == 15)
				rs.add(new FrontBall(2, 5, 10, 13, 30));
			if (i == 16)
				rs.add(new FrontBall(3, 5, 13, 16, 28));
			if (i == 17)
				rs.add(new FrontBall(1, 5, 7, 22, 25));
			if (i == 18)
				rs.add(new FrontBall(3, 18, 19, 26, 34));
			if (i == 19)
				rs.add(new FrontBall(4, 11, 19, 25, 32));
			if (i == 20)
				rs.add(new FrontBall(1, 8, 16, 27, 34));
			if (i == 21)
				rs.add(new FrontBall(7, 13, 17, 24, 33));
			if (i == 22)
				rs.add(new FrontBall(1, 4, 14, 15, 21));
			if (i == 23)
				rs.add(new FrontBall(1, 3, 14, 26, 30));
			if (i == 24)
				rs.add(new FrontBall(11, 17, 19, 29, 33));
			if (i == 25)
				rs.add(new FrontBall(6, 13, 16, 19, 29));
			if (i == 26)
				rs.add(new FrontBall(10, 12, 15, 17, 19));
			if (i == 27)
				rs.add(new FrontBall(16, 18, 24, 25, 27));
			if (i == 28)
				rs.add(new FrontBall(6, 22, 28, 29, 33));
			if (i == 29)
				rs.add(new FrontBall(1, 4, 18, 24, 28));
			if (i == 30)
				rs.add(new FrontBall(7, 9, 13, 14, 33));
			if (i == 31)
				rs.add(new FrontBall(3, 8, 21, 26, 33));
			if (i == 32)
				rs.add(new FrontBall(1, 4, 7, 11, 30));
			if (i == 33)
				rs.add(new FrontBall(1, 2, 4, 16, 24));
			if (i == 34)
				rs.add(new FrontBall(1, 2, 4, 16, 24));
			if (i == 35)
				rs.add(new FrontBall(1, 3, 5, 7, 18));
			if (i == 36)
				rs.add(new FrontBall(3, 9, 21, 28, 30));
			if (i == 37)
				rs.add(new FrontBall(6, 16, 26, 33, 35));
			if (i == 38) rs.add(new FrontBall(5, 11, 16, 18, 27));
			if (i == 39) rs.add(new FrontBall(1, 12, 18, 26, 35));
			if (i == 40) rs.add(new FrontBall(1, 3, 31, 32, 34));
//			if (i == 41) rs.add(new FrontBall(12, 19, 20, 22, 28));
			
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2018(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(1, 13, 22, 25, 35));
			if (i == 2)
				rs.add(new FrontBall(12, 20, 23, 27, 34));
			if (i == 3)
				rs.add(new FrontBall(4, 21, 23, 24, 30));
			if (i == 4)
				rs.add(new FrontBall(4, 9, 22, 28, 30));
			if (i == 5)
				rs.add(new FrontBall(4, 9, 23, 24, 30));
			if (i == 6)
				rs.add(new FrontBall(19, 20, 30, 32, 33));
			if (i == 7)
				rs.add(new FrontBall(3, 4, 28, 31, 34));
			if (i == 8)
				rs.add(new FrontBall(9, 15, 17, 20, 22));
			if (i == 9)
				rs.add(new FrontBall(10, 12, 28, 30, 34));
			if (i == 10)
				rs.add(new FrontBall(24, 25, 26, 28, 29));
			if (i == 11)
				rs.add(new FrontBall(3, 13, 15, 23, 26));
			if (i == 12)
				rs.add(new FrontBall(3, 22, 24, 29, 34));
			if (i == 13)
				rs.add(new FrontBall(8, 24, 31, 33, 35));
			if (i == 14)
				rs.add(new FrontBall(14, 16, 18, 24, 31));
			if (i == 15)
				rs.add(new FrontBall(4, 13, 15, 18, 29));
			if (i == 16)
				rs.add(new FrontBall(1, 2, 12, 13, 23));
			if (i == 17)
				rs.add(new FrontBall(4, 19, 21, 23, 31));
			if (i == 18)
				rs.add(new FrontBall(6, 8, 13, 24, 28));
			if (i == 19)
				rs.add(new FrontBall(10, 11, 19, 21, 28));
			if (i == 20)
				rs.add(new FrontBall(1, 10, 13, 14, 21));
			if (i == 21)
				rs.add(new FrontBall(5, 6, 8, 9, 15));
			if (i == 22)
				rs.add(new FrontBall(2, 10, 19, 33, 35));
			if (i == 23)
				rs.add(new FrontBall(12, 13, 18, 21, 29));
			if (i == 24)
				rs.add(new FrontBall(2, 16, 24, 30, 32));
			if (i == 25)
				rs.add(new FrontBall(7, 8, 9, 15, 34));
			if (i == 26)
				rs.add(new FrontBall(1, 2, 3, 4, 30));
			if (i == 27)
				rs.add(new FrontBall(1, 18, 20, 21, 26));
			if (i == 28)
				rs.add(new FrontBall(4, 19, 25, 30, 35));
			if (i == 29)
				rs.add(new FrontBall(3, 9, 21, 25, 29));
			if (i == 30)
				rs.add(new FrontBall(5, 18, 21, 28, 32));
			if (i == 31)
				rs.add(new FrontBall(3, 8, 13, 17, 23));
			if (i == 32)
				rs.add(new FrontBall(7, 10, 17, 32, 35));
			if (i == 33)
				rs.add(new FrontBall(2, 3, 19, 23, 34));
			if (i == 34)
				rs.add(new FrontBall(8, 11, 22, 27, 32));
			if (i == 35)
				rs.add(new FrontBall(5, 7, 10, 12, 24));
			if (i == 36)
				rs.add(new FrontBall(11, 17, 18, 21, 27));
			if (i == 37)
				rs.add(new FrontBall(1, 3, 27, 30, 31));
			if (i == 38)
				rs.add(new FrontBall(14, 23, 25, 31, 32));
			if (i == 39)
				rs.add(new FrontBall(2, 7, 14, 29, 32));
			if (i == 40)
				rs.add(new FrontBall(5, 7, 18, 27, 31));
			if (i == 41)
				rs.add(new FrontBall(1, 23, 25, 31, 33));
			if (i == 42)
				rs.add(new FrontBall(3, 19, 25, 29, 35));
			if (i == 43)
				rs.add(new FrontBall(3, 6, 13, 28, 33));
			if (i == 44)
				rs.add(new FrontBall(2, 4, 6, 18, 21));
			if (i == 45)
				rs.add(new FrontBall(2, 5, 20, 30, 35));
			if (i == 46)
				rs.add(new FrontBall(10, 20, 22, 29, 32));
			if (i == 47)
				rs.add(new FrontBall(3, 8, 10, 14, 20));
			if (i == 48)
				rs.add(new FrontBall(2, 3, 11, 20, 25));
			if (i == 49)
				rs.add(new FrontBall(4, 7, 9, 10, 13));
			if (i == 50)
				rs.add(new FrontBall(22, 24, 26, 34, 35));
			if (i == 51)
				rs.add(new FrontBall(9, 18, 28, 29, 35));
			if (i == 52)
				rs.add(new FrontBall(5, 16, 18, 19, 25));
			if (i == 53)
				rs.add(new FrontBall(11, 16, 21, 23, 25));
			if (i == 54)
				rs.add(new FrontBall(9, 10, 12, 20, 30));
			if (i == 55)
				rs.add(new FrontBall(3, 7, 20, 33, 34));
			if (i == 56)
				rs.add(new FrontBall(2, 4, 16, 28, 34));
			if (i == 57)
				rs.add(new FrontBall(13, 19, 22, 27, 28));
			if (i == 58)
				rs.add(new FrontBall(9, 11, 12, 26, 32));
			if (i == 59)
				rs.add(new FrontBall(1, 9, 10, 27, 35));
			if (i == 60)
				rs.add(new FrontBall(4, 22, 27, 29, 31));
			if (i == 61)
				rs.add(new FrontBall(4, 10, 12, 28, 31));
			if (i == 62)
				rs.add(new FrontBall(12, 14, 19, 23, 35));
			if (i == 63)
				rs.add(new FrontBall(5, 14, 15, 32, 34));
			if (i == 64)
				rs.add(new FrontBall(1, 3, 4, 11, 29));
			if (i == 65)
				rs.add(new FrontBall(7, 10, 28, 31, 32));
			if (i == 66)
				rs.add(new FrontBall(1, 20, 23, 32, 33));
			if (i == 67)
				rs.add(new FrontBall(3, 7, 12, 18, 31));
			if (i == 68)
				rs.add(new FrontBall(8, 12, 16, 26, 33));
			if (i == 69)
				rs.add(new FrontBall(1, 8, 13, 21, 24));
			if (i == 70)
				rs.add(new FrontBall(2, 5, 10, 16, 30));
			if (i == 71)
				rs.add(new FrontBall(2, 5, 23, 30, 31));
			if (i == 72)
				rs.add(new FrontBall(5, 12, 17, 24, 26));
			if (i == 73)
				rs.add(new FrontBall(13, 19, 24, 25, 29));
			if (i == 74)
				rs.add(new FrontBall(3, 9, 12, 28, 30));
			if (i == 75)
				rs.add(new FrontBall(1, 6, 12, 20, 34));
			if (i == 76)
				rs.add(new FrontBall(7, 18, 28, 29, 32));
			if (i == 77)
				rs.add(new FrontBall(1, 6, 9, 15, 26));
			if (i == 78)
				rs.add(new FrontBall(7, 11, 12, 22, 30));
			if (i == 79)
				rs.add(new FrontBall(3, 4, 10, 27, 29));
			if (i == 80)
				rs.add(new FrontBall(7, 16, 24, 26, 31));
			if (i == 81)
				rs.add(new FrontBall(2, 10, 13, 21, 35));
			if (i == 82)
				rs.add(new FrontBall(1, 2, 14, 17, 18));
			if (i == 83)
				rs.add(new FrontBall(7, 12, 25, 27, 28));
			if (i == 84)
				rs.add(new FrontBall(6, 11, 17, 22, 35));
			if (i == 85)
				rs.add(new FrontBall(1, 2, 14, 25, 31));
			if (i == 86)
				rs.add(new FrontBall(16, 22, 24, 29, 31));
			if (i == 87)
				rs.add(new FrontBall(3, 14, 19, 23, 25));
			if (i == 88)
				rs.add(new FrontBall(8, 9, 21, 25, 33));
			if (i == 89)
				rs.add(new FrontBall(26, 27, 28, 32, 34));
			if (i == 90)
				rs.add(new FrontBall(6, 20, 24, 33, 34));
			if (i == 91)
				rs.add(new FrontBall(6, 22, 26, 28, 31));
			if (i == 92)
				rs.add(new FrontBall(5, 7, 14, 18, 19));
			if (i == 93)
				rs.add(new FrontBall(3, 11, 16, 18, 33));
			if (i == 94)
				rs.add(new FrontBall(11, 16, 25, 30, 34));
			if (i == 95)
				rs.add(new FrontBall(7, 14, 18, 29, 35));
			if (i == 96)
				rs.add(new FrontBall(13, 14, 20, 28, 34));
			if (i == 97)
				rs.add(new FrontBall(10, 12, 14, 18, 23));
			if (i == 98)
				rs.add(new FrontBall(2, 15, 18, 25, 27));
			if (i == 99)
				rs.add(new FrontBall(12, 13, 16, 20, 21));
			if (i == 100)
				rs.add(new FrontBall(6, 20, 21, 26, 30));
			if (i == 101)
				rs.add(new FrontBall(3, 14, 15, 23, 29));
			if (i == 102)
				rs.add(new FrontBall(6, 7, 13, 22, 24));
			if (i == 103)
				rs.add(new FrontBall(14, 24, 26, 28, 35));
			if (i == 104)
				rs.add(new FrontBall(1, 13, 14, 26, 28));
			if (i == 105)
				rs.add(new FrontBall(1, 16, 19, 20, 31));
			if (i == 106)
				rs.add(new FrontBall(4, 14, 17, 24, 31));
			if (i == 107)
				rs.add(new FrontBall(7, 8, 9, 10, 22));
			if (i == 108)
				rs.add(new FrontBall(9, 10, 24, 31, 32));
			if (i == 109)
				rs.add(new FrontBall(10, 16, 23, 25, 34));
			if (i == 110)
				rs.add(new FrontBall(6, 19, 21, 27, 28));
			if (i == 111)
				rs.add(new FrontBall(3, 16, 27, 28, 32));
			if (i == 112)
				rs.add(new FrontBall(3, 7, 8, 9, 29));
			if (i == 113)
				rs.add(new FrontBall(8, 12, 27, 31, 33));
			if (i == 114)
				rs.add(new FrontBall(12, 18, 26, 28, 29));
			if (i == 115)
				rs.add(new FrontBall(2, 6, 13, 18, 25));
			if (i == 116)
				rs.add(new FrontBall(1, 14, 17, 21, 33));
			if (i == 117)
				rs.add(new FrontBall(7, 11, 13, 22, 29));
			if (i == 118)
				rs.add(new FrontBall(4, 5, 14, 21, 34));
			if (i == 119)
				rs.add(new FrontBall(6, 9, 11, 16, 35));
			if (i == 120)
				rs.add(new FrontBall(21, 22, 25, 27, 30));
			if (i == 121)
				rs.add(new FrontBall(6, 7, 21, 29, 30));
			if (i == 122)
				rs.add(new FrontBall(8, 9, 21, 30, 31));
			if (i == 123)
				rs.add(new FrontBall(6, 9, 29, 32, 35));
			if (i == 124)
				rs.add(new FrontBall(8, 10, 12, 19, 20));
			if (i == 125)
				rs.add(new FrontBall(7, 16, 20, 21, 34));
			if (i == 126)
				rs.add(new FrontBall(11, 13, 15, 21, 27));
			if (i == 127)
				rs.add(new FrontBall(1, 3, 4, 11, 29));
			if (i == 128)
				rs.add(new FrontBall(11, 12, 14, 16, 26));
			if (i == 129)
				rs.add(new FrontBall(4, 7, 21, 22, 29));
			if (i == 130)
				rs.add(new FrontBall(3, 4, 16, 18, 25));
			if (i == 131)
				rs.add(new FrontBall(12, 14, 21, 32, 33));
			if (i == 132)
				rs.add(new FrontBall(3, 16, 22, 23, 27));
			if (i == 133)
				rs.add(new FrontBall(8, 12, 14, 15, 19));
			if (i == 134)
				rs.add(new FrontBall(4, 5, 19, 31, 35));
			if (i == 135)
				rs.add(new FrontBall(14, 19, 23, 27, 34));
			if (i == 136)
				rs.add(new FrontBall(3, 11, 12, 19, 21));
			if (i == 137)
				rs.add(new FrontBall(7, 10, 22, 23, 33));
			if (i == 138)
				rs.add(new FrontBall(1, 23, 24, 28, 33));
			if (i == 139)
				rs.add(new FrontBall(5, 11, 16, 28, 35));
			if (i == 140)
				rs.add(new FrontBall(1, 6, 8, 12, 15));
			if (i == 141)
				rs.add(new FrontBall(3, 7, 23, 26, 33));
			if (i == 142)
				rs.add(new FrontBall(19, 24, 28, 29, 34));
			if (i == 143)
				rs.add(new FrontBall(4, 7, 20, 22, 33));
			if (i == 144)
				rs.add(new FrontBall(6, 17, 18, 24, 31));
			if (i == 145)
				rs.add(new FrontBall(9, 18, 29, 31, 33));
			if (i == 146)
				rs.add(new FrontBall(3, 8, 9, 13, 33));
			if (i == 147)
				rs.add(new FrontBall(1, 11, 26, 33, 35));
			if (i == 148)
				rs.add(new FrontBall(2, 6, 24, 33, 34));
			if (i == 149)
				rs.add(new FrontBall(1, 7, 10, 11, 20));
			if (i == 150)
				rs.add(new FrontBall(5, 12, 13, 31, 34));
			if (i == 151)
				rs.add(new FrontBall(4, 8, 18, 29, 30));
			if (i == 152)
				rs.add(new FrontBall(2, 4, 5, 12, 28));
			if (i == 153)
				rs.add(new FrontBall(3, 6, 7, 8, 21));
			if (i == 154)
				rs.add(new FrontBall(14, 22, 23, 26, 30));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2017(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(7, 9, 20, 31, 33));
			if (i == 2)
				rs.add(new FrontBall(7, 12, 14, 31, 34));
			if (i == 3)
				rs.add(new FrontBall(3, 5, 6, 13, 22));
			if (i == 4)
				rs.add(new FrontBall(5, 8, 11, 28, 31));
			if (i == 5)
				rs.add(new FrontBall(5, 9, 20, 26, 35));
			if (i == 6)
				rs.add(new FrontBall(4, 6, 23, 32, 33));
			if (i == 7)
				rs.add(new FrontBall(8, 11, 17, 25, 27));
			if (i == 8)
				rs.add(new FrontBall(3, 4, 9, 25, 32));
			if (i == 9)
				rs.add(new FrontBall(5, 6, 8, 12, 22));
			if (i == 10)
				rs.add(new FrontBall(4, 10, 13, 18, 35));
			if (i == 11)
				rs.add(new FrontBall(5, 15, 21, 29, 34));
			if (i == 12)
				rs.add(new FrontBall(4, 5, 24, 26, 35));
			if (i == 13)
				rs.add(new FrontBall(5, 12, 17, 30, 34));
			if (i == 14)
				rs.add(new FrontBall(4, 8, 15, 24, 25));
			if (i == 15)
				rs.add(new FrontBall(1, 7, 19, 27, 34));
			if (i == 16)
				rs.add(new FrontBall(3, 13, 28, 30, 33));
			if (i == 17)
				rs.add(new FrontBall(4, 19, 24, 26, 29));
			if (i == 18)
				rs.add(new FrontBall(6, 7, 10, 17, 23));
			if (i == 19)
				rs.add(new FrontBall(2, 6, 14, 23, 25));
			if (i == 20)
				rs.add(new FrontBall(16, 21, 24, 27, 28));
			if (i == 21)
				rs.add(new FrontBall(1, 15, 17, 20, 26));
			if (i == 22)
				rs.add(new FrontBall(2, 3, 9, 17, 24));
			if (i == 23)
				rs.add(new FrontBall(5, 8, 12, 24, 34));
			if (i == 24)
				rs.add(new FrontBall(21, 23, 29, 32, 35));
			if (i == 25)
				rs.add(new FrontBall(10, 16, 19, 20, 34));
			if (i == 26)
				rs.add(new FrontBall(10, 14, 19, 25, 32));
			if (i == 27)
				rs.add(new FrontBall(8, 17, 25, 33, 34));
			if (i == 28)
				rs.add(new FrontBall(6, 18, 22, 23, 33));
			if (i == 29)
				rs.add(new FrontBall(1, 6, 14, 17, 29));
			if (i == 30)
				rs.add(new FrontBall(21, 22, 24, 29, 34));
			if (i == 31)
				rs.add(new FrontBall(2, 16, 17, 30, 32));
			if (i == 32)
				rs.add(new FrontBall(2, 13, 14, 18, 29));
			if (i == 33)
				rs.add(new FrontBall(15, 22, 23, 25, 34));
			if (i == 34)
				rs.add(new FrontBall(6, 12, 21, 26, 29));
			if (i == 35)
				rs.add(new FrontBall(14, 17, 22, 30, 33));
			if (i == 36)
				rs.add(new FrontBall(1, 4, 9, 18, 33));
			if (i == 37)
				rs.add(new FrontBall(13, 15, 16, 32, 34));
			if (i == 38)
				rs.add(new FrontBall(4, 5, 13, 18, 27));
			if (i == 39)
				rs.add(new FrontBall(5, 6, 14, 17, 26));
			if (i == 40)
				rs.add(new FrontBall(4, 6, 10, 23, 29));
			if (i == 41)
				rs.add(new FrontBall(2, 4, 6, 25, 31));
			if (i == 42)
				rs.add(new FrontBall(2, 17, 31, 33, 34));
			if (i == 43)
				rs.add(new FrontBall(6, 13, 22, 25, 35));
			if (i == 44)
				rs.add(new FrontBall(11, 16, 17, 18, 25));
			if (i == 45)
				rs.add(new FrontBall(1, 8, 11, 21, 35));
			if (i == 46)
				rs.add(new FrontBall(4, 17, 20, 23, 30));
			if (i == 47)
				rs.add(new FrontBall(15, 19, 32, 33, 34));
			if (i == 48)
				rs.add(new FrontBall(7, 9, 13, 15, 19));
			if (i == 49)
				rs.add(new FrontBall(9, 12, 14, 22, 31));
			if (i == 50)
				rs.add(new FrontBall(12, 14, 17, 20, 28));
			if (i == 51)
				rs.add(new FrontBall(14, 17, 18, 22, 29));
			if (i == 52)
				rs.add(new FrontBall(3, 19, 24, 28, 33));
			if (i == 53)
				rs.add(new FrontBall(6, 19, 20, 22, 26));
			if (i == 54)
				rs.add(new FrontBall(16, 29, 30, 32, 33));
			if (i == 55)
				rs.add(new FrontBall(19, 20, 22, 30, 33));
			if (i == 56)
				rs.add(new FrontBall(1, 4, 24, 27, 32));
			if (i == 57)
				rs.add(new FrontBall(12, 16, 19, 23, 24));
			if (i == 58)
				rs.add(new FrontBall(14, 18, 20, 21, 28));
			if (i == 59)
				rs.add(new FrontBall(8, 11, 13, 15, 17));
			if (i == 60)
				rs.add(new FrontBall(9, 15, 20, 26, 31));
			if (i == 61)
				rs.add(new FrontBall(10, 19, 23, 25, 30));
			if (i == 62)
				rs.add(new FrontBall(1, 4, 6, 8, 28));
			if (i == 63)
				rs.add(new FrontBall(18, 21, 22, 24, 29));
			if (i == 64)
				rs.add(new FrontBall(1, 8, 20, 27, 30));
			if (i == 65)
				rs.add(new FrontBall(5, 11, 12, 19, 28));
			if (i == 66)
				rs.add(new FrontBall(11, 15, 23, 26, 30));
			if (i == 67)
				rs.add(new FrontBall(10, 17, 18, 32, 35));
			if (i == 68)
				rs.add(new FrontBall(7, 8, 19, 24, 27));
			if (i == 69)
				rs.add(new FrontBall(10, 16, 20, 23, 32));
			if (i == 70)
				rs.add(new FrontBall(6, 16, 18, 26, 30));
			if (i == 71)
				rs.add(new FrontBall(1, 4, 11, 14, 33));
			if (i == 72)
				rs.add(new FrontBall(1, 3, 29, 32, 34));
			if (i == 73)
				rs.add(new FrontBall(7, 18, 28, 31, 33));
			if (i == 74)
				rs.add(new FrontBall(8, 10, 11, 13, 17));
			if (i == 75)
				rs.add(new FrontBall(5, 11, 16, 18, 35));
			if (i == 76)
				rs.add(new FrontBall(2, 7, 25, 30, 35));
			if (i == 77)
				rs.add(new FrontBall(1, 3, 4, 25, 31));
			if (i == 78)
				rs.add(new FrontBall(4, 5, 27, 31, 34));
			if (i == 79)
				rs.add(new FrontBall(1, 17, 19, 32, 33));
			if (i == 80)
				rs.add(new FrontBall(8, 10, 21, 30, 31));
			if (i == 81)
				rs.add(new FrontBall(2, 12, 15, 20, 34));
			if (i == 82)
				rs.add(new FrontBall(5, 13, 20, 21, 25));
			if (i == 83)
				rs.add(new FrontBall(2, 5, 14, 22, 34));
			if (i == 84)
				rs.add(new FrontBall(6, 11, 14, 21, 31));
			if (i == 85)
				rs.add(new FrontBall(9, 13, 14, 25, 30));
			if (i == 86)
				rs.add(new FrontBall(12, 15, 18, 22, 31));
			if (i == 87)
				rs.add(new FrontBall(3, 14, 21, 29, 35));
			if (i == 88)
				rs.add(new FrontBall(5, 28, 31, 34, 35));
			if (i == 89)
				rs.add(new FrontBall(3, 5, 6, 15, 18));
			if (i == 90)
				rs.add(new FrontBall(3, 6, 15, 22, 35));
			if (i == 91)
				rs.add(new FrontBall(1, 5, 7, 16, 19));
			if (i == 92)
				rs.add(new FrontBall(3, 7, 9, 17, 34));
			if (i == 93)
				rs.add(new FrontBall(5, 6, 17, 21, 29));
			if (i == 94)
				rs.add(new FrontBall(3, 5, 8, 29, 33));
			if (i == 95)
				rs.add(new FrontBall(15, 32, 33, 34, 35));
			if (i == 96)
				rs.add(new FrontBall(3, 7, 9, 17, 28));
			if (i == 97)
				rs.add(new FrontBall(7, 14, 19, 22, 34));
			if (i == 98)
				rs.add(new FrontBall(6, 9, 17, 30, 35));
			if (i == 99)
				rs.add(new FrontBall(8, 9, 17, 18, 24));
			if (i == 100)
				rs.add(new FrontBall(2, 5, 18, 19, 31));
			if (i == 101)
				rs.add(new FrontBall(5, 15, 21, 25, 29));
			if (i == 102)
				rs.add(new FrontBall(1, 12, 23, 24, 29));
			if (i == 103)
				rs.add(new FrontBall(4, 19, 20, 24, 29));
			if (i == 104)
				rs.add(new FrontBall(9, 11, 22, 27, 30));
			if (i == 105)
				rs.add(new FrontBall(4, 15, 22, 24, 32));
			if (i == 106)
				rs.add(new FrontBall(9, 12, 18, 23, 29));
			if (i == 107)
				rs.add(new FrontBall(4, 10, 19, 25, 27));
			if (i == 108)
				rs.add(new FrontBall(1, 4, 15, 21, 22));
			if (i == 109)
				rs.add(new FrontBall(6, 9, 19, 26, 34));
			if (i == 110)
				rs.add(new FrontBall(10, 14, 20, 21, 35));
			if (i == 111)
				rs.add(new FrontBall(2, 14, 17, 26, 34));
			if (i == 112)
				rs.add(new FrontBall(5, 6, 20, 31, 32));
			if (i == 113)
				rs.add(new FrontBall(5, 8, 17, 18, 23));
			if (i == 114)
				rs.add(new FrontBall(6, 7, 12, 18, 23));
			if (i == 115)
				rs.add(new FrontBall(14, 19, 20, 25, 31));
			if (i == 116)
				rs.add(new FrontBall(2, 27, 30, 32, 33));
			if (i == 117)
				rs.add(new FrontBall(5, 7, 9, 24, 32));
			if (i == 118)
				rs.add(new FrontBall(2, 7, 16, 20, 33));
			if (i == 119)
				rs.add(new FrontBall(5, 7, 13, 29, 35));
			if (i == 120)
				rs.add(new FrontBall(8, 15, 24, 26, 27));
			if (i == 121)
				rs.add(new FrontBall(1, 6, 12, 26, 31));
			if (i == 122)
				rs.add(new FrontBall(3, 12, 18, 29, 34));
			if (i == 123)
				rs.add(new FrontBall(3, 15, 23, 26, 32));
			if (i == 124)
				rs.add(new FrontBall(3, 29, 30, 32, 35));
			if (i == 125)
				rs.add(new FrontBall(7, 11, 18, 26, 28));
			if (i == 126)
				rs.add(new FrontBall(3, 4, 13, 24, 33));
			if (i == 127)
				rs.add(new FrontBall(2, 15, 18, 21, 22));
			if (i == 128)
				rs.add(new FrontBall(9, 11, 13, 18, 33));
			if (i == 129)
				rs.add(new FrontBall(5, 17, 20, 32, 33));
			if (i == 130)
				rs.add(new FrontBall(5, 18, 28, 33, 34));
			if (i == 131)
				rs.add(new FrontBall(3, 5, 8, 19, 34));
			if (i == 132)
				rs.add(new FrontBall(11, 17, 23, 26, 27));
			if (i == 133)
				rs.add(new FrontBall(15, 17, 19, 32, 33));
			if (i == 134)
				rs.add(new FrontBall(7, 18, 19, 32, 34));
			if (i == 135)
				rs.add(new FrontBall(1, 12, 15, 19, 22));
			if (i == 136)
				rs.add(new FrontBall(1, 11, 20, 21, 22));
			if (i == 137)
				rs.add(new FrontBall(1, 20, 22, 28, 29));
			if (i == 138)
				rs.add(new FrontBall(4, 7, 9, 20, 25));
			if (i == 139)
				rs.add(new FrontBall(2, 6, 19, 25, 32));
			if (i == 140)
				rs.add(new FrontBall(10, 16, 25, 26, 29));
			if (i == 141)
				rs.add(new FrontBall(2, 8, 21, 22, 29));
			if (i == 142)
				rs.add(new FrontBall(1, 5, 16, 19, 28));
			if (i == 143)
				rs.add(new FrontBall(6, 9, 24, 29, 32));
			if (i == 144)
				rs.add(new FrontBall(3, 21, 23, 29, 32));
			if (i == 145)
				rs.add(new FrontBall(4, 7, 17, 18, 19));
			if (i == 146)
				rs.add(new FrontBall(1, 5, 11, 14, 35));
			if (i == 147)
				rs.add(new FrontBall(5, 16, 17, 25, 34));
			if (i == 148)
				rs.add(new FrontBall(19, 27, 31, 32, 35));
			if (i == 149)
				rs.add(new FrontBall(10, 18, 19, 25, 26));
			if (i == 150)
				rs.add(new FrontBall(3, 6, 10, 13, 18));
			if (i == 151)
				rs.add(new FrontBall(5, 6, 23, 28, 32));
			if (i == 152)
				rs.add(new FrontBall(2, 4, 7, 23, 28));
			if (i == 153)
				rs.add(new FrontBall(1, 9, 24, 26, 34));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2016(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(1, 7, 19, 20, 30));
			if (i == 2)
				rs.add(new FrontBall(7, 12, 18, 25, 35));
			if (i == 3)
				rs.add(new FrontBall(4, 12, 17, 22, 26));
			if (i == 4)
				rs.add(new FrontBall(10, 20, 23, 32, 35));
			if (i == 5)
				rs.add(new FrontBall(6, 9, 12, 15, 20));
			if (i == 6)
				rs.add(new FrontBall(14, 16, 17, 22, 24));
			if (i == 7)
				rs.add(new FrontBall(2, 5, 14, 32, 35));
			if (i == 8)
				rs.add(new FrontBall(5, 12, 31, 34, 35));
			if (i == 9)
				rs.add(new FrontBall(5, 8, 10, 17, 20));
			if (i == 10)
				rs.add(new FrontBall(12, 13, 15, 16, 28));
			if (i == 11)
				rs.add(new FrontBall(2, 8, 10, 15, 23));
			if (i == 12)
				rs.add(new FrontBall(5, 7, 11, 23, 28));
			if (i == 13)
				rs.add(new FrontBall(3, 21, 23, 31, 35));
			if (i == 14)
				rs.add(new FrontBall(6, 8, 21, 24, 27));
			if (i == 15)
				rs.add(new FrontBall(1, 4, 10, 13, 30));
			if (i == 16)
				rs.add(new FrontBall(3, 10, 22, 29, 32));
			if (i == 17)
				rs.add(new FrontBall(11, 18, 24, 28, 29));
			if (i == 18)
				rs.add(new FrontBall(5, 10, 13, 27, 33));
			if (i == 19)
				rs.add(new FrontBall(4, 11, 15, 20, 26));
			if (i == 20)
				rs.add(new FrontBall(1, 16, 22, 29, 30));
			if (i == 21)
				rs.add(new FrontBall(1, 4, 9, 10, 35));
			if (i == 22)
				rs.add(new FrontBall(4, 18, 21, 30, 35));
			if (i == 23)
				rs.add(new FrontBall(4, 9, 14, 25, 27));
			if (i == 24)
				rs.add(new FrontBall(1, 2, 11, 15, 18));
			if (i == 25)
				rs.add(new FrontBall(3, 6, 13, 23, 24));
			if (i == 26)
				rs.add(new FrontBall(2, 6, 29, 30, 34));
			if (i == 27)
				rs.add(new FrontBall(6, 11, 13, 15, 28));
			if (i == 28)
				rs.add(new FrontBall(13, 18, 20, 23, 31));
			if (i == 29)
				rs.add(new FrontBall(20, 26, 27, 29, 32));
			if (i == 30)
				rs.add(new FrontBall(10, 19, 21, 29, 33));
			if (i == 31)
				rs.add(new FrontBall(3, 14, 24, 27, 29));
			if (i == 32)
				rs.add(new FrontBall(5, 9, 14, 20, 33));
			if (i == 33)
				rs.add(new FrontBall(3, 14, 15, 31, 35));
			if (i == 34)
				rs.add(new FrontBall(14, 18, 31, 32, 35));
			if (i == 35)
				rs.add(new FrontBall(17, 22, 24, 25, 29));
			if (i == 36)
				rs.add(new FrontBall(7, 15, 26, 30, 31));
			if (i == 37)
				rs.add(new FrontBall(3, 5, 13, 24, 34));
			if (i == 38)
				rs.add(new FrontBall(3, 7, 9, 15, 33));
			if (i == 39)
				rs.add(new FrontBall(1, 8, 16, 22, 28));
			if (i == 40)
				rs.add(new FrontBall(20, 22, 29, 30, 35));
			if (i == 41)
				rs.add(new FrontBall(12, 23, 24, 27, 34));
			if (i == 42)
				rs.add(new FrontBall(2, 6, 8, 19, 24));
			if (i == 43)
				rs.add(new FrontBall(1, 9, 16, 33, 34));
			if (i == 44)
				rs.add(new FrontBall(1, 6, 10, 20, 31));
			if (i == 45)
				rs.add(new FrontBall(7, 11, 25, 30, 33));
			if (i == 46)
				rs.add(new FrontBall(3, 19, 22, 32, 34));
			if (i == 47)
				rs.add(new FrontBall(2, 3, 23, 29, 32));
			if (i == 48)
				rs.add(new FrontBall(4, 12, 17, 25, 27));
			if (i == 49)
				rs.add(new FrontBall(3, 4, 5, 27, 33));
			if (i == 50)
				rs.add(new FrontBall(7, 17, 21, 29, 35));
			if (i == 51)
				rs.add(new FrontBall(16, 21, 23, 24, 32));
			if (i == 52)
				rs.add(new FrontBall(8, 14, 19, 20, 33));
			if (i == 53)
				rs.add(new FrontBall(4, 13, 15, 30, 35));
			if (i == 54)
				rs.add(new FrontBall(2, 5, 9, 21, 30));
			if (i == 55)
				rs.add(new FrontBall(6, 21, 27, 30, 34));
			if (i == 56)
				rs.add(new FrontBall(10, 12, 14, 31, 35));
			if (i == 57)
				rs.add(new FrontBall(8, 17, 19, 23, 30));
			if (i == 58)
				rs.add(new FrontBall(2, 15, 17, 23, 28));
			if (i == 59)
				rs.add(new FrontBall(2, 10, 27, 28, 33));
			if (i == 60)
				rs.add(new FrontBall(2, 6, 22, 27, 34));
			if (i == 61)
				rs.add(new FrontBall(9, 15, 17, 21, 23));
			if (i == 62)
				rs.add(new FrontBall(2, 10, 14, 15, 35));
			if (i == 63)
				rs.add(new FrontBall(8, 12, 22, 27, 35));
			if (i == 64)
				rs.add(new FrontBall(1, 2, 10, 18, 35));
			if (i == 65)
				rs.add(new FrontBall(1, 9, 18, 22, 24));
			if (i == 66)
				rs.add(new FrontBall(10, 28, 29, 31, 33));
			if (i == 67)
				rs.add(new FrontBall(2, 8, 11, 13, 19));
			if (i == 68)
				rs.add(new FrontBall(5, 7, 22, 26, 34));
			if (i == 69)
				rs.add(new FrontBall(14, 17, 19, 23, 30));
			if (i == 70)
				rs.add(new FrontBall(2, 9, 13, 19, 23));
			if (i == 71)
				rs.add(new FrontBall(8, 15, 19, 20, 33));
			if (i == 72)
				rs.add(new FrontBall(16, 20, 24, 26, 31));
			if (i == 73)
				rs.add(new FrontBall(7, 14, 17, 24, 27));
			if (i == 74)
				rs.add(new FrontBall(1, 5, 7, 11, 14));
			if (i == 75)
				rs.add(new FrontBall(3, 7, 17, 22, 31));
			if (i == 76)
				rs.add(new FrontBall(3, 8, 10, 17, 31));
			if (i == 77)
				rs.add(new FrontBall(9, 11, 14, 16, 35));
			if (i == 78)
				rs.add(new FrontBall(7, 18, 29, 31, 35));
			if (i == 79)
				rs.add(new FrontBall(7, 14, 15, 20, 27));
			if (i == 80)
				rs.add(new FrontBall(15, 20, 29, 30, 33));
			if (i == 81)
				rs.add(new FrontBall(6, 7, 18, 21, 33));
			if (i == 82)
				rs.add(new FrontBall(3, 8, 23, 28, 29));
			if (i == 83)
				rs.add(new FrontBall(1, 5, 9, 33, 35));
			if (i == 84)
				rs.add(new FrontBall(8, 12, 15, 26, 35));
			if (i == 85)
				rs.add(new FrontBall(14, 15, 27, 31, 32));
			if (i == 86)
				rs.add(new FrontBall(3, 5, 22, 25, 30));
			if (i == 87)
				rs.add(new FrontBall(3, 16, 17, 23, 25));
			if (i == 88)
				rs.add(new FrontBall(4, 6, 17, 21, 30));
			if (i == 89)
				rs.add(new FrontBall(7, 14, 17, 28, 34));
			if (i == 90)
				rs.add(new FrontBall(4, 6, 8, 28, 32));
			if (i == 91)
				rs.add(new FrontBall(8, 13, 17, 21, 22));
			if (i == 92)
				rs.add(new FrontBall(2, 13, 31, 33, 34));
			if (i == 93)
				rs.add(new FrontBall(1, 8, 14, 30, 35));
			if (i == 94)
				rs.add(new FrontBall(1, 14, 16, 17, 18));
			if (i == 95)
				rs.add(new FrontBall(8, 12, 18, 19, 21));
			if (i == 96)
				rs.add(new FrontBall(1, 6, 8, 12, 21));
			if (i == 97)
				rs.add(new FrontBall(6, 8, 18, 31, 33));
			if (i == 98)
				rs.add(new FrontBall(8, 9, 11, 20, 29));
			if (i == 99)
				rs.add(new FrontBall(3, 4, 12, 14, 27));
			if (i == 100)
				rs.add(new FrontBall(8, 12, 19, 26, 30));
			if (i == 101)
				rs.add(new FrontBall(4, 6, 28, 33, 35));
			if (i == 102)
				rs.add(new FrontBall(3, 5, 6, 34, 35));
			if (i == 103)
				rs.add(new FrontBall(5, 14, 20, 23, 29));
			if (i == 104)
				rs.add(new FrontBall(1, 20, 22, 23, 30));
			if (i == 105)
				rs.add(new FrontBall(8, 11, 31, 34, 35));
			if (i == 106)
				rs.add(new FrontBall(3, 21, 30, 33, 35));
			if (i == 107)
				rs.add(new FrontBall(2, 6, 19, 24, 26));
			if (i == 108)
				rs.add(new FrontBall(10, 17, 22, 23, 25));
			if (i == 109)
				rs.add(new FrontBall(3, 25, 28, 31, 34));
			if (i == 110)
				rs.add(new FrontBall(7, 20, 21, 23, 30));
			if (i == 111)
				rs.add(new FrontBall(4, 9, 22, 26, 27));
			if (i == 112)
				rs.add(new FrontBall(7, 22, 23, 31, 32));
			if (i == 113)
				rs.add(new FrontBall(10, 11, 17, 30, 34));
			if (i == 114)
				rs.add(new FrontBall(16, 17, 20, 32, 33));
			if (i == 115)
				rs.add(new FrontBall(1, 4, 15, 31, 34));
			if (i == 116)
				rs.add(new FrontBall(4, 6, 8, 19, 34));
			if (i == 117)
				rs.add(new FrontBall(3, 9, 14, 16, 23));
			if (i == 118)
				rs.add(new FrontBall(12, 15, 18, 24, 29));
			if (i == 119)
				rs.add(new FrontBall(2, 3, 9, 21, 22));
			if (i == 120)
				rs.add(new FrontBall(3, 10, 20, 32, 34));
			if (i == 121)
				rs.add(new FrontBall(4, 5, 8, 15, 20));
			if (i == 122)
				rs.add(new FrontBall(1, 3, 12, 14, 29));
			if (i == 123)
				rs.add(new FrontBall(4, 5, 13, 20, 32));
			if (i == 124)
				rs.add(new FrontBall(4, 13, 24, 26, 29));
			if (i == 125)
				rs.add(new FrontBall(6, 7, 8, 28, 30));
			if (i == 126)
				rs.add(new FrontBall(11, 13, 16, 19, 24));
			if (i == 127)
				rs.add(new FrontBall(1, 5, 15, 24, 26));
			if (i == 128)
				rs.add(new FrontBall(17, 20, 22, 30, 33));
			if (i == 129)
				rs.add(new FrontBall(7, 8, 19, 30, 35));
			if (i == 130)
				rs.add(new FrontBall(11, 23, 32, 33, 34));
			if (i == 131)
				rs.add(new FrontBall(6, 13, 25, 28, 30));
			if (i == 132)
				rs.add(new FrontBall(4, 18, 19, 22, 35));
			if (i == 133)
				rs.add(new FrontBall(1, 4, 5, 23, 28));
			if (i == 134)
				rs.add(new FrontBall(1, 3, 31, 32, 34));
			if (i == 135)
				rs.add(new FrontBall(1, 10, 12, 18, 35));
			if (i == 136)
				rs.add(new FrontBall(5, 6, 7, 19, 23));
			if (i == 137)
				rs.add(new FrontBall(7, 20, 23, 29, 34));
			if (i == 138)
				rs.add(new FrontBall(12, 13, 16, 29, 35));
			if (i == 139)
				rs.add(new FrontBall(13, 21, 30, 31, 35));
			if (i == 140)
				rs.add(new FrontBall(12, 16, 23, 29, 34));
			if (i == 141)
				rs.add(new FrontBall(2, 6, 7, 19, 28));
			if (i == 142)
				rs.add(new FrontBall(1, 6, 17, 23, 26));
			if (i == 143)
				rs.add(new FrontBall(4, 6, 22, 27, 31));
			if (i == 144)
				rs.add(new FrontBall(4, 5, 13, 22, 31));
			if (i == 145)
				rs.add(new FrontBall(1, 9, 11, 17, 28));
			if (i == 146)
				rs.add(new FrontBall(21, 22, 25, 29, 34));
			if (i == 147)
				rs.add(new FrontBall(7, 19, 20, 28, 30));
			if (i == 148)
				rs.add(new FrontBall(5, 14, 15, 23, 25));
			if (i == 149)
				rs.add(new FrontBall(1, 2, 3, 12, 33));
			if (i == 150)
				rs.add(new FrontBall(1, 10, 18, 24, 29));
			if (i == 151)
				rs.add(new FrontBall(4, 7, 11, 14, 21));
			if (i == 152)
				rs.add(new FrontBall(8, 17, 22, 24, 30));
			if (i == 153)
				rs.add(new FrontBall(13, 18, 25, 29, 35));
			if (i == 154)
				rs.add(new FrontBall(6, 16, 17, 21, 29));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2015(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(8, 9, 19, 27, 30));
			if (i == 2)
				rs.add(new FrontBall(3, 14, 20, 26, 32));
			if (i == 3)
				rs.add(new FrontBall(12, 19, 27, 28, 34));
			if (i == 4)
				rs.add(new FrontBall(3, 12, 14, 18, 28));
			if (i == 5)
				rs.add(new FrontBall(11, 14, 15, 18, 19));
			if (i == 6)
				rs.add(new FrontBall(6, 8, 30, 32, 33));
			if (i == 7)
				rs.add(new FrontBall(2, 7, 8, 14, 31));
			if (i == 8)
				rs.add(new FrontBall(7, 10, 11, 15, 17));
			if (i == 9)
				rs.add(new FrontBall(17, 22, 26, 27, 33));
			if (i == 10)
				rs.add(new FrontBall(2, 6, 17, 30, 35));
			if (i == 11)
				rs.add(new FrontBall(4, 13, 22, 25, 30));
			if (i == 12)
				rs.add(new FrontBall(3, 4, 6, 11, 31));
			if (i == 13)
				rs.add(new FrontBall(11, 15, 25, 28, 35));
			if (i == 14)
				rs.add(new FrontBall(8, 16, 25, 29, 35));
			if (i == 15)
				rs.add(new FrontBall(1, 5, 13, 17, 32));
			if (i == 16)
				rs.add(new FrontBall(6, 7, 16, 20, 34));
			if (i == 17)
				rs.add(new FrontBall(7, 13, 16, 17, 29));
			if (i == 18)
				rs.add(new FrontBall(4, 7, 10, 23, 31));
			if (i == 19)
				rs.add(new FrontBall(2, 8, 16, 22, 24));
			if (i == 20)
				rs.add(new FrontBall(11, 26, 28, 29, 32));
			if (i == 21)
				rs.add(new FrontBall(22, 23, 24, 26, 31));
			if (i == 22)
				rs.add(new FrontBall(9, 11, 14, 15, 26));
			if (i == 23)
				rs.add(new FrontBall(6, 9, 11, 12, 22));
			if (i == 24)
				rs.add(new FrontBall(2, 6, 8, 16, 34));
			if (i == 25)
				rs.add(new FrontBall(7, 10, 20, 22, 27));
			if (i == 26)
				rs.add(new FrontBall(11, 13, 14, 15, 22));
			if (i == 27)
				rs.add(new FrontBall(5, 21, 22, 25, 28));
			if (i == 28)
				rs.add(new FrontBall(3, 9, 28, 32, 33));
			if (i == 29)
				rs.add(new FrontBall(7, 10, 19, 30, 35));
			if (i == 30)
				rs.add(new FrontBall(9, 18, 19, 26, 31));
			if (i == 31)
				rs.add(new FrontBall(7, 21, 29, 32, 33));
			if (i == 32)
				rs.add(new FrontBall(6, 21, 25, 27, 30));
			if (i == 33)
				rs.add(new FrontBall(3, 17, 22, 26, 28));
			if (i == 34)
				rs.add(new FrontBall(4, 8, 15, 18, 26));
			if (i == 35)
				rs.add(new FrontBall(22, 24, 29, 30, 35));
			if (i == 36)
				rs.add(new FrontBall(14, 18, 20, 23, 24));
			if (i == 37)
				rs.add(new FrontBall(10, 16, 21, 28, 31));
			if (i == 38)
				rs.add(new FrontBall(12, 19, 22, 31, 35));
			if (i == 39)
				rs.add(new FrontBall(3, 6, 7, 16, 25));
			if (i == 40)
				rs.add(new FrontBall(2, 9, 10, 23, 35));
			if (i == 41)
				rs.add(new FrontBall(1, 11, 21, 23, 28));
			if (i == 42)
				rs.add(new FrontBall(3, 7, 12, 17, 24));
			if (i == 43)
				rs.add(new FrontBall(2, 20, 22, 25, 29));
			if (i == 44)
				rs.add(new FrontBall(16, 18, 27, 31, 33));
			if (i == 45)
				rs.add(new FrontBall(8, 9, 22, 29, 30));
			if (i == 46)
				rs.add(new FrontBall(5, 7, 10, 22, 26));
			if (i == 47)
				rs.add(new FrontBall(1, 2, 17, 23, 31));
			if (i == 48)
				rs.add(new FrontBall(10, 11, 22, 24, 33));
			if (i == 49)
				rs.add(new FrontBall(8, 9, 11, 15, 22));
			if (i == 50)
				rs.add(new FrontBall(6, 7, 10, 20, 28));
			if (i == 51)
				rs.add(new FrontBall(1, 2, 11, 16, 21));
			if (i == 52)
				rs.add(new FrontBall(13, 19, 24, 27, 29));
			if (i == 53)
				rs.add(new FrontBall(8, 25, 28, 29, 32));
			if (i == 54)
				rs.add(new FrontBall(2, 9, 15, 24, 34));
			if (i == 55)
				rs.add(new FrontBall(6, 11, 14, 20, 30));
			if (i == 56)
				rs.add(new FrontBall(6, 12, 19, 26, 35));
			if (i == 57)
				rs.add(new FrontBall(1, 5, 7, 14, 26));
			if (i == 58)
				rs.add(new FrontBall(10, 14, 20, 27, 30));
			if (i == 59)
				rs.add(new FrontBall(7, 9, 19, 23, 32));
			if (i == 60)
				rs.add(new FrontBall(16, 24, 25, 26, 33));
			if (i == 61)
				rs.add(new FrontBall(6, 7, 8, 16, 22));
			if (i == 62)
				rs.add(new FrontBall(6, 7, 13, 14, 15));
			if (i == 63)
				rs.add(new FrontBall(1, 4, 6, 34, 35));
			if (i == 64)
				rs.add(new FrontBall(2, 8, 20, 28, 31));
			if (i == 65)
				rs.add(new FrontBall(4, 5, 7, 13, 35));
			if (i == 66)
				rs.add(new FrontBall(1, 3, 7, 13, 29));
			if (i == 67)
				rs.add(new FrontBall(4, 10, 18, 24, 27));
			if (i == 68)
				rs.add(new FrontBall(2, 3, 20, 31, 35));
			if (i == 69)
				rs.add(new FrontBall(2, 9, 11, 22, 25));
			if (i == 70)
				rs.add(new FrontBall(3, 9, 12, 17, 18));
			if (i == 71)
				rs.add(new FrontBall(4, 6, 13, 16, 34));
			if (i == 72)
				rs.add(new FrontBall(19, 20, 21, 31, 33));
			if (i == 73)
				rs.add(new FrontBall(9, 26, 27, 30, 34));
			if (i == 74)
				rs.add(new FrontBall(1, 12, 21, 27, 33));
			if (i == 75)
				rs.add(new FrontBall(13, 14, 26, 27, 33));
			if (i == 76)
				rs.add(new FrontBall(3, 19, 21, 31, 34));
			if (i == 77)
				rs.add(new FrontBall(1, 16, 17, 22, 28));
			if (i == 78)
				rs.add(new FrontBall(19, 24, 26, 28, 33));
			if (i == 79)
				rs.add(new FrontBall(1, 9, 17, 23, 24));
			if (i == 80)
				rs.add(new FrontBall(14, 20, 29, 30, 32));
			if (i == 81)
				rs.add(new FrontBall(3, 4, 10, 13, 17));
			if (i == 82)
				rs.add(new FrontBall(8, 15, 28, 31, 33));
			if (i == 83)
				rs.add(new FrontBall(14, 16, 19, 25, 29));
			if (i == 84)
				rs.add(new FrontBall(10, 20, 21, 32, 34));
			if (i == 85)
				rs.add(new FrontBall(2, 3, 4, 6, 16));
			if (i == 86)
				rs.add(new FrontBall(5, 9, 11, 15, 32));
			if (i == 87)
				rs.add(new FrontBall(2, 5, 15, 17, 22));
			if (i == 88)
				rs.add(new FrontBall(5, 15, 28, 31, 34));
			if (i == 89)
				rs.add(new FrontBall(5, 12, 18, 20, 27));
			if (i == 90)
				rs.add(new FrontBall(6, 9, 11, 17, 21));
			if (i == 91)
				rs.add(new FrontBall(2, 7, 28, 29, 30));
			if (i == 92)
				rs.add(new FrontBall(2, 14, 21, 27, 34));
			if (i == 93)
				rs.add(new FrontBall(16, 17, 25, 26, 27));
			if (i == 94)
				rs.add(new FrontBall(2, 3, 10, 11, 29));
			if (i == 95)
				rs.add(new FrontBall(8, 14, 26, 34, 35));
			if (i == 96)
				rs.add(new FrontBall(3, 9, 12, 18, 21));
			if (i == 97)
				rs.add(new FrontBall(4, 16, 17, 26, 27));
			if (i == 98)
				rs.add(new FrontBall(9, 14, 21, 27, 33));
			if (i == 99)
				rs.add(new FrontBall(9, 12, 14, 22, 25));
			if (i == 100)
				rs.add(new FrontBall(9, 15, 18, 23, 32));
			if (i == 101)
				rs.add(new FrontBall(6, 12, 17, 18, 32));
			if (i == 102)
				rs.add(new FrontBall(11, 14, 15, 33, 34));
			if (i == 103)
				rs.add(new FrontBall(7, 9, 15, 25, 34));
			if (i == 104)
				rs.add(new FrontBall(16, 19, 25, 30, 34));
			if (i == 105)
				rs.add(new FrontBall(8, 9, 15, 21, 27));
			if (i == 106)
				rs.add(new FrontBall(2, 11, 13, 22, 30));
			if (i == 107)
				rs.add(new FrontBall(3, 23, 25, 28, 29));
			if (i == 108)
				rs.add(new FrontBall(1, 13, 16, 26, 31));
			if (i == 109)
				rs.add(new FrontBall(1, 6, 11, 22, 31));
			if (i == 110)
				rs.add(new FrontBall(2, 7, 10, 22, 30));
			if (i == 111)
				rs.add(new FrontBall(7, 8, 16, 24, 28));
			if (i == 112)
				rs.add(new FrontBall(4, 5, 15, 19, 28));
			if (i == 113)
				rs.add(new FrontBall(1, 14, 21, 29, 33));
			if (i == 114)
				rs.add(new FrontBall(9, 18, 24, 31, 34));
			if (i == 115)
				rs.add(new FrontBall(8, 12, 13, 14, 16));
			if (i == 116)
				rs.add(new FrontBall(7, 10, 19, 24, 33));
			if (i == 117)
				rs.add(new FrontBall(6, 17, 20, 30, 33));
			if (i == 118)
				rs.add(new FrontBall(3, 7, 20, 24, 31));
			if (i == 119)
				rs.add(new FrontBall(1, 8, 12, 16, 21));
			if (i == 120)
				rs.add(new FrontBall(1, 9, 15, 24, 32));
			if (i == 121)
				rs.add(new FrontBall(2, 4, 17, 27, 28));
			if (i == 122)
				rs.add(new FrontBall(11, 13, 15, 26, 35));
			if (i == 123)
				rs.add(new FrontBall(4, 15, 27, 29, 30));
			if (i == 124)
				rs.add(new FrontBall(4, 6, 12, 31, 32));
			if (i == 125)
				rs.add(new FrontBall(2, 3, 15, 17, 28));
			if (i == 126)
				rs.add(new FrontBall(4, 5, 8, 9, 21));
			if (i == 127)
				rs.add(new FrontBall(9, 11, 14, 19, 30));
			if (i == 128)
				rs.add(new FrontBall(10, 12, 23, 30, 32));
			if (i == 129)
				rs.add(new FrontBall(1, 6, 23, 25, 29));
			if (i == 130)
				rs.add(new FrontBall(17, 25, 31, 32, 34));
			if (i == 131)
				rs.add(new FrontBall(11, 17, 19, 20, 27));
			if (i == 132)
				rs.add(new FrontBall(3, 8, 14, 18, 27));
			if (i == 133)
				rs.add(new FrontBall(3, 7, 8, 25, 30));
			if (i == 134)
				rs.add(new FrontBall(1, 2, 6, 15, 35));
			if (i == 135)
				rs.add(new FrontBall(5, 16, 20, 25, 29));
			if (i == 136)
				rs.add(new FrontBall(5, 20, 23, 29, 32));
			if (i == 137)
				rs.add(new FrontBall(14, 17, 21, 23, 26));
			if (i == 138)
				rs.add(new FrontBall(1, 16, 20, 29, 32));
			if (i == 139)
				rs.add(new FrontBall(2, 3, 5, 25, 32));
			if (i == 140)
				rs.add(new FrontBall(1, 11, 15, 26, 35));
			if (i == 141)
				rs.add(new FrontBall(2, 4, 15, 19, 31));
			if (i == 142)
				rs.add(new FrontBall(12, 14, 22, 26, 30));
			if (i == 143)
				rs.add(new FrontBall(9, 20, 31, 33, 35));
			if (i == 144)
				rs.add(new FrontBall(1, 9, 24, 26, 29));
			if (i == 145)
				rs.add(new FrontBall(6, 7, 20, 29, 32));
			if (i == 146)
				rs.add(new FrontBall(4, 15, 19, 27, 31));
			if (i == 147)
				rs.add(new FrontBall(1, 2, 13, 18, 19));
			if (i == 148)
				rs.add(new FrontBall(8, 11, 27, 31, 33));
			if (i == 149)
				rs.add(new FrontBall(4, 6, 10, 12, 28));
			if (i == 150)
				rs.add(new FrontBall(4, 13, 18, 25, 33));
			if (i == 151)
				rs.add(new FrontBall(15, 16, 18, 30, 35));
			if (i == 152)
				rs.add(new FrontBall(4, 5, 22, 29, 35));
			if (i == 153)
				rs.add(new FrontBall(1, 7, 22, 27, 33));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2014(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(5, 13, 20, 23, 29));
			if (i == 2)
				rs.add(new FrontBall(1, 12, 21, 24, 29));
			if (i == 3)
				rs.add(new FrontBall(7, 11, 13, 21, 33));
			if (i == 4)
				rs.add(new FrontBall(7, 10, 19, 27, 28));
			if (i == 5)
				rs.add(new FrontBall(15, 17, 18, 29, 33));
			if (i == 6)
				rs.add(new FrontBall(1, 4, 7, 16, 35));
			if (i == 7)
				rs.add(new FrontBall(8, 11, 14, 21, 32));
			if (i == 8)
				rs.add(new FrontBall(11, 13, 20, 28, 35));
			if (i == 9)
				rs.add(new FrontBall(10, 18, 25, 29, 33));
			if (i == 10)
				rs.add(new FrontBall(5, 10, 20, 26, 27));
			if (i == 11)
				rs.add(new FrontBall(4, 6, 14, 24, 35));
			if (i == 12)
				rs.add(new FrontBall(9, 20, 21, 23, 29));
			if (i == 13)
				rs.add(new FrontBall(10, 11, 13, 22, 28));
			if (i == 14)
				rs.add(new FrontBall(1, 9, 11, 27, 29));
			if (i == 15)
				rs.add(new FrontBall(4, 6, 18, 20, 30));
			if (i == 16)
				rs.add(new FrontBall(4, 6, 13, 24, 34));
			if (i == 17)
				rs.add(new FrontBall(5, 10, 11, 23, 34));
			if (i == 18)
				rs.add(new FrontBall(8, 9, 12, 28, 34));
			if (i == 19)
				rs.add(new FrontBall(7, 12, 22, 29, 32));
			if (i == 20)
				rs.add(new FrontBall(1, 14, 17, 30, 35));
			if (i == 21)
				rs.add(new FrontBall(6, 10, 17, 23, 24));
			if (i == 22)
				rs.add(new FrontBall(3, 6, 10, 16, 25));
			if (i == 23)
				rs.add(new FrontBall(4, 13, 15, 29, 33));
			if (i == 24)
				rs.add(new FrontBall(7, 11, 15, 31, 32));
			if (i == 25)
				rs.add(new FrontBall(19, 20, 27, 32, 34));
			if (i == 26)
				rs.add(new FrontBall(5, 10, 12, 15, 26));
			if (i == 27)
				rs.add(new FrontBall(9, 10, 24, 28, 29));
			if (i == 28)
				rs.add(new FrontBall(3, 10, 20, 25, 30));
			if (i == 29)
				rs.add(new FrontBall(3, 21, 22, 23, 35));
			if (i == 30)
				rs.add(new FrontBall(3, 14, 18, 29, 35));
			if (i == 31)
				rs.add(new FrontBall(6, 15, 27, 32, 33));
			if (i == 32)
				rs.add(new FrontBall(2, 5, 6, 9, 31));
			if (i == 33)
				rs.add(new FrontBall(1, 7, 8, 28, 29));
			if (i == 34)
				rs.add(new FrontBall(3, 11, 14, 27, 32));
			if (i == 35)
				rs.add(new FrontBall(9, 12, 14, 28, 29));
			if (i == 36)
				rs.add(new FrontBall(1, 2, 12, 17, 29));
			if (i == 37)
				rs.add(new FrontBall(3, 4, 8, 19, 34));
			if (i == 38)
				rs.add(new FrontBall(7, 8, 12, 20, 32));
			if (i == 39)
				rs.add(new FrontBall(2, 5, 11, 15, 20));
			if (i == 40)
				rs.add(new FrontBall(12, 15, 21, 30, 33));
			if (i == 41)
				rs.add(new FrontBall(5, 7, 11, 15, 18));
			if (i == 42)
				rs.add(new FrontBall(16, 21, 25, 27, 35));
			if (i == 43)
				rs.add(new FrontBall(1, 11, 23, 29, 30));
			if (i == 44)
				rs.add(new FrontBall(22, 23, 25, 27, 35));
			if (i == 45)
				rs.add(new FrontBall(6, 10, 12, 16, 30));
			if (i == 46)
				rs.add(new FrontBall(3, 15, 18, 21, 26));
			if (i == 47)
				rs.add(new FrontBall(6, 17, 18, 30, 34));
			if (i == 48)
				rs.add(new FrontBall(1, 2, 5, 15, 35));
			if (i == 49)
				rs.add(new FrontBall(3, 15, 17, 22, 31));
			if (i == 50)
				rs.add(new FrontBall(10, 18, 27, 28, 35));
			if (i == 51)
				rs.add(new FrontBall(1, 7, 11, 29, 30));
			if (i == 52)
				rs.add(new FrontBall(14, 19, 21, 24, 30));
			if (i == 53)
				rs.add(new FrontBall(2, 11, 17, 27, 30));
			if (i == 54)
				rs.add(new FrontBall(2, 3, 20, 25, 34));
			if (i == 55)
				rs.add(new FrontBall(4, 23, 26, 27, 35));
			if (i == 56)
				rs.add(new FrontBall(12, 18, 28, 29, 35));
			if (i == 57)
				rs.add(new FrontBall(8, 10, 20, 27, 33));
			if (i == 58)
				rs.add(new FrontBall(9, 15, 22, 24, 26));
			if (i == 59)
				rs.add(new FrontBall(7, 15, 17, 25, 29));
			if (i == 60)
				rs.add(new FrontBall(12, 22, 29, 30, 34));
			if (i == 61)
				rs.add(new FrontBall(4, 11, 17, 20, 29));
			if (i == 62)
				rs.add(new FrontBall(4, 7, 17, 24, 25));
			if (i == 63)
				rs.add(new FrontBall(11, 17, 21, 23, 34));
			if (i == 64)
				rs.add(new FrontBall(8, 15, 33, 34, 35));
			if (i == 65)
				rs.add(new FrontBall(7, 12, 19, 31, 33));
			if (i == 66)
				rs.add(new FrontBall(8, 14, 16, 20, 31));
			if (i == 67)
				rs.add(new FrontBall(3, 18, 23, 24, 31));
			if (i == 68)
				rs.add(new FrontBall(5, 15, 24, 29, 35));
			if (i == 69)
				rs.add(new FrontBall(16, 22, 27, 29, 31));
			if (i == 70)
				rs.add(new FrontBall(1, 2, 7, 10, 32));
			if (i == 71)
				rs.add(new FrontBall(4, 14, 15, 22, 23));
			if (i == 72)
				rs.add(new FrontBall(17, 19, 22, 24, 30));
			if (i == 73)
				rs.add(new FrontBall(4, 5, 7, 13, 35));
			if (i == 74)
				rs.add(new FrontBall(6, 11, 22, 27, 30));
			if (i == 75)
				rs.add(new FrontBall(5, 7, 29, 32, 35));
			if (i == 76)
				rs.add(new FrontBall(5, 10, 19, 31, 32));
			if (i == 77)
				rs.add(new FrontBall(9, 16, 26, 31, 32));
			if (i == 78)
				rs.add(new FrontBall(10, 15, 16, 22, 28));
			if (i == 79)
				rs.add(new FrontBall(9, 10, 20, 31, 32));
			if (i == 80)
				rs.add(new FrontBall(17, 20, 23, 25, 27));
			if (i == 81)
				rs.add(new FrontBall(3, 5, 8, 10, 25));
			if (i == 82)
				rs.add(new FrontBall(1, 8, 18, 23, 25));
			if (i == 83)
				rs.add(new FrontBall(18, 20, 24, 33, 35));
			if (i == 84)
				rs.add(new FrontBall(2, 7, 9, 11, 28));
			if (i == 85)
				rs.add(new FrontBall(6, 12, 13, 25, 29));
			if (i == 86)
				rs.add(new FrontBall(6, 8, 27, 29, 35));
			if (i == 87)
				rs.add(new FrontBall(4, 7, 31, 33, 35));
			if (i == 88)
				rs.add(new FrontBall(7, 13, 20, 25, 26));
			if (i == 89)
				rs.add(new FrontBall(2, 8, 12, 29, 30));
			if (i == 90)
				rs.add(new FrontBall(2, 3, 20, 23, 28));
			if (i == 91)
				rs.add(new FrontBall(10, 16, 18, 29, 32));
			if (i == 92)
				rs.add(new FrontBall(2, 18, 27, 30, 32));
			if (i == 93)
				rs.add(new FrontBall(3, 8, 30, 32, 34));
			if (i == 94)
				rs.add(new FrontBall(13, 14, 24, 25, 34));
			if (i == 95)
				rs.add(new FrontBall(6, 22, 30, 31, 34));
			if (i == 96)
				rs.add(new FrontBall(3, 7, 21, 23, 31));
			if (i == 97)
				rs.add(new FrontBall(3, 15, 20, 21, 23));
			if (i == 98)
				rs.add(new FrontBall(16, 18, 22, 25, 35));
			if (i == 99)
				rs.add(new FrontBall(15, 21, 22, 23, 33));
			if (i == 100)
				rs.add(new FrontBall(2, 4, 8, 12, 35));
			if (i == 101)
				rs.add(new FrontBall(9, 10, 12, 17, 28));
			if (i == 102)
				rs.add(new FrontBall(1, 7, 14, 19, 20));
			if (i == 103)
				rs.add(new FrontBall(14, 20, 23, 25, 26));
			if (i == 104)
				rs.add(new FrontBall(7, 13, 14, 28, 32));
			if (i == 105)
				rs.add(new FrontBall(4, 10, 26, 29, 32));
			if (i == 106)
				rs.add(new FrontBall(5, 9, 11, 20, 22));
			if (i == 107)
				rs.add(new FrontBall(5, 13, 14, 21, 34));
			if (i == 108)
				rs.add(new FrontBall(1, 2, 13, 23, 35));
			if (i == 109)
				rs.add(new FrontBall(15, 18, 20, 21, 23));
			if (i == 110)
				rs.add(new FrontBall(9, 18, 19, 22, 24));
			if (i == 111)
				rs.add(new FrontBall(11, 16, 18, 20, 29));
			if (i == 112)
				rs.add(new FrontBall(3, 5, 14, 18, 32));
			if (i == 113)
				rs.add(new FrontBall(2, 13, 17, 19, 23));
			if (i == 114)
				rs.add(new FrontBall(3, 16, 24, 30, 33));
			if (i == 115)
				rs.add(new FrontBall(1, 5, 26, 29, 30));
			if (i == 116)
				rs.add(new FrontBall(6, 13, 15, 24, 27));
			if (i == 117)
				rs.add(new FrontBall(3, 14, 17, 18, 33));
			if (i == 118)
				rs.add(new FrontBall(2, 3, 23, 24, 26));
			if (i == 119)
				rs.add(new FrontBall(4, 8, 9, 13, 18));
			if (i == 120)
				rs.add(new FrontBall(1, 4, 6, 18, 33));
			if (i == 121)
				rs.add(new FrontBall(13, 16, 18, 22, 32));
			if (i == 122)
				rs.add(new FrontBall(3, 10, 25, 26, 35));
			if (i == 123)
				rs.add(new FrontBall(1, 9, 12, 22, 25));
			if (i == 124)
				rs.add(new FrontBall(1, 3, 28, 29, 35));
			if (i == 125)
				rs.add(new FrontBall(12, 15, 19, 23, 31));
			if (i == 126)
				rs.add(new FrontBall(2, 9, 22, 30, 34));
			if (i == 127)
				rs.add(new FrontBall(2, 4, 6, 15, 19));
			if (i == 128)
				rs.add(new FrontBall(2, 4, 16, 22, 34));
			if (i == 129)
				rs.add(new FrontBall(7, 22, 28, 30, 32));
			if (i == 130)
				rs.add(new FrontBall(2, 18, 31, 32, 33));
			if (i == 131)
				rs.add(new FrontBall(3, 16, 19, 23, 27));
			if (i == 132)
				rs.add(new FrontBall(1, 3, 4, 19, 32));
			if (i == 133)
				rs.add(new FrontBall(2, 8, 12, 14, 18));
			if (i == 134)
				rs.add(new FrontBall(2, 5, 7, 11, 32));
			if (i == 135)
				rs.add(new FrontBall(20, 26, 28, 30, 35));
			if (i == 136)
				rs.add(new FrontBall(4, 18, 20, 34, 35));
			if (i == 137)
				rs.add(new FrontBall(2, 11, 16, 22, 34));
			if (i == 138)
				rs.add(new FrontBall(1, 7, 29, 32, 34));
			if (i == 139)
				rs.add(new FrontBall(3, 5, 7, 15, 34));
			if (i == 140)
				rs.add(new FrontBall(1, 19, 20, 25, 34));
			if (i == 141)
				rs.add(new FrontBall(4, 17, 20, 26, 29));
			if (i == 142)
				rs.add(new FrontBall(18, 21, 25, 28, 30));
			if (i == 143)
				rs.add(new FrontBall(1, 11, 14, 18, 25));
			if (i == 144)
				rs.add(new FrontBall(1, 21, 24, 25, 35));
			if (i == 145)
				rs.add(new FrontBall(15, 19, 22, 24, 26));
			if (i == 146)
				rs.add(new FrontBall(2, 16, 23, 24, 28));
			if (i == 147)
				rs.add(new FrontBall(5, 9, 14, 26, 34));
			if (i == 148)
				rs.add(new FrontBall(3, 9, 10, 11, 20));
			if (i == 149)
				rs.add(new FrontBall(2, 13, 19, 26, 35));
			if (i == 150)
				rs.add(new FrontBall(19, 21, 30, 33, 35));
			if (i == 151)
				rs.add(new FrontBall(3, 8, 26, 31, 32));
			if (i == 152)
				rs.add(new FrontBall(5, 12, 18, 24, 33));
			if (i == 153)
				rs.add(new FrontBall(1, 8, 13, 24, 32));
			if (i == 154)
				rs.add(new FrontBall(5, 12, 17, 23, 28));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2013(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(6, 9, 11, 31, 32));
			if (i == 2)
				rs.add(new FrontBall(4, 20, 27, 31, 32));
			if (i == 3)
				rs.add(new FrontBall(1, 16, 18, 21, 31));
			if (i == 4)
				rs.add(new FrontBall(7, 8, 12, 20, 25));
			if (i == 5)
				rs.add(new FrontBall(18, 22, 26, 28, 31));
			if (i == 6)
				rs.add(new FrontBall(8, 20, 25, 31, 32));
			if (i == 7)
				rs.add(new FrontBall(14, 29, 32, 33, 34));
			if (i == 8)
				rs.add(new FrontBall(2, 7, 25, 29, 34));
			if (i == 9)
				rs.add(new FrontBall(10, 17, 19, 27, 29));
			if (i == 10)
				rs.add(new FrontBall(9, 15, 17, 18, 29));
			if (i == 11)
				rs.add(new FrontBall(1, 2, 8, 15, 23));
			if (i == 12)
				rs.add(new FrontBall(1, 14, 31, 32, 34));
			if (i == 13)
				rs.add(new FrontBall(13, 15, 29, 30, 35));
			if (i == 14)
				rs.add(new FrontBall(5, 8, 25, 29, 31));
			if (i == 15)
				rs.add(new FrontBall(14, 15, 26, 32, 33));
			if (i == 16)
				rs.add(new FrontBall(5, 15, 19, 27, 32));
			if (i == 17)
				rs.add(new FrontBall(11, 14, 22, 29, 34));
			if (i == 18)
				rs.add(new FrontBall(20, 23, 31, 33, 34));
			if (i == 19)
				rs.add(new FrontBall(6, 12, 17, 29, 30));
			if (i == 20)
				rs.add(new FrontBall(6, 11, 20, 31, 32));
			if (i == 21)
				rs.add(new FrontBall(23, 24, 28, 30, 33));
			if (i == 22)
				rs.add(new FrontBall(3, 4, 13, 17, 23));
			if (i == 23)
				rs.add(new FrontBall(5, 19, 24, 26, 35));
			if (i == 24)
				rs.add(new FrontBall(9, 12, 14, 18, 24));
			if (i == 25)
				rs.add(new FrontBall(3, 23, 25, 26, 28));
			if (i == 26)
				rs.add(new FrontBall(2, 10, 16, 30, 33));
			if (i == 27)
				rs.add(new FrontBall(3, 12, 14, 24, 35));
			if (i == 28)
				rs.add(new FrontBall(13, 19, 28, 30, 34));
			if (i == 29)
				rs.add(new FrontBall(5, 7, 17, 25, 26));
			if (i == 30)
				rs.add(new FrontBall(3, 5, 9, 10, 28));
			if (i == 31)
				rs.add(new FrontBall(12, 17, 18, 26, 32));
			if (i == 32)
				rs.add(new FrontBall(12, 27, 28, 33, 35));
			if (i == 33)
				rs.add(new FrontBall(12, 18, 22, 28, 31));
			if (i == 34)
				rs.add(new FrontBall(1, 3, 11, 19, 29));
			if (i == 35)
				rs.add(new FrontBall(5, 14, 28, 32, 34));
			if (i == 36)
				rs.add(new FrontBall(8, 12, 32, 33, 35));
			if (i == 37)
				rs.add(new FrontBall(2, 26, 31, 32, 34));
			if (i == 38)
				rs.add(new FrontBall(1, 19, 24, 25, 26));
			if (i == 39)
				rs.add(new FrontBall(6, 23, 30, 33, 35));
			if (i == 40)
				rs.add(new FrontBall(16, 17, 22, 26, 35));
			if (i == 41)
				rs.add(new FrontBall(3, 13, 14, 15, 34));
			if (i == 42)
				rs.add(new FrontBall(2, 6, 22, 23, 33));
			if (i == 43)
				rs.add(new FrontBall(7, 13, 25, 34, 35));
			if (i == 44)
				rs.add(new FrontBall(7, 11, 13, 18, 28));
			if (i == 45)
				rs.add(new FrontBall(8, 11, 12, 21, 25));
			if (i == 46)
				rs.add(new FrontBall(15, 16, 19, 25, 32));
			if (i == 47)
				rs.add(new FrontBall(12, 20, 28, 30, 35));
			if (i == 48)
				rs.add(new FrontBall(10, 11, 23, 32, 33));
			if (i == 49)
				rs.add(new FrontBall(18, 22, 25, 31, 32));
			if (i == 50)
				rs.add(new FrontBall(14, 22, 30, 32, 33));
			if (i == 51)
				rs.add(new FrontBall(5, 8, 15, 18, 33));
			if (i == 52)
				rs.add(new FrontBall(1, 2, 10, 29, 31));
			if (i == 53)
				rs.add(new FrontBall(13, 31, 33, 34, 35));
			if (i == 54)
				rs.add(new FrontBall(5, 8, 21, 30, 32));
			if (i == 55)
				rs.add(new FrontBall(4, 5, 22, 23, 24));
			if (i == 56)
				rs.add(new FrontBall(11, 22, 30, 32, 35));
			if (i == 57)
				rs.add(new FrontBall(7, 15, 27, 33, 35));
			if (i == 58)
				rs.add(new FrontBall(20, 21, 27, 31, 35));
			if (i == 59)
				rs.add(new FrontBall(3, 8, 11, 24, 27));
			if (i == 60)
				rs.add(new FrontBall(15, 25, 26, 32, 35));
			if (i == 61)
				rs.add(new FrontBall(1, 14, 18, 21, 32));
			if (i == 62)
				rs.add(new FrontBall(1, 5, 8, 9, 12));
			if (i == 63)
				rs.add(new FrontBall(3, 5, 11, 27, 28));
			if (i == 64)
				rs.add(new FrontBall(21, 24, 26, 28, 32));
			if (i == 65)
				rs.add(new FrontBall(9, 28, 31, 34, 35));
			if (i == 66)
				rs.add(new FrontBall(6, 7, 13, 33, 34));
			if (i == 67)
				rs.add(new FrontBall(2, 3, 5, 8, 29));
			if (i == 68)
				rs.add(new FrontBall(10, 17, 27, 34, 35));
			if (i == 69)
				rs.add(new FrontBall(6, 12, 13, 16, 30));
			if (i == 70)
				rs.add(new FrontBall(9, 12, 18, 21, 29));
			if (i == 71)
				rs.add(new FrontBall(13, 19, 26, 27, 28));
			if (i == 72)
				rs.add(new FrontBall(12, 27, 28, 33, 35));
			if (i == 73)
				rs.add(new FrontBall(3, 5, 23, 27, 31));
			if (i == 74)
				rs.add(new FrontBall(6, 14, 20, 24, 32));
			if (i == 75)
				rs.add(new FrontBall(1, 11, 13, 19, 35));
			if (i == 76)
				rs.add(new FrontBall(13, 15, 16, 26, 27));
			if (i == 77)
				rs.add(new FrontBall(24, 26, 30, 32, 35));
			if (i == 78)
				rs.add(new FrontBall(2, 7, 23, 31, 33));
			if (i == 79)
				rs.add(new FrontBall(9, 10, 17, 21, 34));
			if (i == 80)
				rs.add(new FrontBall(6, 21, 23, 27, 31));
			if (i == 81)
				rs.add(new FrontBall(7, 9, 15, 17, 23));
			if (i == 82)
				rs.add(new FrontBall(3, 9, 25, 26, 33));
			if (i == 83)
				rs.add(new FrontBall(26, 29, 30, 32, 35));
			if (i == 84)
				rs.add(new FrontBall(8, 22, 26, 29, 35));
			if (i == 85)
				rs.add(new FrontBall(8, 19, 23, 27, 32));
			if (i == 86)
				rs.add(new FrontBall(9, 16, 26, 29, 31));
			if (i == 87)
				rs.add(new FrontBall(9, 12, 22, 32, 34));
			if (i == 88)
				rs.add(new FrontBall(3, 5, 8, 33, 35));
			if (i == 89)
				rs.add(new FrontBall(6, 7, 23, 24, 29));
			if (i == 90)
				rs.add(new FrontBall(2, 26, 30, 31, 33));
			if (i == 91)
				rs.add(new FrontBall(4, 9, 28, 34, 35));
			if (i == 92)
				rs.add(new FrontBall(7, 10, 21, 27, 33));
			if (i == 93)
				rs.add(new FrontBall(1, 5, 17, 18, 26));
			if (i == 94)
				rs.add(new FrontBall(3, 28, 33, 34, 35));
			if (i == 95)
				rs.add(new FrontBall(3, 17, 28, 30, 33));
			if (i == 96)
				rs.add(new FrontBall(17, 19, 20, 22, 26));
			if (i == 97)
				rs.add(new FrontBall(7, 8, 13, 17, 32));
			if (i == 98)
				rs.add(new FrontBall(2, 6, 16, 29, 34));
			if (i == 99)
				rs.add(new FrontBall(4, 11, 28, 30, 33));
			if (i == 100)
				rs.add(new FrontBall(9, 12, 24, 26, 30));
			if (i == 101)
				rs.add(new FrontBall(4, 9, 13, 15, 32));
			if (i == 102)
				rs.add(new FrontBall(6, 12, 15, 19, 26));
			if (i == 103)
				rs.add(new FrontBall(5, 8, 13, 16, 31));
			if (i == 104)
				rs.add(new FrontBall(2, 5, 11, 27, 29));
			if (i == 105)
				rs.add(new FrontBall(7, 13, 27, 30, 34));
			if (i == 106)
				rs.add(new FrontBall(6, 7, 12, 13, 27));
			if (i == 107)
				rs.add(new FrontBall(7, 13, 14, 18, 25));
			if (i == 108)
				rs.add(new FrontBall(5, 10, 13, 15, 18));
			if (i == 109)
				rs.add(new FrontBall(13, 20, 26, 29, 32));
			if (i == 110)
				rs.add(new FrontBall(7, 16, 18, 32, 33));
			if (i == 111)
				rs.add(new FrontBall(7, 12, 13, 20, 27));
			if (i == 112)
				rs.add(new FrontBall(2, 10, 20, 22, 29));
			if (i == 113)
				rs.add(new FrontBall(19, 21, 23, 28, 30));
			if (i == 114)
				rs.add(new FrontBall(6, 17, 21, 23, 33));
			if (i == 115)
				rs.add(new FrontBall(5, 16, 29, 32, 34));
			if (i == 116)
				rs.add(new FrontBall(13, 22, 23, 30, 33));
			if (i == 117)
				rs.add(new FrontBall(5, 16, 23, 25, 33));
			if (i == 118)
				rs.add(new FrontBall(4, 6, 11, 20, 31));
			if (i == 119)
				rs.add(new FrontBall(1, 2, 16, 23, 35));
			if (i == 120)
				rs.add(new FrontBall(6, 14, 15, 22, 26));
			if (i == 121)
				rs.add(new FrontBall(3, 18, 19, 20, 24));
			if (i == 122)
				rs.add(new FrontBall(15, 17, 20, 24, 35));
			if (i == 123)
				rs.add(new FrontBall(2, 9, 10, 33, 34));
			if (i == 124)
				rs.add(new FrontBall(5, 7, 18, 21, 32));
			if (i == 125)
				rs.add(new FrontBall(4, 8, 14, 23, 28));
			if (i == 126)
				rs.add(new FrontBall(9, 10, 15, 18, 30));
			if (i == 127)
				rs.add(new FrontBall(3, 14, 16, 19, 32));
			if (i == 128)
				rs.add(new FrontBall(11, 13, 27, 33, 35));
			if (i == 129)
				rs.add(new FrontBall(11, 23, 29, 30, 33));
			if (i == 130)
				rs.add(new FrontBall(8, 9, 15, 19, 30));
			if (i == 131)
				rs.add(new FrontBall(12, 15, 29, 30, 31));
			if (i == 132)
				rs.add(new FrontBall(23, 26, 28, 31, 34));
			if (i == 133)
				rs.add(new FrontBall(2, 8, 10, 16, 17));
			if (i == 134)
				rs.add(new FrontBall(2, 13, 19, 23, 32));
			if (i == 135)
				rs.add(new FrontBall(4, 13, 19, 25, 26));
			if (i == 136)
				rs.add(new FrontBall(5, 11, 15, 25, 28));
			if (i == 137)
				rs.add(new FrontBall(4, 12, 32, 33, 34));
			if (i == 138)
				rs.add(new FrontBall(3, 8, 13, 17, 24));
			if (i == 139)
				rs.add(new FrontBall(5, 6, 18, 20, 31));
			if (i == 140)
				rs.add(new FrontBall(1, 12, 17, 26, 28));
			if (i == 141)
				rs.add(new FrontBall(5, 15, 18, 25, 31));
			if (i == 142)
				rs.add(new FrontBall(6, 11, 25, 28, 29));
			if (i == 143)
				rs.add(new FrontBall(3, 8, 14, 21, 31));
			if (i == 144)
				rs.add(new FrontBall(3, 20, 21, 23, 35));
			if (i == 145)
				rs.add(new FrontBall(2, 13, 15, 18, 20));
			if (i == 146)
				rs.add(new FrontBall(6, 7, 15, 25, 31));
			if (i == 147)
				rs.add(new FrontBall(3, 9, 22, 24, 25));
			if (i == 148)
				rs.add(new FrontBall(2, 5, 9, 29, 32));
			if (i == 149)
				rs.add(new FrontBall(6, 7, 8, 9, 13));
			if (i == 150)
				rs.add(new FrontBall(6, 7, 14, 18, 22));
			if (i == 151)
				rs.add(new FrontBall(2, 13, 21, 27, 30));
			if (i == 152)
				rs.add(new FrontBall(9, 12, 14, 18, 19));
			if (i == 153)
				rs.add(new FrontBall(4, 5, 16, 17, 30));
		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2012(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(7, 27, 28, 32, 33));
			if (i == 2)
				rs.add(new FrontBall(3, 11, 14, 26, 29));
			if (i == 3)
				rs.add(new FrontBall(16, 22, 24, 33, 34));
			if (i == 4)
				rs.add(new FrontBall(10, 11, 22, 31, 32));
			if (i == 5)
				rs.add(new FrontBall(1, 2, 29, 31, 33));
			if (i == 6)
				rs.add(new FrontBall(3, 20, 22, 25, 27));
			if (i == 7)
				rs.add(new FrontBall(4, 5, 13, 17, 25));
			if (i == 8)
				rs.add(new FrontBall(6, 8, 30, 31, 32));
			if (i == 9)
				rs.add(new FrontBall(6, 14, 20, 29, 35));
			if (i == 10)
				rs.add(new FrontBall(25, 26, 29, 32, 34));
			if (i == 11)
				rs.add(new FrontBall(5, 19, 22, 29, 30));
			if (i == 12)
				rs.add(new FrontBall(6, 18, 22, 30, 35));
			if (i == 13)
				rs.add(new FrontBall(7, 8, 11, 12, 24));
			if (i == 14)
				rs.add(new FrontBall(10, 14, 24, 30, 32));
			if (i == 15)
				rs.add(new FrontBall(12, 13, 24, 26, 33));
			if (i == 16)
				rs.add(new FrontBall(5, 14, 20, 29, 31));
			if (i == 17)
				rs.add(new FrontBall(6, 11, 22, 29, 34));
			if (i == 18)
				rs.add(new FrontBall(3, 10, 14, 29, 31));
			if (i == 19)
				rs.add(new FrontBall(7, 9, 17, 30, 34));
			if (i == 20)
				rs.add(new FrontBall(12, 14, 27, 29, 34));
			if (i == 21)
				rs.add(new FrontBall(10, 15, 21, 31, 34));
			if (i == 22)
				rs.add(new FrontBall(7, 12, 20, 33, 35));
			if (i == 23)
				rs.add(new FrontBall(7, 9, 17, 29, 35));
			if (i == 24)
				rs.add(new FrontBall(3, 11, 17, 21, 30));
			if (i == 25)
				rs.add(new FrontBall(1, 2, 5, 12, 27));
			if (i == 26)
				rs.add(new FrontBall(10, 11, 22, 23, 29));
			if (i == 27)
				rs.add(new FrontBall(3, 10, 11, 22, 31));
			if (i == 28)
				rs.add(new FrontBall(10, 12, 15, 33, 34));
			if (i == 29)
				rs.add(new FrontBall(4, 7, 8, 18, 29));
			if (i == 30)
				rs.add(new FrontBall(3, 21, 22, 26, 32));
			if (i == 31)
				rs.add(new FrontBall(19, 21, 23, 25, 30));
			if (i == 32)
				rs.add(new FrontBall(7, 8, 16, 26, 34));
			if (i == 33)
				rs.add(new FrontBall(8, 13, 19, 27, 32));
			if (i == 34)
				rs.add(new FrontBall(1, 8, 15, 16, 29));
			if (i == 35)
				rs.add(new FrontBall(1, 4, 30, 32, 35));
			if (i == 36)
				rs.add(new FrontBall(1, 9, 20, 30, 31));
			if (i == 37)
				rs.add(new FrontBall(9, 13, 27, 31, 35));
			if (i == 38)
				rs.add(new FrontBall(11, 23, 25, 31, 35));
			if (i == 39)
				rs.add(new FrontBall(15, 21, 22, 24, 35));
			if (i == 40)
				rs.add(new FrontBall(2, 13, 23, 28, 29));
			if (i == 41)
				rs.add(new FrontBall(1, 2, 13, 22, 23));
			if (i == 42)
				rs.add(new FrontBall(7, 24, 27, 28, 35));
			if (i == 43)
				rs.add(new FrontBall(1, 6, 25, 31, 34));
			if (i == 44)
				rs.add(new FrontBall(3, 4, 14, 32, 35));
			if (i == 45)
				rs.add(new FrontBall(5, 11, 17, 20, 28));
			if (i == 46)
				rs.add(new FrontBall(4, 8, 19, 23, 27));
			if (i == 47)
				rs.add(new FrontBall(5, 7, 17, 30, 34));
			if (i == 48)
				rs.add(new FrontBall(6, 9, 26, 30, 35));
			if (i == 49)
				rs.add(new FrontBall(9, 18, 22, 27, 31));
			if (i == 50)
				rs.add(new FrontBall(13, 17, 22, 28, 29));
			if (i == 51)
				rs.add(new FrontBall(1, 2, 17, 18, 33));
			if (i == 52)
				rs.add(new FrontBall(10, 20, 26, 31, 33));
			if (i == 53)
				rs.add(new FrontBall(11, 12, 26, 28, 31));
			if (i == 54)
				rs.add(new FrontBall(1, 16, 18, 27, 30));
			if (i == 55)
				rs.add(new FrontBall(7, 22, 26, 32, 33));
			if (i == 56)
				rs.add(new FrontBall(11, 21, 23, 26, 34));
			if (i == 57)
				rs.add(new FrontBall(1, 2, 14, 33, 34));
			if (i == 58)
				rs.add(new FrontBall(13, 21, 29, 31, 35));
			if (i == 59)
				rs.add(new FrontBall(9, 13, 19, 21, 27));
			if (i == 60)
				rs.add(new FrontBall(2, 16, 21, 24, 30));
			if (i == 61)
				rs.add(new FrontBall(5, 10, 14, 27, 33));
			if (i == 62)
				rs.add(new FrontBall(21, 32, 33, 34, 35));
			if (i == 63)
				rs.add(new FrontBall(11, 25, 26, 29, 35));
			if (i == 64)
				rs.add(new FrontBall(9, 12, 13, 15, 30));
			if (i == 65)
				rs.add(new FrontBall(10, 22, 28, 29, 34));
			if (i == 66)
				rs.add(new FrontBall(1, 20, 25, 29, 33));
			if (i == 67)
				rs.add(new FrontBall(20, 22, 27, 30, 33));
			if (i == 68)
				rs.add(new FrontBall(1, 21, 31, 32, 35));
			if (i == 69)
				rs.add(new FrontBall(2, 4, 22, 25, 34));
			if (i == 70)
				rs.add(new FrontBall(9, 22, 23, 32, 34));
			if (i == 71)
				rs.add(new FrontBall(13, 23, 29, 31, 34));
			if (i == 72)
				rs.add(new FrontBall(4, 8, 17, 22, 25));
			if (i == 73)
				rs.add(new FrontBall(18, 23, 29, 33, 34));
			if (i == 74)
				rs.add(new FrontBall(10, 22, 23, 30, 32));
			if (i == 75)
				rs.add(new FrontBall(7, 9, 10, 18, 22));
			if (i == 76)
				rs.add(new FrontBall(2, 14, 16, 22, 24));
			if (i == 77)
				rs.add(new FrontBall(10, 30, 32, 33, 34));
			if (i == 78)
				rs.add(new FrontBall(1, 2, 23, 25, 35));
			if (i == 79)
				rs.add(new FrontBall(1, 5, 25, 32, 33));
			if (i == 80)
				rs.add(new FrontBall(11, 12, 14, 25, 28));
			if (i == 81)
				rs.add(new FrontBall(10, 16, 17, 30, 35));
			if (i == 82)
				rs.add(new FrontBall(2, 4, 9, 10, 15));
			if (i == 83)
				rs.add(new FrontBall(16, 19, 28, 29, 31));
			if (i == 84)
				rs.add(new FrontBall(21, 24, 27, 29, 31));
			if (i == 85)
				rs.add(new FrontBall(7, 18, 29, 31, 33));
			if (i == 86)
				rs.add(new FrontBall(3, 20, 25, 29, 32));
			if (i == 87)
				rs.add(new FrontBall(1, 6, 7, 21, 31));
			if (i == 88)
				rs.add(new FrontBall(13, 17, 24, 30, 35));
			if (i == 89)
				rs.add(new FrontBall(6, 12, 21, 29, 32));
			if (i == 90)
				rs.add(new FrontBall(2, 21, 27, 29, 33));
			if (i == 91)
				rs.add(new FrontBall(3, 10, 28, 31, 33));
			if (i == 92)
				rs.add(new FrontBall(8, 9, 23, 25, 31));
			if (i == 93)
				rs.add(new FrontBall(2, 16, 21, 31, 33));
			if (i == 94)
				rs.add(new FrontBall(2, 14, 23, 32, 35));
			if (i == 95)
				rs.add(new FrontBall(6, 9, 22, 27, 30));
			if (i == 96)
				rs.add(new FrontBall(5, 10, 19, 24, 35));
			if (i == 97)
				rs.add(new FrontBall(9, 17, 24, 29, 32));
			if (i == 98)
				rs.add(new FrontBall(2, 11, 28, 29, 30));
			if (i == 99)
				rs.add(new FrontBall(12, 18, 24, 25, 32));
			if (i == 100)
				rs.add(new FrontBall(7, 9, 13, 19, 27));
			if (i == 101)
				rs.add(new FrontBall(2, 5, 8, 9, 31));
			if (i == 102)
				rs.add(new FrontBall(2, 4, 6, 13, 35));
			if (i == 103)
				rs.add(new FrontBall(2, 9, 18, 23, 24));
			if (i == 104)
				rs.add(new FrontBall(16, 18, 24, 25, 27));
			if (i == 105)
				rs.add(new FrontBall(5, 6, 14, 15, 31));
			if (i == 106)
				rs.add(new FrontBall(15, 23, 25, 29, 31));
			if (i == 107)
				rs.add(new FrontBall(4, 7, 9, 22, 33));
			if (i == 108)
				rs.add(new FrontBall(6, 7, 12, 24, 35));
			if (i == 109)
				rs.add(new FrontBall(1, 22, 30, 32, 35));
			if (i == 110)
				rs.add(new FrontBall(1, 11, 17, 19, 26));
			if (i == 111)
				rs.add(new FrontBall(1, 24, 25, 30, 33));
			if (i == 112)
				rs.add(new FrontBall(1, 2, 28, 31, 35));
			if (i == 113)
				rs.add(new FrontBall(3, 10, 22, 27, 29));
			if (i == 114)
				rs.add(new FrontBall(3, 6, 21, 33, 35));
			if (i == 115)
				rs.add(new FrontBall(1, 6, 13, 19, 23));
			if (i == 116)
				rs.add(new FrontBall(1, 11, 18, 20, 22));
			if (i == 117)
				rs.add(new FrontBall(1, 12, 18, 21, 33));
			if (i == 118)
				rs.add(new FrontBall(5, 17, 25, 30, 33));
			if (i == 119)
				rs.add(new FrontBall(5, 6, 9, 19, 32));
			if (i == 120)
				rs.add(new FrontBall(2, 10, 21, 23, 29));
			if (i == 121)
				rs.add(new FrontBall(7, 18, 20, 29, 30));
			if (i == 122)
				rs.add(new FrontBall(23, 24, 25, 29, 31));
			if (i == 123)
				rs.add(new FrontBall(5, 8, 18, 30, 33));
			if (i == 124)
				rs.add(new FrontBall(7, 11, 19, 20, 35));
			if (i == 125)
				rs.add(new FrontBall(6, 14, 17, 22, 35));
			if (i == 126)
				rs.add(new FrontBall(13, 14, 21, 28, 29));
			if (i == 127)
				rs.add(new FrontBall(12, 13, 14, 25, 35));
			if (i == 128)
				rs.add(new FrontBall(9, 10, 19, 30, 31));
			if (i == 129)
				rs.add(new FrontBall(1, 7, 21, 28, 31));
			if (i == 130)
				rs.add(new FrontBall(14, 19, 23, 29, 30));
			if (i == 131)
				rs.add(new FrontBall(2, 16, 18, 27, 30));
			if (i == 132)
				rs.add(new FrontBall(5, 8, 21, 25, 33));
			if (i == 133)
				rs.add(new FrontBall(5, 7, 13, 29, 30));
			if (i == 134)
				rs.add(new FrontBall(1, 6, 18, 32, 35));
			if (i == 135)
				rs.add(new FrontBall(3, 5, 17, 18, 33));
			if (i == 136)
				rs.add(new FrontBall(2, 23, 29, 30, 31));
			if (i == 137)
				rs.add(new FrontBall(3, 12, 20, 21, 27));
			if (i == 138)
				rs.add(new FrontBall(13, 17, 27, 31, 33));
			if (i == 139)
				rs.add(new FrontBall(9, 10, 12, 22, 25));
			if (i == 140)
				rs.add(new FrontBall(7, 17, 27, 28, 29));
			if (i == 141)
				rs.add(new FrontBall(3, 11, 19, 23, 34));
			if (i == 142)
				rs.add(new FrontBall(15, 19, 29, 34, 35));
			if (i == 143)
				rs.add(new FrontBall(9, 27, 29, 30, 31));
			if (i == 144)
				rs.add(new FrontBall(11, 13, 14, 21, 29));
			if (i == 145)
				rs.add(new FrontBall(5, 22, 31, 33, 35));
			if (i == 146)
				rs.add(new FrontBall(1, 10, 13, 17, 26));
			if (i == 147)
				rs.add(new FrontBall(2, 3, 17, 19, 33));
			if (i == 148)
				rs.add(new FrontBall(4, 16, 27, 29, 34));
			if (i == 149)
				rs.add(new FrontBall(2, 10, 23, 33, 34));
			if (i == 150)
				rs.add(new FrontBall(2, 14, 18, 24, 31));
			if (i == 151)
				rs.add(new FrontBall(3, 19, 20, 24, 33));
			if (i == 152)
				rs.add(new FrontBall(4, 17, 26, 33, 34));
			if (i == 153)
				rs.add(new FrontBall(8, 9, 10, 13, 22));
			if (i == 154)
				rs.add(new FrontBall(3, 26, 27, 31, 32));
		}
		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2011(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(7, 8, 15, 32, 34));
			if (i == 2)
				rs.add(new FrontBall(11, 13, 27, 28, 29));
			if (i == 3)
				rs.add(new FrontBall(1, 24, 27, 30, 31));
			if (i == 4)
				rs.add(new FrontBall(7, 8, 10, 23, 25));
			if (i == 5)
				rs.add(new FrontBall(1, 7, 25, 27, 30));
			if (i == 6)
				rs.add(new FrontBall(2, 8, 16, 26, 35));
			if (i == 7)
				rs.add(new FrontBall(14, 24, 32, 33, 35));
			if (i == 8)
				rs.add(new FrontBall(1, 23, 26, 27, 30));
			if (i == 9)
				rs.add(new FrontBall(9, 10, 11, 14, 24));
			if (i == 10)
				rs.add(new FrontBall(4, 8, 10, 14, 27));
			if (i == 11)
				rs.add(new FrontBall(2, 17, 23, 24, 30));
			if (i == 12)
				rs.add(new FrontBall(3, 12, 19, 25, 30));
			if (i == 13)
				rs.add(new FrontBall(5, 8, 14, 28, 30));
			if (i == 14)
				rs.add(new FrontBall(2, 14, 20, 21, 24));
			if (i == 15)
				rs.add(new FrontBall(8, 18, 19, 22, 23));
			if (i == 16)
				rs.add(new FrontBall(15, 20, 30, 33, 35));
			if (i == 17)
				rs.add(new FrontBall(16, 19, 24, 26, 31));
			if (i == 18)
				rs.add(new FrontBall(16, 22, 24, 32, 34));
			if (i == 19)
				rs.add(new FrontBall(8, 21, 23, 27, 33));
			if (i == 20)
				rs.add(new FrontBall(9, 12, 19, 22, 28));
			if (i == 21)
				rs.add(new FrontBall(1, 9, 13, 17, 30));
			if (i == 22)
				rs.add(new FrontBall(9, 14, 24, 25, 34));
			if (i == 23)
				rs.add(new FrontBall(5, 13, 16, 18, 24));
			if (i == 24)
				rs.add(new FrontBall(12, 15, 16, 20, 33));
			if (i == 25)
				rs.add(new FrontBall(8, 9, 25, 28, 29));
			if (i == 26)
				rs.add(new FrontBall(1, 9, 15, 20, 29));
			if (i == 27)
				rs.add(new FrontBall(5, 14, 25, 34, 35));
			if (i == 28)
				rs.add(new FrontBall(1, 2, 13, 17, 28));
			if (i == 29)
				rs.add(new FrontBall(3, 9, 17, 24, 28));
			if (i == 30)
				rs.add(new FrontBall(15, 19, 25, 30, 33));
			if (i == 31)
				rs.add(new FrontBall(12, 17, 19, 22, 35));
			if (i == 32)
				rs.add(new FrontBall(7, 16, 23, 31, 33));
			if (i == 33)
				rs.add(new FrontBall(3, 19, 24, 29, 33));
			if (i == 34)
				rs.add(new FrontBall(3, 6, 9, 17, 27));
			if (i == 35)
				rs.add(new FrontBall(3, 4, 13, 15, 32));
			if (i == 36)
				rs.add(new FrontBall(3, 18, 29, 30, 33));
			if (i == 37)
				rs.add(new FrontBall(1, 12, 14, 22, 24));
			if (i == 38)
				rs.add(new FrontBall(7, 9, 11, 13, 33));
			if (i == 39)
				rs.add(new FrontBall(1, 11, 14, 22, 34));
			if (i == 40)
				rs.add(new FrontBall(3, 7, 15, 18, 20));
			if (i == 41)
				rs.add(new FrontBall(4, 5, 11, 13, 25));
			if (i == 42)
				rs.add(new FrontBall(6, 9, 18, 30, 32));
			if (i == 43)
				rs.add(new FrontBall(2, 8, 23, 33, 35));
			if (i == 44)
				rs.add(new FrontBall(11, 21, 24, 26, 31));
			if (i == 45)
				rs.add(new FrontBall(13, 21, 22, 29, 31));
			if (i == 46)
				rs.add(new FrontBall(9, 15, 16, 19, 29));
			if (i == 47)
				rs.add(new FrontBall(2, 15, 22, 33, 35));
			if (i == 48)
				rs.add(new FrontBall(13, 17, 25, 27, 28));
			if (i == 49)
				rs.add(new FrontBall(5, 6, 10, 22, 25));
			if (i == 50)
				rs.add(new FrontBall(4, 7, 29, 32, 33));
			if (i == 51)
				rs.add(new FrontBall(6, 8, 12, 17, 18));
			if (i == 52)
				rs.add(new FrontBall(13, 24, 31, 32, 33));
			if (i == 53)
				rs.add(new FrontBall(3, 16, 28, 31, 32));
			if (i == 54)
				rs.add(new FrontBall(5, 9, 16, 26, 35));
			if (i == 55)
				rs.add(new FrontBall(1, 7, 31, 32, 35));
			if (i == 56)
				rs.add(new FrontBall(3, 5, 29, 30, 31));
			if (i == 57)
				rs.add(new FrontBall(7, 11, 30, 31, 34));
			if (i == 58)
				rs.add(new FrontBall(1, 9, 27, 32, 33));
			if (i == 59)
				rs.add(new FrontBall(9, 16, 21, 29, 34));
			if (i == 60)
				rs.add(new FrontBall(3, 25, 29, 32, 34));
			if (i == 61)
				rs.add(new FrontBall(6, 7, 16, 18, 20));
			if (i == 62)
				rs.add(new FrontBall(6, 10, 17, 20, 21));
			if (i == 63)
				rs.add(new FrontBall(10, 17, 18, 26, 32));
			if (i == 64)
				rs.add(new FrontBall(1, 6, 27, 30, 34));
			if (i == 65)
				rs.add(new FrontBall(3, 11, 14, 25, 34));
			if (i == 66)
				rs.add(new FrontBall(6, 13, 18, 20, 33));
			if (i == 67)
				rs.add(new FrontBall(10, 17, 22, 24, 32));
			if (i == 68)
				rs.add(new FrontBall(1, 13, 16, 18, 32));
			if (i == 69)
				rs.add(new FrontBall(3, 5, 28, 29, 33));
			if (i == 70)
				rs.add(new FrontBall(9, 19, 22, 29, 30));
			if (i == 71)
				rs.add(new FrontBall(27, 31, 33, 34, 35));
			if (i == 72)
				rs.add(new FrontBall(3, 11, 13, 20, 35));
			if (i == 73)
				rs.add(new FrontBall(13, 19, 20, 22, 33));
			if (i == 74)
				rs.add(new FrontBall(7, 16, 23, 28, 31));
			if (i == 75)
				rs.add(new FrontBall(6, 9, 20, 23, 28));
			if (i == 76)
				rs.add(new FrontBall(18, 23, 25, 29, 30));
			if (i == 77)
				rs.add(new FrontBall(5, 8, 19, 33, 34));
			if (i == 78)
				rs.add(new FrontBall(4, 9, 16, 27, 30));
			if (i == 79)
				rs.add(new FrontBall(1, 3, 23, 30, 31));
			if (i == 80)
				rs.add(new FrontBall(5, 12, 30, 31, 32));
			if (i == 81)
				rs.add(new FrontBall(4, 13, 20, 21, 35));
			if (i == 82)
				rs.add(new FrontBall(7, 20, 25, 30, 32));
			if (i == 83)
				rs.add(new FrontBall(6, 8, 18, 20, 24));
			if (i == 84)
				rs.add(new FrontBall(14, 29, 31, 34, 35));
			if (i == 85)
				rs.add(new FrontBall(2, 17, 19, 21, 22));
			if (i == 86)
				rs.add(new FrontBall(4, 5, 6, 9, 15));
			if (i == 87)
				rs.add(new FrontBall(6, 13, 20, 25, 34));
			if (i == 88)
				rs.add(new FrontBall(20, 21, 27, 29, 35));
			if (i == 89)
				rs.add(new FrontBall(5, 6, 23, 27, 34));
			if (i == 90)
				rs.add(new FrontBall(2, 4, 29, 30, 34));
			if (i == 91)
				rs.add(new FrontBall(11, 17, 23, 29, 30));
			if (i == 92)
				rs.add(new FrontBall(10, 17, 19, 32, 33));
			if (i == 93)
				rs.add(new FrontBall(4, 6, 8, 19, 31));
			if (i == 94)
				rs.add(new FrontBall(11, 21, 22, 32, 34));
			if (i == 95)
				rs.add(new FrontBall(9, 12, 17, 19, 29));
			if (i == 96)
				rs.add(new FrontBall(3, 8, 20, 24, 25));
			if (i == 97)
				rs.add(new FrontBall(4, 19, 28, 31, 33));
			if (i == 98)
				rs.add(new FrontBall(6, 7, 28, 33, 35));
			if (i == 99)
				rs.add(new FrontBall(2, 6, 9, 12, 20));
			if (i == 100)
				rs.add(new FrontBall(8, 11, 13, 28, 33));
			if (i == 101)
				rs.add(new FrontBall(5, 12, 20, 28, 30));
			if (i == 102)
				rs.add(new FrontBall(19, 24, 28, 31, 34));
			if (i == 103)
				rs.add(new FrontBall(3, 4, 26, 29, 34));
			if (i == 104)
				rs.add(new FrontBall(7, 19, 27, 28, 34));
			if (i == 105)
				rs.add(new FrontBall(2, 11, 26, 32, 33));
			if (i == 106)
				rs.add(new FrontBall(1, 9, 29, 30, 35));
			if (i == 107)
				rs.add(new FrontBall(2, 6, 18, 30, 32));
			if (i == 108)
				rs.add(new FrontBall(7, 15, 18, 24, 28));
			if (i == 109)
				rs.add(new FrontBall(1, 11, 12, 22, 34));
			if (i == 110)
				rs.add(new FrontBall(30, 31, 33, 34, 35));
			if (i == 111)
				rs.add(new FrontBall(2, 11, 13, 23, 31));
			if (i == 112)
				rs.add(new FrontBall(6, 17, 28, 32, 33));
			if (i == 113)
				rs.add(new FrontBall(4, 5, 7, 10, 12));
			if (i == 114)
				rs.add(new FrontBall(6, 8, 17, 27, 35));
			if (i == 115)
				rs.add(new FrontBall(17, 26, 30, 31, 35));
			if (i == 116)
				rs.add(new FrontBall(10, 15, 18, 19, 26));
			if (i == 117)
				rs.add(new FrontBall(10, 12, 28, 32, 33));
			if (i == 118)
				rs.add(new FrontBall(4, 7, 11, 32, 35));
			if (i == 119)
				rs.add(new FrontBall(4, 15, 20, 26, 31));
			if (i == 120)
				rs.add(new FrontBall(20, 25, 26, 30, 31));
			if (i == 121)
				rs.add(new FrontBall(2, 3, 30, 31, 33));
			if (i == 122)
				rs.add(new FrontBall(3, 8, 23, 24, 34));
			if (i == 123)
				rs.add(new FrontBall(10, 14, 18, 19, 35));
			if (i == 124)
				rs.add(new FrontBall(8, 12, 14, 20, 25));
			if (i == 125)
				rs.add(new FrontBall(7, 10, 27, 34, 35));
			if (i == 126)
				rs.add(new FrontBall(7, 17, 29, 30, 33));
			if (i == 127)
				rs.add(new FrontBall(1, 11, 22, 26, 29));
			if (i == 128)
				rs.add(new FrontBall(3, 4, 6, 11, 13));
			if (i == 129)
				rs.add(new FrontBall(1, 7, 13, 18, 23));
			if (i == 130)
				rs.add(new FrontBall(8, 9, 13, 23, 35));
			if (i == 131)
				rs.add(new FrontBall(3, 5, 12, 18, 33));
			if (i == 132)
				rs.add(new FrontBall(12, 14, 16, 19, 33));
			if (i == 133)
				rs.add(new FrontBall(4, 11, 23, 26, 35));
			if (i == 134)
				rs.add(new FrontBall(1, 10, 12, 14, 17));
			if (i == 135)
				rs.add(new FrontBall(6, 22, 29, 33, 35));
			if (i == 136)
				rs.add(new FrontBall(8, 9, 11, 19, 33));
			if (i == 137)
				rs.add(new FrontBall(2, 15, 18, 23, 31));
			if (i == 138)
				rs.add(new FrontBall(17, 23, 26, 30, 32));
			if (i == 139)
				rs.add(new FrontBall(4, 6, 10, 15, 16));
			if (i == 140)
				rs.add(new FrontBall(1, 12, 32, 33, 34));
			if (i == 141)
				rs.add(new FrontBall(2, 11, 19, 22, 35));
			if (i == 142)
				rs.add(new FrontBall(4, 26, 30, 33, 34));
			if (i == 143)
				rs.add(new FrontBall(8, 9, 12, 25, 33));
			if (i == 144)
				rs.add(new FrontBall(7, 18, 24, 28, 33));
			if (i == 145)
				rs.add(new FrontBall(7, 15, 19, 24, 29));
			if (i == 146)
				rs.add(new FrontBall(9, 13, 19, 29, 34));
			if (i == 147)
				rs.add(new FrontBall(1, 15, 16, 27, 28));
			if (i == 148)
				rs.add(new FrontBall(7, 10, 11, 26, 31));
			if (i == 149)
				rs.add(new FrontBall(2, 7, 12, 29, 31));
			if (i == 150)
				rs.add(new FrontBall(13, 22, 30, 33, 34));
			if (i == 151)
				rs.add(new FrontBall(7, 11, 14, 20, 27));
			if (i == 152)
				rs.add(new FrontBall(1, 4, 6, 21, 35));
			if (i == 153)
				rs.add(new FrontBall(6, 22, 29, 30, 35));
			if (i == 154)
				rs.add(new FrontBall(4, 12, 16, 20, 28));

		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2010(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(2, 6, 7, 12, 27));
			if (i == 2)
				rs.add(new FrontBall(4, 23, 25, 26, 30));
			if (i == 3)
				rs.add(new FrontBall(5, 14, 23, 27, 30));
			if (i == 4)
				rs.add(new FrontBall(3, 6, 21, 24, 34));
			if (i == 5)
				rs.add(new FrontBall(4, 17, 19, 22, 30));
			if (i == 6)
				rs.add(new FrontBall(3, 13, 19, 30, 34));
			if (i == 7)
				rs.add(new FrontBall(7, 23, 26, 29, 32));
			if (i == 8)
				rs.add(new FrontBall(11, 23, 25, 31, 32));
			if (i == 9)
				rs.add(new FrontBall(2, 5, 13, 27, 32));
			if (i == 10)
				rs.add(new FrontBall(15, 22, 24, 32, 35));
			if (i == 11)
				rs.add(new FrontBall(2, 3, 11, 27, 32));
			if (i == 12)
				rs.add(new FrontBall(20, 24, 30, 31, 33));
			if (i == 13)
				rs.add(new FrontBall(18, 21, 22, 26, 34));
			if (i == 14)
				rs.add(new FrontBall(18, 19, 30, 33, 35));
			if (i == 15)
				rs.add(new FrontBall(3, 10, 14, 18, 28));
			if (i == 16)
				rs.add(new FrontBall(10, 12, 20, 23, 32));
			if (i == 17)
				rs.add(new FrontBall(13, 21, 23, 27, 34));
			if (i == 18)
				rs.add(new FrontBall(3, 10, 26, 32, 33));
			if (i == 19)
				rs.add(new FrontBall(3, 11, 19, 26, 27));
			if (i == 20)
				rs.add(new FrontBall(8, 18, 26, 32, 33));
			if (i == 21)
				rs.add(new FrontBall(11, 20, 23, 24, 25));
			if (i == 22)
				rs.add(new FrontBall(2, 11, 13, 14, 25));
			if (i == 23)
				rs.add(new FrontBall(11, 13, 29, 32, 33));
			if (i == 24)
				rs.add(new FrontBall(3, 14, 19, 24, 25));
			if (i == 25)
				rs.add(new FrontBall(9, 11, 13, 14, 25));
			if (i == 26)
				rs.add(new FrontBall(5, 23, 25, 31, 35));
			if (i == 27)
				rs.add(new FrontBall(5, 23, 26, 32, 34));
			if (i == 28)
				rs.add(new FrontBall(1, 2, 7, 20, 35));
			if (i == 29)
				rs.add(new FrontBall(21, 22, 33, 34, 35));
			if (i == 30)
				rs.add(new FrontBall(10, 12, 19, 32, 35));
			if (i == 31)
				rs.add(new FrontBall(5, 13, 16, 17, 35));
			if (i == 32)
				rs.add(new FrontBall(13, 16, 23, 24, 33));
			if (i == 33)
				rs.add(new FrontBall(12, 19, 28, 29, 30));
			if (i == 34)
				rs.add(new FrontBall(1, 6, 19, 25, 26));
			if (i == 35)
				rs.add(new FrontBall(14, 16, 20, 31, 34));
			if (i == 36)
				rs.add(new FrontBall(19, 25, 28, 31, 33));
			if (i == 37)
				rs.add(new FrontBall(19, 21, 26, 34, 35));
			if (i == 38)
				rs.add(new FrontBall(8, 10, 25, 29, 33));
			if (i == 39)
				rs.add(new FrontBall(7, 19, 26, 28, 32));
			if (i == 40)
				rs.add(new FrontBall(13, 20, 26, 31, 35));
			if (i == 41)
				rs.add(new FrontBall(16, 22, 28, 29, 34));
			if (i == 42)
				rs.add(new FrontBall(1, 5, 19, 34, 35));
			if (i == 43)
				rs.add(new FrontBall(5, 8, 10, 33, 35));
			if (i == 44)
				rs.add(new FrontBall(6, 21, 24, 28, 30));
			if (i == 45)
				rs.add(new FrontBall(8, 17, 18, 20, 28));
			if (i == 46)
				rs.add(new FrontBall(2, 15, 19, 26, 27));
			if (i == 47)
				rs.add(new FrontBall(4, 8, 11, 30, 31));
			if (i == 48)
				rs.add(new FrontBall(2, 3, 10, 12, 25));
			if (i == 49)
				rs.add(new FrontBall(1, 25, 29, 31, 33));
			if (i == 50)
				rs.add(new FrontBall(7, 8, 15, 30, 35));
			if (i == 51)
				rs.add(new FrontBall(6, 10, 20, 24, 32));
			if (i == 52)
				rs.add(new FrontBall(4, 6, 25, 29, 32));
			if (i == 53)
				rs.add(new FrontBall(9, 19, 22, 26, 34));
			if (i == 54)
				rs.add(new FrontBall(12, 25, 29, 30, 33));
			if (i == 55)
				rs.add(new FrontBall(13, 14, 17, 27, 32));
			if (i == 56)
				rs.add(new FrontBall(5, 9, 23, 25, 30));
			if (i == 57)
				rs.add(new FrontBall(15, 17, 24, 32, 35));
			if (i == 58)
				rs.add(new FrontBall(6, 15, 17, 19, 30));
			if (i == 59)
				rs.add(new FrontBall(6, 10, 14, 25, 34));
			if (i == 60)
				rs.add(new FrontBall(10, 13, 22, 33, 34));
			if (i == 61)
				rs.add(new FrontBall(5, 12, 14, 17, 22));
			if (i == 62)
				rs.add(new FrontBall(6, 7, 18, 30, 31));
			if (i == 63)
				rs.add(new FrontBall(7, 14, 16, 30, 31));
			if (i == 64)
				rs.add(new FrontBall(7, 10, 12, 20, 21));
			if (i == 65)
				rs.add(new FrontBall(5, 8, 13, 14, 32));
			if (i == 66)
				rs.add(new FrontBall(15, 21, 22, 24, 27));
			if (i == 67)
				rs.add(new FrontBall(1, 11, 19, 30, 32));
			if (i == 68)
				rs.add(new FrontBall(11, 17, 19, 20, 34));
			if (i == 69)
				rs.add(new FrontBall(6, 17, 18, 25, 29));
			if (i == 70)
				rs.add(new FrontBall(5, 14, 23, 25, 28));
			if (i == 71)
				rs.add(new FrontBall(7, 12, 26, 30, 32));
			if (i == 72)
				rs.add(new FrontBall(5, 10, 17, 23, 25));
			if (i == 73)
				rs.add(new FrontBall(4, 9, 11, 30, 32));
			if (i == 74)
				rs.add(new FrontBall(3, 7, 20, 27, 32));
			if (i == 75)
				rs.add(new FrontBall(10, 12, 17, 23, 27));
			if (i == 76)
				rs.add(new FrontBall(9, 12, 16, 19, 35));
			if (i == 77)
				rs.add(new FrontBall(6, 7, 9, 17, 24));
			if (i == 78)
				rs.add(new FrontBall(2, 3, 15, 28, 35));
			if (i == 79)
				rs.add(new FrontBall(1, 4, 21, 22, 24));
			if (i == 80)
				rs.add(new FrontBall(8, 19, 27, 29, 34));
			if (i == 81)
				rs.add(new FrontBall(14, 18, 20, 24, 27));
			if (i == 82)
				rs.add(new FrontBall(5, 8, 24, 29, 30));
			if (i == 83)
				rs.add(new FrontBall(7, 11, 21, 22, 35));
			if (i == 84)
				rs.add(new FrontBall(3, 13, 14, 22, 26));
			if (i == 85)
				rs.add(new FrontBall(2, 10, 16, 18, 34));
			if (i == 86)
				rs.add(new FrontBall(1, 2, 12, 19, 35));
			if (i == 87)
				rs.add(new FrontBall(1, 12, 20, 21, 24));
			if (i == 88)
				rs.add(new FrontBall(3, 5, 14, 30, 35));
			if (i == 89)
				rs.add(new FrontBall(4, 10, 13, 18, 23));
			if (i == 90)
				rs.add(new FrontBall(8, 24, 26, 31, 32));
			if (i == 91)
				rs.add(new FrontBall(6, 10, 23, 26, 31));
			if (i == 92)
				rs.add(new FrontBall(2, 15, 29, 30, 34));
			if (i == 93)
				rs.add(new FrontBall(2, 4, 9, 28, 29));
			if (i == 94)
				rs.add(new FrontBall(20, 32, 33, 34, 35));
			if (i == 95)
				rs.add(new FrontBall(12, 14, 16, 19, 25));
			if (i == 96)
				rs.add(new FrontBall(4, 9, 24, 30, 35));
			if (i == 97)
				rs.add(new FrontBall(9, 17, 21, 28, 29));
			if (i == 98)
				rs.add(new FrontBall(2, 3, 12, 13, 25));
			if (i == 99)
				rs.add(new FrontBall(3, 11, 17, 21, 30));
			if (i == 100)
				rs.add(new FrontBall(19, 20, 30, 33, 35));
			if (i == 101)
				rs.add(new FrontBall(11, 15, 22, 27, 35));
			if (i == 102)
				rs.add(new FrontBall(4, 15, 19, 24, 35));
			if (i == 103)
				rs.add(new FrontBall(10, 14, 29, 30, 35));
			if (i == 104)
				rs.add(new FrontBall(14, 25, 30, 32, 33));
			if (i == 105)
				rs.add(new FrontBall(5, 17, 26, 27, 35));
			if (i == 106)
				rs.add(new FrontBall(5, 27, 28, 29, 34));
			if (i == 107)
				rs.add(new FrontBall(14, 17, 22, 27, 34));
			if (i == 108)
				rs.add(new FrontBall(1, 10, 13, 19, 34));
			if (i == 109)
				rs.add(new FrontBall(1, 2, 8, 11, 25));
			if (i == 110)
				rs.add(new FrontBall(21, 29, 30, 33, 35));
			if (i == 111)
				rs.add(new FrontBall(3, 6, 13, 14, 29));
			if (i == 112)
				rs.add(new FrontBall(14, 15, 18, 34, 35));
			if (i == 113)
				rs.add(new FrontBall(5, 16, 22, 23, 32));
			if (i == 114)
				rs.add(new FrontBall(3, 7, 22, 25, 35));
			if (i == 115)
				rs.add(new FrontBall(5, 7, 10, 15, 32));
			if (i == 116)
				rs.add(new FrontBall(14, 22, 27, 28, 35));
			if (i == 117)
				rs.add(new FrontBall(4, 6, 21, 27, 34));
			if (i == 118)
				rs.add(new FrontBall(19, 22, 23, 29, 35));
			if (i == 119)
				rs.add(new FrontBall(5, 13, 14, 23, 26));
			if (i == 120)
				rs.add(new FrontBall(8, 10, 18, 34, 35));
			if (i == 121)
				rs.add(new FrontBall(21, 22, 31, 32, 34));
			if (i == 122)
				rs.add(new FrontBall(5, 6, 11, 13, 26));
			if (i == 123)
				rs.add(new FrontBall(18, 20, 30, 32, 33));
			if (i == 124)
				rs.add(new FrontBall(1, 9, 27, 29, 34));
			if (i == 125)
				rs.add(new FrontBall(1, 7, 9, 14, 19));
			if (i == 126)
				rs.add(new FrontBall(3, 5, 9, 13, 33));
			if (i == 127)
				rs.add(new FrontBall(3, 22, 24, 30, 33));
			if (i == 128)
				rs.add(new FrontBall(6, 17, 19, 29, 35));
			if (i == 129)
				rs.add(new FrontBall(14, 15, 24, 25, 26));
			if (i == 130)
				rs.add(new FrontBall(5, 6, 9, 10, 34));
			if (i == 131)
				rs.add(new FrontBall(10, 15, 22, 28, 29));
			if (i == 132)
				rs.add(new FrontBall(18, 21, 23, 25, 29));
			if (i == 133)
				rs.add(new FrontBall(11, 16, 17, 21, 22));
			if (i == 134)
				rs.add(new FrontBall(9, 12, 13, 19, 30));
			if (i == 135)
				rs.add(new FrontBall(14, 17, 19, 26, 32));
			if (i == 136)
				rs.add(new FrontBall(3, 13, 18, 30, 33));
			if (i == 137)
				rs.add(new FrontBall(22, 27, 28, 33, 35));
			if (i == 138)
				rs.add(new FrontBall(8, 12, 14, 19, 27));
			if (i == 139)
				rs.add(new FrontBall(3, 13, 16, 19, 29));
			if (i == 140)
				rs.add(new FrontBall(6, 18, 20, 30, 31));
			if (i == 141)
				rs.add(new FrontBall(5, 11, 17, 23, 33));
			if (i == 142)
				rs.add(new FrontBall(10, 11, 19, 21, 27));
			if (i == 143)
				rs.add(new FrontBall(10, 16, 18, 22, 27));
			if (i == 144)
				rs.add(new FrontBall(2, 11, 16, 22, 31));
			if (i == 145)
				rs.add(new FrontBall(18, 19, 27, 28, 33));
			if (i == 146)
				rs.add(new FrontBall(14, 17, 30, 31, 34));
			if (i == 147)
				rs.add(new FrontBall(1, 15, 19, 21, 23));
			if (i == 148)
				rs.add(new FrontBall(3, 4, 8, 10, 35));
			if (i == 149)
				rs.add(new FrontBall(5, 22, 24, 25, 30));
			if (i == 150)
				rs.add(new FrontBall(5, 24, 28, 29, 35));
			if (i == 151)
				rs.add(new FrontBall(1, 10, 32, 33, 35));
			if (i == 152)
				rs.add(new FrontBall(2, 5, 18, 22, 23));
			if (i == 153)
				rs.add(new FrontBall(6, 7, 16, 24, 35));

		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2009(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(1, 15, 23, 27, 30));
			if (i == 2)
				rs.add(new FrontBall(1, 4, 7, 12, 30));
			if (i == 3)
				rs.add(new FrontBall(16, 18, 23, 30, 32));
			if (i == 4)
				rs.add(new FrontBall(1, 3, 22, 32, 35));
			if (i == 5)
				rs.add(new FrontBall(10, 11, 15, 31, 32));
			if (i == 6)
				rs.add(new FrontBall(2, 4, 22, 31, 35));
			if (i == 7)
				rs.add(new FrontBall(6, 14, 15, 29, 35));
			if (i == 8)
				rs.add(new FrontBall(4, 17, 21, 29, 31));
			if (i == 9)
				rs.add(new FrontBall(12, 18, 23, 26, 32));
			if (i == 10)
				rs.add(new FrontBall(2, 9, 12, 21, 29));
			if (i == 11)
				rs.add(new FrontBall(2, 11, 13, 14, 21));
			if (i == 12)
				rs.add(new FrontBall(2, 5, 20, 25, 31));
			if (i == 13)
				rs.add(new FrontBall(5, 24, 26, 30, 35));
			if (i == 14)
				rs.add(new FrontBall(8, 14, 15, 25, 26));
			if (i == 15)
				rs.add(new FrontBall(1, 5, 10, 16, 27));
			if (i == 16)
				rs.add(new FrontBall(10, 11, 20, 26, 27));
			if (i == 17)
				rs.add(new FrontBall(5, 11, 23, 26, 33));
			if (i == 18)
				rs.add(new FrontBall(1, 6, 13, 28, 29));
			if (i == 19)
				rs.add(new FrontBall(4, 29, 31, 32, 35));
			if (i == 20)
				rs.add(new FrontBall(5, 16, 18, 32, 35));
			if (i == 21)
				rs.add(new FrontBall(1, 15, 31, 32, 34));
			if (i == 22)
				rs.add(new FrontBall(12, 14, 17, 34, 35));
			if (i == 23)
				rs.add(new FrontBall(15, 17, 21, 27, 33));
			if (i == 24)
				rs.add(new FrontBall(29, 31, 32, 33, 35));
			if (i == 25)
				rs.add(new FrontBall(3, 17, 22, 23, 33));
			if (i == 26)
				rs.add(new FrontBall(24, 30, 31, 32, 34));
			if (i == 27)
				rs.add(new FrontBall(3, 22, 26, 33, 34));
			if (i == 28)
				rs.add(new FrontBall(6, 20, 30, 32, 35));
			if (i == 29)
				rs.add(new FrontBall(3, 4, 13, 17, 24));
			if (i == 30)
				rs.add(new FrontBall(1, 7, 27, 30, 32));
			if (i == 31)
				rs.add(new FrontBall(7, 11, 19, 21, 22));
			if (i == 32)
				rs.add(new FrontBall(4, 12, 20, 26, 29));
			if (i == 33)
				rs.add(new FrontBall(2, 8, 18, 21, 32));
			if (i == 34)
				rs.add(new FrontBall(5, 19, 31, 32, 35));
			if (i == 35)
				rs.add(new FrontBall(3, 7, 9, 28, 33));
			if (i == 36)
				rs.add(new FrontBall(2, 12, 26, 31, 33));
			if (i == 37)
				rs.add(new FrontBall(17, 18, 19, 25, 31));
			if (i == 38)
				rs.add(new FrontBall(6, 17, 20, 29, 32));
			if (i == 39)
				rs.add(new FrontBall(1, 3, 7, 10, 33));
			if (i == 40)
				rs.add(new FrontBall(3, 16, 30, 32, 33));
			if (i == 41)
				rs.add(new FrontBall(5, 9, 20, 23, 29));
			if (i == 42)
				rs.add(new FrontBall(11, 24, 25, 26, 31));
			if (i == 43)
				rs.add(new FrontBall(5, 21, 22, 32, 35));
			if (i == 44)
				rs.add(new FrontBall(1, 7, 18, 29, 34));
			if (i == 45)
				rs.add(new FrontBall(1, 9, 14, 24, 35));
			if (i == 46)
				rs.add(new FrontBall(1, 9, 24, 34, 35));
			if (i == 47)
				rs.add(new FrontBall(13, 18, 21, 24, 29));
			if (i == 48)
				rs.add(new FrontBall(5, 6, 22, 25, 27));
			if (i == 49)
				rs.add(new FrontBall(5, 16, 28, 29, 34));
			if (i == 50)
				rs.add(new FrontBall(5, 15, 28, 32, 33));
			if (i == 51)
				rs.add(new FrontBall(3, 11, 22, 26, 29));
			if (i == 52)
				rs.add(new FrontBall(23, 24, 30, 34, 35));
			if (i == 53)
				rs.add(new FrontBall(5, 9, 24, 31, 33));
			if (i == 54)
				rs.add(new FrontBall(2, 12, 19, 29, 30));
			if (i == 55)
				rs.add(new FrontBall(5, 8, 14, 23, 24));
			if (i == 56)
				rs.add(new FrontBall(4, 13, 17, 32, 35));
			if (i == 57)
				rs.add(new FrontBall(6, 15, 22, 27, 30));
			if (i == 58)
				rs.add(new FrontBall(8, 10, 14, 27, 32));
			if (i == 59)
				rs.add(new FrontBall(2, 13, 14, 29, 33));
			if (i == 60)
				rs.add(new FrontBall(18, 28, 29, 30, 31));
			if (i == 61)
				rs.add(new FrontBall(2, 10, 21, 26, 34));
			if (i == 62)
				rs.add(new FrontBall(4, 22, 23, 29, 31));
			if (i == 63)
				rs.add(new FrontBall(5, 6, 18, 21, 22));
			if (i == 64)
				rs.add(new FrontBall(6, 10, 11, 17, 34));
			if (i == 65)
				rs.add(new FrontBall(1, 12, 24, 27, 32));
			if (i == 66)
				rs.add(new FrontBall(1, 8, 19, 24, 31));
			if (i == 67)
				rs.add(new FrontBall(3, 6, 25, 28, 32));
			if (i == 68)
				rs.add(new FrontBall(2, 12, 15, 20, 28));
			if (i == 69)
				rs.add(new FrontBall(14, 16, 27, 30, 33));
			if (i == 70)
				rs.add(new FrontBall(10, 21, 24, 30, 31));
			if (i == 71)
				rs.add(new FrontBall(4, 20, 29, 30, 33));
			if (i == 72)
				rs.add(new FrontBall(23, 26, 29, 32, 33));
			if (i == 73)
				rs.add(new FrontBall(1, 10, 19, 21, 30));
			if (i == 74)
				rs.add(new FrontBall(15, 17, 19, 23, 32));
			if (i == 75)
				rs.add(new FrontBall(1, 7, 11, 32, 33));
			if (i == 76)
				rs.add(new FrontBall(3, 9, 11, 18, 24));
			if (i == 77)
				rs.add(new FrontBall(7, 20, 28, 32, 34));
			if (i == 78)
				rs.add(new FrontBall(11, 23, 26, 31, 34));
			if (i == 79)
				rs.add(new FrontBall(1, 2, 7, 13, 34));
			if (i == 80)
				rs.add(new FrontBall(7, 16, 19, 29, 35));
			if (i == 81)
				rs.add(new FrontBall(2, 15, 20, 25, 33));
			if (i == 82)
				rs.add(new FrontBall(5, 11, 26, 29, 32));
			if (i == 83)
				rs.add(new FrontBall(2, 5, 28, 34, 35));
			if (i == 84)
				rs.add(new FrontBall(5, 9, 19, 26, 35));
			if (i == 85)
				rs.add(new FrontBall(6, 13, 27, 33, 34));
			if (i == 86)
				rs.add(new FrontBall(1, 2, 7, 26, 29));
			if (i == 87)
				rs.add(new FrontBall(10, 24, 28, 30, 33));
			if (i == 88)
				rs.add(new FrontBall(13, 16, 27, 32, 34));
			if (i == 89)
				rs.add(new FrontBall(3, 6, 11, 19, 27));
			if (i == 90)
				rs.add(new FrontBall(18, 25, 30, 33, 34));
			if (i == 91)
				rs.add(new FrontBall(1, 5, 17, 32, 34));
			if (i == 92)
				rs.add(new FrontBall(10, 21, 22, 27, 29));
			if (i == 93)
				rs.add(new FrontBall(7, 9, 22, 30, 33));
			if (i == 94)
				rs.add(new FrontBall(1, 5, 21, 23, 29));
			if (i == 95)
				rs.add(new FrontBall(8, 18, 24, 30, 33));
			if (i == 96)
				rs.add(new FrontBall(7, 12, 28, 32, 33));
			if (i == 97)
				rs.add(new FrontBall(6, 13, 14, 22, 25));
			if (i == 98)
				rs.add(new FrontBall(11, 17, 19, 25, 26));
			if (i == 99)
				rs.add(new FrontBall(3, 9, 21, 23, 33));
			if (i == 100)
				rs.add(new FrontBall(16, 20, 25, 29, 33));
			if (i == 101)
				rs.add(new FrontBall(2, 10, 14, 22, 26));
			if (i == 102)
				rs.add(new FrontBall(11, 13, 29, 32, 35));
			if (i == 103)
				rs.add(new FrontBall(16, 20, 28, 32, 33));
			if (i == 104)
				rs.add(new FrontBall(15, 25, 29, 32, 33));
			if (i == 105)
				rs.add(new FrontBall(1, 25, 26, 34, 35));
			if (i == 106)
				rs.add(new FrontBall(11, 21, 22, 25, 34));
			if (i == 107)
				rs.add(new FrontBall(11, 12, 33, 34, 35));
			if (i == 108)
				rs.add(new FrontBall(1, 9, 14, 29, 30));
			if (i == 109)
				rs.add(new FrontBall(2, 11, 13, 26, 35));
			if (i == 110)
				rs.add(new FrontBall(22, 28, 30, 31, 34));
			if (i == 111)
				rs.add(new FrontBall(4, 11, 13, 19, 35));
			if (i == 112)
				rs.add(new FrontBall(2, 8, 12, 34, 35));
			if (i == 113)
				rs.add(new FrontBall(3, 4, 10, 18, 27));
			if (i == 114)
				rs.add(new FrontBall(2, 8, 25, 29, 33));
			if (i == 115)
				rs.add(new FrontBall(1, 2, 6, 8, 26));
			if (i == 116)
				rs.add(new FrontBall(12, 15, 23, 30, 33));
			if (i == 117)
				rs.add(new FrontBall(7, 21, 29, 31, 33));
			if (i == 118)
				rs.add(new FrontBall(10, 17, 18, 21, 34));
			if (i == 119)
				rs.add(new FrontBall(3, 12, 22, 23, 28));
			if (i == 120)
				rs.add(new FrontBall(11, 23, 27, 28, 32));
			if (i == 121)
				rs.add(new FrontBall(4, 5, 8, 11, 22));
			if (i == 122)
				rs.add(new FrontBall(1, 2, 11, 31, 33));
			if (i == 123)
				rs.add(new FrontBall(10, 21, 28, 29, 32));
			if (i == 124)
				rs.add(new FrontBall(1, 3, 14, 32, 35));
			if (i == 125)
				rs.add(new FrontBall(8, 20, 23, 29, 31));
			if (i == 126)
				rs.add(new FrontBall(14, 23, 27, 28, 33));
			if (i == 127)
				rs.add(new FrontBall(5, 9, 27, 32, 34));
			if (i == 128)
				rs.add(new FrontBall(6, 21, 28, 32, 34));
			if (i == 129)
				rs.add(new FrontBall(2, 10, 18, 32, 33));
			if (i == 130)
				rs.add(new FrontBall(9, 14, 25, 32, 34));
			if (i == 131)
				rs.add(new FrontBall(2, 3, 8, 33, 34));
			if (i == 132)
				rs.add(new FrontBall(2, 10, 12, 15, 28));
			if (i == 133)
				rs.add(new FrontBall(1, 8, 24, 27, 34));
			if (i == 134)
				rs.add(new FrontBall(2, 16, 19, 28, 33));
			if (i == 135)
				rs.add(new FrontBall(6, 8, 15, 20, 32));
			if (i == 136)
				rs.add(new FrontBall(7, 13, 23, 24, 29));
			if (i == 137)
				rs.add(new FrontBall(12, 28, 29, 30, 34));
			if (i == 138)
				rs.add(new FrontBall(3, 4, 14, 28, 32));
			if (i == 139)
				rs.add(new FrontBall(14, 16, 20, 22, 32));
			if (i == 140)
				rs.add(new FrontBall(7, 8, 19, 26, 30));
			if (i == 141)
				rs.add(new FrontBall(13, 14, 21, 30, 33));
			if (i == 142)
				rs.add(new FrontBall(5, 6, 13, 24, 31));
			if (i == 143)
				rs.add(new FrontBall(1, 9, 10, 11, 22));
			if (i == 144)
				rs.add(new FrontBall(18, 26, 32, 33, 34));
			if (i == 145)
				rs.add(new FrontBall(5, 11, 14, 22, 35));
			if (i == 146)
				rs.add(new FrontBall(11, 17, 23, 24, 25));
			if (i == 147)
				rs.add(new FrontBall(6, 12, 18, 22, 29));
			if (i == 148)
				rs.add(new FrontBall(2, 4, 13, 14, 33));
			if (i == 149)
				rs.add(new FrontBall(1, 3, 10, 12, 20));
			if (i == 150)
				rs.add(new FrontBall(4, 11, 18, 25, 34));
			if (i == 151)
				rs.add(new FrontBall(3, 8, 14, 30, 31));
			if (i == 152)
				rs.add(new FrontBall(1, 23, 29, 30, 32));
			if (i == 153)
				rs.add(new FrontBall(21, 22, 30, 32, 34));

		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2008(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(1, 2, 11, 34, 35));
			if (i == 2)
				rs.add(new FrontBall(1, 12, 24, 31, 32));
			if (i == 3)
				rs.add(new FrontBall(1, 11, 13, 32, 35));
			if (i == 4)
				rs.add(new FrontBall(9, 22, 24, 31, 33));
			if (i == 5)
				rs.add(new FrontBall(18, 25, 29, 31, 34));
			if (i == 6)
				rs.add(new FrontBall(10, 12, 26, 29, 34));
			if (i == 7)
				rs.add(new FrontBall(3, 4, 5, 12, 28));
			if (i == 8)
				rs.add(new FrontBall(2, 6, 8, 17, 32));
			if (i == 9)
				rs.add(new FrontBall(4, 8, 12, 24, 30));
			if (i == 10)
				rs.add(new FrontBall(6, 23, 24, 27, 29));
			if (i == 11)
				rs.add(new FrontBall(14, 20, 22, 24, 27));
			if (i == 12)
				rs.add(new FrontBall(2, 10, 29, 32, 35));
			if (i == 13)
				rs.add(new FrontBall(1, 11, 19, 22, 35));
			if (i == 14)
				rs.add(new FrontBall(4, 7, 10, 28, 34));
			if (i == 15)
				rs.add(new FrontBall(9, 18, 20, 27, 33));
			if (i == 16)
				rs.add(new FrontBall(8, 10, 11, 17, 19));
			if (i == 17)
				rs.add(new FrontBall(2, 14, 25, 29, 32));
			if (i == 18)
				rs.add(new FrontBall(3, 6, 7, 11, 30));
			if (i == 19)
				rs.add(new FrontBall(8, 24, 25, 29, 31));
			if (i == 20)
				rs.add(new FrontBall(4, 5, 15, 17, 33));
			if (i == 21)
				rs.add(new FrontBall(5, 10, 13, 21, 24));
			if (i == 22)
				rs.add(new FrontBall(9, 12, 13, 25, 31));
			if (i == 23)
				rs.add(new FrontBall(6, 26, 31, 32, 34));
			if (i == 24)
				rs.add(new FrontBall(8, 12, 17, 20, 30));
			if (i == 25)
				rs.add(new FrontBall(6, 10, 12, 15, 28));
			if (i == 26)
				rs.add(new FrontBall(1, 21, 22, 24, 25));
			if (i == 27)
				rs.add(new FrontBall(5, 17, 23, 31, 32));
			if (i == 28)
				rs.add(new FrontBall(3, 11, 17, 19, 26));
			if (i == 29)
				rs.add(new FrontBall(6, 11, 18, 29, 30));
			if (i == 30)
				rs.add(new FrontBall(3, 21, 23, 26, 35));
			if (i == 31)
				rs.add(new FrontBall(14, 20, 23, 27, 28));
			if (i == 32)
				rs.add(new FrontBall(3, 9, 19, 27, 33));
			if (i == 33)
				rs.add(new FrontBall(3, 10, 21, 23, 30));
			if (i == 34)
				rs.add(new FrontBall(6, 7, 18, 34, 35));
			if (i == 35)
				rs.add(new FrontBall(2, 12, 13, 29, 30));
			if (i == 36)
				rs.add(new FrontBall(9, 19, 22, 30, 32));
			if (i == 37)
				rs.add(new FrontBall(11, 20, 24, 31, 35));
			if (i == 38)
				rs.add(new FrontBall(12, 13, 19, 32, 33));
			if (i == 39)
				rs.add(new FrontBall(7, 11, 15, 27, 35));
			if (i == 40)
				rs.add(new FrontBall(4, 8, 19, 22, 29));
			if (i == 41)
				rs.add(new FrontBall(7, 17, 21, 22, 28));
			if (i == 42)
				rs.add(new FrontBall(5, 10, 13, 32, 35));
			if (i == 43)
				rs.add(new FrontBall(5, 8, 10, 31, 33));
			if (i == 44)
				rs.add(new FrontBall(2, 21, 23, 27, 32));
			if (i == 45)
				rs.add(new FrontBall(14, 32, 33, 34, 35));
			if (i == 46)
				rs.add(new FrontBall(11, 25, 26, 27, 35));
			if (i == 47)
				rs.add(new FrontBall(12, 18, 22, 23, 30));
			if (i == 48)
				rs.add(new FrontBall(1, 13, 22, 25, 27));
			if (i == 49)
				rs.add(new FrontBall(1, 11, 14, 28, 30));
			if (i == 50)
				rs.add(new FrontBall(1, 5, 11, 26, 27));
			if (i == 51)
				rs.add(new FrontBall(1, 7, 9, 11, 33));
			if (i == 52)
				rs.add(new FrontBall(3, 18, 19, 30, 35));
			if (i == 53)
				rs.add(new FrontBall(1, 13, 21, 23, 32));
			if (i == 54)
				rs.add(new FrontBall(5, 14, 23, 31, 35));
			if (i == 55)
				rs.add(new FrontBall(2, 14, 28, 30, 35));
			if (i == 56)
				rs.add(new FrontBall(15, 19, 25, 30, 31));
			if (i == 57)
				rs.add(new FrontBall(5, 8, 9, 17, 33));
			if (i == 58)
				rs.add(new FrontBall(3, 9, 11, 29, 33));
			if (i == 59)
				rs.add(new FrontBall(7, 13, 21, 25, 31));
			if (i == 60)
				rs.add(new FrontBall(3, 13, 17, 23, 30));
			if (i == 61)
				rs.add(new FrontBall(7, 10, 14, 19, 32));
			if (i == 62)
				rs.add(new FrontBall(1, 15, 27, 28, 29));
			if (i == 63)
				rs.add(new FrontBall(7, 11, 24, 30, 35));
			if (i == 64)
				rs.add(new FrontBall(14, 18, 24, 27, 31));
			if (i == 65)
				rs.add(new FrontBall(19, 22, 23, 25, 32));
			if (i == 66)
				rs.add(new FrontBall(2, 7, 21, 22, 25));
			if (i == 67)
				rs.add(new FrontBall(3, 10, 14, 15, 22));
			if (i == 68)
				rs.add(new FrontBall(6, 9, 11, 33, 34));
			if (i == 69)
				rs.add(new FrontBall(5, 13, 16, 29, 33));
			if (i == 70)
				rs.add(new FrontBall(9, 17, 18, 21, 31));
			if (i == 71)
				rs.add(new FrontBall(1, 5, 11, 14, 25));
			if (i == 72)
				rs.add(new FrontBall(10, 25, 32, 33, 34));
			if (i == 73)
				rs.add(new FrontBall(2, 5, 6, 7, 31));
			if (i == 74)
				rs.add(new FrontBall(10, 13, 22, 31, 35));
			if (i == 75)
				rs.add(new FrontBall(1, 10, 13, 30, 33));
			if (i == 76)
				rs.add(new FrontBall(3, 5, 10, 27, 34));
			if (i == 77)
				rs.add(new FrontBall(1, 8, 21, 33, 34));
			if (i == 78)
				rs.add(new FrontBall(8, 17, 20, 28, 31));
			if (i == 79)
				rs.add(new FrontBall(20, 23, 26, 32, 33));
			if (i == 80)
				rs.add(new FrontBall(6, 9, 29, 31, 33));
			if (i == 81)
				rs.add(new FrontBall(7, 8, 20, 22, 29));
			if (i == 82)
				rs.add(new FrontBall(15, 19, 29, 33, 35));
			if (i == 83)
				rs.add(new FrontBall(6, 14, 15, 30, 31));
			if (i == 84)
				rs.add(new FrontBall(2, 17, 20, 22, 25));
			if (i == 85)
				rs.add(new FrontBall(3, 7, 13, 15, 19));
			if (i == 86)
				rs.add(new FrontBall(1, 6, 10, 22, 35));
			if (i == 87)
				rs.add(new FrontBall(14, 22, 32, 33, 35));
			if (i == 88)
				rs.add(new FrontBall(7, 11, 19, 27, 31));
			if (i == 89)
				rs.add(new FrontBall(8, 13, 24, 32, 33));
			if (i == 90)
				rs.add(new FrontBall(4, 11, 18, 33, 34));
			if (i == 91)
				rs.add(new FrontBall(9, 13, 19, 22, 25));
			if (i == 92)
				rs.add(new FrontBall(3, 23, 26, 32, 34));
			if (i == 93)
				rs.add(new FrontBall(6, 7, 10, 24, 30));
			if (i == 94)
				rs.add(new FrontBall(7, 12, 19, 27, 34));
			if (i == 95)
				rs.add(new FrontBall(3, 4, 11, 21, 25));
			if (i == 96)
				rs.add(new FrontBall(6, 7, 12, 25, 28));
			if (i == 97)
				rs.add(new FrontBall(1, 10, 31, 33, 35));
			if (i == 98)
				rs.add(new FrontBall(7, 10, 22, 27, 33));
			if (i == 99)
				rs.add(new FrontBall(3, 18, 23, 25, 30));
			if (i == 100)
				rs.add(new FrontBall(12, 20, 26, 29, 30));
			if (i == 101)
				rs.add(new FrontBall(10, 13, 23, 31, 33));
			if (i == 102)
				rs.add(new FrontBall(5, 25, 26, 29, 35));
			if (i == 103)
				rs.add(new FrontBall(2, 11, 22, 30, 34));
			if (i == 104)
				rs.add(new FrontBall(7, 8, 10, 24, 34));
			if (i == 105)
				rs.add(new FrontBall(12, 21, 22, 26, 35));
			if (i == 106)
				rs.add(new FrontBall(3, 5, 21, 28, 33));
			if (i == 107)
				rs.add(new FrontBall(1, 2, 13, 15, 16));
			if (i == 108)
				rs.add(new FrontBall(11, 16, 24, 29, 32));
			if (i == 109)
				rs.add(new FrontBall(1, 10, 18, 28, 34));
			if (i == 110)
				rs.add(new FrontBall(5, 16, 25, 27, 33));
			if (i == 111)
				rs.add(new FrontBall(2, 11, 12, 14, 19));
			if (i == 112)
				rs.add(new FrontBall(4, 18, 26, 32, 33));
			if (i == 113)
				rs.add(new FrontBall(11, 14, 17, 19, 22));
			if (i == 114)
				rs.add(new FrontBall(2, 3, 22, 27, 31));
			if (i == 115)
				rs.add(new FrontBall(7, 9, 19, 21, 33));
			if (i == 116)
				rs.add(new FrontBall(6, 8, 15, 24, 31));
			if (i == 117)
				rs.add(new FrontBall(13, 23, 24, 25, 30));
			if (i == 118)
				rs.add(new FrontBall(6, 9, 19, 25, 30));
			if (i == 119)
				rs.add(new FrontBall(1, 2, 10, 19, 27));
			if (i == 120)
				rs.add(new FrontBall(21, 23, 24, 25, 32));
			if (i == 121)
				rs.add(new FrontBall(11, 23, 24, 32, 35));
			if (i == 122)
				rs.add(new FrontBall(3, 6, 12, 20, 29));
			if (i == 123)
				rs.add(new FrontBall(1, 6, 12, 28, 31));
			if (i == 124)
				rs.add(new FrontBall(2, 10, 13, 29, 33));
			if (i == 125)
				rs.add(new FrontBall(1, 4, 28, 33, 34));
			if (i == 126)
				rs.add(new FrontBall(9, 29, 32, 34, 35));
			if (i == 127)
				rs.add(new FrontBall(8, 21, 22, 31, 33));
			if (i == 128)
				rs.add(new FrontBall(12, 15, 23, 24, 25));
			if (i == 129)
				rs.add(new FrontBall(13, 16, 20, 25, 27));
			if (i == 130)
				rs.add(new FrontBall(3, 5, 22, 29, 34));
			if (i == 131)
				rs.add(new FrontBall(8, 9, 12, 21, 32));
			if (i == 132)
				rs.add(new FrontBall(6, 14, 24, 27, 29));
			if (i == 133)
				rs.add(new FrontBall(10, 12, 15, 33, 35));
			if (i == 134)
				rs.add(new FrontBall(11, 13, 15, 28, 35));
			if (i == 135)
				rs.add(new FrontBall(7, 22, 25, 29, 33));
			if (i == 136)
				rs.add(new FrontBall(3, 28, 29, 32, 34));
			if (i == 137)
				rs.add(new FrontBall(1, 10, 25, 32, 35));
			if (i == 138)
				rs.add(new FrontBall(4, 5, 18, 22, 35));
			if (i == 139)
				rs.add(new FrontBall(1, 6, 10, 14, 22));
			if (i == 140)
				rs.add(new FrontBall(2, 9, 11, 29, 32));
			if (i == 141)
				rs.add(new FrontBall(9, 15, 18, 30, 34));
			if (i == 142)
				rs.add(new FrontBall(6, 18, 21, 30, 35));
			if (i == 143)
				rs.add(new FrontBall(1, 2, 22, 29, 32));
			if (i == 144)
				rs.add(new FrontBall(10, 19, 27, 28, 33));
			if (i == 145)
				rs.add(new FrontBall(5, 16, 27, 29, 30));
			if (i == 146)
				rs.add(new FrontBall(9, 23, 24, 26, 33));
			if (i == 147)
				rs.add(new FrontBall(16, 18, 19, 24, 35));
			if (i == 148)
				rs.add(new FrontBall(3, 7, 20, 33, 35));
			if (i == 149)
				rs.add(new FrontBall(2, 5, 6, 27, 29));
			if (i == 150)
				rs.add(new FrontBall(1, 9, 10, 15, 25));
			if (i == 151)
				rs.add(new FrontBall(7, 10, 27, 31, 34));
			if (i == 152)
				rs.add(new FrontBall(3, 5, 14, 20, 33));
			if (i == 153)
				rs.add(new FrontBall(2, 4, 6, 25, 26));
			if (i == 154)
				rs.add(new FrontBall(5, 7, 10, 29, 32));

		}

		return rs;
	}

	/**
	 * 获取最近n个区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<FrontBall> frontBall2007(int limitCount) {
		List<FrontBall> rs = new ArrayList<FrontBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1)
				rs.add(new FrontBall(22, 24, 29, 31, 35));
			if (i == 2)
				rs.add(new FrontBall(15, 22, 31, 34, 35));
			if (i == 3)
				rs.add(new FrontBall(3, 4, 18, 23, 32));
			if (i == 4)
				rs.add(new FrontBall(6, 10, 16, 17, 25));
			if (i == 5)
				rs.add(new FrontBall(1, 9, 19, 20, 30));
			if (i == 6)
				rs.add(new FrontBall(1, 16, 20, 23, 28));
			if (i == 7)
				rs.add(new FrontBall(14, 16, 25, 26, 35));
			if (i == 8)
				rs.add(new FrontBall(2, 8, 11, 21, 23));
			if (i == 9)
				rs.add(new FrontBall(1, 3, 9, 19, 34));
			if (i == 10)
				rs.add(new FrontBall(6, 8, 18, 29, 34));
			if (i == 11)
				rs.add(new FrontBall(29, 32, 33, 34, 35));
			if (i == 12)
				rs.add(new FrontBall(3, 12, 15, 29, 34));
			if (i == 13)
				rs.add(new FrontBall(12, 17, 27, 29, 34));
			if (i == 14)
				rs.add(new FrontBall(1, 2, 7, 29, 32));
			if (i == 15)
				rs.add(new FrontBall(2, 8, 12, 13, 17));
			if (i == 16)
				rs.add(new FrontBall(1, 14, 19, 24, 31));
			if (i == 17)
				rs.add(new FrontBall(13, 14, 29, 32, 34));
			if (i == 18)
				rs.add(new FrontBall(3, 4, 16, 23, 28));
			if (i == 19)
				rs.add(new FrontBall(3, 6, 17, 22, 23));
			if (i == 20)
				rs.add(new FrontBall(2, 6, 11, 12, 18));
			if (i == 21)
				rs.add(new FrontBall(2, 4, 24, 29, 33));
			if (i == 22)
				rs.add(new FrontBall(8, 10, 12, 23, 25));
			if (i == 23)
				rs.add(new FrontBall(8, 10, 23, 32, 34));
			if (i == 24)
				rs.add(new FrontBall(6, 16, 20, 25, 31));
			if (i == 25)
				rs.add(new FrontBall(22, 24, 26, 27, 34));
			if (i == 26)
				rs.add(new FrontBall(5, 9, 13, 33, 35));
			if (i == 27)
				rs.add(new FrontBall(2, 3, 10, 19, 27));
			if (i == 28)
				rs.add(new FrontBall(20, 26, 30, 34, 35));
			if (i == 29)
				rs.add(new FrontBall(15, 22, 25, 29, 35));
			if (i == 30)
				rs.add(new FrontBall(11, 14, 27, 33, 35));
			if (i == 31)
				rs.add(new FrontBall(3, 21, 27, 31, 32));
			if (i == 32)
				rs.add(new FrontBall(1, 13, 21, 23, 32));
			if (i == 33)
				rs.add(new FrontBall(1, 5, 8, 14, 22));
			if (i == 34)
				rs.add(new FrontBall(6, 8, 11, 13, 22));
			if (i == 35)
				rs.add(new FrontBall(7, 11, 16, 31, 32));
			if (i == 36)
				rs.add(new FrontBall(15, 18, 21, 27, 34));
			if (i == 37)
				rs.add(new FrontBall(1, 6, 7, 17, 31));
			if (i == 38)
				rs.add(new FrontBall(6, 21, 25, 27, 32));
			if (i == 39)
				rs.add(new FrontBall(10, 11, 20, 21, 35));
			if (i == 40)
				rs.add(new FrontBall(5, 21, 25, 28, 35));
			if (i == 41)
				rs.add(new FrontBall(3, 16, 17, 22, 35));
			if (i == 42)
				rs.add(new FrontBall(7, 10, 22, 31, 35));
			if (i == 43)
				rs.add(new FrontBall(4, 9, 22, 24, 31));
			if (i == 44)
				rs.add(new FrontBall(4, 5, 7, 12, 26));
			if (i == 45)
				rs.add(new FrontBall(9, 16, 20, 26, 35));
			if (i == 46)
				rs.add(new FrontBall(4, 16, 18, 23, 30));
			if (i == 47)
				rs.add(new FrontBall(1, 6, 15, 19, 35));
			if (i == 48)
				rs.add(new FrontBall(8, 25, 26, 29, 35));
			if (i == 49)
				rs.add(new FrontBall(9, 10, 15, 17, 32));
			if (i == 50)
				rs.add(new FrontBall(13, 21, 22, 30, 35));
			if (i == 51)
				rs.add(new FrontBall(3, 7, 24, 28, 35));
			if (i == 52)
				rs.add(new FrontBall(1, 14, 29, 32, 33));
			if (i == 53)
				rs.add(new FrontBall(11, 16, 19, 21, 25));
			if (i == 54)
				rs.add(new FrontBall(4, 10, 19, 29, 34));
			if (i == 55)
				rs.add(new FrontBall(10, 16, 24, 31, 33));
			if (i == 56)
				rs.add(new FrontBall(4, 11, 17, 20, 21));
			if (i == 57)
				rs.add(new FrontBall(14, 16, 30, 32, 35));
			if (i == 58)
				rs.add(new FrontBall(8, 21, 25, 28, 33));
			if (i == 59)
				rs.add(new FrontBall(4, 15, 23, 31, 33));
			if (i == 60)
				rs.add(new FrontBall(12, 13, 29, 30, 31));
			if (i == 61)
				rs.add(new FrontBall(2, 10, 19, 28, 29));
			if (i == 62)
				rs.add(new FrontBall(1, 4, 10, 14, 29));
			if (i == 63)
				rs.add(new FrontBall(10, 31, 33, 34, 35));
			if (i == 64)
				rs.add(new FrontBall(2, 16, 32, 33, 35));
			if (i == 65)
				rs.add(new FrontBall(19, 20, 24, 29, 31));
			if (i == 66)
				rs.add(new FrontBall(4, 7, 8, 19, 24));
			if (i == 67)
				rs.add(new FrontBall(11, 18, 25, 30, 31));
			if (i == 68)
				rs.add(new FrontBall(4, 9, 13, 14, 33));
			if (i == 69)
				rs.add(new FrontBall(2, 13, 16, 21, 35));
			if (i == 70)
				rs.add(new FrontBall(7, 26, 29, 30, 35));
			if (i == 71)
				rs.add(new FrontBall(10, 22, 32, 33, 35));
			if (i == 72)
				rs.add(new FrontBall(21, 24, 26, 27, 33));
			if (i == 73)
				rs.add(new FrontBall(4, 5, 9, 12, 23));
			if (i == 74)
				rs.add(new FrontBall(16, 17, 23, 24, 31));
			if (i == 75)
				rs.add(new FrontBall(5, 11, 20, 30, 32));
			if (i == 76)
				rs.add(new FrontBall(2, 9, 12, 15, 31));
			if (i == 77)
				rs.add(new FrontBall(4, 6, 12, 13, 24));
			if (i == 78)
				rs.add(new FrontBall(9, 12, 14, 22, 23));
			if (i == 79)
				rs.add(new FrontBall(6, 9, 25, 26, 31));
			if (i == 80)
				rs.add(new FrontBall(1, 15, 20, 25, 27));
			if (i == 81)
				rs.add(new FrontBall(6, 18, 20, 22, 35));
			if (i == 82)
				rs.add(new FrontBall(3, 5, 14, 33, 34));
			if (i == 83)
				rs.add(new FrontBall(1, 5, 20, 21, 24));
			if (i == 84)
				rs.add(new FrontBall(5, 11, 18, 29, 34));
			if (i == 85)
				rs.add(new FrontBall(17, 24, 28, 29, 33));
			if (i == 86)
				rs.add(new FrontBall(14, 18, 19, 26, 28));
			if (i == 87)
				rs.add(new FrontBall(8, 18, 30, 31, 33));
			if (i == 88)
				rs.add(new FrontBall(17, 18, 21, 23, 33));
			if (i == 89)
				rs.add(new FrontBall(8, 13, 24, 30, 34));
			if (i == 90)
				rs.add(new FrontBall(4, 20, 24, 31, 33));
			if (i == 91)
				rs.add(new FrontBall(7, 12, 26, 31, 32));
			if (i == 92)
				rs.add(new FrontBall(6, 19, 27, 28, 29));
			if (i == 93)
				rs.add(new FrontBall(6, 8, 16, 25, 27));

		}

		return rs;
	}

}
