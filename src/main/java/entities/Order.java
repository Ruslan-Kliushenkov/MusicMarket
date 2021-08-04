package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "order")
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

    @Column(name = "customer")
    private Customer customer;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", album=" + album +
                ", track=" + track +
                ", customer=" + customer +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
