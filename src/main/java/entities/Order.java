package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "OrdersTable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "album_oder",
            joinColumns = @JoinColumn(name = "oder_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id")
    )
    private List<Album> albums;


    @ManyToMany
    @JoinTable(
            name = "track_oder",
            joinColumns = @JoinColumn(name = "orders_id"),
            inverseJoinColumns = @JoinColumn(name = "track_id")
    )
    private List<Track> tracks;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_orders")
    private Customer customer;

    public Order() {
    }


}
