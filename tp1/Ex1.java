package tp1;
public class Ex1{

    public static float calcul(int n,float p,float res){
        if(n==0){
            return res;
        }
        return calcul(n-1,p,p*res);
    }
    
}
