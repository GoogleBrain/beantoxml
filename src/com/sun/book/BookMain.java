package com.sun.book;

import java.util.Date;

import com.sun.utils.JaxbUtil;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setId(100);
		book.setAuthor("Tom");
		book.setCalendar(new Date());
		book.setPrice(23.34f);
		String str = JaxbUtil.convertToXml(book);
		System.out.print(str);

		Book book2 = JaxbUtil.converyToJavaBean(str, Book.class);
		System.out.print(book2);
	}
}
