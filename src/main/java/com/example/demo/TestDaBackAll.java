package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.dto.BackBall;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class TestDaBackAll {

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
		int limitCount = 10;
		List<BackBall> backBallLast2019 = backBallLast2019(limitCount);
		System.out.println("获取" + limitCount + "个后区结果size：" + backBalls.size());

		for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();) {
			BackBall backBall = (BackBall) iterator.next();
			System.out.println("后区1：" + backBall.getBackBall1() + "，后区2：" + backBall.getBackBall2());
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
		BackBall backBall = new BackBall();
		for (int i = 1; i <= limitCount; i++) {
			if (i == 1) {
				backBall.setBackBall1(3);
				backBall.setBackBall2(12);
				rs2019.add(backBall);
			}
			if (i == 2) {
				backBall.setBackBall1(1);
				backBall.setBackBall2(7);
				rs2019.add(backBall);
			}
			if (i == 3) {
				backBall.setBackBall1(10);
				backBall.setBackBall2(12);
				rs2019.add(backBall);
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
