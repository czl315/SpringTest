package com.example.front;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.example.dto.FrontBall;
import com.example.dto.FrontLast;
import com.example.dto.FrontLimit;
import com.example.dto.FrontLimitArea5;
import com.example.util.DaFrontHis;

public class Front105 {
	private static boolean showLast = true;// false true
	private static boolean showYuce = true;// false true

	public static void main(String[] args) {
		FrontLimit frontLimit = new FrontLimit();// 限定过滤
		FrontBall curBall = new FrontBall(1, 4, 9, 14, 17);// 19105:::1,4,9,14,17+1,6
		int[] filtersLast = { 2, 7, 19, 22, 28 };// 过滤上期 TODO

		// 2018年前区和值：40以下-0；5X-8；6X-11；7X=12；8X=31；9X=29；10X=22；11X=20；12X=5；13X=4；14X=2；
		frontLimit.setSumMinLimit(90);
		frontLimit.setSumMaxLimit(94);

		// 必杀号码列表
		List<Integer> mustKills = new ArrayList<Integer>();
		mustKills.add(5);
		mustKills.add(24);
		mustKills.add(25);

		int[] filtersAdjoin3 = { 29 };// 过滤3adjoin-特殊形态;三邻号
		int[] filtersRuleRepeat = { 1, 4, 5, 13, 19, 22, 27, 28 };// 过滤规律重复1, 27;上次重号，本次不再重号
		int[] filtersMost = { 29, 33, 35 };// 出现总次数：29=352；33=341；35=328；32=321；30=312；35遗漏39期处于历史峰值
		int[] filtersCool = { 24, 25 };// 遗漏次数：24=21;25=20;9=15;34=15
		int[] kill360Array = { 34, 2, 16, 26, 5, 25, 8, 5, 5, 10 };// 360杀号定胆
		int[] killcjw = { 14, 13, 25, 1, 32, 20, 13, 5, 32, 32 };// 杀号-彩经网

		int lastLimitCount = 0;// 上期相同个数限定
		List<Integer> tempArea5s = new ArrayList<Integer>();// 分区5-过滤3、4、5个3, 4, 5
		tempArea5s.add(3);
		tempArea5s.add(4);
		tempArea5s.add(5);
		int[] killWeiEveryArrayOrg = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };// 尾号每个区域过滤
		int[] killWeiEveryArray = killWeiEveryArrayOrg;// 尾号每个区域过滤
		frontLimit.setCzlFiltersCount(1);// 我自己杀号限定个数
		int kill360LimitCount = 1;
		int cjwKillCount = 1;
		frontLimit.setKillLianLimit(2);// 连号数量限定：过滤掉
		int kuaduMin = 24;// 最小跨度
		int kuaduMax = 30;// 最大跨度
		int oddLimit = 3;// 奇数限定
		int evenLimit = 3;// 偶数限定
		// 每个范围限定
		frontLimit.setF1Min(1);
		frontLimit.setF2Min(4);// 4
		frontLimit.setF3Min(7);// 7 9
		frontLimit.setF4Min(11);// 15 13
		frontLimit.setF5Min(15);// 25 29 27
		frontLimit.setF1Max(7);// 1-7百分比=1240/1819=68.17% 9 7
		frontLimit.setF2Max(18);// 18
		frontLimit.setF3Max(23);
		frontLimit.setF4Max(32);// 32
		frontLimit.setF5Max(35);
		// 前区-分区5-限定:每个分区不能多于n个
		FrontLimitArea5 area5s = new FrontLimitArea5();
		List<int[]> fiter5s = new ArrayList<int[]>();
		int[] everyAreaCounts11111 = { 1, 1, 1, 1, 1 };// 过滤分区5-11111
		fiter5s.add(everyAreaCounts11111);
		// 过滤分区5-最近n期-
		int[] everyAreaCounts12200 = { 1, 2, 2, 0, 0 };
		fiter5s.add(everyAreaCounts12200);
		int[] everyAreaCounts02102 = { 0, 2, 1, 0, 2 };
		fiter5s.add(everyAreaCounts02102);
		int[] everyAreaCounts22010 = { 2, 2, 0, 1, 0 };
		fiter5s.add(everyAreaCounts22010);
		int[] everyAreaCounts10121 = { 1, 0, 1, 2, 1 };
		fiter5s.add(everyAreaCounts10121);
		int[] everyAreaCounts11210 = { 1, 1, 2, 1, 0 };
		fiter5s.add(everyAreaCounts11210);
		int[] everyAreaCounts01130 = { 0, 1, 1, 3, 0 };
		fiter5s.add(everyAreaCounts01130);
		int[] everyAreaCounts11102 = { 1, 1, 1, 0, 2 };
		fiter5s.add(everyAreaCounts11102);
		int[] everyAreaCounts21101 = { 2, 1, 1, 0, 1 };
		fiter5s.add(everyAreaCounts21101);
		int[] everyAreaCounts12101 = { 1, 2, 1, 0, 1 };
		fiter5s.add(everyAreaCounts12101);
		int[] everyAreaCounts20201 = { 2, 0, 2, 0, 1 };
		fiter5s.add(everyAreaCounts20201);
		int[] everyAreaCounts22001 = { 2, 2, 0, 0, 1 };
		fiter5s.add(everyAreaCounts22001);
		int[] everyAreaCounts12011 = { 1, 2, 0, 1, 1 };
		fiter5s.add(everyAreaCounts12011);
		area5s.setFiterCounts(fiter5s);

		// 修正
		frontLimit.setCzlFiltersCount(1);// 我自己杀号限定个数
		lastLimitCount = 1;// 上期相同个数限定
		frontLimit.setKillLianLimit(3);// 连号数量限定：过滤掉

		// 错误修正 TODO
		frontLimit.setSumMinLimit(45);
		// frontLimit.setSumMaxLimit(94);
		mustKills = new ArrayList<Integer>();// 必杀号码列表
		cjwKillCount = 2;
		frontLimit.setCzlFiltersCount(2);// 我自己杀号限定个数
		kuaduMin = 16;// 最小跨度

