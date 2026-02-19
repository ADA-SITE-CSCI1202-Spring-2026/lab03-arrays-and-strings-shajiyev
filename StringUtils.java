import java.util.Arrays;

public class StringUtils {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = s.length() -1; i >= 0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }

    public static String explode(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String sub = s.substring(0, i + 1);
            sb.append(sub);
        }

        return sb.toString();
    }

    public static String sort(String s){
        char[] c_array = s.toCharArray();
        Arrays.sort(c_array);
        return new String(c_array);
    }

    public static boolean isAnagram(String s1, String s2){
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);

        return n_s1.equals(n_s2);
    }

    public static String swap(String s){
        StringBuilder sb = new StringBuilder();
        String[] s_array = s.split(" ");

        for(int i = 0; i < s_array.length; i++){
            char[] c_array = s_array[i].toCharArray();
            char temp = c_array[0];
            c_array[0] = c_array[c_array.length -1];
            c_array[c_array.length - 1] = temp;
            sb.append(c_array);
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));
        String s2 = "Baku";
        System.out.println(explode(s2));
        String s3 = "hfdac";
        String s4 = "aBku";
        String s5 = "This is PP2 Fall 2021";

        System.out.println(sort(s3));
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram(s2, s4));
        System.out.println(swap(s5));
    }
}
