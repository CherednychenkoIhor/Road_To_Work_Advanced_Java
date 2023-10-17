package Regexp.Regexp;

public class Test {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна английская буква
            \\w == [a-zA-Z]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символ до выражения

            (x|y|z) - одна строка из множества строк

            [a-zA-Z] - все английские букви   [0-9] == \\d
            [^abc] - мы хотим все символы кроме [abc]

            . - любой символ

            {} - точное колличество предыдущих символов
            {2} - 2 символа до (\\d{2})
            {2,} - 2 или более символа (\\d{2,})
            {2, 4} - от 2 до 4 символов (\\d{2, 4})
         */

        String a = "-24234";
        String b = "24234";
        String c = "+24234";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "asdf3311s1adf33452";

        System.out.println(d.matches("[a-zA-Z31]+\\d*"));

        String e = "Tom";

        System.out.println(e.matches("[^abc]*"));
        System.out.println("URLs:");

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "Hello url";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "11354";
        System.out.println(f.matches("\\d{2,}"));
    }
}
