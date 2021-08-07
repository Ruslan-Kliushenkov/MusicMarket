package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "trackTable")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String title;

   /* @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "track_artist")
    private Artist artist;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "track_album")
    private Album album;*/

    @ManyToMany(mappedBy = "tracks",cascade = CascadeType.ALL)
    @Column(name = "orders")
    private List<Order> orders;

    public Track() {
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                '}';
    }
}
