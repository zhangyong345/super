	/**
	 * 
	 */
	package com.zhangyong.commin.utils;
	
	import java.util.Random;
	
	/**
	 * 作者：张勇
	 * 2019年6月17日
	 */
	public class StringUtil {
		/**
		 * 判断源字符串是否有值，空引号(空白字符串)也算没值 
		 */
		public static boolean hasLength(String src){
			//TODO 实现代码
			//判断
			if(src!=null && src!="" &&src.length()!=0){
				//如果有值返回true
				return true;
			}
			//没值返回false
			return false;
	   }
		/**
		 * 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 
		 */
		public static boolean hasText(String src){
			//TODO 实现代码
			//判断
			if(src!=null && src!="" && src.length()!=0 && src!=" "){
				//如果有值返回true
				return true;
			}
			//没值返回false
			return false;
		}
		/**
		 * 返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”
		 */
		public static String randomChineseString(int length){
			//TODO 实现代码
			//定义个字符
			String str = "";
			//循环多个值
			while(str.length()!=length){
				//每次生成一个汉字
				char random = (char) RandomUtil.random(19968,40869);
				//拼接到一起
				str+=random;
			}
			//返回字符
			return str;
		}
		/**
		 * 返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字，
		 * 内部调用randomChineseString()方法。返回示例：“刘呀被”、“欧阳及为”
		 */
		public static String generateChineseName(){
			//TODO 实现代码
			//返回规定的汉字
			return randomChineseString(1)+randomChineseString(1);
	  }
	}
