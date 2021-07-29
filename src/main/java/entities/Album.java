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

    @Enumerated(EnumType.STRING)
    @Column(name = "artist")
    private Artists artist;

    public Album(int id, Artists artist, List<Order> order, List<Track> track) {
        this.id = id;
        this.artist = artist;
        this.order = order;
        this.track = track;
    }

    @ManyToMany
    @Column(name = "order")
    private List<Order> order;

    @ManyToMany(cascade = CascadeType.ALL)
    @Column(name = "track")
    private List<Track> track;


    public Album() {
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setArtist(Artists artist) {
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

    public Artists getArtist() {
        return artist;
    }

    public List<Order> getOrder() {
        return order;
    }

    public List<Track> getTrack() {
        return track;
    }
}