		// int[] killWeiEveryArrayNow = { 2, 2, 3, 2, 2, 2, 2, 2, 2, 2 };// 尾号每个区域过滤
		// killWeiEveryArray = killWeiEveryArrayNow;// 尾号每个区域过滤
		// lastLimitCount = 2;// 上期相同个数限定
		// oddLimit = 4;// 奇数限定
		// area5s.setFiterCounts(null);
		// kill360LimitCount = 3;
		// tempArea5s = new ArrayList<Integer>();// 分区5-过滤3、4、5个3, 4, 5
		// // tempArea5s.add(3);
		// tempArea5s.add(4);
		// tempArea5s.add(5);
		// frontLimit.setF1Max(14);// 1-7百分比=1240/1819=68.17% 9 7
		// // killWeiEveryArrayNow = killWeiEveryArrayOrg;
		// frontLimit.setKillLianLimit(3);// 连号数量限定：过滤掉
		// evenLimit = 4;// 偶数限定
		// frontLimit.setF2Max(20);// 23
		// frontLimit.setF3Max(28);// 23
		// frontLimit.setF4Max(33);// 32
		// area5s.setFiterCounts(null);
		// kill360LimitCount = 2;
		// kuaduMax = 32;// 最大跨度
		// frontLimit.setF3Min(6);// 7

		// frontLimit.setKillLianLimit(3);// 连号数量限定：过滤掉
		// tempArea5s.remove(0);// 3
		// frontLimit.setF2Max(26);// 18
		// frontLimit.setF3Max(28);

		// int[] tempArea5 = { 4, 5 };// 分区5-过滤3、4、5个3, 4, 5
		// int[] killNoLimits = { 1 };

		frontLimit.setMustKills(mustKills);
		frontLimit.setKillWeiEveryCount(killWeiEveryArray);// 尾号每个区域过滤

		// 每个范围限定
		frontLimit.setKuaduMin(kuaduMin);
		frontLimit.setKuaduMax(kuaduMax);
		frontLimit.setOddLimit(oddLimit);
		frontLimit.setEvenLimit(evenLimit);

		frontLimit.setKill360LimitCount(kill360LimitCount);// 360杀号限定n个

		int[] killNoLimits = { cjwKillCount };
		frontLimit.setKillNosLimitCount(killNoLimits);

		FrontLast frontLast = new FrontLast();
		frontLast.setLimitCount(lastLimitCount);// 相同个数限定
		int last1 = filtersLast[0], last2 = filtersLast[1], last3 = filtersLast[2], last4 = filtersLast[3],
				last5 = filtersLast[4];
		frontLast.setLast1(last1);
		frontLast.setLast2(last2);
		frontLast.setLast3(last3);
		frontLast.setLast4(last4);
		frontLast.setLast5(last5);
		frontLimit.setLast(frontLast);// 前区上期

		int[] tempArea5 = new int[tempArea5s.size()];
		for (int i = 0; i < tempArea5s.size(); i++) {
			tempArea5[i] = tempArea5s.get(i);
		}
		int[] area1 = tempArea5, area2 = tempArea5, area3 = tempArea5, area4 = tempArea5, area5 = tempArea5;
		area5s.setArea1(area1);
		area5s.setArea2(area2);
		area5s.setArea3(area3);
		area5s.setArea4(area4);
		area5s.setArea5(area5);
		frontLimit.setArea5(area5s);

		SortedSet<Integer> setFilters = new TreeSet<Integer>();// 过滤
		for (int i = 0; i < filtersAdjoin3.length; i++) {
			if (i == 0) {
				System.out.print("[filtersAdjoin3]size():" + filtersAdjoin3.length + "=");
			}
			System.out.print("," + filtersAdjoin3[i]);
			setFilters.add(filtersAdjoin3[i]);
			if (i == (filtersAdjoin3.length - 1)) {
				System.out.println("");
			}
		}
		for (int i = 0; i < filtersRuleRepeat.length; i++) {
			if (i == 0) {
				System.out.print("[filtersRuleRepeat]size():" + filtersRuleRepeat.length + "=");
			}
			System.out.print("," + filtersRuleRepeat[i]);
			setFilters.add(filtersRuleRepeat[i]);
			if (i == (filtersRuleRepeat.length - 1)) {
				System.out.println("");
			}
		}

		for (int i = 0; i < filtersCool.length; i++) {
			if (i == 0) {
				System.out.print("[filtersCool]filter。size():" + filtersCool.length + "=");
			}
			setFilters.add(filtersCool[i]);
			System.out.print("," + filtersCool[i]);
			if (i == (filtersCool.length - 1)) {
				System.out.println("");
			}
		}

		for (int i = 0; i < filtersMost.length; i++) {
			if (i == 0) {
				System.out.print("[filtersMost]filter。size():" + filtersMost.length + "=");
			}
			setFilters.add(filtersMost[i]);
			System.out.print("," + filtersMost[i]);
			if (i == (filtersMost.length - 1)) {
				System.out.println("");
			}
		}

		// 360杀号定胆
		List<Integer> kill360 = new ArrayList<Integer>();
		SortedSet<Integer> kill360set = new TreeSet<Integer>();
		for (int i = 0; i < kill360Array.length; i++) {
			kill360set.add(kill360Array[i]);
		}
		System.out.print("[kill360set]filter。size():" + kill360set.size() + "=");
		for (Iterator<Integer> iterator = kill360set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print("," + integer);
		}
		System.out.println("");
		showIsYes(curBall, kill360set, "360杀号过滤号码：");
		kill360.addAll(kill360set);
		frontLimit.setKill360two(kill360);

		// 彩经网
		SortedSet<Integer> killcjwsSet = new TreeSet<Integer>();
		for (int i = 0; i < killcjw.length; i++) {
			killcjwsSet.add(killcjw[i]);
		}
		System.out.print("[killcjw]filter。size():" + killcjwsSet.size() + "=");
		for (Iterator<Integer> iterator = killcjwsSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print("," + integer);
		}
		System.out.println("");
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		map.put(killNoLimits[0], killcjwsSet);
		List<Map<Integer, Set<Integer>>> killNos = new ArrayList<Map<Integer, Set<Integer>>>();
		killNos.add(map);
		showIsYes(curBall, killcjwsSet, "彩经网杀号过滤号码：");
		frontLimit.setKillNos(killNos);

		List<FrontBall> filterHists = DaFrontHis.frontBall2007to2019(5000);// history全过滤4个以上；历史100过滤3个；历史10过滤2个
		// System.out.println("历史过滤frontBalls个数：" + filterHists.size());

		Object[] filtersObj = (Object[]) setFilters.toArray();
		int[] filterBalls = new int[filtersObj.length];
		List<Integer> czlFilters = new ArrayList<Integer>();

