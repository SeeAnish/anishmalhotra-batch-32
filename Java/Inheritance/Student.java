package Inheritance;
public class Student
{
    public String name;
    public String getName()
    {
        return name;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.setName("Anish Malhotra");
        System.out.println(s.getName());
    }
}