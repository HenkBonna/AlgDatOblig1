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

    /* Notes on 7a
    There is quite possibly a simpler method of handling this, with a StringBuilder, a String or even
    an arrayList. However, I tried to make it adaptable to other data-types than chars/strings. Hence,
    I created empty arrays to be filled, and then –later– be displayed.
    */
    public static String flett(String s, String t) {

        // TODO this throw below me
        //throw new UnsupportedOperationException();

        // TODO: make tests to see if it ACTUALLY works

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

        // TODO: make tests to see if it ACTUALLY works


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

        // TODO: implement this throw
        // throw new UnsupportedOperationException();

        // TODO: make tests to see if it ACTUALLY works

        int[] temp = a.clone(); //  First we copy the array, so we can alter it.

        int max_val = temp[0];
        for (int i = 1; i < temp.length; ++i) { // This block finds the largest value in the array
            if (temp[i] > max_val) {
                max_val = temp[i];
            }
        }

        int[] indicesSorted = new int[a.length];    // Create an empty array to be filled with the sorted indices

        for(int i = 0; i < indicesSorted.length; ++i){  // For each position in the empty array,
            int minIndex = 0;
            for (int j = 1; j < temp.length; ++j){      // we search for the smallest value
                if (temp[j] < temp[minIndex]){
                    minIndex = j;
                }
            }
            indicesSorted[i] = minIndex;                // and add it to the current position.
            temp[minIndex] = max_val+i;                 // Finally, we (hackily) assure that this value won't be the next.
        }
        // If we were to look at the temp array, we would see that all it's values are larger than –or equal to–
        // the largest entry in a. This is a sorta hacky solution, to be sure, but it works.

        return indicesSorted;

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
