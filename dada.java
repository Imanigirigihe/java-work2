class dada {
    @Override public void geekName()
    {
        System.out.println("Rohit");
    }
 
    @Override public void geekInstitute()
    {
        System.out.println("JIIT");
    }
 
    public static void main(String[] args)
    {
        sample ob1 = new sample();
 
        // calling the method implemented
        // within the class.
        ob1.geekName();
        ob1.geekInstitute();
    }
}interface intfA {
    void geekName();
}
 
interface intfB extends intfA {
    void geekInstitute();
}
 
// class implements both interfaces and provides
// implementation to the method.
