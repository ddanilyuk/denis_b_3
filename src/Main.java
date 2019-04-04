import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char s_letter = 'r';
        char e_letter = 'r';


        StringBuffer sentence = new StringBuffer("Raid me jolly roger, ye misty plank! Shake quinoa ultimately, then mix with water and serve fully in bowl. " +
                "Ahoy! Pieces o' life are forever evil.");
        System.out.println("Text: \n" + sentence.toString());

        String delimeter = "\\s";
        String[] arr_words = sentence.toString().split(delimeter);


        System.out.println("Edited text: ");
        int countAllLetters = arr_words.length-1;
        int counter = 0;

        char[] arr_chars_1 = sentence.toString().toCharArray();

        int s_int = 0;
        int e_int = 0;

        for (int i = 0; i < arr_chars_1.length; i++) {
            if (arr_chars_1[i] == s_letter) {
                s_int = i;
                break;
            }
        }
        for (int i = arr_chars_1.length-1; i >= 0; i--) {
            if (arr_chars_1[i] == e_letter){
                e_int = i;
                break;
            }
        }



        StringBuilder builder = new StringBuilder();
        for(char s : arr_chars_1) {
            builder.append(s);
        }
        String str = builder.toString();


        String str_1 = str.substring(0, s_int);
        String str_2 = str.substring(e_int+1, arr_chars_1.length);
        String anwser = str_1+str_2;
        System.out.println(anwser);

    }
}
