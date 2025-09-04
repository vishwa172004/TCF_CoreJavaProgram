package com.tcf.oops.practise.thiskeyword;

public class Book {
   private int id;
   private String title;
   private String author;
   private double price;
   public Book(int id, String title, String author, double price) {
	this.id = id;
	this.title = title;
	this.author = author;
	this.price = price;
   }
   public Book() {
	  System.out.println("Default construtor called");
	  this.defaultdisplay();
   }
   public void defaultdisplay()
   {
	   System.out.println("=== Book Information ===");
	   System.out.println("Id:0,Title:Unknown,Author:Unknown,Price:0.0");
	   System.out.println("Book added to store: Unknown by Unknown");
	   System.out.println();
   }
   public void displayInfo()
   {
	   System.out.println("=== Book Information ===");
	   System.out.println("Id:"+id+",Title:" +title + ",Author: " +author + ",Price:"+price);
	   System.out.println("Book added to store: "+ title+"by"+author);
	   System.out.println();
   }
   
   
}