		System.out.print("[czl过滤号码]filter:=【");
		for (int i = 0; i < filtersObj.length; i++) {
			filterBalls[i] = (int) filtersObj[i];
			czlFilters.add(filterBalls[i]);
			System.out.print("，" + filterBalls[i]);
		}
		System.out.print("】");
		System.out.println("[size():" + czlFilters.size() + "]");
		showIsYes(curBall, filterBalls, "czl过滤号码：", showLast);
		frontLimit.setCzlFilters(czlFilters);

		int c1 = curBall.getFrontBall1(), c2 = curBall.getFrontBall2(), c3 = curBall.getFrontBall3(),
				c4 = curBall.getFrontBall4(), c5 = curBall.getFrontBall5();
		if (showLast)
			System.out.println("当期和值===" + (c1 + c2 + c3 + c4 + c5));
		// 过滤号码与当期比较，是否错误
		showIsYes(curBall, filtersLast, "上期号码：", showLast);

		/**
		 * 剩余组合
		 */
		List<FrontBall> combs = combNolian(curBall, filterHists, frontLimit);// 精确匹配多个

		System.out.println(
				"前区组合限定:" + "上期限定" + frontLimit.getLast().getLimitCount() + ";" + "no" + frontLimit.getKillLianLimit()
						+ "连;和值" + frontLimit.getSumMinLimit() + "-" + frontLimit.getSumMaxLimit() + ";跨度"
						+ frontLimit.getKuaduMin() + "-" + frontLimit.getKuaduMax() + ";剩余组合：" + combs.size());

		int yes5 = 0;// 5球全中
		int yes4 = 0;// 4球中
		int yes3 = 0;// 3球中
		int yes2 = 0;// 2球中
		int yes1 = 0;// 1球中
		int yuce1 = 0, yuce2 = 0, yuce3 = 0, yuce4 = 0, yuce5 = 0;// 预测

		for (Iterator<FrontBall> iterator = combs.iterator(); iterator.hasNext();) {
			FrontBall ball = (FrontBall) iterator.next();
			int f1 = ball.getFrontBall1(), f2 = ball.getFrontBall2(), f3 = ball.getFrontBall3(),
					f4 = ball.getFrontBall4(), f5 = ball.getFrontBall5();
			if (showLast) {
				if (f1 == c1 && f2 == c2 && f3 == c3 && f4 == c4 && f5 == c5) {
					System.out.println("过滤后当期：：：" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5);
				}
				// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
				// 前区出球
				int yuceCount = 0;
				if (f1 == yuce1) {
					yuceCount++;
				}
				if (f2 == yuce2) {
					yuceCount++;
				}
				if (f3 == yuce3) {
					yuceCount++;
				}
				if (f4 == yuce4) {
					yuceCount++;
				}
				if (f5 == yuce5) {
					yuceCount++;
				}
				if (showYuce) {
					if (yuceCount >= 2) {
						// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " + ");//
					} else {// TODO CZL
						// System.out.println(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
					}
				}
				yuce1 = f1;
				yuce2 = f2;
				yuce3 = f3;
				yuce4 = f4;
				yuce5 = f5;
			}

			if (curBall != null) {
				// 中5球
				if (c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5) {
					System.out.println("5球全中！！！！！！！！" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
					yes5++;
				}
				// 中4球
				if ((c1 == f1 && c2 == f2 && c3 == f3 && c4 == f4) || (c2 == f2 && c3 == f3 && c4 == f4 && c5 == f5)) {
					System.out.println("4球中!!!!" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + " +");
					yes4++;
				}
				// 中3球
				int tempCount = 0;
				if ((c1 == f1 || c1 == f2 || c1 == f3 || c1 == f4 || c1 == f5)) {
					tempCount++;
				}
				if ((c2 == f1 || c2 == f2 || c2 == f3 || c2 == f4 || c2 == f5)) {
					tempCount++;
				}
				if ((c3 == f1 || c3 == f2 || c3 == f3 || c3 == f4 || c3 == f5)) {
					tempCount++;
				}
				if ((c4 == f1 || c4 == f2 || c4 == f3 || c4 == f4 || c4 == f5)) {
					tempCount++;
				}
				if ((c5 == f1 || c5 == f2 || c5 == f3 || c5 == f4 || c5 == f5)) {
					tempCount++;
				}
				if (tempCount == 3) {
					// System.out.println("3球中!!!!" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5
					// + " +");
					yes3++;
				}
				if (tempCount == 2) {
					// System.out.println("2球中!!!!" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5
					// + " +");
					yes2++;
				}
				if (tempCount == 1) {
					// System.out.println("1球中!!!!" + f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5
					// + " +");
					yes1++;
				}
			}

		}
		System.out.println("1ok===" + yes1 + "=====" + "，2ok===" + yes2 + "=====" + "，3ok===" + yes3 + "===" + yes3 * 5
				+ "，4ok===" + yes4 + "===" + yes4 * 100 + "，5ok===" + yes5 + "===" + yes5 * 10000);
		System.out.println("剩余组合：" + combs.size() + "-" + (yes3 * 5 + yes4 * 100 + yes5 * 10000) + "(合计金额)");

		// 当期2019033；验证通过：历史模糊4；奇数4；
		// int[] curBalls = { 1, 2, 4, 16, 24 };// 当期2019033；4偶；上期1,4；最近20高频；和值85;2连号;
		// int[] curBalls = { 4, 8, 18, 20, 32 };// 当期2019003；5偶；过滤错误32(历史频率第3)；
		// int[] curBalls = { 7, 9, 13, 14, 33 };// 当期2019030
		// 过滤错误33(历史频率第2)；去除2连；4个奇数；历史匹配4个;和值76
		// int[] curBalls = { 3, 8, 21, 26, 33 };// 当期2019031 过滤错误33(历史频率第2)；最大跨度30
		// int[] curBalls = { 1, 4, 7, 11, 30 }; // 当期2019032
		// 过滤错误30(历史频率第5)；和值=53;历史匹配过滤3个
	}

