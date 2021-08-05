package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    String name;

    @Column(name = "order")
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<Order> orders;



    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", orders=" + orders.size() +
                '}';
    }

    public Customer(String id, List<Order> orders) {
        this.id = id;
        this.orders = orders;

    }


    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
