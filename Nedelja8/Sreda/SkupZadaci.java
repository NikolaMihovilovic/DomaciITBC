package skup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SkupZadaci {
    /*
     * 1. Zajednicki elementi
     * Za dva zadata niza bojeva vratiti niz onih brojeva koji se nalaze i u jednom i u drugom nizu.
     *
     * NPR:
     * [1, 2, 3, 4, 5], [2, 4, 6, 8, 10] -> [2, 4]
     * */

    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> skup = new TreeSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : b) {
            if (skup.contains(i)) {
                res.add(i);
            }
            if (res.isEmpty())
                return res;
        }
        return res;
    }


    /*
     * 2. Svi elementi
     * Za dva zadata niza brojeva vratiti niz svih brojeva iz oba niza bez ponavljanja.
     * */

    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.addAll(b);
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : set)
            res.addAll(set);
        return res;
    }

    /*
     * 3. Razlika
     * Za dva zadata niza brojeva vratiti niz onih brojeva koji se nalaze u prvom
     * ali ne i u drugom nizu, bez ponavljanja.
     * */

    public static ArrayList<Integer> razlika(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a == null && b == null) {
            return null;
        }
        if (a == null)
            return b;
        if (b == null)
            return a;
        TreeSet<Integer> set = new TreeSet<>(a);
        set.removeAll(b);

        if (set.isEmpty())
            return null;
        return new ArrayList<>(set);
    }

    /*
     * 4. Napisati funkciju koja broji koliko ima duplikata u zadatom nizu.
     *
     * [1, 2, 3, 4, 4, 2, 3, 5, 6] -> 3
     * [1, 2, 3] -> 0
     * [5, 5, 5, 5, 5, 6] -> 4
     * */

    public static int ponavljanjeBroj(int[] arr) {
        TreeSet<Integer> skup = new TreeSet<>();
        for (int i = 0; i < skup.size(); i++) {
            skup.add(arr[i]);
        }
        return arr.length - skup.size();
    }

    /*
     * 5. Provera permutacije
     * Za dva zadata niza brojeva proveriti da li moze da se jedan dobije od drugog.
     * Brojevi u nizu se ne ponavljaju
     *
     * NPR:
     * [1, 2, 221, 101], [101, 2, 221, 1] -> da
     * [1, 2, 3], [3, 1, 2, 4] -> ne
     * */

    public static boolean permutacija(ArrayList<Integer> p1, ArrayList<Integer> p2) {
        if (p1.containsAll(p2) && p1.size() == p2.size()) {
            return true;
        } else
            return false;
    }



    /*
     * 6. Neuparen element
     * Funkciji se prosledjuje niz ciji se svi elementi ponavljaju tacno dva puta,
     * osim jednog koji se ponavlja samo jednom.
     * Vratiti taj element
     *
     * Npr:
     * [1, 1, 2, 3, 3, 4, 4] -> 2
     * */

    public static int neuparen(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            if (set.add(i))
                set.remove(i);
            System.out.println(set);
        }
        return set.first();

    }


    /*
     * 7. Anagram
     * Funkcija prima 2 String i daje odgovor da/ne u odnosu na to da li je
     * jedan String anagram drugog.
     *
     * NPR:
     * "panta redovno zakasni"
     * "neopravdan izostanak"
     * Da
     * */

    public static boolean anagram(String s1, String s2) {
        return false;
    }

}
