import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> costumers =new ArrayList<Customer>();

        costumers.add(new Customer(1,"Enes","Aktürk"));
        costumers.add(new Customer(2,"Sevgi","Aktürk"));
        costumers.add(new Customer(3,"Zeynep","Aktürk"));

        for (Customer customer:costumers){
            System.out.println(customer.getFirstName());
        }
    }
}