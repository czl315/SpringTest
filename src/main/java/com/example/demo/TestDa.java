package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.dto.BackBall;

public class TestDa {

	private static int back2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int front1 = 0;
		int front2 = 0;
		int front3 = 0;
		int front4 = 0;
		int front5 = 0;
		int back1 = 0;
		int back2 = 0;
		int back1limit = 12;
		int back2limit = 12;
		int backLimitCount = 0;// 可能性个数

		// 后区所有可能组合
		int backAllCount = back1limit * (back2limit - 1);
		List<BackBall> backBalls = backAllComb(back1limit, back2limit);
		System.out.println("后区所有可能组合size：" + backBalls.size());
		for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();) {
			BackBall backBall = (BackBall) iterator.next();
			System.out.println("后区1："+backBall.getBackBall1()+"，后区2："+backBall.getBackBall2());
		}
	}

	/*
	 * 后区所有可能组合
	 */
	private static List<BackBall> backAllComb(int back1limit, int back2limit) {
		List<BackBall> backBalls = new ArrayList<BackBall>();
		for (int backTemp1 = 1; backTemp1 <= back1limit; backTemp1++) {
			for (int backTemp2 = backTemp1+1; backTemp2 <= back2limit; backTemp2++) {
				BackBall backBall = new BackBall();
//				if (backTemp2 == backTemp1) {
//					// 两数不能相同
//					continue;
//				}
				backBall.setBackBall1(backTemp1);
				backBall.setBackBall2(backTemp2);
				backBalls.add(backBall);
			}
		}
//		for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();) {
//			BackBall backBall = (BackBall) iterator.next();
//			System.out.println("后区111："+backBall.getBackBall1()+"，后区222："+backBall.getBackBall2());
//		}
		return backBalls;
	}

}
