public class Lab2 {
    public static void main(String[] args) {
    MTrapezow mt=new MTrapezow(1,7);
    mt.start();
    MSimpsona ms=new MSimpsona(1,7);
    ms.start();

    MProstokatow mp=new MProstokatow(1,7);
    mp.start();
    while (mt.isAlive ())
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {

        }
        mt.calka+=(MTrapezow.fT.funkcja(MTrapezow.a)+MTrapezow.fT.funkcja(MTrapezow.b))/2;
        mt.wynik=mt.calka*MTrapezow.h;
        System.out.println("Metoda trapezów: "+mt.wynik);

        while (ms.isAlive ())
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {

            }
        ms.t+=(MSimpsona.fS.funkcja(MSimpsona.b-MSimpsona.h/2));
        ms.wynik=(MSimpsona.h/6)*(MSimpsona.fS.funkcja(MSimpsona.a)+MSimpsona.fS.funkcja(MSimpsona.b)+2*MSimpsona.calka+4*MSimpsona.t);
        System.out.println("Metoda Simpsona: "+ms.wynik);

        while (mp.isAlive ())
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {

            }
        mp.wynik*=mp.h;
        System.out.println("Metoda prostokątów: "+mp.wynik);

    }
}
