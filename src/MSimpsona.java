
public class MSimpsona extends Thread {

    static double a;
    static double b;
    static double h,calka,x;
    //static int n=2;
    static Lab2 lab=new Lab2();
    static int i;
    static Funkcja fS = new Funkcja();
    public MSimpsona(double a,double b, int i)
    {
        this.a=a;
        this.b=b;
        this.i=i;
    }
    public void run()
    {
        h=(b-a)/lab.n;
        calka=0;
        //t=0;
        //for(int i=1;i<lab.n;i++)
        //{
            x=a+i*h;
            //ti
            lab.t+=fS.funkcja(x-h/2);
            //xi
            calka+=fS.funkcja(x);
        //}
    }
}