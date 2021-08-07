package controller;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserControl {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    AlbumControl albumControl = new AlbumControl();

    @SneakyThrows
    public void cmdList() {
        System.out.println("Введите : ");
        System.out.println("1 - чтобы создать альбом ");
        System.out.println("2 - чтобы показать все альбомы");
        System.out.println("3 - чтобы удалить все альбомы");


        switch (reader.readLine()) {
            case ("1"):
                create();
                break;
            case("2"):
                show();
                break;
            case("3"):
                delete();
            default:
                unsupportedCmd();

        }

    }

    @SneakyThrows
    public void create() {
                albumControl.createAlbum();
        }

    @SneakyThrows
    public void show(){
                albumControl.show();
        }



    @SneakyThrows
    public void delete(){
        albumControl.deleteAll();
    }

    public void unsupportedCmd(){
        System.out.println("Неподдерживаемая команда");
        cmdList();
    }
}

