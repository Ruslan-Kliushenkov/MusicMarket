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
    private int id;

    @Column(name = "name")
    String name;

    @Column(name = "order")
    @OneToMany(cascade = CascadeType.ALL)
    List<Order> orders;


    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", orders=" + orders.size() +
                '}';
    }

    public Customer(int id, List<Order> orders) {
        this.id = id;
        this.orders = orders;

    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
