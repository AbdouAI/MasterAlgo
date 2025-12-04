package tp1;
public class Ex2 {
    public static void affiche(int[] tab,int ind){
        if(ind==tab.length-1){
            System.out.println(tab[ind]);
        }else{
            System.out.println(tab[ind]);
            affiche(tab, ind+1);
        }
        
    }
}
