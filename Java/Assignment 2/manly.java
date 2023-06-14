public class manly
{
    public static void main(String args[])
    {
        Department s = new store();
	System.out.println("The input size is = " + s.getDepartmentSize(5));
	        
	product p = new product();
	System.out.println("Original price is = " + p.getPrice());
	System.out.println("New price is = " + p.getPrice(5));
	        
        runtime r = new runtime();
        System.out.println("Overriding method = " + r.demo());
    }
}