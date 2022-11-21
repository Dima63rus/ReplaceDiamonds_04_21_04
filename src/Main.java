import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//***
//        Пользователь вводит строку, в некоторой части которой содержится конфиденциальная информация.
//        Ваша задача изменить строку и скрыть информацию в < >.
//***

        Scanner loScanner = new Scanner(System.in);
        System.out.println("Please enter text: Number card <4008 1234 5678> 8912, ***");

        //Получить введенный текст
        String lvOldText = loScanner.nextLine();

        Password loPassword = new Password();

        //Получить измененный текст
        System.out.println(loPassword.searchAndReplaceDiamonds(lvOldText));
    }
}