public class override{
    public String demo() 
    {
        return "Returning parent method";
    }
}
class runtime extends override{
    public String demo()
    {
        return "Returning child method";
    }
}