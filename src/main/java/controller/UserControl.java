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
        System.out.println("1 - чтобы создать ");
        System.out.println("2 - чтобы показать");
        System.out.println("3 - чтобы обновить");
        System.out.println("4 - чтобы удалить");


        switch (reader.readLine()) {
            case ("1"):
                create();
                break;
            case("2"):
                show();
                break;
            case("3"):
                update();
                break;
            case("4"):
                delete();
                break;

        }

    }

    @SneakyThrows
    public void create() {
        System.out.println("1 - создать альбом");
        System.out.println("2 - создать артиста");
        System.out.println("3 - создать кастомера");
        System.out.println("4 - создать заказ");
        System.out.println("5 - создать трек");

        switch (reader.readLine()) {
            case ("1"):
                albumControl.createAlbum();
                break;
            case("2"):
               /* crateArtist();
                break;
            case("3"):
                crateCustomer();
                break;
            case("4"):
                crateOrder();
                break;
            case ("5"):
                createTrack();
                break;*/
            default: unsupportedCmd();

        }
    }

    @SneakyThrows
    public void show(){
        System.out.println("1 - показать альбом");
        System.out.println("2 - показать артиста");
        System.out.println("3 - показать кастомера");
        System.out.println("4 - показать заказ");
        System.out.println("5 - показать трек");
    }

    @SneakyThrows
    public void update(){
        System.out.println("1 - обновить альбом");
        System.out.println("2 - обновить артиста");
        System.out.println("3 - обновить кастомера");
        System.out.println("4 - обновить заказ");
        System.out.println("5 - обновить трек");
    }

    @SneakyThrows
    public void delete(){
        System.out.println("1 - удалить альбом");
        System.out.println("2 - удалить артиста");
        System.out.println("3 - удалить кастомера");
        System.out.println("4 - удалить заказ");
        System.out.println("5 - удалить трек");
    }

    public void unsupportedCmd(){
        System.out.println("Неподдерживаемая команда");
        cmdList();
    }
}

