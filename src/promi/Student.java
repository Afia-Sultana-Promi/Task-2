package promi;

public class Student {
    String name;
    int id;
    static String universityName= "Leading University";
    Student()
    {
        System.out.println("Default constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name : " + name);
    }
    Student (int id)
    {
        this.id = id;
        System.out.println("Id : " + id);
    }
    void display()
    {
        System.out.println("University name : "+ universityName);
    }
}
/* Name   : Afia Sultana
   ID     : 2012020082
   Section: B
   Email  : cse_2012020082@lus.ac.bd
 */