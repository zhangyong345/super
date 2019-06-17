/**
 * 
 */
package com.zhangyong.commin.utils;

import java.util.Date;

/**
 * 作者：张勇
 * 2019年6月17日
 */
public class Person {
  String name;
  int age;
  String about;
  Date created;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the about
 */
public String getAbout() {
	return about;
}
/**
 * @param about the about to set
 */
public void setAbout(String about) {
	this.about = about;
}
/**
 * @return the created
 */
public Date getCreated() {
	return created;
}
/**
 * @param created the created to set
 */
public void setCreated(Date created) {
	this.created = created;
}
/**
 * @param name
 * @param age
 * @param about
 * @param created
 */
public Person(String name, int age, String about, Date created) {
	super();
	this.name = name;
	this.age = age;
	this.about = about;
	this.created = created;
}
/**
 * 
 */
public Person() {
	super();
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
}
  
  
}
