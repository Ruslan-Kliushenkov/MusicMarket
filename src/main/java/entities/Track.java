package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "artist")
    private Artist artist;

    @Column(name = "album")
    private Album album;

    @ManyToMany(mappedBy = "track")
    @Column(name = "order")
    private List<Order> order;

    public Track() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Track(int id, Artist artist) {
        this.id = id;
        this.artist = artist;
    }

}
