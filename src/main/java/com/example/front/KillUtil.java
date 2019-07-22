package com.example.front;

import java.util.Iterator;
import java.util.List;

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
		// int count = 0;
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
		if (killWeiEveryCount != null && killWeiEveryCount.length > 0) {
			for (int i = 0; i < tmpWeiEveryCount.length; i++) {
				if (tmpWeiEveryCount[i] > killWeiEveryCount[i]) {
					// System.out.println("尾号每个区域过滤:" + t1 + "," + t2 + "," + t3 + "," + t4 + "," +
					// t5);
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * 模糊匹配4个过滤掉
	 * 
	 * @param tempBall
	 * @param filterHists
	 * @param i
	 * @return
	 */
	public static boolean checkHisLike(FrontBall tempBall, List<FrontBall> filterHists, int limitCount) {
		boolean rs = false;
		for (Iterator<FrontBall> iterator = filterHists.iterator(); iterator.hasNext();) {
			FrontBall exactObj = (FrontBall) iterator.next();
			int h1 = exactObj.getFrontBall1();
			int h2 = exactObj.getFrontBall2();
			int h3 = exactObj.getFrontBall3();
			int h4 = exactObj.getFrontBall4();
			int h5 = exactObj.getFrontBall5();
			int t1 = tempBall.getFrontBall1();
			int t2 = tempBall.getFrontBall2();
			int t3 = tempBall.getFrontBall3();
			int t4 = tempBall.getFrontBall4();
			int t5 = tempBall.getFrontBall5();
			int count = 0;
			if (t1 == h1 || t1 == h2 || t1 == h3 || t1 == h4 || t1 == h5) {
				count++;
			}
			if (t2 == h1 || t2 == h2 || t2 == h3 || t2 == h4 || t2 == h5) {
				count++;
			}
			if (t3 == h1 || t3 == h2 || t3 == h3 || t3 == h4 || t3 == h5) {
				count++;
			}
			if (t4 == h1 || t4 == h2 || t4 == h3 || t4 == h4 || t4 == h5) {
				count++;
			}
			if (t5 == h1 || t5 == h2 || t5 == h3 || t5 == h4 || t5 == h5) {
				count++;
			}

			if (count > limitCount) {
				rs = true;
				break;
			}
		}
		return rs;
	}

}
