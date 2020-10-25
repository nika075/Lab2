public class MTrapezow extends Thread
{
    static double a;
    static double b;
    static double h,calka,t,x;
    static int n=2;
    static  double wynik=0;
    static Funkcja fT=new Funkcja();

    public MTrapezow(double a,double b)
    {
        this.a=a;
        this.b=b;
    }

    public void run()
    {
        h=(b-a)/n;
        calka=0;

        for(int i=1;i<n;i++)
        {

            //xi
            calka+=fT.funkcja(a+i*h);
        }
    }

}
