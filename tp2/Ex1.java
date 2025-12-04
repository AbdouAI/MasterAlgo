package tp2;
public class Ex1{

    public static boolean est_trie_asc(int[] tab){
        int len=tab.length;
        if(len<2){
            return true;
        }
        
        for (int i = 1; i < len-1; i++) {
            if(tab[i]>tab[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void echange(int[] tab,int i,int j){
        int temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }


    public static int[] append(int n,int[] tab){
        int len=tab.length;
        int[] newTab=new int[len+1];
        for (int i = 0; i < len; i++) {
            newTab[i]=tab[i];
        } 
        newTab[newTab.length-1]=n;
        return newTab;
    }


    public static int[] fusion(int[] tab1, int[] tab2){
        int[] newTab=new int[tab1.length+tab2.length];
        for (int i = 0; i < newTab.length; i++) {
            if(i<tab1.length){
                newTab[i]=tab1[i];
            }else{
                newTab[i]=tab2[i-tab1.length];
            }
        }
        return newTab;
    }


    public static int posMin(int[] tab,int courant){
        int minInd=tab[courant];
        for (int i = courant; i < tab.length; i++) {
            if(tab[i]<tab[minInd]){
                minInd=i;
            }
        }
        return minInd;
    }

}