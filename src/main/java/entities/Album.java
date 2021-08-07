package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ToString
@Getter
@Setter
@Entity
@Table(name = "AlbumTable")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_artist")
    private Artist artist;

    @ManyToMany(mappedBy = "albums")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "album",cascade = CascadeType.ALL)
    private List<Track> tracks;

    @Column
    private String title;

    public Album() {
    }
}
