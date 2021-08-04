package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "artist")
    private Artist artistName;

    @Column(name = "track")
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Track> track;

    @Column(name = "album")
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Album> albums;
}
