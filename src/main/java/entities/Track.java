package entities;

import javax.persistence.*;

@Entity
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "album")
    @OneToOne(cascade = CascadeType.ALL)
    private Album album;

    @Enumerated(EnumType.STRING)
    @Column(name = "artist")
    private Artists artist;

    public Track() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artists getArtist() {
        return artist;
    }

    public void setArtist(Artists artist) {
        this.artist = artist;
    }

    public Track(int id, Album album, Artists artist) {
        this.id = id;
        this.album = album;
        this.artist = artist;
    }

}
