import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Strsort {
    
    private static Set<String> set = new HashSet<String>();

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] chars = scanner.next().toCharArray();
            permutation(chars,0);
        }
        System.out.println(set);
    }

    static void swap(char[] arr,int idx1,int idx2){
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void permutation(char[] chars,int index){
        if (index == chars.length){
            set.add(new String(chars));
        }else{
            for (int i = index;i < chars.length;i++){
                swap(chars,i,index);
                permutation(chars, index + 1);
                swap(chars, i , index);
            }
        }
    }

}
