package devices.company;
public class Phone extends Device {
    String System;

    public Phone(String model, String producer, int yearOfProduction, String system) {
        this.System = system;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        java.lang.System.out.println("Telefon wlaczyl sie!");
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.getTelephone() != null){
            if(buyer.getCash() >= price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash((seller.getCash()+price));
                buyer.setTelephone(seller.getTelephone());
                seller.setTelephone(null);

                java.lang.System.out.println("Telefon pomyslnie zakupiony przez kupujacego od sprzedajacego");
            }
            else{
                java.lang.System.out.println("Kupujacy nie ma tyle siana!");
            }
        }
        else{
            java.lang.System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }
    @Override
    public String toString() {
            String x = "Model: " + this.model + ";" +
                    "Producent: " + this.producer + ";" +
                    "Cena: " + this.System + ";" +
                    "Rok produkcji: " + this.yearOfProduction;
            return x;
        }
}