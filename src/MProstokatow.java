public class MProstokatow extends Thread {
    static double a;
    static double b;
    //static double h;
    //static int n = 2;
    static double wynik = 0;
    static Funkcja fP = new Funkcja();
    static double sr=0;
    static Lab2 lab=new Lab2();
    static int i;
    public MProstokatow(double a, double b,int i) {
        this.a = a;
        this.b = b;
        this.i=i;
    }

    public void run()
    {
        lab.h=(b-a)/lab.n;
        sr=a+(b-a)/(2*lab.n);
       //for (int i=1; i<=lab.n; i++) {

           if(i>1)
           {
               sr+=lab.h*(i);
               wynik= fP.funkcja(sr);
           }
           else
           {
               wynik= fP.funkcja(sr);
               sr+=lab.h*(i);
           }

        //}
    }
}