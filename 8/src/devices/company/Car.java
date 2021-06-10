package devices.company;

import java.util.Objects;

public class Car extends Device{
    public String price;
    private Double value;

    public Car(String model, String producer, String price, Double value, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    public  Double getValue()
    {
        return  this.value;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())return false;
    Car auto = (Car) o;
    return Objects.equals(producer,auto.producer)&&Objects.equals(model,auto.model)&&Objects.equals(price,auto.price)&&Objects.equals(value,auto.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(producer, model, price, value);
    }

    public void turnOn(){
        System.out.println("Samochod zapalil.");
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.getCar() != null){
            if(buyer.getCash() >= price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash((seller.getCash()+price));
                buyer.setCar(seller.getCar()); // kupujacy jest wlascicielem
                seller.setCar(null); // sprzedajacy sprzedal i nie ma auta
                System.out.println("Samochod pomyslnie zakupiony przez kupujacego od sprzedajacego");
            }
            else{
                System.out.println("Kupujacy nie ma tyle siana!");
            }
        }
        else{
            System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }
}