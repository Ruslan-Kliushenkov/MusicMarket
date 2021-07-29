package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "castomer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @OneToMany(cascade = CascadeType.ALL)
    String name;

    @Column(name = "order")
    @OneToMany(cascade = CascadeType.ALL)
    List<Order> orders;

    @Column(name = "album")
    @OneToMany(cascade = CascadeType.ALL)
    List<Album> album;

    @Column(name = "track")
    @OneToMany(cascade = CascadeType.ALL)
    List<Track> track;

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", orders=" + orders.size() +
                ", album=" + album +
                ", track=" + track +
                '}';
    }

    public Customer(int id, List<Order> orders, List<Album> album, List<Track> track) {
        this.id = id;
        this.orders = orders;
        this.album = album;
        this.track = track;
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

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }
}
