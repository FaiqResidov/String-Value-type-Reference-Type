import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(palindromeString(word));
    }

    public static boolean palindromeString(String word){
        String str="";
        char ch;
       for(int i=0;i<word.length();i++) {
           ch=word.charAt(i);
           str=ch+str;
       }
       if(str.equals(word)){
           return true;
        }
       else
           return false;
    }

}
