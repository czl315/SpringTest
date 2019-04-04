package com.example.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.example.dto.BackBall;

/**
 * 后区全部组合
 * 
 * @author admin
 *
 */
public class DaBackUtil {

	public static void main(String[] args) {
		int back1limit = 12, back2limit = 12;// 后区第2个2-12,第二个不能小于第一个
		/**
		 * 后区所有可能组合
		 */
		List<BackBall> backBalls = backAllComb(back1limit, back2limit);
//		System.out.println("后区所有可能组合size：" + backBalls.size());
		/**
		 * 历史获取n个后区结果
		 */
		int limitCount = 1000;
		List<BackBall> lastBackBalls = new ArrayList<BackBall>();
		List<BackBall> lastBackBalls2018 = DaBack2018.backBallLast2018(limitCount);
//		System.out.println("获取2018年" + limitCount + "个后区结果size：" + lastBackBalls2018.size());
		List<BackBall> lastBackBalls2019 = DaBack2019.backBallLast2019(limitCount);
//		System.out.println("获取2019年" + limitCount + "个后区结果size：" + lastBackBalls2019.size());
		lastBackBalls.addAll(lastBackBalls2018);
		lastBackBalls.addAll(lastBackBalls2019);
		System.out.println("获取2018年至今" + limitCount + "个后区结果size：" + lastBackBalls.size());

		// 频率
		Map<String, Integer> pinlvMap = new HashMap<String, Integer>();
		int curPinlv = 0;// 当前频率value
		// 结果遍历
		for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();) {
			BackBall backBallAll = (BackBall) iterator.next();
			String showStr = backBallAll.getBackBall1() + "," + backBallAll.getBackBall2();
			String showStrChuxian = "";
			boolean isChuxian = false;
			for (Iterator<BackBall> iterator2 = lastBackBalls.iterator(); iterator2.hasNext();) {
				BackBall backBallSomeone = (BackBall) iterator2.next();
				if (backBallAll.getBackBall1() == backBallSomeone.getBackBall1()
						&& backBallAll.getBackBall2() == backBallSomeone.getBackBall2()) {
					showStrChuxian = showStr + "---2018已出现过---";
					if (pinlvMap.get(showStr) != null) {
						curPinlv = pinlvMap.get(showStr).intValue();
						curPinlv++;
					} else {
						curPinlv = 1;
					}
					pinlvMap.put(showStr, curPinlv);
					isChuxian = true;
					continue;
				}
			}
			if (isChuxian) {
				// System.out.println(showStrChuxian);
			} else {
				System.out.println(showStr + "未出现过！！！");
				System.out.println();
			}
		}
		int[] cishuCounts = new int[10];// 出现次数
		for (String key : pinlvMap.keySet()) {
			for (int i = 1; i <= 10; i++) {
				if (pinlvMap.get(key) == i) {// 仅出现n次
//					System.out.println(key + ":" + pinlvMap.get(key));
					System.out.println(key + ":" + pinlvMap.get(key));
					if (i == 1) {
						int count2019Limit = 0;//限定最近期过滤
						int limit2019Max = 40;//限定最近期过滤
						for (Iterator iterator = lastBackBalls2019.iterator(); iterator.hasNext();) {
							BackBall backBall = (BackBall) iterator.next();
							String last = backBall.getBackBall1()+","+backBall.getBackBall2();
//							System.out.println(last);
							//2019
							count2019Limit++;
							if(count2019Limit>limit2019Max) {
								break;
							}else {
								if(last.equals(key)) {
									System.out.println("最近"+limit2019Max+"出现："+key + ":" + pinlvMap.get(key));
									continue;
								}else {
//									System.out.println("最近"+limit2019Max+"未出现："+key + ":" + pinlvMap.get(key));
									continue;
								}
							}
						}
					}
					cishuCounts[i]=cishuCounts[i]+1;
				}
			}
		}
		for (int i = 0; i < cishuCounts.length; i++) {
			System.out.println("cishu["+i+"]:" + cishuCounts[i]);
		}
	}

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
				rs2019.add(new BackBall(4, 5));
			}
			if (i == 32) {
				rs2019.add(new BackBall(7, 8));
			}
			if (i == 33) {
				rs2019.add(new BackBall(7, 9));
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
				// 两数不能相同
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
