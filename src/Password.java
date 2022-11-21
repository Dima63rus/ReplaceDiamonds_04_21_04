public class Password {
    public static final String MC_LESS = "<";
    public static final String MC_MORE = ">";
    public static final String MC_COMMA = ",";

    public StringBuffer searchAndReplaceDiamonds(String ivOldText) {
        //Строка для замены
        int lvBegIndex = ivOldText.indexOf(MC_LESS);
        int lvLastIndex = ivOldText.lastIndexOf(MC_MORE);
        lvLastIndex += 1;

        // Считать строку между индексами - начало строки останется без изменений
        String lvTextNotChange = ivOldText.substring(0, lvBegIndex);
        lvLastIndex += 1;

        // Считать строку между ковычками для изменения
        String lvTextForChange = ivOldText.substring(lvBegIndex, lvLastIndex);

        int lvBegIndex2 = ivOldText.indexOf(MC_COMMA);
        lvBegIndex2 += 1;

        // Считать строку между индексами на что будем менять
        String lvTextOnChange = ivOldText.substring(lvBegIndex2);
        lvTextOnChange = lvTextOnChange.trim();

        //Заменить строку lvTextForChange на lvTextOnChange
        String lvNewText = replaceStatement(ivOldText, lvTextForChange, lvTextOnChange);

        //Удалить лишнюю концовку после запятой
        return delFromStr(lvNewText);
    }

    private String replaceStatement(String ivOldText,
                                    String ivTextForChange,
                                    String ivTextOnChange) {
        return ivOldText.replace(ivTextForChange, ivTextOnChange);
    }

    private StringBuffer delFromStr(String ivNewText) {
        StringBuffer roStringBuffer = new StringBuffer(ivNewText);
        roStringBuffer.delete(ivNewText.lastIndexOf(MC_COMMA), ivNewText.length());

        return roStringBuffer;
    }
}
