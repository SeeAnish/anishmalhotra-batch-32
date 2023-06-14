public abstract class Department
{
    public abstract int getDepartmentSize(int a);
}
class store extends Department
{
    public int getDepartmentSize(int a)
    {
        return a; 
    }
}