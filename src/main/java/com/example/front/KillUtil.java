package com.example.front;

import com.example.dto.FrontBall;
import com.example.dto.FrontLimit;

public class KillUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 尾号每个区域过滤
	 * 
	 * @param tempBall
	 * @param frontLimit
	 * @return
	 */
	public static boolean checkKillWeiEveryCount(FrontBall tempBall, FrontLimit frontLimit) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int[] killWeiEveryCount = frontLimit.getKillWeiEveryCount();
//		int count = 0;
		int[] tmpWeiEveryCount = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i <= 9; i++) {
			if (t1 % 10 == i) {
				tmpWeiEveryCount[i]++;
			}
			if (t2 % 10 == i) {
				tmpWeiEveryCount[i]++;
			}
			if (t3 % 10 == i) {
				tmpWeiEveryCount[i]++;
			}
			if (t4 % 10 == i) {
				tmpWeiEveryCount[i]++;
			}
			if (t5 % 10 == i) {
				tmpWeiEveryCount[i]++;
			}
		}
		for (int i = 0; i < tmpWeiEveryCount.length; i++) {
			if (tmpWeiEveryCount[i] > killWeiEveryCount[i]) {
//				System.out.println("尾号每个区域过滤:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
				return true;
			}
		}
		return false;
	}

}
