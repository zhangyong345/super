/**
 * 
 */
package com.zhangyong.commin.utils;

import java.util.Date;

/**
 * 作者：张勇
 * 2019年6月17日
 */
public class TestPerson {
  public static void main(String[] args) {
	  //定义个数值
	 int num=0;
	 //循环1万次
	 while(num!=10000){
		 Person p = new Person(StringUtil.generateChineseName(), RandomUtil.random(0, 120), 
				 StringUtil.randomChineseString(10),new Date());
		         System.out.println(p);
		       num++;  
	 }
}
}
