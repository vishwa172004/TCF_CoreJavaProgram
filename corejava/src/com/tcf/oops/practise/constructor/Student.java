package com.tcf.oops.practise.constructor;

public class Student {
   public int id;
   public String name;
   public String course;
   public Student(int id,String name,String course)
   {
	   this.id=id;
	   this.name=name;
	   this.course=course;
   }
   public void displayInfo()
   {
	  System.out.println("The name of the student :" +name);
	  System.out.println("The id of the student :" +id);
	  System.out.println("Course opt by the student :" +course);
   }
}
