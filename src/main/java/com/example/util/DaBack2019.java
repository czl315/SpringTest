package com.example.util;

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
public class DaBack2019 {

	/**
	 * 获取最近n个后区结果
	 * 
	 * @param limitCount
	 * @return
	 */
	public static List<BackBall> backBallLast2019(int limitCount) {
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
				rs2019.add(new BackBall(2, 4));
			}
			if (i == 31) {
				rs2019.add(new BackBall(4,5 ));
			}
			if (i == 32) {
				rs2019.add(new BackBall(7,8 ));
			}
			if (i == 33) {
				rs2019.add(new BackBall(7, 9));
			}
			if (i == 34) rs2019.add(new BackBall(1, 2));
			if (i == 35) rs2019.add(new BackBall(8, 9));
			if (i == 36) rs2019.add(new BackBall(1, 12));
			if (i == 37) rs2019.add(new BackBall(4, 8));
			
		}

		return rs2019;
	}


}