	/**
	 * 显示当期是否选中
	 * 
	 * @param curBall
	 * @param kill360set
	 */
	private static void showIsYes(FrontBall curBall, SortedSet<Integer> kill360set, String methodDesc) {
		int c1 = curBall.getFrontBall1(), c2 = curBall.getFrontBall2(), c3 = curBall.getFrontBall3(),
				c4 = curBall.getFrontBall4(), c5 = curBall.getFrontBall5();
		if (showLast) {
			int kill360ErrCount = 0;
			for (Iterator<Integer> iterator = kill360set.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if (c1 == integer) {
					System.out.println(methodDesc + "当期号码c1错误：" + integer);
					kill360ErrCount++;
					continue;
				}
				if (c2 == integer) {
					System.out.println(methodDesc + "当期号码c2错误：" + integer);
					kill360ErrCount++;
					continue;
				}
				if (c3 == integer) {
					System.out.println(methodDesc + "当期号码c3错误：" + integer);
					kill360ErrCount++;
					continue;
				}
				if (c4 == integer) {
					System.out.println(methodDesc + "当期号码c4错误：" + integer);
					kill360ErrCount++;
					continue;
				}
				if (c5 == integer) {
					System.out.println(methodDesc + "当期号码c5错误：" + integer);
					kill360ErrCount++;
					continue;
				}
			}
			System.out.println(methodDesc + "当期号码错误个数：" + kill360set.size() + "_1_" + kill360ErrCount);
		}
	}

	/**
	 * 显示当期是否选中
	 * 
	 * @param curBall
	 * @param filterBalls
	 */
	private static void showIsYes(FrontBall curBall, int[] filterBalls, String methodDesc, boolean showLast) {
		if (showLast) {
			int c1 = curBall.getFrontBall1(), c2 = curBall.getFrontBall2(), c3 = curBall.getFrontBall3(),
					c4 = curBall.getFrontBall4(), c5 = curBall.getFrontBall5();
			int errCount = 0;
			for (int i = 0; i < filterBalls.length; i++) {
				if (c1 == filterBalls[i]) {
					System.out.println(methodDesc + "，c1错误：" + filterBalls[i]);
					errCount++;
					continue;
				}
				if (c2 == filterBalls[i]) {
					System.out.println(methodDesc + "，c2错误：" + filterBalls[i]);
					errCount++;
					continue;
				}
				if (c3 == filterBalls[i]) {
					System.out.println(methodDesc + "，c3错误：" + filterBalls[i]);
					errCount++;
					continue;
				}
				if (c4 == filterBalls[i]) {
					System.out.println(methodDesc + "，c4错误：" + filterBalls[i]);
					errCount++;
					continue;
				}
				if (c5 == filterBalls[i]) {
					System.out.println(methodDesc + "，c5错误：" + filterBalls[i]);
					errCount++;
					continue;
				}
			}
			System.out.println(methodDesc + "当期号码错误个数：" + filterBalls.length + "_1_" + errCount);
		}
	}

