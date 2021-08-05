package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToMany
    @JoinTable(
            name = "album_oder",
            joinColumns = @JoinColumn(name = "oder_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id")
    )
    @Column(name = "album")
    private List<Album> album;


    @ManyToMany
    @JoinTable(
            name = "track_oder",
            joinColumns = @JoinColumn(name = "oders_id"),
            inverseJoinColumns = @JoinColumn(name = "track_id")
    )
    @Column(name = "track")
    private List<Track> track;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_orders")
    private Customer customer;

    public Order(String id, List<Album> album, List<Track> track) {
        this.id = id;
        this.album = album;
        this.track = track;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "order_album",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id")
    )
    private List<Album> albums = new ArrayList<>();

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", album=" + album +
                ", track=" + track +
                ", customer=" + customer +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order(List<Album> album, List<Track> track, Customer customer) {
        this.album = album;
        this.track = track;
        this.customer = customer;
    }

    public Order() {
    }
}
