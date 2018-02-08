package org.totalbeginner.tutorial;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;	

	public MyLibrary(String name) {
		this.name = name;
		
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		this.books.add(b1);
	}

	public void removeBook(Book b1) {
		this.books.remove(b1);
	}

	public void addPerson(Person p1) {
		this.people.add(p1);
	}

	public void removePerson(Person p1) {
		this.people.remove(p1);
	}

	
}
