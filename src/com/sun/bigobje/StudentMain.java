package com.sun.bigobje;

import com.sun.utils.JaxbUtil;

/**
 * 嵌套对象
 * 
 * @author Administrator
 * 
 */
public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(12);
		student.setName("test");

		Role role = new Role();
		role.setDesc("管理");
		role.setName("班长");

		student.setRole(role);

		String str = JaxbUtil.convertToXml(student);
		System.out.println(str);

		Student student2 = JaxbUtil.converyToJavaBean(str, Student.class);
		System.out.println(student2);
	}

}
