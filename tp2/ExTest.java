package tp2;

public class ExTest {
    public static void main(String[] args) {
        int[] tab={1,2,2,4,5};
        int[] tab2={10,11,12,13};

        // System.out.println(Ex1.est_trie_asc(tab));
        // System.out.println(tab[1]);
        // Ex1.echange(tab,1,3);
        // System.out.println(tab[1]);

        // int[] test=Ex1.append(999,tab);
        // System.out.println(tab.length);
        // System.out.println(test.length);
        // System.out.println(test[test.length-1]);


        int[] test2=Ex1.fusion(tab,tab2);
        for (int e : test2) {
            System.out.println(e);
        }
        // System.out.println(Ex1.posMin(tab));


    }
}
