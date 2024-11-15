import java.util.*;
public class Anagrams {
    public static boolean isAnagram(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        else{
            char[] arra = a.toCharArray();
            char[] arrb = a.toCharArray();
            Arrays.sort(arra);
            Arrays.sort(arrb);
            return Arrays.equals(arra, arrb);

            
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("allergy", "allergic"));
    }
}
