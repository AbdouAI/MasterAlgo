package tp1;
import java.util.Arrays;

public class Ex3 {

    //retourne l'indice de plus grand
    public static int max(int[] tab,int max,int iters){
        if(iters==tab.length){
            return max;
        }
        int newMax=tab[max]<tab[iters]?iters:max;
        return max(tab,newMax,iters+1);
    }

    //retourne l'element le plus grand (1 parametre)
    public static int max2(int[] tab){
        if(tab.length==1){
            return tab[0];
        }
        int max=tab[0];
        int[] nextTab=Arrays.copyOfRange(tab, 1,tab.length);
        int nextMax=max2(nextTab);
        if(max<nextMax){
            max=nextMax;
        }
        return max;
    }
}
