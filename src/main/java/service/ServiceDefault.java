package service;

import entities.Album;
import entities.Artist;
import entities.Order;
import entities.Track;

import java.util.*;

public class ServiceDefault {

    public Album createDefaultAlbum(String title){
        Album album = new Album();
        album.setTitle(title);
        List<Track> tracks = createDefaultTracks();
        Artist artist = createDefaultArtist();
        List<Order> orders = createDefaultOrders();
        artist.setAlbums(Collections.singletonList(album));
        orders.forEach(a->a.setAlbums(Collections.singletonList(album)));
        album.setTracks(tracks);
        album.setArtist(artist);
        album.setOrders(orders);
        return album;
    }
    public List<Track> createDefaultTracks() {
        List<Track> defaultTracks= new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Track track = new Track();
            track.setTitle("Track #" + i);
            defaultTracks.add(track);
        }
        return defaultTracks;
    }

    public Artist createDefaultArtist(){
        Artist artist = new Artist();
        artist.setArtistName("DefaultName");
        return artist;
    }

    public List<Order> createDefaultOrders(){
        List<Order> orders = new ArrayList<>();
        List<Order> defaultTracks= new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Order order = new Order();
            defaultTracks.add(order);
        }
        return orders;
    }
}
