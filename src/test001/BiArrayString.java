package test001;

import java.util.Arrays;

public class BiArrayString {
    public static void main(String[] args) {
        String[][] frutas =
                {
                        {"banana", "maça", "laranja"},
                        {"melão", "mamão", "melancia"},
                        {"kiwi", "maracuja", "morango"}
                };

        for (String[] fruta : frutas) {
            System.out.println(Arrays.toString(fruta));
        }
    }
}
