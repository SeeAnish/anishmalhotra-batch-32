public class StringRotation 
{
	public static void main(String[] args)
	{
		String str1 = "JavaJ2eeStrutsHibernate";
		String str2 = "StrutsHibernateJavaJ2ee";
		String str = str1 + str1;
		if((str1.length() == str2.length()) && (str.indexOf(str2) != -1)) System.out.println("True");
		else System.out.printf("False");
	}
}