public class MSimpsona extends Thread {

    static double a;
    static double b;
    static double h,calka,t,x;
    static int n=2;
    static  double wynik=0;
    static Funkcja fS = new Funkcja();
    public MSimpsona(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public void run()
    {
        h=(b-a)/n;
        calka=0;
        t=0;
        for(int i=1;i<n;i++)
        {
            x=a+i*h;
            //ti
            t+=fS.funkcja(x-h/2);
            //xi
            calka+=fS.funkcja(x);
        }
    }
}
