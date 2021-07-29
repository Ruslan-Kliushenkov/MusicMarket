import dao.AlbumDao;
import dao.CustomerDao;
import entities.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        Track cadilak = new Track();
        Track dance = new Track();

        cadilak.setAlbum(album);
        dance.setAlbum(album);

        cadilak.setArtist(Artists.MORGENSTERN);
        dance.setArtist(Artists.MORGENSTERN);

        album.setArtist(Artists.MORGENSTERN);
        album.setTrack(Arrays.asList(cadilak,dance));
        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < 2000000; i++) {
            Customer customer = new Customer();
            customer.setAlbum(Collections.singletonList(album));
            Order order = new Order(Collections.singletonList(album),Arrays.asList(cadilak,dance),customer);
            customer.setOrders(Collections.singletonList(order));
            orders.add(order);
        }
        album.setOrder(orders);
        AlbumDao albumDao = new AlbumDao();
        albumDao.saveAlbum(album);
        System.out.println(album.getOrder().size());
    }
}
