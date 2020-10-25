public class MProstokatow extends Thread {
    static double a;
    static double b;
    static double h;
    static int n = 2;
    static double wynik = 0;
    static Funkcja fP = new Funkcja();
    static double sr=0;
    public MProstokatow(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run()
    {
        h=(b-a)/n;
        sr=a+(b-a)/(2*n);
        for (int i=1; i<=n; i++) {
            wynik += fP.funkcja(sr);
            sr+=h;
        }
    }
}