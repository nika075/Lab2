public class MTrapezow extends Thread
{
    static double a;
    static double b;
    static double h,calka;
    static Funkcja fT=new Funkcja();
    static Lab2 lab=new Lab2();
    static int i;
    public MTrapezow(double a,double b,int i)
    {
        this.a=a;
        this.b=b;
        this.i=i;
    }

    public void run()
    {
        h=(b-a)/lab.n;
        calka=0;
        //for(int i=1;i<n;i++)
        //{
            //xi
            calka+=fT.funkcja(a+i*h);

        //}
    }
}