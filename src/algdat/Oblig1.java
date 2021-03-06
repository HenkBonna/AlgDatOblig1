package algdat;

////// Losning Oblig 1 ////////////////////////
// Sander Toien, s344045
// Mats Ove Vada, s340363
// Henrik Berhard Stangelang, s344104
// Patrick Snorreson Sletvold, s344102
// Kristian Kasin Wang, s344088

import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Det finnes ingen elementer i arrayet!");
        } else if (a.length == 1) {
            return a[0];
        } else {
            int[] temp = new int[1];
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    temp[0] = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp[0];
                }
            }
            return a[a.length - 1];
        }
    }

    public static int ombyttinger(int[] a) {
        int ombyttinger = 0;
        if (a.length == 0) {
            throw new NoSuchElementException("Det finnes ingen elementer i arrayet!");
        } else if (a.length == 1) {
            return 0;
        } else {
            int[] temp = new int[1];
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    temp[0] = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp[0];
                    ombyttinger++;
                }
            }
        }
        return ombyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int antallUlike = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                throw new IllegalStateException("Arrayet er ikke sortert!");
            } else if (a[i] > a[i - 1]) {
                antallUlike++;
            }
        }
        return antallUlike;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0) {
            return 0;
        } else if (a.length == 1) {
            return 1;
        }

        int different = 1;
        boolean seen = false;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                different++;
            } else {
                seen = false;
            }
        }
        return different;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        int n = a.length;

        if (n < 2) {
            // Hvis tabellen har mindre enn 2 elementer sa gjores ingen ting
            return;
        }
        int oddetall = 0;

        for (int i = 0; i < a.length; i++) {
            // Teller opp antall oddetall
            if (Math.abs(a[i] % 2) == 1) {
                oddetall++;
            }
        }

        //Hvis tabellen bestar kun av partall eller oddetall,
        //sa sorteres hele tabellen, hvis ikke, sa sorteres
        //hver sin side av tabellen, oddetall og partall separat.
        if (!(oddetall == 0 || oddetall > n)) {
            int v = 0;
            int h = n - 1;

            while (v < h) {
                while (Math.abs(a[v]) % 2 != 0) {
                    v++;
                    if (v == h) {
                        break;
                    }
                }
                while (Math.abs(a[h]) % 2 != 1 && h != v) {
                    h--;
                    if (v == h) {
                        break;
                    }
                }
                bytt(a, v, h);
            }

            // Sorter venstre/oddetall
            quicksort(a, 0, oddetall - 1);
            // Sorter hoyre/partall
            quicksort(a, oddetall, n - 1);
        } else {
            // Sorterer hele
            quicksort(a, 0, n - 1);
        }
    }

    public static void quicksort(int[] a, int v, int h) {
        if (v >= h) {
            return;
        }
        int pivot = partisjonerpivot(a, v, h, (v + h) / 2);

        quicksort(a, v, pivot - 1);
        quicksort(a, pivot + 1, h);
    }

    public static int partisjoner(int[] a, int v, int h, int pivot) {

        while (true) {
            while (v <= h && a[v] < pivot) {
                v++;
            }
            while (v <= h && a[h] >= pivot) {
                h--;
            }

            if (v < h) {
                bytt(a, v++, h--);
            } else {
                return v;
            }
        }
    }

    public static int partisjonerpivot(int[] a, int v, int h, int pivot) {
        bytt(a, pivot, h);
        int pivotpos = partisjoner(a, v, h - 1, a[h]);
        bytt(a, pivotpos, h);
        return pivotpos;
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        rotasjon(a, 1);
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k0) {
        // Ikke gjor noe hvis ingen eller ett element, eller k er 0.
        if (a.length < 2 || k0 % a.length == 0) {
            return;
        }

        // I tilfelle arrayet roterer mer enn en hel runde
        int k = k0 % a.length;

        // Bruker med effektiv algoritmen for nar k er 1 og -1
        // denne trenger ikke kloning av arrayet.
        // Hovedalgoritmen begynner lenger ned, ved else if (k > 0).
        if (k == 1) {
            // Roter mot hoyre

            // Verdi som skal settes inn
            char temp = a[a.length - 1];

            for (int j = a.length - 1; j > 0; j--) {
                // Flytt verdi til hoyre
                a[j] = a[j - 1];
            }

            // Sett inn igjen verdien vi tok ut
            a[0] = temp;
        } else if (k == -1) {
            // Roter mot venstre

            // Verdi som skal settes inn
            char temp = a[0];

            for (int j = 0; j < a.length - 1; j++) {
                // Flytt verdi til venstre
                a[j] = a[j + 1];
            }

            // Sett inn igjen verdien vi tok ut
            a[a.length - 1] = temp;
        } else if (k > 0) {
            // klon arrayet, sa vi kan finne igjen original verdi under rotering. Litt juks?
            char[] b = a.clone();

            // Roter mot hoyre
            for (int i = a.length - 1; i >= 0; i--) {
                // Indeks til tall som skal flyttes til i.
                int indeks = i - k;
                // Hvis indeksen er mindre enn 0, juster den
                if (indeks < 0) {
                    indeks += a.length;
                }

                // Flytt verdi til hoyre
                a[i] = b[indeks];
            }
        } else if (k < 0) {
            // klon arrayet, sa vi kan finne igjen original verdi under rotering
            char[] b = a.clone();

            // Roter mot venstre
            for (int i = 0; i <= a.length - 1; i++) {
                // Indeks til tall som skal flyttes til i.
                int indeks = i - k; // k er her negativ, sa vi bruker minus for a fa pluss
                // Hvis indeksen er mer enn siste indeks, juster den
                if (indeks > a.length - 1) {
                    indeks -= a.length;
                }

                // Flytt verdi til venstre
                a[i] = b[indeks];
            }
        }
    }

    ///// Oppgave 7 - Henk //////////////////////////////////////
    /// 7a)

    /* Notes on 7a
    There is quite possibly a simpler method of handling this, with a StringBuilder, a String or even
    an arrayList. However, I tried to make it adaptable to other data-types than chars/strings. Hence,
    I created empty arrays to be filled, and then –later– be displayed.
    */
    public static String flett(String s, String t) {
        char[] charArray_s = s.toCharArray();
        char[] charArray_t = t.toCharArray();

        char[] outArray = new char[charArray_s.length + charArray_t.length];

        ///////
        int shortestLength = charArray_s.length;
        int longestLength = 0; // Temp value

        if (charArray_t.length < charArray_s.length) {       // This if-else simply assigns the longest lenghts to variables
            shortestLength = charArray_t.length;
            longestLength = charArray_s.length;
        } else {
            longestLength = charArray_t.length;
        }

        ///////

        for (int i = 0; i < shortestLength; ++i) {   // This block assigns the initial values
            outArray[2 * i] = charArray_s[i];     // Using this type of indexing, we assign to every other value of out
            outArray[2 * i + 1] = charArray_t[i];
        }

        char[] restArray = new char[longestLength - shortestLength];    // Array to contain the rest of elements;
        if (charArray_s.length < charArray_t.length) {
            for (int i = shortestLength; i < longestLength; ++i) {
                restArray[i - shortestLength] = charArray_t[i];
            }
        }
        if (charArray_s.length > charArray_t.length) {
            for (int i = shortestLength; i < longestLength; ++i) {
                restArray[i - shortestLength] = charArray_s[i];
            }
        }

        for (int i = 0; i < restArray.length; ++i) {  // This block fills the rest
            outArray[shortestLength * 2 + i] = restArray[i];
        }

        String out = "";
        for (char c : outArray) {
            out += c;
        }
        return out;
    }

    /// 7b)
    public static String flett(String... s) {
        String out = "";
        int totalLength = 0;
        for (String str : s) {
            totalLength += str.length();    // This calculates the totalLength -> Could perhaps have a while statement instead, in the loop, would save costs
        }

        for (int j = 0; j < totalLength; ++j) {       // This double if block loops through each word, getting the relevant
            for (int i = 0; i < s.length; ++i) {    // letter. The trick is increasing 'i' before 'j' ( s[0][0] -> s[1][0] ...)
                if (s[i].length() > j) {
                    out += s[i].toCharArray()[j];
                }
            }
        }
        return out;
    }

    ///// Oppgave 8 - Henk //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        } else if (a.length == 1) {
            return new int[]{0};
        }

        int[] temp = a.clone(); //  First we copy the array, so we can alter it.

        int max_val = temp[0];
        for (int i = 1; i < temp.length; ++i) { // This block finds the largest value in the array
            if (temp[i] > max_val) {
                max_val = temp[i];
            }
        }

        int[] indicesSorted = new int[a.length];    // Create an empty array to be filled with the sorted indices

        for (int i = 0; i < indicesSorted.length; ++i) {  // For each position in the empty array,
            int minIndex = 0;
            for (int j = 1; j < temp.length; ++j) {      // we search for the smallest value
                if (temp[j] < temp[minIndex]) {
                    minIndex = j;
                }
            }
            indicesSorted[i] = minIndex;                // and add it to the current position.
            temp[minIndex] = max_val + 1;                 // Finally, we (hackily) assure that this value won't be the next.
        }
        // If we were to look at the temp array, we would see that all it's values are larger than –or equal to–
        // the largest entry in a. This is a sorta hacky solution, to be sure, but it works.

        return indicesSorted;
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        if (a.length < 3) {
            throw new NoSuchElementException("Array has to few elements");
        }
        int[] begynnelse = {a[0], a[1], a[2]};
        begynnelse = indekssortering(begynnelse);
        int minIndex = begynnelse[0], nestMinIndex = begynnelse[1], tredjeMinIndex = begynnelse[2],
                min = a[minIndex], nestMin = a[nestMinIndex], tredjeMin = a[tredjeMinIndex];

        for (int i = 3; i < a.length; i++) {
            if (a[i] < tredjeMin) {

                if (a[i] < nestMin) {

                    if (a[i] < min) { //nytt minstetall
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

        return new int[]{minIndex, nestMinIndex, tredjeMinIndex};
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        return bokstav;
    }

    public static boolean inneholdt(String a, String b) {
        if (a.equals("")) {  //En tom tegnstreng er inneholdt i alle andre ord, true.
            return true;
        }

        int[] antallA = new int[256];
        int[] antallB = new int[256];

        // Tell opp bokstaver i a
        for (int i = 0; i < a.length(); i++) {
            antallA[bokstavNr(a.charAt(i))]++;
        }

        // Tell opp bokstaver i b
        for (int i = 0; i < b.length(); i++) {
            antallB[bokstavNr(b.charAt(i))]++;
        }

        for (int i = 0; i < antallA.length; i++) {
            if (antallA[i] != 0 && antallA[i] > antallB[i]) {
                return false;
            }
        }
        return true;
    }
}  // Oblig1
