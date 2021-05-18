package com.iu.s1.error;

//나만의 예외 클래스 객체, 완성 !
public class MyException extends Exception {
	
	public MyException(String message) {
		super(message); //부모의 생성자
	}

}
