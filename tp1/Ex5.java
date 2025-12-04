package tp1;
public class Ex5 {
    public static boolean verifPalindrome(String str){
        int len=str.length();
        if(len==1){
            return true;
        }
        if(str.charAt(0)==str.charAt(len-1)){
            if(len==2){
                return true;
            }
            return verifPalindrome(str.substring(1,len-1));
        }
        return false;
    }
}
