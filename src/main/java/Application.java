import dao.*;
import entities.*;

import java.util.Arrays;
import java.util.List;

public class Application {
    private static final AlbumDao albumDao = new AlbumDao();

    public void start() {
        Album album = new Album();
        albumDao.saveAlbum(album);
    }



}

