/**
 * 
 */
package com.zhangyong.commin.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 作者：张勇
 * 2019年6月17日
 */
public class StringUtilTest {

	/**
	 * 测试判断源字符串是否有值，空引号(空白字符串)也算没值
	 */
	@Test
	public void testHasLength() {
		String src ="1";
		System.out.println(StringUtil.hasLength(src));
	}

	/**
	 * 测试判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 */
	@Test
	public void testHasText() {
		String src =" ";
		System.out.println(StringUtil.hasText(src));
	}

	/**
	 * 测试返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”
	 */
	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(5));
	}
	/**
	 * 测试返回中文姓名
	 */
	@Test
	public void testgenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
