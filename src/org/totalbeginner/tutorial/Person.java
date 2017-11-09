package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name;	// name of the person
	private int maximumBooks;	// most books the person can check out
	
	// constructor
	public Person() {
		name = "unknown name";
		maximumBooks = 3;	
	}
	
	//methods
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

}
