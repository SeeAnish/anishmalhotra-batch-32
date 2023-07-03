package HashMap;

import java.util.*;

public class StudentHashMapExample {
    public static void main(String[] args) {
        Map<String, student> map = new HashMap<>();
        map.put("John", new student("John", "Doe", 3.8));
        map.put("Jane", new student("Jane", "Smith", 3.9));
        map.put("Mike", new student("Mike", "Johnson", 3.7));
        map.put("Emily", new student("Emily", "Davis", 4.0));
        map.put("Alex", new student("Alex", "Wilson", 3.5));
        map.put("Sarah", new student("Sarah", "Brown", 3.6));
        map.put("David", new student("David", "Lee", 3.9));
        map.put("Emma", new student("Emma", "Taylor", 3.8));
        System.out.println("Printing using keySet and Iterator:");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext())
        {
            String key = it.next();
            student stu = map.get(key);
            System.out.println("Key: " + key + "; Value: " + stu.constr());
        }
        System.out.println();
        System.out.println("Printing using forEach method:");
        map.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value.constr()));
        System.out.println();
        System.out.println("Printing using Entry Set:");
        for (Map.Entry<String, student> entry: map.entrySet())
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue().constr());
    }
}
class student {
    String FirstName;
    String LastName;
    double GPA;
    student(String FirstName, String LastName, double GPA) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GPA = GPA;
    }
    public String constr(){
        return "[FirstName = " + FirstName + ", LastName = " + LastName + ", GPA = " + GPA + "]";
    }
}
