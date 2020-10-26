public class Lab2 {
    public static void main(String[] args) throws InterruptedException {
        MTrapezow mt=new MTrapezow(1,7);
        mt.start();
        mt.join();
        MSimpsona ms=new MSimpsona(1,7);
        ms.start();
        ms.join();
        MProstokatow mp=new MProstokatow(1,7);
        mp.start();
        mp.join();

        mt.calka+=(MTrapezow.fT.funkcja(MTrapezow.a)+MTrapezow.fT.funkcja(MTrapezow.b))/2;
        mt.wynik=mt.calka*MTrapezow.h;
        System.out.println("Metoda trapezów: "+mt.wynik);
        ms.t+=(MSimpsona.fS.funkcja(MSimpsona.b-MSimpsona.h/2));
        ms.wynik=(MSimpsona.h/6)*(MSimpsona.fS.funkcja(MSimpsona.a)+MSimpsona.fS.funkcja(MSimpsona.b)+2*MSimpsona.calka+4*MSimpsona.t);
        System.out.println("Metoda Simpsona: "+ms.wynik);

        mp.wynik*=mp.h;
        System.out.println("Metoda prostokątów: "+mp.wynik);

    }
}