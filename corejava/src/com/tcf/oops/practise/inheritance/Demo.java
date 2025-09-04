package com.tcf.oops.practise.inheritance;

public class Demo {

	public static void main(String[] args) {
		System.out.println("=== Person ===");
        Person p = new Person("Arun", 40);
        p.display();

        System.out.println("\n=== Student ===");
        Student s = new Student("Kumar", 20, 101, "Computer Science");
        s.display();

        System.out.println("\n=== Research Student ===");
        ResearchStudent rs = new ResearchStudent("Meena", 25, 102, "M.Tech",
                                "Artificial Intelligence", "Dr. Ramesh");
        rs.display();

        System.out.println("\n=== Teacher ===");
        Teacher t = new Teacher("Suresh", 45, "EMP123", "Java Programming");
        t.display();
	}

}
