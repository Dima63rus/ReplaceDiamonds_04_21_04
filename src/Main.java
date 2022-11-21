import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//***
//        Пользователь вводит строку, в некоторой части которой содержится конфиденциальная информация.
//        Ваша задача изменить строку и скрыть информацию в < >.
//***

        Scanner loScanner = new Scanner(System.in);
        System.out.println("Please enter text: Number card <4008 1234 5678> 8912, ***");

        //Password
        String lvOldText = loScanner.nextLine();

        Password loPassword = new Password();

        //Строка для замены
        int lvBegIndex = lvOldText.indexOf("<");
        int lvLastIndex = lvOldText.lastIndexOf(">");
        lvLastIndex += 1;

        // Считать строку между индексами - начало строки останется без изменений
        String lvTextNotChange = lvOldText.substring(0, lvBegIndex);
        lvLastIndex += 1;

        // Считать строку между ковычками для изменения
        String lvTextForChange = lvOldText.substring(lvBegIndex, lvLastIndex);

        int lvBegIndex2 = lvOldText.indexOf(",");
        lvBegIndex2 += 1;

        // Считать строку между индексами на что будем менять
        String lvTextOnChange = lvOldText.substring(lvBegIndex2, lvOldText.length());
        lvTextOnChange = lvTextOnChange.trim();

        //Заменить строку lvTextForChange на lvTextOnChange
        String lvNewText = lvOldText.replace(lvTextForChange, lvTextOnChange);

        //Удалить лишнюю концовку после запятой
        StringBuffer loStringBuffer = new StringBuffer(lvNewText);
        loStringBuffer.delete(lvNewText.lastIndexOf(","), lvNewText.length());

        //Результат замены
        System.out.println(loStringBuffer);
    }
}