package pl.swiebodzin.pzs.lifecicle;
// psvm zwraca metoda ktora umozliwia uruchomienie aplikacji java
public class NumberList {

   static String name;
   static int counter = 0;

    public static void main(String[] args) {
        //counter++;
        //  name = "Kacper";
        // System.out.println(name + " " + counter); //wyswietleine w konsoli name
        //  Samochod samochod = new Samochod();
        // samochod.marka = "Opel";
        //samochod.model = "Insignia";
        //samochod.paliwo = "Diesel";
        //samochod.pojemnosc = 5.0;
        //samochod.przebieg = 10;
        // sout skrot do linijki ponizej
        //System.out.println(samochod);

        Samochod kia = new Samochod("Kia","Rio",5.0,10000,"LPG");
        Samochod nissan = new Samochod("Nissan", "Juke", 8.0,2,"Diesel");
        Samochod ford = new Samochod("Ford", "Kuga", 5.0 , 150000, "Diesel");
        System.out.println(kia);
        System.out.println(nissan);
        System.out.println(ford);

        System.out.println(kia.getMarka());
        kia.setMarka("BMW");
        System.out.println(kia.getMarka());

        kia.nowyPojazd("Hello");

        Pojazd mercedes = new Samochod();

    }
}
