class Exp2_Q2{
    public static void main(String[] args)
    {
      Exp2_Q2 obj=new Exp2_Q2();
      obj.pattern();
    }
    
    void pattern()
    {
        for(int i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}