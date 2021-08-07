package controller;

import dao.AlbumDao;
import entities.Album;
import lombok.SneakyThrows;
import service.ServiceDefault;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AlbumControl {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    AlbumDao dao = new AlbumDao();
    ServiceDefault serviceDefault = new ServiceDefault();

    @SneakyThrows
    public void createAlbum() {
        UserControl u = new UserControl();
        System.out.println("Введите название альбома");
        dao.saveAlbum(serviceDefault.createDefaultAlbum(read.readLine()));
        u.cmdList();
    }

    @SneakyThrows
    public void show() {
        UserControl u = new UserControl();
        dao.listAll().forEach(System.out::println);
        u.cmdList();
    }

    public void deleteAll() {
        UserControl u = new UserControl();
        List<Integer> id = new ArrayList<>();
        for (Album album : dao.listAll()){
            id.add(album.getId());
        }
        for (Integer num : id) {
            dao.deleteAlbum(num);
        }
        u.cmdList();
    }
}
