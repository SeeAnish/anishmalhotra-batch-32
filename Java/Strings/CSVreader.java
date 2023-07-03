package Strings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CSVreader implements Comparable<CSVreader> 
{
    private String firstName;
    private String lastName;
    private String gpa;
    // Implementing the Comparable interface to compare CSVreader objects based on last name
    public int compareTo(CSVreader o) 
    {
        return this.lastName.compareTo(o.lastName);
    }
    public List<CSVreader> readCSV() 
    {
        String filePath = "record.csv";
        List<CSVreader> csvList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;    
            // Skip the header line
            reader.readLine();
            while ((line = reader.readLine()) != null) 
            {
                CSVreader csv = new CSVreader();
                String[] values = line.split(",");
                csv.firstName = values[0];
                csv.lastName = values[1];
                csv.gpa = values[2];
                csvList.add(csv);
            }
            System.out.println("Before Sorting:");
            printList(csvList);
            // Sort the csvList based on last name
            Collections.sort(csvList);
            System.out.println();
            System.out.println("After Sorting by Last Name:");
            printList(csvList);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return csvList;
    }
    public void printList(List<CSVreader> csvList) 
    {
        for (CSVreader c : csvList) System.out.println(c.firstName + " " + c.lastName + " " + c.gpa);
    }
    public static void main(String[] args) 
    {
        CSVreader csvReader = new CSVreader();
        csvReader.readCSV();
    }
}