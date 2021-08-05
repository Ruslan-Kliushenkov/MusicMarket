import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserControl {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @SneakyThrows
    public void cmdList() {
        System.out.println("Введите : ");
        System.out.println("1 - чтобы создать ");
        System.out.println("2 - чтобы показать");
        System.out.println("3 - чтобы удалить");


        switch (reader.readLine()) {
            case ("1"):
                crate();
                break;
        }

    }

    public void crate(){
        System.out.println("");
    }
}
