package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_artist")
    private Artist artist;

    @ManyToMany(mappedBy = "albums")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "album",cascade = CascadeType.ALL)
    private List<Track> track;

    @Column
    private String title;

    public Album(String title) {
        this.title = title;
    }

    public Album() {
    }

    public Album(String id, Artist artist, List<Order> order, List<Track> track) {
        this.id = id;
        this.artist = artist;
        this.orders = order;
        this.track = track;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setOrder(List<Order> order) {
        this.orders = order;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }


    public String getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public List<Order> getOrder() {
        return orders;
    }

    public List<Track> getTrack() {
        return track;
    }
}