	/**
	 * 组合
	 * 
	 * @param lianLimit
	 * @param sumLimit
	 * @return
	 */
	private static List<FrontBall> combNolian(FrontBall curBall, List<FrontBall> filterHists, FrontLimit frontLimit) {
		int front1limit = 35, front2limit = 35, front3limit = 35, front4limit = 35, front5limit = 35;
		int sumMinLimit = frontLimit.getSumMinLimit();
		int sumMaxLimit = frontLimit.getSumMaxLimit();
		FrontLast last = frontLimit.getLast();// 前区上期
		// int allCount = 0;// 个数
		int lianLimit = frontLimit.getKillLianLimit();// 默认连号限定
		int lianCount2 = 0;// 连号个数
		// boolean lianCountIsYesShowed = false;
		int lianCount3 = 0;// 连号个数
		int lianCount4 = 0;// 连号个数
		int lianCount5 = 0;// 连号个数
		int sumMaxCount = 0;// 和值个数
		int sumMinCount = 0;// 和值个数

		// 360杀号
		List<Integer> Kill360twos = frontLimit.getKill360two();
		int Kill360twoCount = 0;// 360杀号个数

		// 彩经网杀号
		// List<Map<Integer, Set<Integer>>> cjwKills = frontLimit.getKillNos();
		int cjwKillsCount = 0;// 彩经网杀号个数

		int killczlFiltersCount = 0;// 我自己过滤号码-个数统计

		// int pipei5FilerCount = 0;// 精确匹配5个过滤
		// int pipei5FilerCount = 0;
		int pipei4FilerCount = 0;
		// int pipei3FilerCount = 0;// 精确匹配n个过滤
		int filterCount = 0;// 个数
		int oddCount = 0;
		int evenCount = 0;
		@SuppressWarnings("unused")
		int kuadu16MinCount = 0;// 最小跨度
		@SuppressWarnings("unused")
		int kuadu29MaxCount = 0;// 最大跨度
		@SuppressWarnings("unused")
		int fenqu1MinCount = 0;// 三分区，t1不能大于个数
		@SuppressWarnings("unused")
		int fenqu5MaxCount = 0;// 三分区，t5不能小于个数
		// int f1limtMinCount = 0;// 每个范围限定t1小于
		// int f1limtMaxCount = 0;// 每个范围限定t1大于
		// int f2limtMinCount = 0;// 每个范围限定t2小于
		// int f2limtMaxCount = 0;// 每个范围限定t2大于
		// int f3limtMinCount = 0;// 每个范围限定t3小于
		// int f3limtMaxCount = 0;// 每个范围限定t3大于
		// int f4limtMinCount = 0;// 每个范围限定t4小于
		// int f4limtMaxCount = 0;// 每个范围限定t4大于
		// int f5limtMinCount = 0;// 每个范围限定t5小于
		// int f5limtMaxCount = 0;// 每个范围限定t5大于

		int area5EveryCount = 0;// 分区5每区过滤个数
		int everyAreaCount = 0;// 分区5每区过滤个数

		int checkLastGe2Rs = 0;//

		int killWeiEveryCount = 0;// 尾号每个区域过滤

		List<FrontBall> balls = new ArrayList<FrontBall>();

		int cur1 = curBall.getFrontBall1();
		int cur2 = curBall.getFrontBall2();
		int cur3 = curBall.getFrontBall3();
		int cur4 = curBall.getFrontBall4();
		int cur5 = curBall.getFrontBall5();

		// 前区第2个,第二个不能小于第一个
		for (int t1 = 1; t1 <= front1limit; t1++) {
			for (int t2 = (t1 + 1); t2 <= front2limit; t2++) {
				for (int t3 = (t2 + 1); t3 <= front3limit; t3++) {
					for (int t4 = (t3 + 1); t4 <= front4limit; t4++) {
						for (int t5 = (t4 + 1); t5 <= front5limit; t5++) {
							FrontBall backBall = new FrontBall();
							FrontBall tempBall = new FrontBall(t1, t2, t3, t4, t5);
							// allCount++;

							if (showLast) {
								if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
									// TODO
									System.out.println("当期：：：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								}
							}

							// 必杀号码列表
							boolean filterFlag = false;
							List<Integer> mustKills = frontLimit.getMustKills();
							if (mustKills != null) {
								for (Iterator<Integer> iterator = mustKills.iterator(); iterator.hasNext();) {
									Integer mustKill = (Integer) iterator.next();
									// System.out.println("filter["+i+"]:"+mustKill);
									if (t1 == mustKill || t2 == mustKill || t3 == mustKill || t4 == mustKill
											|| t5 == mustKill) {
										filterCount++;
										filterFlag = true;
										break;
									}
								}
								if (filterFlag) {
									continue;
								}
							}

							// 我自己过滤号码
							List<Integer> czlFilters = frontLimit.getCzlFilters();
							int czlFiltersCount = frontLimit.getCzlFiltersCount();
							boolean czlFiltersRs = checkKillLimit(tempBall, czlFilters, czlFiltersCount);
							if (czlFiltersRs) {
								killczlFiltersCount++;
								continue;
							}

							// 360杀号-
							int kill360LimitCount = frontLimit.getKill360LimitCount();
							boolean Kill360twoRs = checkKillLimit(tempBall, Kill360twos, kill360LimitCount);
							if (Kill360twoRs) {
								Kill360twoCount++;
								continue;
							}

							// 彩经网杀号-
							boolean cjwRs = false;
							List<Map<Integer, Set<Integer>>> list = frontLimit.getKillNos();
							for (Iterator<Map<Integer, Set<Integer>>> iterator = list.iterator(); iterator.hasNext();) {
								Map<Integer, Set<Integer>> map = (Map<Integer, Set<Integer>>) iterator.next();
								Set<Integer> limits = map.keySet();
								for (Iterator<Integer> iterator2 = limits.iterator(); iterator2.hasNext();) {
									Integer integer = (Integer) iterator2.next();
									Set<Integer> killSet = map.get(integer);
									List<Integer> killList = new ArrayList<Integer>();
									killList.addAll(killSet);
									boolean KillCjwRs = checkKillLimit(tempBall, killList, integer);
									if (KillCjwRs) {
										cjwKillsCount++;
										cjwRs = true;
										break;
									}
								}
								if (cjwRs) {
									break;
								}
							}
							if (cjwRs) {
								continue;
							}

							// 尾号每个区域过滤
							boolean killWeiEveryCountRs = KillUtil.checkKillWeiEveryCount(tempBall, frontLimit);
							if (killWeiEveryCountRs) {
								killWeiEveryCount++;
								continue;
							}

							boolean checkLian = checkLianLimit(lianLimit, t1, t2, t3, t4, t5);
							if (lianLimit == 2 && checkLian) {// 去除2连号
								lianCount2++;
								continue;
							}
							if (lianLimit == 3 && checkLian) {// 去除3连号
								lianCount3++;
								continue;
							}
							if (lianLimit == 4 && checkLian) {// 去除4连号
								lianCount4++;
								continue;
							}
							if (lianLimit == 5 && checkLian) {// 去除5连号
								lianCount4++;
								continue;
							}

							// 与上期相同的两个号码相同，过滤掉
							boolean checkLastGeRs = checkLastGe(tempBall, last);
							if (checkLastGeRs) {//
								checkLastGe2Rs++;
								continue;
							}

							// 和值最大限定
							if ((t1 + t2 + t3 + t4 + t5) > sumMaxLimit) {
								sumMaxCount++;
								continue;
							}
							// 和值最小限定
							if ((t1 + t2 + t3 + t4 + t5) < sumMinLimit) {
								sumMinCount++;
								continue;
							}

							boolean pipei4FilerFlag = KillUtil.checkHisLike(tempBall, filterHists, 4);// 模糊匹配4个过滤掉
							if (pipei4FilerFlag) {
								pipei4FilerCount++;
								continue;
							}
							// 历史匹配过滤3个--此匹配过滤太多，慎用

							int oddLimit = frontLimit.getOddLimit();
							boolean checkOddRs = checkOddLimit(tempBall, oddLimit);
							if (checkOddRs) {
								oddCount++;
								continue;
							}
							int evenLimit = frontLimit.getEvenLimit();
							boolean checkEvenRs = checkEvenLimit(tempBall, evenLimit);
							if (checkEvenRs) {
								evenCount++;
								continue;
							}

							// 最小跨度
							int kuaduMin = frontLimit.getKuaduMin();
							if (t5 - t1 < kuaduMin) {
								kuadu16MinCount++;
								// System.out.println("最小跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								continue;
							}
							// 最大跨度
							int kuaduMax = frontLimit.getKuaduMax();
							if (t5 - t1 > kuaduMax) {
								kuadu29MaxCount++;
								// System.out.println("最大跨度：" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
								continue;
							}

							// 检查5分区
							FrontLimitArea5 frontLimitArea5 = frontLimit.getArea5();
							boolean area5Every = checkArea5Every(tempBall, frontLimitArea5);
							if (area5Every) {//
								area5EveryCount++;
								continue;
							}
							boolean everyAreaCounts = checkArea5EveryAreaCounts(tempBall, frontLimitArea5);
							if (everyAreaCounts) {//
								everyAreaCount++;
								continue;
							}

							// 每个范围限定
							if (frontLimit != null) {
								if (t1 < frontLimit.getF1Min()) {
									// f1limtMinCount++;
									continue;
								}
								if (t1 > frontLimit.getF1Max()) {
									// f1limtMaxCount++;
									continue;
								}
								if (t2 < frontLimit.getF2Min()) {
									// f2limtMinCount++;
									continue;
								}
								if (t2 > frontLimit.getF2Max()) {
									// f2limtMaxCount++;
									continue;
								}
								if (t3 < frontLimit.getF3Min()) {
									// f3limtMinCount++;
									continue;
								}
								if (t3 > frontLimit.getF3Max()) {
									// f3limtMaxCount++;
									continue;
								}
								if (t4 < frontLimit.getF4Min()) {
									// f4limtMinCount++;
									continue;
								}
								if (t4 > frontLimit.getF4Max()) {
									// f4limtMaxCount++;
									continue;
								}
								if (t5 < frontLimit.getF5Min()) {
									// f5limtMinCount++;
									continue;
								}
								if (t5 > frontLimit.getF5Max()) {
									// f5limtMaxCount++;
									continue;
								}

							}

							backBall.setFrontBall1(t1);
							backBall.setFrontBall2(t2);
							backBall.setFrontBall3(t3);
							backBall.setFrontBall4(t4);
							backBall.setFrontBall5(t5);
							balls.add(backBall);
						}
					}
				}

			}
		}
		// for (Iterator<BackBall> iterator = backBalls.iterator(); iterator.hasNext();)
		// {
		// BackBall backBall = (BackBall) iterator.next();
		// System.out.println("前区111："+backBall.getBackBall1()+"，前区222："+backBall.getBackBall2());
		// }

		// System.out.println("全部个数：" + allCount);
		if (lianLimit == 2) {
			System.out.println("2连号过滤个数" + lianCount2);
		}
		if (lianLimit == 3) {
			System.out.println("3连号过滤个数" + lianCount3);
		}
		if (lianLimit == 4) {
			System.out.println("4连号过滤个数" + lianCount4);
		}
		if (lianLimit == 5) {
			System.out.println("5连号过滤个数" + lianCount5);
		}

		System.out.println(sumMaxLimit + "  和值限定过滤个数：" + sumMaxCount);
		System.out.println(sumMinLimit + "  和值限定过滤个数：" + sumMinCount);

		System.out.println(" 奇数过滤个数：" + oddCount);
		System.out.println(" 偶数过滤个数：" + evenCount);

		System.out.println("  限定号码过滤个数：" + filterCount);

		System.out.println("360杀号-限定号码过滤个数：" + Kill360twoCount);
		System.out.println("彩经网杀号-限定号码过滤个数：" + cjwKillsCount);
		System.out.println("我自己杀号-限定号码过滤个数：" + killczlFiltersCount);

		// System.out.println(" kuadu16MinCount：" + kuadu16MinCount);
		// System.out.println(" kuadu29MaxCount：" + kuadu29MaxCount);

		// System.out.println(" 已出5个-限定过滤个数：" + pipei5FilerCount);
		System.out.println("  已出4个-限定过滤个数：" + pipei4FilerCount);
		// System.out.println(" 已出3个-限定过滤个数：" + pipei3FilerCount);

		// System.out.println(" 三分区，t1不能大于个数：" + fenqu1MinCount);
		// System.out.println(" 三分区，t5不能小于个数：" + fenqu5MaxCount);

		// System.out.println(" 每个范围限定t1小于：" + f1limtMinCount);
		// System.out.println(" 每个范围限定t1大于：" + f1limtMaxCount);
		// System.out.println(" 每个范围限定t2小于：" + f2limtMinCount);
		// System.out.println(" 每个范围限定t2大于：" + f2limtMaxCount);
		// System.out.println(" 每个范围限定t3小于：" + f3limtMinCount);
		// System.out.println(" 每个范围限定t3大于：" + f3limtMaxCount);
		// System.out.println(" 每个范围限定t4小于：" + f4limtMinCount);
		// System.out.println(" 每个范围限定t4大于：" + f4limtMaxCount);
		// System.out.println(" 每个范围限定t5小于：" + f5limtMinCount);
		// System.out.println(" 每个范围限定t5大于：" + f5limtMaxCount);

		System.out.println("  分区5每区集中45过滤个数：" + area5EveryCount);
		System.out.println("  分区5-每区形态个数相同过滤：" + everyAreaCount);

		System.out.println("  与上期相同的n个号码相同，过滤个数：" + checkLastGe2Rs);

		System.out.println("尾号每个区域过滤个数：" + killWeiEveryCount);

		// System.out.println(" 剩余个数：" + balls.size());
		return balls;
	}

	/**
	 * 360杀号-
	 * 
	 * @param tempBall
	 * @param killBalls
	 * @param limitCount
	 */
	private static boolean checkKillLimit(FrontBall tempBall, List<Integer> killBalls, int limitCount) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int count = 0;

		for (Iterator<Integer> iterator = killBalls.iterator(); iterator.hasNext();) {
			Integer killOne = (Integer) iterator.next();
			if (killOne == t1 || killOne == t2 || killOne == t3 || killOne == t4 || killOne == t5) {
				count++;
			}
		}

		if (count > limitCount) {
			return true;
		}
		return false;
	}

