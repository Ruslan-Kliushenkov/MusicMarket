package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "artistTable")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "artist")
    private String artistName;

    /*@OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<Track> tracks;*/

    @Column(name = "albums")
    @OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<Album> albums;

    public Artist() {
    }

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                '}';
    }
}
