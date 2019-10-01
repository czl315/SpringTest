package com.example.util;

public class UtilDaTcwKj {

	public static void main(String[] args) {
		String backString = "19113 03 11 27 34 35 01 02 ";

		String[] str = backString.split(" ");
		int curNum = 101;
		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i]);
			String tempRowAllStr = str[i];
			if (i == 0) {
				System.out.print(tempRowAllStr + ":::");
			} else if (i == (str.length - 1)) {
				if (tempRowAllStr.startsWith("0")) {
					tempRowAllStr = tempRowAllStr.replace("0", "");
				}
				System.out.println(tempRowAllStr);
			} else if (i < 5) {
				if (tempRowAllStr.startsWith("0")) {
					tempRowAllStr = tempRowAllStr.replace("0", "");
				}
				System.out.print(tempRowAllStr + ",");
			} else if (i == 5) {
				if (tempRowAllStr.startsWith("0")) {
					tempRowAllStr = tempRowAllStr.replace("0", "");
				}
				System.out.print(tempRowAllStr + "+");
			} else if (i == 6) {
				if (tempRowAllStr.startsWith("0")) {
					tempRowAllStr = tempRowAllStr.replace("0", "");
				}
				System.out.print(tempRowAllStr + ",");
			}else if (i == 7) {
				if (tempRowAllStr.startsWith("0")) {
					tempRowAllStr = tempRowAllStr.replace("0", "");
				}
				System.out.print(tempRowAllStr + "+");
			}
		}
	}

	// public static void main(String[] args) {
	// String backString = "<strong class='bluenum'>04 05</strong></td><td
	// class='tdbdr thide'></td><td class='tdbg_5' >16</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_5'>03</span></td><td
	// class='tdbg_5' >22</td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >6</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// hit><span class='ball_5'>14</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>15</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >17</td><td class='tdbdr'></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' hit><span class='ball_5'>23</span></td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>29</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td
	// class='tdbdr'></td><td class='tdbg_3' >2</td><td class='tdbg_3' >28</td><td
	// class='tdbg_3' >8</td><td class='tdbg_3' hit><span
	// class='ball_1'>04</span></td><td class='tdbg_3' hit><span
	// class='ball_19'>05</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >7</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >8</td><td class='tdbg_3' >6</td></tr><tr><td
	// class='tdbg_1 '>2018-102</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>06 07 13 22 24</strong>+<strong class='bluenum'>10
	// 12</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >17</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >23</td><td class='tdbg_5' >10</td><td class='tdbg_5' hit><span
	// class='ball_5'>06</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>07</span></td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >5</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>13</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >18</td><td
	// class='tdbdr'></td><td class='tdbg_5' >4</td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>22</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_5'>24</span></td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >13</td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >7</td><td class='tdbdr'></td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >29</td><td class='tdbg_3'
	// >9</td><td class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >3</td><td class='tdbg_3' >8</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' hit><span class='ball_1'>10</span></td><td
	// class='tdbg_3' >9</td><td class='tdbg_3' hit><span
	// class='ball_1'>12</span></td></tr><tr><td class='tdbg_1 '>2018-103</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>14 24 26
	// 28 35</strong>+<strong class='bluenum'>02 03</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >18</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >24</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >15</td><td class='tdbg_5' >15</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >9</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_5'>14</span></td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >19</td><td class='tdbdr'></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >3</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>24</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>26</span></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' hit><span class='ball_5'>28</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >3</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >14</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' hit><span class='ball_5'>35</span></td><td
	// class='tdbdr'></td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>02</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>03</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >3</td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >9</td><td class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >1</td></tr><tr><td class='tdbg_1
	// '>2018-104</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>01 13 14 26 28</strong>+<strong class='bluenum'>07
	// 11</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >25</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >16</td><td class='tdbg_5' >16</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>13</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>14</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >20</td><td class='tdbdr'></td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >12</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>26</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// hit><span class='ball_5'>28</span></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >11</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >1</td><td class='tdbdr'></td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>07</span></td><td class='tdbg_3' >10</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >2</td></tr><tr><td
	// class='tdbg_1 '>2018-105</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>01 16 19 20 31</strong>+<strong class='bluenum'>02
	// 07</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >26</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >17</td><td class='tdbg_5' >17</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// hit><span class='ball_5'>16</span></td><td class='tdbg_5' >21</td><td
	// class='tdbdr'></td><td class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_5'>19</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>20</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >4</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>31</span></td><td class='tdbg_5' >16</td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >2</td><td class='tdbdr'></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// hit><span class='ball_1'>02</span></td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >4</td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' hit><span class='ball_1'>07</span></td><td class='tdbg_3'
	// >11</td><td class='tdbg_3' >5</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >3</td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-106</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>04 14 17
	// 24 31</strong>+<strong class='bluenum'>01 04</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >4</td><td class='tdbg_5' >18</td><td
	// class='tdbg_5' >18</td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >7</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' hit><span class='ball_5'>14</span></td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>17</span></td><td class='tdbdr'></td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>24</span></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >8</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>31</span></td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >10</td><td class='tdbg_5' >3</td><td
	// class='tdbdr'></td><td class='tdbg_3' hit><span
	// class='ball_1'>01</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' hit><span class='ball_1'>04</span></td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >6</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >12</td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >2</td><td class='tdbg_3' >4</td></tr><tr><td
	// class='tdbg_1 '>2018-107</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>07 08 09 10 22</strong>+<strong class='bluenum'>03
	// 04</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >9</td><td class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >15</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_4'>07</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>08</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>09</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>10</span></td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td
	// class='tdbdr'></td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_5'>22</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >9</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >3</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >1</td><td class='tdbg_5' >18</td><td
	// class='tdbg_5' >14</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >4</td><td class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' hit><span class='ball_1'>03</span></td><td
	// class='tdbg_3' hit><span class='ball_1'>04</span></td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' >7</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >13</td><td class='tdbg_3' >7</td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >5</td></tr><tr><td class='tdbg_1
	// '>2018-108</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>09 10 24 31 32</strong>+<strong class='bluenum'>07
	// 12</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >16</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>09</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>10</span></td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >4</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td
	// class='tdbdr'></td><td class='tdbg_5' >10</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_5'>24</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >10</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >8</td><td class='tdbg_5' hit><span
	// class='ball_5'>31</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>32</span></td><td class='tdbg_5' >15</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >5</td><td class='tdbdr'></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >7</td><td class='tdbg_3' >8</td><td class='tdbg_3'
	// hit><span class='ball_1'>07</span></td><td class='tdbg_3' >14</td><td
	// class='tdbg_3' >8</td><td class='tdbg_3' >6</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' hit><span class='ball_1'>12</span></td></tr><tr><td
	// class='tdbg_1 '>2018-109</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>10 16 23 25 34</strong>+<strong class='bluenum'>02
	// 05</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >17</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_4'>10</span></td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >10</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >8</td><td class='tdbg_5' hit><span
	// class='ball_5'>16</span></td><td class='tdbg_5' >3</td><td
	// class='tdbdr'></td><td class='tdbg_5' >11</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' hit><span class='ball_5'>23</span></td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_5'>25</span></td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >8</td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >16</td><td
	// class='tdbg_5' hit><span class='ball_5'>34</span></td><td class='tdbg_5'
	// >6</td><td class='tdbdr'></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// hit><span class='ball_19'>02</span></td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' >9</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >15</td><td class='tdbg_3' >9</td><td
	// class='tdbg_3' >7</td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >1</td></tr><tr><td class='tdbg_1 '>2018-110</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>06 19 21 27 28</strong>+<strong
	// class='bluenum'>03 11</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >4</td><td class='tdbg_5' >18</td><td
	// class='tdbg_5' hit><span class='ball_5'>06</span></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >16</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >4</td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td class='tdbdr'></td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' hit><span
	// class='ball_5'>19</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>21</span></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_4'>27</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>28</span></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >17</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >7</td><td class='tdbdr'></td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' hit><span class='ball_19'>03</span></td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >2</td><td class='tdbg_3' >16</td><td
	// class='tdbg_3' >10</td><td class='tdbg_3' >8</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >2</td></tr><tr><td
	// colspan='99' class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-111</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>03 16 27
	// 28 32</strong>+<strong class='bluenum'>04 05</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >6</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' hit><span class='ball_5'>03</span></td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >19</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >7</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' hit><span
	// class='ball_5'>16</span></td><td class='tdbg_5' >5</td><td
	// class='tdbdr'></td><td class='tdbg_5' >13</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_5'>27</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>28</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>32</span></td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >8</td><td class='tdbdr'></td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >2</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// hit><span class='ball_19'>04</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' >11</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' >17</td><td class='tdbg_3' >11</td><td
	// class='tdbg_3' >9</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >3</td></tr><tr><td class='tdbg_1 '>2018-112</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>03 07 08 09 29</strong>+<strong
	// class='bluenum'>09 10</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >14</td><td class='tdbg_5' hit><span
	// class='ball_5'>03</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >20</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_4'>07</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>08</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>09</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >18</td><td class='tdbg_5' >13</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >6</td><td class='tdbdr'></td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >2</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>29</span></td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >1</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >9</td><td class='tdbdr'></td><td
	// class='tdbg_3' >6</td><td class='tdbg_3' >3</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >12</td><td class='tdbg_3' >4</td><td class='tdbg_3' >18</td><td
	// class='tdbg_3' hit><span class='ball_1'>09</span></td><td class='tdbg_3'
	// hit><span class='ball_1'>10</span></td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >4</td></tr><tr><td class='tdbg_1 '>2018-113</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>08 12 27
	// 31 33</strong>+<strong class='bluenum'>04 08</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >8</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >21</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_5'>08</span></td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >4</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' hit><span class='ball_5'>12</span></td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >7</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >7</td><td class='tdbdr'></td><td
	// class='tdbg_5' >15</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >3</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' hit><span class='ball_4'>27</span></td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' hit><span class='ball_5'>31</span></td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>33</span></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >10</td><td class='tdbdr'></td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >3</td><td class='tdbg_3' hit><span
	// class='ball_1'>04</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >13</td><td class='tdbg_3' >5</td><td class='tdbg_3' hit><span
	// class='ball_1'>08</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >3</td><td class='tdbg_3' >5</td></tr><tr><td
	// class='tdbg_1 '>2018-114</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>12 18 26 28 29</strong>+<strong class='bluenum'>05
	// 06</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >16</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >22</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >20</td><td class='tdbg_5' hit><span
	// class='ball_4'>12</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >13</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >8</td><td class='tdbdr'></td><td class='tdbg_5' hit><span
	// class='ball_5'>18</span></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >4</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >6</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_4'>26</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_5'>28</span></td><td class='tdbg_5'
	// hit><span class='ball_5'>29</span></td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >11</td><td class='tdbdr'></td><td
	// class='tdbg_3' >8</td><td class='tdbg_3' >5</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>06</span></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >2</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >6</td></tr><tr><td class='tdbg_1
	// '>2018-115</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>02 06 13 18 25</strong>+<strong class='bluenum'>01
	// 02</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' hit><span class='ball_5'>02</span></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >9</td><td class='tdbg_5' >23</td><td
	// class='tdbg_5' hit><span class='ball_5'>06</span></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >21</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_4'>13</span></td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >14</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >9</td><td class='tdbdr'></td><td class='tdbg_5' hit><span
	// class='ball_5'>18</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >5</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_4'>25</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >2</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >12</td><td class='tdbdr'></td><td class='tdbg_3' hit><span
	// class='ball_1'>01</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>02</span></td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >7</td><td class='tdbg_3' >2</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' >5</td><td class='tdbg_3' >7</td></tr><tr><td
	// colspan='99' class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-116</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>01 14 17
	// 21 33</strong>+<strong class='bluenum'>07 10</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' hit><span class='ball_5'>01</span></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >24</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >22</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>14</span></td><td class='tdbg_5' >15</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' hit><span class='ball_5'>17</span></td><td
	// class='tdbdr'></td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' hit><span
	// class='ball_5'>21</span></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >16</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>33</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >13</td><td class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >6</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_19'>07</span></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' hit><span class='ball_1'>10</span></td><td
	// class='tdbg_3' >6</td><td class='tdbg_3' >8</td></tr><tr><td class='tdbg_1
	// '>2018-117</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>07 11 13 22 29</strong>+<strong class='bluenum'>03
	// 08</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >25</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' hit><span class='ball_5'>07</span></td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >5</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// hit><span class='ball_5'>11</span></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' hit><span class='ball_5'>13</span></td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >16</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbdr'></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_5'>22</span></td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' hit><span class='ball_5'>29</span></td><td class='tdbg_5'
	// >17</td><td class='tdbg_5' >4</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >14</td><td class='tdbdr'></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' hit><span class='ball_1'>03</span></td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >3</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_19'>08</span></td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >7</td><td class='tdbg_3' >9</td></tr><tr><td
	// class='tdbg_1 '>2018-118</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>04 05 14 21 34</strong>+<strong class='bluenum'>06
	// 09</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>05</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_5'>14</span></td><td
	// class='tdbg_5' >17</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >2</td><td class='tdbdr'></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >13</td><td class='tdbg_5' hit><span
	// class='ball_5'>21</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >10</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >7</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// hit><span class='ball_5'>34</span></td><td class='tdbg_5' >15</td><td
	// class='tdbdr'></td><td class='tdbg_3' >3</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >5</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' hit><span class='ball_1'>06</span></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_19'>09</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >8</td><td class='tdbg_3' >10</td></tr><tr><td class='tdbg_1
	// '>2018-119</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>06 09 11 16 35</strong>+<strong class='bluenum'>02
	// 05</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >7</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>06</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' hit><span class='ball_5'>09</span></td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' hit><span
	// class='ball_5'>11</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >18</td><td
	// class='tdbg_5' hit><span class='ball_5'>16</span></td><td class='tdbg_5'
	// >3</td><td class='tdbdr'></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >14</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >5</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >19</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_5'>35</span></td><td class='tdbdr'></td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>02</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' hit><span class='ball_1'>05</span></td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >3</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >3</td><td class='tdbg_3' >9</td><td
	// class='tdbg_3' >11</td></tr><tr><td class='tdbg_1 '>2018-120</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>21 22 25
	// 27 30</strong>+<strong class='bluenum'>08 09</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >6</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >19</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >4</td><td class='tdbdr'></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >15</td><td class='tdbg_5'
	// hit><span class='ball_4'>21</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>22</span></td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' hit><span class='ball_5'>25</span></td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>27</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_4'>30</span></td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >9</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbdr'></td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >1</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >7</td><td class='tdbg_3' >1</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>08</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>09</span></td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >12</td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-121</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>06 07 21
	// 29 30</strong>+<strong class='bluenum'>01 10</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >9</td><td class='tdbg_5' >3</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' hit><span class='ball_5'>06</span></td><td class='tdbg_5'
	// hit><span class='ball_4'>07</span></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >7</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >20</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >5</td><td class='tdbdr'></td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >16</td><td class='tdbg_5'
	// hit><span class='ball_4'>21</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >7</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' hit><span class='ball_5'>29</span></td><td
	// class='tdbg_5' hit><span class='ball_4'>30</span></td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >10</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbdr'></td><td
	// class='tdbg_3' hit><span class='ball_1'>01</span></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >4</td><td class='tdbg_3' >8</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >3</td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' >11</td><td class='tdbg_3'
	// >13</td></tr><tr><td class='tdbg_1 '>2018-122</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>08 09 21 30 31</strong>+<strong
	// class='bluenum'>05 12</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >4</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>08</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>09</span></td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >8</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >21</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >6</td><td class='tdbdr'></td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// hit><span class='ball_4'>21</span></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >8</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>30</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>31</span></td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td
	// class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >9</td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' >2</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >12</td><td class='tdbg_3' hit><span
	// class='ball_1'>12</span></td></tr><tr><td class='tdbg_1 '>2018-123</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>06 09 29
	// 32 35</strong>+<strong class='bluenum'>02 04</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >7</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' hit><span class='ball_5'>06</span></td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>09</span></td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >9</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >22</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >7</td><td class='tdbdr'></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' >15</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >3</td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// hit><span class='ball_5'>29</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>32</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' hit><span class='ball_5'>35</span></td><td
	// class='tdbdr'></td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>02</span></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// hit><span class='ball_1'>04</span></td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >7</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >13</td><td class='tdbg_3' >1</td></tr><tr><td class='tdbg_1
	// '>2018-124</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>08 10 12 19 20</strong>+<strong class='bluenum'>10
	// 11</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >9</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_4'>08</span></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>10</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>12</span></td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >23</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >8</td><td class='tdbdr'></td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' hit><span class='ball_4'>19</span></td><td
	// class='tdbg_5' hit><span class='ball_5'>20</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >16</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >4</td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbdr'></td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >7</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' >6</td><td class='tdbg_3' >8</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >2</td></tr><tr><td
	// class='tdbg_1 '>2018-125</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>07 16 20 21 34</strong>+<strong class='bluenum'>04
	// 06</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >7</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// hit><span class='ball_4'>07</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >24</td><td class='tdbg_5' hit><span
	// class='ball_5'>16</span></td><td class='tdbg_5' >9</td><td
	// class='tdbdr'></td><td class='tdbg_5' >10</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_4'>20</span></td><td class='tdbg_5'
	// hit><span class='ball_5'>21</span></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >16</td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >11</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' hit><span class='ball_5'>34</span></td><td
	// class='tdbg_5' >2</td><td class='tdbdr'></td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' >8</td><td class='tdbg_3' hit><span
	// class='ball_1'>04</span></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// hit><span class='ball_1'>06</span></td><td class='tdbg_3' >9</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >5</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >3</td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-126</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>11 13 15
	// 21 27</strong>+<strong class='bluenum'>05 06</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >10</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >14</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// hit><span class='ball_4'>11</span></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' hit><span class='ball_5'>13</span></td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' hit><span class='ball_5'>15</span></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >10</td><td class='tdbdr'></td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_4'>21</span></td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >18</td><td class='tdbg_5' >6</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' hit><span class='ball_5'>27</span></td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >3</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td
	// class='tdbdr'></td><td class='tdbg_3' >5</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' >9</td><td class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>06</span></td><td class='tdbg_3' >10</td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' >6</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >4</td></tr><tr><td class='tdbg_1
	// '>2018-127</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>01 03 04 11 29</strong>+<strong class='bluenum'>08
	// 12</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// hit><span class='ball_5'>03</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_4'>11</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >9</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >11</td><td class='tdbdr'></td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >18</td><td class='tdbg_5' >19</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' hit><span class='ball_5'>29</span></td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >4</td><td class='tdbdr'></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >10</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >11</td><td class='tdbg_3' hit><span class='ball_1'>08</span></td><td
	// class='tdbg_3' >7</td><td class='tdbg_3' >3</td><td class='tdbg_3' >3</td><td
	// class='tdbg_3' hit><span class='ball_1'>12</span></td></tr><tr><td
	// class='tdbg_1 '>2018-128</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>11 12 14 16 26</strong>+<strong class='bluenum'>08
	// 09</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >10</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_4'>11</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>12</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// hit><span class='ball_5'>14</span></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' hit><span class='ball_5'>16</span></td><td class='tdbg_5'
	// >12</td><td class='tdbdr'></td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >19</td><td class='tdbg_5' >20</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' hit><span
	// class='ball_5'>26</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >3</td><td class='tdbg_5' >5</td><td
	// class='tdbdr'></td><td class='tdbg_3' >7</td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' >11</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >2</td><td class='tdbg_3' >12</td><td
	// class='tdbg_3' hit><span class='ball_1'>08</span></td><td class='tdbg_3'
	// hit><span class='ball_1'>09</span></td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >1</td></tr><tr><td class='tdbg_1
	// '>2018-129</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>04 07 21 22 29</strong>+<strong class='bluenum'>03
	// 06</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >14</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' hit><span class='ball_5'>07</span></td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >13</td><td class='tdbdr'></td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_5'>21</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>22</span></td><td class='tdbg_5' >20</td><td class='tdbg_5'
	// >21</td><td class='tdbg_5' >9</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >15</td><td class='tdbg_5' hit><span
	// class='ball_5'>29</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >6</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >6</td><td class='tdbdr'></td><td
	// class='tdbg_3' >8</td><td class='tdbg_3' >6</td><td class='tdbg_3' hit><span
	// class='ball_1'>03</span></td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' hit><span class='ball_1'>06</span></td><td
	// class='tdbg_3' >13</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >5</td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >2</td></tr><tr><td class='tdbg_1 '>2018-130</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>03 04 16 18 25</strong>+<strong
	// class='bluenum'>01 11</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >15</td><td class='tdbg_5' hit><span
	// class='ball_5'>03</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >6</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' hit><span class='ball_5'>16</span></td><td
	// class='tdbg_5' >14</td><td class='tdbdr'></td><td class='tdbg_5' hit><span
	// class='ball_5'>18</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >21</td><td class='tdbg_5' >22</td><td class='tdbg_5' hit><span
	// class='ball_5'>25</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >16</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >8</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >14</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >7</td><td class='tdbdr'></td><td class='tdbg_3' hit><span
	// class='ball_1'>01</span></td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >5</td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >14</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' >6</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >3</td></tr><tr><td
	// colspan='99' class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-131</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>12 14 21
	// 32 33</strong>+<strong class='bluenum'>02 11</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >4</td><td class='tdbg_5' >16</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >8</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >8</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>12</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>14</span></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >15</td><td class='tdbdr'></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' hit><span class='ball_5'>21</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >22</td><td class='tdbg_5' >23</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >17</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >9</td><td class='tdbg_5' hit><span
	// class='ball_5'>32</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>33</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >8</td><td class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// hit><span class='ball_1'>02</span></td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >6</td><td class='tdbg_3' >5</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >15</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' >7</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >4</td></tr><tr><td
	// class='tdbg_1 '>2018-132</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>03 16 22 23 27</strong>+<strong class='bluenum'>01
	// 04</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >17</td><td class='tdbg_5' hit><span
	// class='ball_5'>03</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >9</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >9</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>16</span></td><td class='tdbg_5' >16</td><td
	// class='tdbdr'></td><td class='tdbg_5' >2</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>22</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>23</span></td><td class='tdbg_5' >24</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_5'>27</span></td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >10</td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >9</td><td class='tdbdr'></td><td class='tdbg_3' hit><span
	// class='ball_1'>01</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' hit><span class='ball_1'>04</span></td><td
	// class='tdbg_3' >6</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >16</td><td class='tdbg_3' >4</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >8</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >5</td></tr><tr><td class='tdbg_1 '>2018-133</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>08 12 14 15 19</strong>+<strong
	// class='bluenum'>01 10</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_5'>08</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>12</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// hit><span class='ball_5'>14</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>15</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >17</td><td class='tdbdr'></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// hit><span class='ball_4'>19</span></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >25</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >10</td><td class='tdbdr'></td><td
	// class='tdbg_3' hit><span class='ball_1'>01</span></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >4</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >7</td><td class='tdbg_3' >4</td><td class='tdbg_3' >17</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >5</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >6</td></tr><tr><td class='tdbg_1 '>2018-134</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>04 05 19 31 35</strong>+<strong
	// class='bluenum'>02 12</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >19</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' hit><span class='ball_5'>04</span></td><td
	// class='tdbg_5' hit><span class='ball_5'>05</span></td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' >5</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >18</td><td class='tdbdr'></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// hit><span class='ball_4'>19</span></td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >26</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >2</td><td class='tdbg_5' >20</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >12</td><td class='tdbg_5' hit><span
	// class='ball_5'>31</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >9</td><td class='tdbg_5' hit><span
	// class='ball_5'>35</span></td><td class='tdbdr'></td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' hit><span class='ball_1'>02</span></td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >2</td><td class='tdbg_3' >8</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >18</td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' >6</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' hit><span class='ball_1'>12</span></td></tr><tr><td
	// class='tdbg_1 '>2018-135</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>14 19 23 27 34</strong>+<strong class='bluenum'>06
	// 12</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >20</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >11</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >9</td><td class='tdbg_5' hit><span
	// class='ball_5'>14</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >19</td><td class='tdbdr'></td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' hit><span class='ball_4'>19</span></td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_5'>23</span></td><td
	// class='tdbg_5' >27</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' hit><span class='ball_5'>27</span></td><td
	// class='tdbg_5' >21</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_5'>34</span></td><td class='tdbg_5' >1</td><td
	// class='tdbdr'></td><td class='tdbg_3' >2</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >6</td><td class='tdbg_3' >3</td><td class='tdbg_3' >9</td><td
	// class='tdbg_3' hit><span class='ball_1'>06</span></td><td class='tdbg_3'
	// >19</td><td class='tdbg_3' >7</td><td class='tdbg_3' >7</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>12</span></td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-136</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>03 11 12
	// 19 21</strong>+<strong class='bluenum'>05 11</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >9</td><td class='tdbg_5' >21</td><td
	// class='tdbg_5' hit><span class='ball_5'>03</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >12</td><td class='tdbg_5' hit><span
	// class='ball_5'>11</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>12</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >3</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >20</td><td class='tdbdr'></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// hit><span class='ball_4'>19</span></td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' hit><span class='ball_4'>21</span></td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >1</td><td class='tdbg_5' >28</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >22</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td
	// class='tdbdr'></td><td class='tdbg_3' >3</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >7</td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >20</td><td class='tdbg_3' >8</td><td class='tdbg_3' >8</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >1</td></tr><tr><td
	// class='tdbg_1 '>2018-137</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>07 10 22 23 33</strong>+<strong class='bluenum'>08
	// 11</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >22</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >3</td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' hit><span class='ball_5'>07</span></td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >14</td><td class='tdbg_5' hit><span
	// class='ball_5'>10</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >11</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >21</td><td class='tdbdr'></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >12</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_4'>22</span></td><td class='tdbg_5'
	// hit><span class='ball_5'>23</span></td><td class='tdbg_5' >29</td><td
	// class='tdbg_5' >7</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >23</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >3</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' hit><span class='ball_5'>33</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >3</td><td class='tdbdr'></td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >3</td><td class='tdbg_3' >8</td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >1</td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >21</td><td class='tdbg_3' hit><span class='ball_1'>08</span></td><td
	// class='tdbg_3' >9</td><td class='tdbg_3' >4</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >2</td></tr><tr><td
	// class='tdbg_1 '>2018-138</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>01 23 24 28 33</strong>+<strong class='bluenum'>04
	// 05</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >23</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >1</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >15</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >5</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >22</td><td class='tdbdr'></td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>23</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>24</span></td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>28</span></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >16</td><td class='tdbg_5' >4</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' hit><span class='ball_5'>33</span></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >4</td><td class='tdbdr'></td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >4</td><td class='tdbg_3' >9</td><td class='tdbg_3'
	// hit><span class='ball_1'>04</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>05</span></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >22</td><td class='tdbg_3' >1</td><td class='tdbg_3' >10</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >3</td></tr><tr><td class='tdbg_1 '>2018-139</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>05 11 16 28 35</strong>+<strong
	// class='bluenum'>06 09</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >24</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_4'>05</span></td><td class='tdbg_5' >16</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >6</td><td class='tdbg_5' >16</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>11</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >4</td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' hit><span class='ball_5'>16</span></td><td class='tdbg_5'
	// >23</td><td class='tdbdr'></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >14</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >9</td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' hit><span class='ball_5'>28</span></td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' hit><span class='ball_5'>35</span></td><td
	// class='tdbdr'></td><td class='tdbg_3' >6</td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' >10</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' hit><span class='ball_1'>06</span></td><td
	// class='tdbg_3' >23</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>09</span></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >4</td></tr><tr><td class='tdbg_1
	// '>2018-140</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>01 06 08 12 15</strong>+<strong class='bluenum'>03
	// 04</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >25</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_4'>06</span></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' hit><span class='ball_5'>08</span></td><td class='tdbg_5'
	// >17</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_5'>12</span></td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>15</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >24</td><td class='tdbdr'></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >15</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >12</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >18</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >1</td><td class='tdbdr'></td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >6</td><td class='tdbg_3' hit><span class='ball_1'>03</span></td><td
	// class='tdbg_3' hit><span class='ball_1'>04</span></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >1</td><td class='tdbg_3' >24</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td class='tdbg_3' >7</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' >5</td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-141</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>03 07 23
	// 26 33</strong>+<strong class='bluenum'>04 09</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >1</td><td class='tdbg_5' >26</td><td
	// class='tdbg_5' hit><span class='ball_5'>03</span></td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_4'>07</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >18</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >25</td><td class='tdbdr'></td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >16</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_5'>23</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >11</td><td class='tdbg_5' hit><span class='ball_5'>26</span></td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >19</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' hit><span
	// class='ball_5'>33</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >2</td><td class='tdbdr'></td><td class='tdbg_3' >8</td><td class='tdbg_3'
	// >7</td><td class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_1'>04</span></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >25</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' hit><span class='ball_1'>09</span></td><td class='tdbg_3'
	// >8</td><td class='tdbg_3' >4</td><td class='tdbg_3' >6</td></tr><tr><td
	// class='tdbg_1 '>2018-142</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>19 24 28 29 34</strong>+<strong class='bluenum'>10
	// 11</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >27</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >3</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >16</td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >3</td><td class='tdbg_5' >26</td><td
	// class='tdbdr'></td><td class='tdbg_5' >12</td><td class='tdbg_5' hit><span
	// class='ball_5'>19</span></td><td class='tdbg_5' >17</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >5</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_5'>24</span></td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >7</td><td class='tdbg_5' hit><span
	// class='ball_5'>28</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>29</span></td><td class='tdbg_5' >20</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >11</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' hit><span class='ball_5'>34</span></td><td class='tdbg_5'
	// >3</td><td class='tdbdr'></td><td class='tdbg_3' >9</td><td class='tdbg_3'
	// >8</td><td class='tdbg_3' >2</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >3</td><td class='tdbg_3' >26</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >1</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >7</td></tr><tr><td
	// class='tdbg_1 '>2018-143</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>04 07 20 22 33</strong>+<strong class='bluenum'>01
	// 02</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >28</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>04</span></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_5'>07</span></td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >20</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >4</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >17</td><td class='tdbg_5' >8</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >27</td><td class='tdbdr'></td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>20</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// hit><span class='ball_5'>22</span></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >21</td><td class='tdbg_5' >9</td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' hit><span
	// class='ball_5'>33</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >4</td><td class='tdbdr'></td><td class='tdbg_3' hit><span
	// class='ball_1'>01</span></td><td class='tdbg_3' hit><span
	// class='ball_1'>02</span></td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >5</td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >27</td><td class='tdbg_3' >6</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >8</td></tr><tr><td class='tdbg_1 '>2018-144</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>06 17 18 24 31</strong>+<strong
	// class='bluenum'>07 11</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >29</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >1</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// hit><span class='ball_5'>06</span></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >21</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >18</td><td class='tdbg_5' >9</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>17</span></td><td class='tdbdr'></td><td class='tdbg_5'
	// hit><span class='ball_5'>18</span></td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>24</span></td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >22</td><td class='tdbg_5' hit><span
	// class='ball_5'>31</span></td><td class='tdbg_5' >13</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td
	// class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >3</td><td class='tdbg_3' >6</td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' hit><span
	// class='ball_1'>07</span></td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >3</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >9</td></tr><tr><td
	// class='tdbg_1 '>2018-145</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>09 18 29 31 33</strong>+<strong class='bluenum'>06
	// 11</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >30</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >6</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>09</span></td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >5</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >1</td><td class='tdbdr'></td><td class='tdbg_5'
	// hit><span class='ball_5'>18</span></td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >15</td><td class='tdbg_5' >4</td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>29</span></td><td class='tdbg_5' >23</td><td class='tdbg_5'
	// hit><span class='ball_5'>31</span></td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' hit><span class='ball_4'>33</span></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >6</td><td class='tdbdr'></td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >2</td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >7</td><td class='tdbg_3' hit><span
	// class='ball_1'>06</span></td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >8</td><td class='tdbg_3' >4</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// hit><span class='ball_1'>11</span></td><td class='tdbg_3'
	// >10</td></tr><tr><td colspan='99' class='tdbck'></td></tr><tr><td
	// class='tdbg_1 '>2018-146</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>03 08 09 13 33</strong>+<strong class='bluenum'>01
	// 02</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >6</td><td
	// class='tdbg_5' >31</td><td class='tdbg_5' hit><span
	// class='ball_5'>03</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// hit><span class='ball_5'>08</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>09</span></td><td class='tdbg_5' >9</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >6</td><td class='tdbg_5' hit><span
	// class='ball_5'>13</span></td><td class='tdbg_5' >11</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >7</td><td class='tdbg_5' >2</td><td
	// class='tdbdr'></td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >5</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >16</td><td class='tdbg_5' >5</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >24</td><td class='tdbg_5' >1</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' hit><span class='ball_4'>33</span></td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >7</td><td class='tdbdr'></td><td class='tdbg_3'
	// hit><span class='ball_19'>01</span></td><td class='tdbg_3' hit><span
	// class='ball_19'>02</span></td><td class='tdbg_3' >6</td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >8</td><td class='tdbg_3' >1</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >9</td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >4</td><td class='tdbg_3' >1</td><td class='tdbg_3' >11</td></tr><tr><td
	// class='tdbg_1 '>2018-147</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>01 11 26 33 35</strong>+<strong class='bluenum'>02
	// 10</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >32</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >4</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >10</td><td class='tdbg_5' hit><span
	// class='ball_5'>11</span></td><td class='tdbg_5' >7</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >12</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >3</td><td class='tdbdr'></td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >11</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >3</td><td class='tdbg_5' >17</td><td
	// class='tdbg_5' hit><span class='ball_5'>26</span></td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >5</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >25</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >16</td><td class='tdbg_5' hit><span class='ball_4'>33</span></td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_5'>35</span></td><td class='tdbdr'></td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' hit><span class='ball_19'>02</span></td><td
	// class='tdbg_3' >7</td><td class='tdbg_3' >6</td><td class='tdbg_3' >9</td><td
	// class='tdbg_3' >2</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >6</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' >2</td><td class='tdbg_3'
	// >12</td></tr><tr><td class='tdbg_1 '>2018-148</td><td class='tdbdr'></td><td
	// class='tdbg_1 thide' ><strong class='rednum'>02 06 24 33 34</strong>+<strong
	// class='bluenum'>02 03</strong></td><td class='tdbdr thide'></td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>02</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >9</td><td class='tdbg_5' hit><span
	// class='ball_5'>06</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >8</td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >4</td><td class='tdbdr'></td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >6</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >5</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' hit><span class='ball_5'>24</span></td><td class='tdbg_5'
	// >18</td><td class='tdbg_5' >1</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >26</td><td class='tdbg_5' >3</td><td class='tdbg_5' >17</td><td
	// class='tdbg_5' hit><span class='ball_4'>33</span></td><td class='tdbg_5'
	// hit><span class='ball_5'>34</span></td><td class='tdbg_5' >1</td><td
	// class='tdbdr'></td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_19'>02</span></td><td class='tdbg_3' hit><span
	// class='ball_19'>03</span></td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >3</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >11</td><td class='tdbg_3' >7</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >3</td><td class='tdbg_3' >13</td></tr><tr><td
	// class='tdbg_1 '>2018-149</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>01 07 10 11 20</strong>+<strong class='bluenum'>03
	// 06</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' hit><span
	// class='ball_5'>01</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >6</td><td class='tdbg_5' >10</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>07</span></td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_5'>10</span></td><td
	// class='tdbg_5' hit><span class='ball_5'>11</span></td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >3</td><td class='tdbg_5' >14</td><td
	// class='tdbg_5' >9</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >5</td><td class='tdbdr'></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' hit><span class='ball_5'>20</span></td><td
	// class='tdbg_5' >13</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >8</td><td class='tdbg_5' >1</td><td class='tdbg_5' >19</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >4</td><td class='tdbg_5' >27</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td
	// class='tdbdr'></td><td class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' hit><span class='ball_1'>03</span></td><td class='tdbg_3'
	// >8</td><td class='tdbg_3' >11</td><td class='tdbg_3' hit><span
	// class='ball_1'>06</span></td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// >12</td><td class='tdbg_3' >8</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >4</td><td class='tdbg_3' >14</td></tr><tr><td class='tdbg_1
	// '>2018-150</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>05 12 13 31 34</strong>+<strong class='bluenum'>10
	// 12</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >4</td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' hit><span class='ball_5'>05</span></td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >4</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// hit><span class='ball_5'>12</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>13</span></td><td class='tdbg_5' >15</td><td class='tdbg_5'
	// >10</td><td class='tdbg_5' >11</td><td class='tdbg_5' >6</td><td
	// class='tdbdr'></td><td class='tdbg_5' >5</td><td class='tdbg_5' >8</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >14</td><td class='tdbg_5'
	// >7</td><td class='tdbg_5' >9</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >20</td><td class='tdbg_5' >3</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >28</td><td class='tdbg_5' hit><span class='ball_5'>31</span></td><td
	// class='tdbg_5' >19</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>34</span></td><td class='tdbg_5' >3</td><td
	// class='tdbdr'></td><td class='tdbg_3' >4</td><td class='tdbg_3' >2</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >9</td><td class='tdbg_3'
	// >12</td><td class='tdbg_3' >1</td><td class='tdbg_3' >6</td><td
	// class='tdbg_3' >13</td><td class='tdbg_3' >9</td><td class='tdbg_3' hit><span
	// class='ball_1'>10</span></td><td class='tdbg_3' >5</td><td class='tdbg_3'
	// hit><span class='ball_1'>12</span></td></tr><tr><td colspan='99'
	// class='tdbck'></td></tr><tr><td class='tdbg_1 '>2018-151</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>04 08 18
	// 29 30</strong>+<strong class='bluenum'>03 07</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >2</td><td class='tdbg_5' >3</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' hit><span
	// class='ball_4'>04</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >2</td><td class='tdbg_5' hit><span
	// class='ball_5'>08</span></td><td class='tdbg_5' >5</td><td class='tdbg_5'
	// >2</td><td class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >16</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >12</td><td class='tdbg_5' >7</td><td class='tdbdr'></td><td
	// class='tdbg_5' hit><span class='ball_5'>18</span></td><td class='tdbg_5'
	// >9</td><td class='tdbg_5' >2</td><td class='tdbg_5' >15</td><td
	// class='tdbg_5' >8</td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >21</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >16</td><td class='tdbg_5' >9</td><td class='tdbg_5' hit><span
	// class='ball_5'>29</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>30</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >20</td><td class='tdbg_5' >3</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >4</td><td class='tdbdr'></td><td class='tdbg_3' >5</td><td
	// class='tdbg_3' >3</td><td class='tdbg_3' hit><span
	// class='ball_1'>03</span></td><td class='tdbg_3' >10</td><td class='tdbg_3'
	// >13</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>07</span></td><td class='tdbg_3' >14</td><td class='tdbg_3'
	// >10</td><td class='tdbg_3' >1</td><td class='tdbg_3' >6</td><td
	// class='tdbg_3' >1</td></tr><tr><td class='tdbg_1 '>2018-152</td><td
	// class='tdbdr'></td><td class='tdbg_1 thide' ><strong class='rednum'>02 04 05
	// 12 28</strong>+<strong class='bluenum'>08 11</strong></td><td class='tdbdr
	// thide'></td><td class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>02</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// hit><span class='ball_5'>04</span></td><td class='tdbg_5' hit><span
	// class='ball_4'>05</span></td><td class='tdbg_5' >4</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >1</td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >3</td><td class='tdbg_5' hit><span
	// class='ball_5'>12</span></td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >17</td><td class='tdbg_5' >12</td><td class='tdbg_5' >13</td><td
	// class='tdbg_5' >8</td><td class='tdbdr'></td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >10</td><td class='tdbg_5' >3</td><td class='tdbg_5'
	// >16</td><td class='tdbg_5' >9</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >22</td><td class='tdbg_5'
	// >5</td><td class='tdbg_5' >17</td><td class='tdbg_5' hit><span
	// class='ball_5'>28</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >21</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >2</td><td class='tdbg_5' >5</td><td
	// class='tdbdr'></td><td class='tdbg_3' >6</td><td class='tdbg_3' >4</td><td
	// class='tdbg_3' >1</td><td class='tdbg_3' >11</td><td class='tdbg_3'
	// >14</td><td class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' hit><span class='ball_1'>08</span></td><td class='tdbg_3'
	// >11</td><td class='tdbg_3' >2</td><td class='tdbg_3' hit><span
	// class='ball_1'>11</span></td><td class='tdbg_3' >2</td></tr><tr><td
	// class='tdbg_1 '>2018-153</td><td class='tdbdr'></td><td class='tdbg_1 thide'
	// ><strong class='rednum'>03 06 07 08 21</strong>+<strong class='bluenum'>01
	// 08</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_5'>03</span></td><td class='tdbg_5' >1</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' hit><span class='ball_4'>06</span></td><td
	// class='tdbg_5' hit><span class='ball_4'>07</span></td><td class='tdbg_5'
	// hit><span class='ball_4'>08</span></td><td class='tdbg_5' >7</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >4</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >13</td><td class='tdbg_5' >14</td><td class='tdbg_5' >9</td><td
	// class='tdbdr'></td><td class='tdbg_5' >2</td><td class='tdbg_5' >11</td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' hit><span
	// class='ball_4'>21</span></td><td class='tdbg_5' >10</td><td class='tdbg_5'
	// >12</td><td class='tdbg_5' >5</td><td class='tdbg_5' >23</td><td
	// class='tdbg_5' >6</td><td class='tdbg_5' >18</td><td class='tdbg_5'
	// >1</td><td class='tdbg_5' >2</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' >22</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >3</td><td class='tdbg_5' >6</td><td class='tdbdr'></td><td
	// class='tdbg_3' hit><span class='ball_1'>01</span></td><td class='tdbg_3'
	// >5</td><td class='tdbg_3' >2</td><td class='tdbg_3' >12</td><td
	// class='tdbg_3' >15</td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' hit><span class='ball_1'>08</span></td><td
	// class='tdbg_3' >12</td><td class='tdbg_3' >3</td><td class='tdbg_3'
	// >1</td><td class='tdbg_3' >3</td></tr><tr><td class='tdbg_1
	// '>2018-154</td><td class='tdbdr'></td><td class='tdbg_1 thide' ><strong
	// class='rednum'>14 22 23 26 30</strong>+<strong class='bluenum'>03
	// 05</strong></td><td class='tdbdr thide'></td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >2</td><td
	// class='tdbg_5' >2</td><td class='tdbg_5' >1</td><td class='tdbg_5' >1</td><td
	// class='tdbg_5' >1</td><td class='tdbg_5' >8</td><td class='tdbg_5' >5</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >2</td><td class='tdbg_5' >4</td><td
	// class='tdbg_5' hit><span class='ball_5'>14</span></td><td class='tdbg_5'
	// >14</td><td class='tdbg_5' >15</td><td class='tdbg_5' >10</td><td
	// class='tdbdr'></td><td class='tdbg_5' >3</td><td class='tdbg_5' >12</td><td
	// class='tdbg_5' >5</td><td class='tdbg_5' >1</td><td class='tdbg_5' hit><span
	// class='ball_4'>22</span></td><td class='tdbg_5' hit><span
	// class='ball_5'>23</span></td><td class='tdbg_5' >6</td><td class='tdbg_5'
	// >24</td><td class='tdbg_5' hit><span class='ball_5'>26</span></td><td
	// class='tdbg_5' >19</td><td class='tdbg_5' >2</td><td class='tdbg_5'
	// >3</td><td class='tdbg_5' hit><span class='ball_5'>30</span></td><td
	// class='tdbg_5' >4</td><td class='tdbg_5' >23</td><td class='tdbg_5'
	// >6</td><td class='tdbg_5' >4</td><td class='tdbg_5' >7</td><td
	// class='tdbdr'></td><td class='tdbg_3' >1</td><td class='tdbg_3' >6</td><td
	// class='tdbg_3' hit><span class='ball_1'>03</span></td><td class='tdbg_3'
	// >13</td><td class='tdbg_3' hit><span class='ball_1'>05</span></td><td
	// class='tdbg_3' >5</td><td class='tdbg_3' >3</td><td class='tdbg_3' >1</td><td
	// class='tdbg_3' >13</td><td class='tdbg_3' >4</td><td class='tdbg_3'
	// >2</td><td class='tdbg_3' >4</td></tr></tbody><tfoot id='addedrow'> <tr
	// class='addCodeNum'> <td class='tdbg_1'> <span class='btn-prese'><a href='#'
	// class='add'></a> <a href='#' class='cut'></a> </span>预选1</td>\r\n" +
	// " <td class='tdbdr'></td>";
	//
	// String[] str = backString.split("<strong class='bluenum'>");
	// int curNum = 101;
	// for (int i = 0; i < str.length; i++) {
	// // System.out.println(str[i]);
	// String tempRowAllStr = str[i];
	// String tempRowBlue = "";
	// if (tempRowAllStr.length() > 5) {
	// tempRowBlue = tempRowAllStr.substring(0, 5);
	// // System.out.println(tempRowBlue);
	// tempRowBlue = tempRowBlue.replace(" ", ",");
	// tempRowBlue = "if (i == "+curNum+") rs.add(new BackBall(" + tempRowBlue +
	// "));";
	// curNum++;
	// if (tempRowBlue.contains("new BackBall(0")) {
	// tempRowBlue = tempRowBlue.replace("new BackBall(0", "new BackBall(");
	// }
	// if (tempRowBlue.contains(",0")) {
	// tempRowBlue = tempRowBlue.replace(",0", ",");
	// }
	// System.out.println(tempRowBlue);
	// }
	// }
	// }

}
