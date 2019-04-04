package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.dto.BackBall;
import com.example.util.DaBack2018;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class TestDaBackFiter2019 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int back1limit = 12;// 后区第1个1-12
		int back2limit = 12;// 后区第2个2-12,第二个不能小于第一个
		/**
		 * 后区所有可能组合
		 */
		List<BackBall> backBalls = backAllComb(back1limit, back2limit);
		System.out.println("后区所有可能组合size：" + backBalls.size());
		/**
		 * 获取n个后区结果
		 */
		int limitCount = 1000;
//		List<BackBall> lastBackBalls = DaBack2019.backBallLast2019(limitCount);
//		System.out.println("获取2019年" + limitCount + "个后区结果size：" + lastBackBalls.size());
		List<BackBall> lastBackBalls = DaBack2018.backBallLast2018(limitCount);
		System.out.println("获取2018年" + limitCount + "个后区结果size：" + lastBackBalls.size());

		for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();) {
			BackBall backBallAll = (BackBall) iterator.next();
			System.out.print("后区1：" + backBallAll.getBackBall1() + "，后区2：" + backBallAll.getBackBall2());
			for (Iterator<BackBall> iterator2 = lastBackBalls.iterator(); iterator2.hasNext();) {
				BackBall backBall2019Someone = (BackBall) iterator2.next();
				if (backBallAll.getBackBall1() == backBall2019Someone.getBackBall1()
						&& backBallAll.getBackBall2() == backBall2019Someone.getBackBall2()) {
					System.out.print("---2019已出现过---");
					break;
				}
			}
			System.out.println();
		}
	}

	/**
	 * 获取最近n个后区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	private static List<BackBall> backBallLast2019(int limitCount) {
		List<BackBall> rs2019 = new ArrayList<BackBall>();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1) {
				rs2019.add(new BackBall(3, 12));
			}
			if (i == 2) {
				rs2019.add(new BackBall(1, 7));
			}
			if (i == 3) {
				rs2019.add(new BackBall(10, 12));
			}
			if (i == 4) {
				rs2019.add(new BackBall(3, 9));
			}
			if (i == 5) {
				rs2019.add(new BackBall(5, 6));
			}
			if (i == 6) {
				rs2019.add(new BackBall(4, 8));
			}
			if (i == 7) {
				rs2019.add(new BackBall(1, 5));
			}
			if (i == 8) {
				rs2019.add(new BackBall(6, 11));
			}
			if (i == 9) {
				rs2019.add(new BackBall(6, 12));
			}
			if (i == 10) {
				rs2019.add(new BackBall(2, 12));
			}
			
			if (i == 11) {
				rs2019.add(new BackBall(4, 9));
			}
			if (i == 12) {
				rs2019.add(new BackBall(7, 10));
			}
			if (i == 13) {
				rs2019.add(new BackBall(1, 8));
			}
			if (i == 14) {
				rs2019.add(new BackBall(9, 11));
			}
			if (i == 15) {
				rs2019.add(new BackBall(4, 6));
			}
			if (i == 16) {
				rs2019.add(new BackBall(2, 6));
			}
			if (i == 17) {
				rs2019.add(new BackBall(3, 4));
			}
			if (i == 18) {
				rs2019.add(new BackBall(6, 12));
			}
			if (i == 19) {
				rs2019.add(new BackBall(1, 2));
			}
			if (i == 20) {
				rs2019.add(new BackBall(3, 12));
			}
			
			if (i == 21) {
				rs2019.add(new BackBall(1, 10));
			}
			if (i == 22) {
				rs2019.add(new BackBall(1, 5));
			}
			if (i == 23) {
				rs2019.add(new BackBall(6, 11));
			}
			if (i == 24) {
				rs2019.add(new BackBall(8, 9));
			}
			if (i == 25) {
				rs2019.add(new BackBall(3, 7));
			}
			if (i == 26) {
				rs2019.add(new BackBall(2, 3));
			}
			if (i == 27) {
				rs2019.add(new BackBall(2, 7));
			}
			if (i == 28) {
				rs2019.add(new BackBall(2, 7));
			}
			if (i == 29) {
				rs2019.add(new BackBall(2, 3));
			}
			if (i == 30) {
//				rs2019.add(new BackBall(3, 12));
			}
		}

		return rs2019;
	}

	/*
	 * 后区所有可能组合
	 */
	private static List<BackBall> backAllComb(int back1limit, int back2limit) {
		List<BackBall> backBalls = new ArrayList<BackBall>();
		for (int backTemp1 = 1; backTemp1 <= back1limit; backTemp1++) {
			// 后区第2个2-12,第二个不能小于第一个
			for (int backTemp2 = backTemp1 + 1; backTemp2 <= back2limit; backTemp2++) {
				BackBall backBall = new BackBall();
				// if (backTemp2 == backTemp1) {
				// // 两数不能相同
				// continue;
				// }
				backBall.setBackBall1(backTemp1);
				backBall.setBackBall2(backTemp2);
				backBalls.add(backBall);
			}
		}
		// for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();)
		// {
		// BackBall backBall = (BackBall) iterator.next();
		// System.out.println("后区111："+backBall.getBackBall1()+"，后区222："+backBall.getBackBall2());
		// }
		return backBalls;
	}

}
