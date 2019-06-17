/**
 * 
 */
package com.zhangyong.commin.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 作者：张勇
 * 2019年6月17日
 */
public class RandomUtil {
	/*
	 * 返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对
	 * 随机获取值
	 * 
	 */
	public static int random(int min,int max){
		//随机函数
		Random r = new Random();
		//返回随机值
		return r.nextInt(max-min+1)+min;
	}
	/*
	 * /方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，
	 * 那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	 * 应用场景：在100篇文章中随机取10篇文章，月考可能会使用到
	 * 随机指定的数值
	 * 
	 */
	public static Set<Integer> subRandom (int min, int max, int subs){
		//TODO 实现代码
		//set集合让数值不重复
        Set<Integer> set =new HashSet<Integer>();
        //循环获取数值
		for (int i = 0; i < subs; i++) {
			set.add(random(min, max));
		}
		//返回指定的数值
		return set;
    }
	/*
	 * 返回1个1-9,a-Z之间的随机字符
	 * 随机获取值
	 * 
	 */
	public static char randomCharacter (){
		//TODO 实现代码
		//指定的范围
		String str="123456789qwertyuiopasdfghjklzxcbnmQWERTYUIOPASDFGHJKLZXCBNM";
		//获取随机下标
		int random = random(0,str.length()-1);
		//用获取的下标截取字符串
		char charAt = str.charAt(random);
		//返回字符串
		return charAt;
	}
	/*
	 * 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法
	 * 随机获取值
	 * 
	 */
	public static String randomString(int length){
		//TODO 实现代码
		//定义一个空字符
		String str = "";
		//循环获取个数
		for (int i = 0; i < length; i++) {
			//每次获取的拼接在一起
			str+=randomCharacter();
		}
		//返回字符串
		return str;
	}
}
