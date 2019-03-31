package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.bak.DaBack2018;
import com.example.bak.DaBack2019;
import com.example.dto.BackBall;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class TestDaBackFiter2018 {
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
		List<BackBall> lastBackBalls = new ArrayList<BackBall>();
		List<BackBall> lastBackBalls2018 = DaBack2018.backBallLast2018(limitCount);
		System.out.println("获取2018年" + limitCount + "个后区结果size：" + lastBackBalls.size());
		lastBackBalls.addAll(lastBackBalls2018);
		List<BackBall> lastBackBalls2019 = DaBack2019.backBallLast2019(limitCount);
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
