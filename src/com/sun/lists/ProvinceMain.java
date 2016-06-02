package com.sun.lists;

import java.util.ArrayList;
import java.util.List;

import com.sun.utils.JaxbUtil;

/**
 * 集合对象
 * 
 * @author Administrator
 * 
 */
public class ProvinceMain {
	public static void main(String[] args) {
		Country country = new Country();
		country.setName("中国");

		List<Province> list = new ArrayList<Province>();
		Province province = new Province();
		province.setName("江苏省");
		province.setProvCity("南京市");
		Province province2 = new Province();
		province2.setName("浙江省");
		province2.setProvCity("杭州市");
		list.add(province);
		list.add(province2);

		country.setProvinceList(list);

		String str = JaxbUtil.convertToXml(country);
		System.out.println(str);

		Country country2 = JaxbUtil.converyToJavaBean(str, Country.class);
		System.out.println(country2);
	}
}
