package org.patsimas.sockets;

public class Student {

	private int am;
	private String name;
	
	public Student(int am, String name) {
		super();
		this.am = am;
		this.name = name;
	}
	
	public String getData() {
		return "["+am + "][" + name + "] ";
	}
}
