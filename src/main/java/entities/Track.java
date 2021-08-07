package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Table(name = "TrackTable")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "track_artist")
    private Artist artist;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "track_album")
    private Album album;

    @ManyToMany(mappedBy = "tracks")
    @Column(name = "orders")
    private List<Order> orders;

    public Track() {
    }

}
