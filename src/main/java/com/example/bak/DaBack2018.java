package com.example.bak;

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
public class DaBack2018 {

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

			if (i == 41) rs.add(new BackBall(1, 12));
			if (i == 42) rs.add(new BackBall(5, 9));
			if (i == 43) rs.add(new BackBall(4, 11));
			if (i == 44) rs.add(new BackBall(5, 8));
			if (i == 45) rs.add(new BackBall(5, 9));
			if (i == 46) rs.add(new BackBall(5, 10));
			if (i == 47) rs.add(new BackBall(4, 8));
			if (i == 48) rs.add(new BackBall(2, 7));
			if (i == 49) rs.add(new BackBall(6, 12));
			if (i == 50) rs.add(new BackBall(6, 12));
			
			if (i == 51) rs.add(new BackBall(3, 11));
			if (i == 52) rs.add(new BackBall(2, 7));
			if (i == 53) rs.add(new BackBall(2, 12));
			if (i == 54) rs.add(new BackBall(1, 7));
			if (i == 55) rs.add(new BackBall(9, 10));
			if (i == 56) rs.add(new BackBall(5, 7));
			if (i == 57) rs.add(new BackBall(5, 6));
			if (i == 58) rs.add(new BackBall(4, 10));
			if (i == 59) rs.add(new BackBall(6, 11));
			if (i == 50) rs.add(new BackBall(2, 10));
			
			if (i == 51) rs.add(new BackBall(3,11));
			if (i == 52) rs.add(new BackBall(2,7));
			if (i == 53) rs.add(new BackBall(2,12));
			if (i == 54) rs.add(new BackBall(1,7));
			if (i == 55) rs.add(new BackBall(9,10));
			if (i == 56) rs.add(new BackBall(5,7));
			if (i == 57) rs.add(new BackBall(5,6));
			if (i == 58) rs.add(new BackBall(4,10));
			if (i == 59) rs.add(new BackBall(6,11));
			if (i == 60) rs.add(new BackBall(2,10));
			
			if (i == 61) rs.add(new BackBall(8,11));
			if (i == 62) rs.add(new BackBall(2,7));
			if (i == 63) rs.add(new BackBall(3,10));
			if (i == 64) rs.add(new BackBall(2,4));
			if (i == 65) rs.add(new BackBall(8,10));
			if (i == 66) rs.add(new BackBall(1,4));
			if (i == 67) rs.add(new BackBall(7,10));
			if (i == 68) rs.add(new BackBall(5,6));
			if (i == 69) rs.add(new BackBall(2,11));
			if (i == 70) rs.add(new BackBall(4,7));
			if (i == 71) rs.add(new BackBall(3,9));
			if (i == 72) rs.add(new BackBall(1,2));
			if (i == 73) rs.add(new BackBall(2,8));
			if (i == 74) rs.add(new BackBall(4,12));
			if (i == 75) rs.add(new BackBall(4,12));
			if (i == 76) rs.add(new BackBall(6,8));
			if (i == 77) rs.add(new BackBall(8,9));
			if (i == 78) rs.add(new BackBall(3,6));
			if (i == 79) rs.add(new BackBall(1,5));
			if (i == 80) rs.add(new BackBall(10,11));
			if (i == 81) rs.add(new BackBall(1,12));
			if (i == 82) rs.add(new BackBall(8,10));
			if (i == 83) rs.add(new BackBall(10,11));
			if (i == 84) rs.add(new BackBall(11,12));
			if (i == 85) rs.add(new BackBall(5,7));
			if (i == 86) rs.add(new BackBall(4,5));
			if (i == 87) rs.add(new BackBall(1,4));
			if (i == 88) rs.add(new BackBall(1,8));
			if (i == 89) rs.add(new BackBall(6,10));
			if (i == 90) rs.add(new BackBall(4,11));
			if (i == 91) rs.add(new BackBall(1,7));
			if (i == 92) rs.add(new BackBall(4,10));
			if (i == 93) rs.add(new BackBall(3,11));
			if (i == 94) rs.add(new BackBall(8,10));
			if (i == 95) rs.add(new BackBall(5,12));
			if (i == 96) rs.add(new BackBall(6,10));
			if (i == 97) rs.add(new BackBall(1,4));
			if (i == 98) rs.add(new BackBall(5,7));
			if (i == 99) rs.add(new BackBall(1,7));
			if (i == 100) rs.add(new BackBall(6,9));
			if (i == 101) rs.add(new BackBall(4,5));
			if (i == 102) rs.add(new BackBall(10,12));
			if (i == 103) rs.add(new BackBall(2,3));
			if (i == 104) rs.add(new BackBall(7,11));
			if (i == 105) rs.add(new BackBall(2,7));
			if (i == 106) rs.add(new BackBall(1,4));
			if (i == 107) rs.add(new BackBall(3,4));
			if (i == 108) rs.add(new BackBall(7,12));
			if (i == 109) rs.add(new BackBall(2,5));
			if (i == 110) rs.add(new BackBall(3,11));
			if (i == 111) rs.add(new BackBall(4,5));
			if (i == 112) rs.add(new BackBall(9,10));
			if (i == 113) rs.add(new BackBall(4,8));
			if (i == 114) rs.add(new BackBall(5,6));
			if (i == 115) rs.add(new BackBall(1,2));
			if (i == 116) rs.add(new BackBall(7,10));
			if (i == 117) rs.add(new BackBall(3,8));
			if (i == 118) rs.add(new BackBall(6,9));
			if (i == 119) rs.add(new BackBall(2,5));
			if (i == 120) rs.add(new BackBall(8,9));
			if (i == 121) rs.add(new BackBall(1,10));
			if (i == 122) rs.add(new BackBall(5,12));
			if (i == 123) rs.add(new BackBall(2,4));
			if (i == 124) rs.add(new BackBall(10,11));
			if (i == 125) rs.add(new BackBall(4,6));
			if (i == 126) rs.add(new BackBall(5,6));
			if (i == 127) rs.add(new BackBall(8,12));
			if (i == 128) rs.add(new BackBall(8,9));
			if (i == 129) rs.add(new BackBall(3,6));
			if (i == 130) rs.add(new BackBall(1,11));
			if (i == 131) rs.add(new BackBall(2,11));
			if (i == 132) rs.add(new BackBall(1,4));
			if (i == 133) rs.add(new BackBall(1,10));
			if (i == 134) rs.add(new BackBall(2,12));
			if (i == 135) rs.add(new BackBall(6,12));
			if (i == 136) rs.add(new BackBall(5,11));
			if (i == 137) rs.add(new BackBall(8,11));
			if (i == 138) rs.add(new BackBall(4,5));
			if (i == 139) rs.add(new BackBall(6,9));
			if (i == 140) rs.add(new BackBall(3,4));
			if (i == 141) rs.add(new BackBall(4,9));
			if (i == 142) rs.add(new BackBall(10,11));
			if (i == 143) rs.add(new BackBall(1,2));
			if (i == 144) rs.add(new BackBall(7,11));
			if (i == 145) rs.add(new BackBall(6,11));
			if (i == 146) rs.add(new BackBall(1,2));
			if (i == 147) rs.add(new BackBall(2,10));
			if (i == 148) rs.add(new BackBall(2,3));
			if (i == 149) rs.add(new BackBall(3,6));
			if (i == 150) rs.add(new BackBall(10,12));
			if (i == 151) rs.add(new BackBall(3,7));
			if (i == 152) rs.add(new BackBall(8,11));
			if (i == 153) rs.add(new BackBall(1,8));
			if (i == 154) rs.add(new BackBall(3,5));
			
		}

		return rs;
	}

}
