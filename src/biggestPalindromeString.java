import java.util.Scanner;
public class biggestPalindromeString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String word=sc.nextLine();
        System.out.println(biggestPalindromeString(word));
    }

   public static String biggestPalindromeString(String word){

        String biggestpalindrome="";
        char ch;
       String secondpal="";
        for(int i=0;i<word.length();i++){
            String str="";
            String tstr="";

            for(int j=i;j<word.length();j++) {
                ch = word.charAt(j);
                tstr += ch;
                str = ch + str;

                if (tstr.length()>1 && str.equals(tstr)) {
                    biggestpalindrome = tstr;
                    if (biggestpalindrome.length()>secondpal.length()) {
                        secondpal=biggestpalindrome;

                    }
                    biggestpalindrome=secondpal;

                }

            }
            if(biggestpalindrome.equals(word)){
                break;
            }


        }
        return biggestpalindrome;
    }

}
