package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@ToString
@Getter
@Setter
@Entity
@Table(name = "ArtistTable")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "artist")
    private String artistName;

    @OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<Track> tracks;

    @Column(name = "albums")
    @OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<Album> albums;

    public Artist() {
    }
}
