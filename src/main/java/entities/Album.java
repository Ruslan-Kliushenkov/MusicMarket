package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "artist")
    private Artist artist;

    @ManyToMany(mappedBy = "album")
    @Column(name = "order")
    private List<Order> order;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "track")
    private List<Track> track;


    public Album() {
    }

    public Album(int id, Artist artist, List<Order> order, List<Track> track) {
        this.id = id;
        this.artist = artist;
        this.order = order;
        this.track = track;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }


    public int getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public List<Order> getOrder() {
        return order;
    }

    public List<Track> getTrack() {
        return track;
    }
}
