package stage2;

public final class MyUtilityClass {
    private MyUtilityClass(){}

    /** Преобразует все символы в этой строке в верхний регистр
     * @param string Исходная строка
     * @return Возвращаем строку
     */
    public static String returnUpperCase(String string) {
        return string.toUpperCase();
    }

    // Преобразует все символы в этой строке в нижний регистр
    public static String returnLowerCase(String string) {
        return string.toLowerCase();
    }

    // Разбивает строку на строки с заданным регулярным выражением
    public static String[] splitStringInput(String string, String regex) {
        return string.split(regex);
    }

    // Заменяет последовательность символов на обратную
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Проверка является ли строка палиндромом
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }
}


