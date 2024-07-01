package contants;

public class Constans {
    //Приветствую Гюнай и остальных, снизу алфавит
    private static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] ALPHABET_RU = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я'};
    private static final char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final char[] symbols = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '\"', '\'', '<', '>', '?', ' '};
    public char[] ALPHABET_FULL = new char[ALPHABET.length + ALPHABET_RU.length + numbers.length + symbols.length];


}