	private static boolean checkEvenLimit(FrontBall tempBall, int evenLimit) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();

		int count = 0;
		if (t1 % 2 == 0) {
			count++;
		}
		if (t2 % 2 == 0) {
			count++;
		}
		if (t3 % 2 == 0) {
			count++;
		}
		if (t4 % 2 == 0) {
			count++;
		}
		if (t5 % 2 == 0) {
			count++;
		}

		if (count > evenLimit) {
			return true;
		}
		return false;
	}

	private static boolean checkOddLimit(FrontBall tempBall, int oddLimit) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();

		int count = 0;
		if (t1 % 2 == 1) {
			count++;
		}
		if (t2 % 2 == 1) {
			count++;
		}
		if (t3 % 2 == 1) {
			count++;
		}
		if (t4 % 2 == 1) {
			count++;
		}
		if (t5 % 2 == 1) {
			count++;
		}

		if (count > oddLimit) {
			return true;
		}
		return false;
	}

	/**
	 * 与上期相同的两个号码相同，过滤掉
	 * 
	 * @param tempBall
	 * @param last
	 * @param i
	 * @return
	 */
	private static boolean checkLastGe(FrontBall tempBall, FrontLast last) {
		int limitCount = last.getLimitCount();
		if (limitCount > 5) {
			return false;
		}
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int last1 = last.getLast1();
		int last2 = last.getLast2();
		int last3 = last.getLast3();
		int last4 = last.getLast4();
		int last5 = last.getLast5();

		int count = 0;
		if (t1 == last1 || t1 == last2 || t1 == last3 || t1 == last4 || t1 == last5) {
			count++;
		}
		if (t2 == last1 || t2 == last2 || t2 == last3 || t2 == last4 || t2 == last5) {
			count++;
		}
		if (t3 == last1 || t3 == last2 || t3 == last3 || t3 == last4 || t3 == last5) {
			count++;
		}
		if (t4 == last1 || t4 == last2 || t4 == last3 || t4 == last4 || t4 == last5) {
			count++;
		}
		if (t5 == last1 || t5 == last2 || t5 == last3 || t5 == last4 || t5 == last5) {
			count++;
		}

		if (count == 0) {
			if (count > 0) {
				return true;
			}
		}
		if (count > limitCount) {
			return true;
		}
		return false;
	}

	/**
	 * 分区5-每区个数
	 * 
	 * @param tempBall
	 * @param frontLimitArea5
	 * @return
	 */
	private static boolean checkArea5EveryAreaCounts(FrontBall tempBall, FrontLimitArea5 frontLimitArea5) {
		int area1Min = 1, area1Max = 7;
		int area2Min = 8, area2Max = 14;
		int area3Min = 15, area3Max = 21;
		int area4Min = 22, area4Max = 28;
		int area5Min = 29, area5Max = 35;

		List<int[]> list = frontLimitArea5.getFiterCounts();
		if (list != null) {

			for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext();) {
				int[] is = (int[]) iterator.next();
				int[] everyAreaCounts = is;
				if (everyAreaCounts != null) {
					// 分区1-个数：
					int countArea1 = countArea(tempBall, everyAreaCounts[0], area1Min, area1Max);
					// if (everyAreaCounts[0] == countArea1 ) {
					// System.out.println("分区1-个数相同：:" + countArea1);
					// }

					// 分区2
					int countArea2 = countArea(tempBall, everyAreaCounts[1], area2Min, area2Max);
					// if (everyAreaCounts[1] == countArea2 ) {
					// System.out.println("分区2-个数相同：:" + countArea1);
					// }
					// 分区3
					int countArea3 = countArea(tempBall, everyAreaCounts[2], area3Min, area3Max);
					// if (everyAreaCounts[2] == countArea3 ) {
					// System.out.println("分区3-个数相同：:" + countArea1);
					// }
					// 分区4
					int countArea4 = countArea(tempBall, everyAreaCounts[3], area4Min, area4Max);
					// 分区5
					int countArea5 = countArea(tempBall, everyAreaCounts[4], area5Min, area5Max);

					if (everyAreaCounts[0] == countArea1 && everyAreaCounts[1] == countArea2
							&& everyAreaCounts[2] == countArea3 && everyAreaCounts[3] == countArea4
							&& everyAreaCounts[4] == countArea5) {
						// System.out.println("分区5-每区个数相同:【" + countArea1 + countArea2 + countArea3 +
						// countArea4 + countArea5
						// + "】" + t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5);
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * 统计个数-
	 * 
	 * @param tempBall
	 * @param countLimitArea1
	 * @param area1Min
	 * @param area1Max
	 */
	private static int countArea(FrontBall tempBall, int countLimitArea1, int areaMin, int areaMax) {
		int rs = 0;
		int t1 = tempBall.getFrontBall1(), t2 = tempBall.getFrontBall2(), t3 = tempBall.getFrontBall3(),
				t4 = tempBall.getFrontBall4(), t5 = tempBall.getFrontBall5();
		if (t1 >= areaMin && t1 <= areaMax) {
			rs++;
		}
		if (t2 >= areaMin && t2 <= areaMax) {
			rs++;
		}
		if (t3 >= areaMin && t3 <= areaMax) {
			rs++;
		}
		if (t4 >= areaMin && t4 <= areaMax) {
			rs++;
		}
		if (t5 >= areaMin && t5 <= areaMax) {
			rs++;
		}
		return rs;
	}

	/**
	 * 检查-分区5-每个分区 分区1:1-7;
	 * 
	 * @param tempBall
	 * @param frontLimitArea5
	 */
	private static boolean checkArea5Every(FrontBall tempBall, FrontLimitArea5 frontLimitArea5) {
		int t1 = tempBall.getFrontBall1();
		int t2 = tempBall.getFrontBall2();
		int t3 = tempBall.getFrontBall3();
		int t4 = tempBall.getFrontBall4();
		int t5 = tempBall.getFrontBall5();
		int area1Min = 1, area1Max = 7;
		int area2Min = 8, area2Max = 14;
		int area3Min = 15, area3Max = 21;
		int area4Min = 22, area4Max = 28;
		int area5Min = 29, area5Max = 35;
		// 分区1
		int[] area1s = frontLimitArea5.getArea1();
		for (int i = 0; i < area1s.length; i++) {
			if (area1s[i] == 5) {
				if ((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max)
						&& (t5 >= area1Min && t5 <= area1Max)) {
					// System.out.println("分区1-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area1s[i] == 4) {
				if (((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max))
						|| ((t2 >= area1Min && t2 <= area1Max) && (t3 >= area1Min && t3 <= area1Max)
								&& (t4 >= area1Min && t4 <= area1Max) && (t5 >= area1Min && t5 <= area1Max))) {
					// System.out.println("分区1-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area1s[i] == 3) {
				if (((t1 >= area1Min && t1 <= area1Max) && (t2 >= area1Min && t2 <= area1Max)
						&& (t3 >= area1Min && t3 <= area1Max))
						|| ((t2 >= area1Min && t2 <= area1Max) && (t3 >= area1Min && t3 <= area1Max)
								&& (t4 >= area1Min && t4 <= area1Max)
								|| ((t3 >= area1Min && t3 <= area1Max) && (t4 >= area1Min && t4 <= area1Max)
										&& (t5 >= area1Min && t5 <= area1Max)))) {
					// System.out.println("分区1-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}

		}
		// 分区2
		int[] area2s = frontLimitArea5.getArea2();
		for (int i = 0; i < area2s.length; i++) {
			if (area2s[i] == 5) {
				if ((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max)
						&& (t5 >= area2Min && t5 <= area2Max)) {
					// System.out.println("分区2-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area2s[i] == 4) {
				if (((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max))
						|| ((t2 >= area2Min && t2 <= area2Max) && (t3 >= area2Min && t3 <= area2Max)
								&& (t4 >= area2Min && t4 <= area2Max) && (t5 >= area2Min && t5 <= area2Max))) {
					// System.out.println("分区2-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area2s[i] == 3) {
				if (((t1 >= area2Min && t1 <= area2Max) && (t2 >= area2Min && t2 <= area2Max)
						&& (t3 >= area2Min && t3 <= area2Max))
						|| ((t2 >= area2Min && t2 <= area2Max) && (t3 >= area2Min && t3 <= area2Max)
								&& (t4 >= area2Min && t4 <= area2Max)
								|| ((t3 >= area2Min && t3 <= area2Max) && (t4 >= area2Min && t4 <= area2Max)
										&& (t5 >= area2Min && t5 <= area2Max)))) {
					// System.out.println("分区2-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}

		}
		// 分区3
		int[] area3s = frontLimitArea5.getArea2();
		for (int i = 0; i < area3s.length; i++) {
			if (area3s[i] == 5) {
				if ((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max)
						&& (t5 >= area3Min && t5 <= area3Max)) {
					// System.out.println("分区3-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area3s[i] == 4) {
				if (((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max))
						|| ((t2 >= area3Min && t2 <= area3Max) && (t3 >= area3Min && t3 <= area3Max)
								&& (t4 >= area3Min && t4 <= area3Max) && (t5 >= area3Min && t5 <= area3Max))) {
					// System.out.println("分区3-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area3s[i] == 3) {
				if (((t1 >= area3Min && t1 <= area3Max) && (t2 >= area3Min && t2 <= area3Max)
						&& (t3 >= area3Min && t3 <= area3Max))
						|| ((t2 >= area3Min && t2 <= area3Max) && (t3 >= area3Min && t3 <= area3Max)
								&& (t4 >= area3Min && t4 <= area3Max)
								|| ((t3 >= area3Min && t3 <= area3Max) && (t4 >= area3Min && t4 <= area3Max)
										&& (t5 >= area3Min && t5 <= area3Max)))) {
					// System.out.println("分区3-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}

		}
		// 分区4
		int[] area4s = frontLimitArea5.getArea2();
		for (int i = 0; i < area4s.length; i++) {
			if (area4s[i] == 5) {
				if ((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max)
						&& (t5 >= area4Min && t5 <= area4Max)) {
					// System.out.println("分区4-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area4s[i] == 4) {
				if (((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max))
						|| ((t2 >= area4Min && t2 <= area4Max) && (t3 >= area4Min && t3 <= area4Max)
								&& (t4 >= area4Min && t4 <= area4Max) && (t5 >= area4Min && t5 <= area4Max))) {
					// System.out.println("分区4-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area4s[i] == 3) {
				if (((t1 >= area4Min && t1 <= area4Max) && (t2 >= area4Min && t2 <= area4Max)
						&& (t3 >= area4Min && t3 <= area4Max))
						|| ((t2 >= area4Min && t2 <= area4Max) && (t3 >= area4Min && t3 <= area4Max)
								&& (t4 >= area4Min && t4 <= area4Max)
								|| ((t3 >= area4Min && t3 <= area4Max) && (t4 >= area4Min && t4 <= area4Max)
										&& (t5 >= area4Min && t5 <= area4Max)))) {
					// System.out.println("分区4-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}

		}
		// 分区5
		int[] area5s = frontLimitArea5.getArea2();
		for (int i = 0; i < area5s.length; i++) {
			if (area5s[i] == 5) {
				if ((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max)
						&& (t5 >= area5Min && t5 <= area5Max)) {
					// System.out.println("分区5-限定不能有个数5:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area5s[i] == 4) {
				if (((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max))
						|| ((t2 >= area5Min && t2 <= area5Max) && (t3 >= area5Min && t3 <= area5Max)
								&& (t4 >= area5Min && t4 <= area5Max) && (t5 >= area5Min && t5 <= area5Max))) {
					// System.out.println("分区5-限定不能有个数4:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}
			if (area5s[i] == 3) {
				if (((t1 >= area5Min && t1 <= area5Max) && (t2 >= area5Min && t2 <= area5Max)
						&& (t3 >= area5Min && t3 <= area5Max))
						|| ((t2 >= area5Min && t2 <= area5Max) && (t3 >= area5Min && t3 <= area5Max)
								&& (t4 >= area5Min && t4 <= area5Max)
								|| ((t3 >= area5Min && t3 <= area5Max) && (t4 >= area5Min && t4 <= area5Max)
										&& (t5 >= area5Min && t5 <= area5Max)))) {
					// System.out.println("分区5-限定不能有个数3:" + t1 + "," + t2 + "," + t3 + "," + t4 +
					// "," + t5);
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * 检查连号限定
	 * 
	 * @param lianLimit
	 * @param t1
	 * @param t2
	 * @param t3
	 * @param t4
	 * @param t5
	 */
	private static boolean checkLianLimit(int lianLimit, int t1, int t2, int t3, int t4, int t5) {
		boolean rs = false;
		if (lianLimit == 2) {// 去除2连号
			if ((t1 + 1) == t2 || ((t2 + 1) == t3 || (t3 + 1) == t4) || (t4 + 1) == t5) {
				rs = true;
				// if (cur1 == t1 && cur2 == t2 && cur3 == t3 && cur4 == t4 && cur5 == t5) {
				// if (!lianCount2IsYesShowed) {// 限定条件是否正确
				// System.out.println("去除" + lianLimit + "连号,错误！！！");
				// lianCount2IsYesShowed = true;
				// }
				// }
			}
		}
		if (lianLimit == 3) {// 去除3连号
			if (((t1 + 1) == t2 && (t2 + 1) == t3) || ((t2 + 1) == t3 && (t3 + 1) == t4)
					|| ((t3 + 1) == t4 && (t4 + 1) == t5)) {
				rs = true;
			}
		}
		if (lianLimit == 4) {// 去除4连号
			if (((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4)
					|| ((t2 + 1) == t3 && (t3 + 1) == t4) && (t4 + 1) == t5) {
				rs = true;
			}
		}
		if (lianLimit == 5) {// 去除5连号
			if ((t1 + 1) == t2 && (t2 + 1) == t3 && (t3 + 1) == t4 && (t4 + 1) == t5) {
				rs = true;
			}
		}
		return rs;
	}

	/**
	 * * 190507:old:过滤上期，修改为：与上期相同的两个号码相同，过滤掉
	 * 
	 * 190524:360杀号定胆:最近频率2次；平均值
	 * 
	 * 190531:规律杀号：上次重号，本次不再重号
	 * 
	 * 190602:我自己杀号限定个数
	 * 
	 * 190605:彩经网杀号
	 * 
	 * 190619:尾数过滤
	 */
}
