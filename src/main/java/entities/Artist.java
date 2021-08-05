package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "artist")
    private String artistName;

    @Column(name = "track")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Track> track;

    @Column(name = "album")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Album> albums;

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
