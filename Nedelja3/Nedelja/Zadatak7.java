import java.util.Arrays;

public class Zadatak7 {
    public static int[] rotacijaNiza(int[] niz, int x){
        int[] noviNiz = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            if (i < x)
                noviNiz[i] = niz[niz.length - x + i];
            else
                noviNiz[i] = niz[i-x];
        }
        return noviNiz;
    }

    public static void main(String[] args) {
        int[] niz = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(rotacijaNiza(niz,3)));
    }
}
