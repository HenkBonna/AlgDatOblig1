package algdat;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c'};

        Oblig1.rotasjon(chars, 3);

        // Henk tests //
        System.out.println("Test av 7a: ");
        System.out.println(Oblig1.flett("ABCD","abcdefgh"));
        System.out.println(Oblig1.flett("ABCDEFGHIS","abcdefgh"));
        System.out.println(Oblig1.flett("ABCD","abcd"));
        System.out.println(Oblig1.flett("ABCDEFGHIJKLMNO","abcd"));
        System.out.println(Oblig1.flett("",""));
        System.out.println();
        System.out.println("Test av 7b:");
        System.out.println(Oblig1.flett("AM ","L","GEDS","ORATKRR","","R TRTE","IO","TGAUU"));
        System.out.println(Oblig1.flett("AAA","aaa","cccCCCC", "444"));
        System.out.println();
        System.out.println("Test av 8:");

        //int[] a = {6,10,16,11,7,12,3,8,9,5};
        //int[] a = {6,10,9,4,1,3,8,5,2,7};
        int[] a = {1,3,5,9,19,13,21};
        //int[] a = Oblig1Test.randPerm(20);

        int[] indeks = Oblig1.indekssortering(a);

        for(int i=0;i<a.length;++i) {
            System.out.print(a[indeks[i]] + " ");
        }
        System.out.println();



        System.out.println("Test av 4:");
        System.out.println(Arrays.toString(a));
        Oblig1.delsortering(a);
        System.out.println(Arrays.toString(a));

    }
}
