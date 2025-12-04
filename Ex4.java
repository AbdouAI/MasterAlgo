import java.util.Arrays;

public class Ex4 {
    public static boolean AppartenanceDichotomie(int[] tab,int elem){


        if(tab.length==0){
            return false;
        }
        
        int midInd=tab.length/2;

        if(elem==tab[midInd]){
            return true;
        }else if(elem<tab[midInd]){
            int[] newTab=Arrays.copyOfRange(tab,0,midInd);
            return AppartenanceDichotomie(newTab,elem);

        }else{
            int[] newTab=Arrays.copyOfRange(tab,midInd+1,tab.length);
            return AppartenanceDichotomie(newTab,elem);
        }
    }

    
    public static boolean AppartenanceNonTrie(int[] tab,int elem,int ind){
        
        if(ind==tab.length){
            return false;
        }
        if(tab[ind]==elem){
            return true;
        }
        return AppartenanceNonTrie(tab,elem,++ind);

    }

    //AppartenanceTrie sans dichotomie
    public static boolean AppartenanceTrie(int[] tab,int elem,int ind){
        if(tab[ind]>elem){
            return false;
        }
        if(tab[ind]==elem){
            return true;
        }
        return AppartenanceTrie(tab,elem,++ind);
    }
}
