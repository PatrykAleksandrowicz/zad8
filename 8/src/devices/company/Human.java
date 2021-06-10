package devices.company;

import java.util.Date;

public class Human {
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    private Double cash;
    private Car auto;
    private Double salary;
    private Animal pet;
    private Phone telephone;

    public Human(String firstName, String lastName, Integer age, String sex, Double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
        this.salary=salary;
    }


    public Double getSalary() {
        System.out.println("Pobrano kasiore;" + this.salary);
        System.out.println("Kiedy otrzymano kasiore" + new Date());
        return this.salary;
    }
    public void setSalary(Double salary) {
        if(salary <0){
            System.out.println("Ujemna wypłata");
        }
        else{
            System.out.println(" informacje o tym, że nowe dane zostały wysłane do systemu księgowego");
            System.out.println(" informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println(" info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }
    public Car getCar(){
        return this.auto;
    }
    public void setCar(Car autko){
        if(this.salary > autko.getValue()) {
            //System.out.println("Kupione za gotówkę");
            this.auto = autko;
        }
        else if(this.salary > autko.getValue()/12.0){
            //System.out.println("Kupione na kredyt");
            this.auto = autko;
        }
        else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po" +
                    "podwyżkę");
        }
    }
    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public Phone getTelephone() {
        return telephone;
    }

    public void setTelephone(Phone telephone) {
        this.telephone = telephone;
    }
    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}
