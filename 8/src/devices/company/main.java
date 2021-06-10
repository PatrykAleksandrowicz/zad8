package devices.company;

public class main {
    public static void  main(String[] args){
        Car auto = new Car("A3","Audi","120k", 100000.0, 2015);
        Phone iphone = new Phone("11 pro", "Apple", 2019, "IoS");
        Animal zwierze = new Animal("dog");

        Human h1 = new Human("Patryk", "Aleksandrowicz", 18, "mezczyzna", 20000.0);
        Human h2 = new Human("Pawel", "Sosnoski", 30, "inny", 200000.0);

        /*testy */

        // h1.sell(); Human nie dziedziczy z interfejsu sallable zatem nie ma mozliwosci handlu ludzmi
        // metode sell ma klasa Animal oraz  Car i Phone ktore dziedzicza z device zatem tylko te przedmioty mozna sprzedawac

        auto.sell(h1,h2,200.0);
        iphone.sell(h1,h2,200.0);
        zwierze.sell(h1,h2,200.0);

        h1.setCar(auto);
        h1.setPet(zwierze);
        h1.setTelephone(iphone);

        h1.setCash(500.0);
        h2.setCash(5000.0);

        auto.sell(h1,h2,6000.0);
        iphone.sell(h1,h2,6000.0);
        zwierze.sell(h1,h2,6000.0);

        //auto.sell(h1,h2,300.0); // null przy h1, bo nie ma samochodu juz

        System.out.println(h2.getCar().getModel() + h2.getCar().getProducer());

    }
}