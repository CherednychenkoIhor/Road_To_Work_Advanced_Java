package Regexp.Regexp;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a = "Hello234523452345there1341234hey";
        String[] words = a.split("\\d+"); // - разделитель, получаешь массив строк
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        System.out.println(b.replace(" ", "."));

        String c = "Hello2452345234there634563456hey";
        System.out.println(c.replaceAll("\\d+", " "));
        String modifierString = c.replaceFirst("\\d+", "-");
        System.out.println(modifierString);
    }
}
