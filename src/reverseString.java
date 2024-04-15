import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String word=sc.nextLine();
        System.out.println(reverseString(word));
      }

    public static String reverseString(String word){
        String str="";
        char ch;
        for(int i=0;i<word.length();i++){
           ch=word.charAt(i);
           str=ch+str;
        }
        return str;
    }
    }



