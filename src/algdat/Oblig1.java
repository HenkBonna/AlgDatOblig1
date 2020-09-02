package algdat;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

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
        rotasjon(a, 1);
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k0) {
        // Ikke gjør noe hvis ingen eller ett element
        if (a.length < 2) {
            return;
        }

        // I tilfelle arrayet roterer mer enn en hel runde
        int k = k0 % a.length;

        if (k > 0) {
            // Roter mot høyre
            for (int i = 0; i < k; i++) {
                // Verdi som skal settes inn
                char temp = a[a.length - 1];

                for (int j = a.length - 1; j > 0; j--) {
                    // Flytt verdi til høyre
                    a[j] = a[j - 1];
                }

                // Sett inn igjen verdien vi tok ut
                a[0] = temp;
            }
        } else if (k < 0) {
            // Roter mot venstre
            for (int i = 0; i > k; i--) {
                // Verdi som skal settes inn
                char temp = a[0];

                for (int j = 0; j < a.length - 1; j++) {
                    // Flytt verdi til venstre
                    a[j] = a[j + 1];
                }

                // Sett inn igjen verdien vi tok ut
                a[a.length - 1] = temp;
            }
        }
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
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
