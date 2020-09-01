package algdat;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if(a.length == 0){
            return 0;
        } else if (a.length == 1){
            return 1;
        }

        int different = 1;
        boolean seen = false;

        for(int i = 1; i < a.length; i++){
            for (int j = 0; j < i; j++){
                if(a[j] == a[i]){
                    seen = true;
                    break;
                }
            }
            if (!seen){
                different++;
            } else {
                seen = false;
            }
        }
        return different;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        if (a.length < 3){
            throw new NoSuchElementException("Array has to few elements");
        }
        int[] begynnelse = {a[0], a[1], a[2]};
        begynnelse = indekssortering(begynnelse);
        int minIndex = begynnelse[0], nestMinIndex = begynnelse[1], tredjeMinIndex = begynnelse[2],
        min = a[minIndex], nestMin = a[nestMinIndex], tredjeMin = a[tredjeMinIndex];

        for (int i = 3; i < a.length; i++){
            if (a[i] < tredjeMin){

                if (a[i] < nestMin){
                    
                    if (a[i] < min){ //nytt minstetall
                        tredjeMin = nestMin; //flytter nestminst til tredjeminst
                        nestMin = min; //flytter forrige minst til nestminst
                        min = a[i]; //oppdaterer minst

                        tredjeMinIndex = nestMinIndex; //flytter indeks til nest minst til indeks til tredjeminst
                        nestMinIndex = minIndex; //flytter indeks til forrige minst til nest minst
                        minIndex = i; //lagrer ny minste indeks
                    } else { //nytt nestminstetall
                        tredjeMin = nestMin; //flytter nestminst til tredjeminst
                        nestMin = a[i]; //lagrer ny  nestminst

                        tredjeMinIndex = nestMinIndex; //flytter indeks til nest minst til indeks til tredjeminst
                        nestMinIndex = i; //lagrer ny nestminst indeks
                    }
                } else { //nytt tredjeminstetall
                    tredjeMin = a[i]; //lagrer ny tredjeminst

                    tredjeMinIndex = i; //lagrer ny tredjeminst indeks
                }
            }
        }


        int[] indekser = {minIndex, nestMinIndex, tredjeMinIndex};
        return indekser;
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
