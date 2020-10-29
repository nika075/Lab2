public class Lab2 {
    public static double n=5;
    public static double w=0;
    public static  double wynik=0;
    public static double wynik2=0;
    public static double wynik3=0;
    public static double wynik5=0;
    public static double t=0;
    public static double w2=0;
    public static double h=0;
    public static double w4=0;
    public static void main(String[] args) throws InterruptedException {

        for(int ii=1;ii<n;ii++)
        {
            MTrapezow mt =new MTrapezow(1,7,ii);
            mt.start();
            mt.join();
            w+=mt.calka;
        }
        w+=(MTrapezow.fT.funkcja(MTrapezow.a)+MTrapezow.fT.funkcja(MTrapezow.b))/2;
        wynik=w*MTrapezow.h;
        System.out.println("Metoda trapezów: "+wynik);

        for(int ii=1;ii<n;ii++)
        {
            MSimpsona ms =new MSimpsona(1,7,ii);
            ms.start();
            ms.join();
            w2+=ms.calka;
        }

        t+=(MSimpsona.fS.funkcja(MSimpsona.b-MSimpsona.h/2));
        wynik2=(MSimpsona.h/6)*(MSimpsona.fS.funkcja(MSimpsona.a)+MSimpsona.fS.funkcja(MSimpsona.b)+2*w2+4*t);
        System.out.println("Metoda Simpsona: "+wynik2);
        for (int i=1; i<=n; i++) {
            MProstokatow mp = new MProstokatow(1, 7,i);
            mp.start();
            mp.join();
            wynik3+= mp.wynik;
        }
        wynik3*=h;
        System.out.println("Metoda prostokątów: "+wynik3);

        for(int ii=1;ii<n;ii++)
        {
            MProstokatow mp =new MProstokatow(1,7,ii);
            mp.start();
            mp.join();
            w4+=mp.wynik;
            if(ii+1<n) {
                MSimpsona ms = new MSimpsona(1, 7, ii + 1);
                ms.start();
                ms.join();
                w4 += ms.calka;
            }
            else
            {
                break;
            }
            if(ii+2<n) {
                MTrapezow mt = new MTrapezow(1, 7, ii + 2);
                mt.start();
                mt.join();
                w4 += mt.calka;
            }
            else break;;
            ii+=3;

        }
        w4+=(MTrapezow.fT.funkcja(MTrapezow.a)+MTrapezow.fT.funkcja(MTrapezow.b))/2;
        wynik5=w4*MTrapezow.h;
        System.out.println("Wynik całki metodą mieszaną: "+wynik5);
    }
}