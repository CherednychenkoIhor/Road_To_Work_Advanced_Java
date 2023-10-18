package Regexp.PatternAndMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text =  "Hello, Bro! I send you my email joe@gmail.com so we can keep in touch. " +
                "That's cool. I send you my address: tim@yandex.ru. Let's stay touch...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group(2));

    }
}
