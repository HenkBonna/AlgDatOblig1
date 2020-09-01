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
        throw new UnsupportedOperationException();
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

    ///// Oppgave 7 - Henk //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {

        //TODO this throw below me
        //throw new UnsupportedOperationException();

        char[] charArray_s = s.toCharArray();
        char[] charArray_t = t.toCharArray();

        char[] outArray = new char[charArray_s.length + charArray_t.length];


        ///////
        int shortestLength = charArray_s.length;
        int longestLength = 0; // Temp value

        if(charArray_t.length < charArray_s.length){       // This if-else simply assigns the longest lenghts to variables
            shortestLength = charArray_t.length;
            longestLength = charArray_s.length;
        }
        else{
            longestLength = charArray_t.length;
        }

        ///////

        for (int i = 0; i < shortestLength; ++i){   // This block assigns the initial values
            outArray[2*i] = charArray_s[i];     // Using this type of indexing, we assign to every other value of out
            outArray[2*i + 1] = charArray_t[i];
        }

        char[] restArray = new char[longestLength - shortestLength];    // Array to contain the rest of elements;
        if (charArray_s.length < charArray_t.length){
            for (int i = shortestLength; i < longestLength; ++i){
                restArray[i-shortestLength] = charArray_t[i];
            }
        }
        if(charArray_s.length > charArray_t.length){
            for (int i = shortestLength; i < longestLength; ++i){
                restArray[i-shortestLength] = charArray_s[i];
            }
        }

        for(int i = 0; i < restArray.length; ++i){  // This block fills the rest
            outArray[shortestLength*2 + i] = restArray[i];
        }


        for (int i = 0; i < charArray_s.length; ++i){

        }
        String out = "";
        for (char c : outArray){
            out += c;
        }
        return out;
    }

    /// 7b)
    public static String flett(String... s) {

        //TODO this throw below me
        //throw new UnsupportedOperationException();


        String out = "";
        int totalLength = 0;
        for(String str : s){
            totalLength += str.length();    // This calculates the totalLength -> Could perhaps have a while statement instead, in the loop, would save costs
        }

        for (int j=0; j < totalLength; ++j) {       // This double if block loops through each word, getting the relevant
            for (int i = 0; i < s.length; ++i) {    // letter. The trick is increasing 'i' before 'j' ( s[0][0] -> s[1][0] ...)
                if(s[i].length() > j){
                    out += s[i].toCharArray()[j];
                }
            }
        }



        return out;
    }

    ///// Oppgave 8 - Henk //////////////////////////////////////
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
