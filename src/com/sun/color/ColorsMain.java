package com.sun.color;

import com.sun.utils.JaxbUtil;

/**
 * 属性给子节点
 * 
 * @author Administrator
 * 
 */
public class ColorsMain {
	public static void main(String[] args) {
		Red red = new Red();
		red.setAtt("red");
		red.setValue("red_val");

		Blue blue = new Blue();
		blue.setAtt("Blue_1");
		blue.setAtt2("Blue_2");
		blue.setValue("Blue_val");

		Colors colors = new Colors();
		colors.setBlue(blue);
		colors.setRed(red);
		String str = JaxbUtil.convertToXml(colors);
		System.out.print(str);
	}
}
