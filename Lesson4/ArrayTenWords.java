package JavaCore.Lesson4;

import java.util.HashMap;

public class ArrayTenWords {


    public static void main(String[] args) {

        String[] tenWords = new String[]
                {
                        "One", "Two", "Nine", "Four", "Five", "Nine", "Seven", "Eight", "Nine", "Two"
                };

        HashMap<String, Integer> duplicateWords = new HashMap<>();
        for (int i = 0; i < tenWords.length; i++) {
            if(duplicateWords.containsKey(tenWords[i])) {
                duplicateWords.put(tenWords[i], duplicateWords.get(tenWords[i])+ 1);
            }else {
                duplicateWords.put(tenWords[i], 1);
            }
        }
        System.out.println(duplicateWords);
    }
}
