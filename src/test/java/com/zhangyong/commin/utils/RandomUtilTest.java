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
public class RandomUtilTest {

	/**
	 * 测试随机数
	 */
	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1,3));
	}
	/**
	 * 测试指定个数的随机数
	 */
	@Test
	public void testsubRandom() {
		System.out.println(RandomUtil.subRandom(1, 10, 5));
	}
	/**
	 * 测试获取随机字符串
	 */
	@Test
	public void testrandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}
	/**
	 * 测试获取规定的随机字符串
	 */
	@Test
	public void testrandomString() {
		System.out.println(RandomUtil.randomString(5));
	}
}
