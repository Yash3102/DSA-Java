public class Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("yash");
        System.out.println(s1.name);
        
    }
}

class Student{
    String name;

    Student()   //default constructor 
    {
        System.out.println("Constructor is called.."); 
    }

    Student(String name) //parameterized constructor
    {
        this.name = name;
    }
}