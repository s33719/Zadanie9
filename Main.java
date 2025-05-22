import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> Kontener = new ArrayList<>();

        Kontener.add(new Car("Toyota Corolla", 2010));
        Kontener.add(new Car("Ford Mustang", 2015));
        Kontener.add(new Car("BMW 3 Series", 2012));
        Kontener.add(new Car("Honda Civic", 2008));
        Kontener.add(new Car("Audi A4", 2014));
        Kontener.add(new Car("Mercedes C-Class", 2011));
        Kontener.add(new Car("Volkswagen Golf", 2009));
        Kontener.add(new Car("Chevrolet Cruze", 2013));
        Kontener.add(new Car("Kia Ceed", 2007));
        Kontener.add(new Car("Hyundai Elantra", 2016));
        
        
        Collections.sort(Kontener);

        for(Car car : Kontener)
            System.out.println(car);
    }
}
