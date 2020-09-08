package algdat;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        assertEquals(true, false, "Implementer maks og denne testen");
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        assertEquals(true, false, "Implementer ombyttinger og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        assertEquals(true, false, "Implementer antallUlikeSortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        // Test kun selve sorteringen, ikke partall/oddetall
        int[] a = {2, 4, 6, 14, 18, 22, 102, 10, 16, 12};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(new int[]{2, 4, 6, 10, 12, 14, 16, 18, 22, 102}), Arrays.toString(a));

        // Test kun selve sorteringen, men med negative
        a = new int[]{2, 4, 6, 14, -18, 22, 102, -10, 16, 12};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(new int[]{-18, -10, 2, 4, 6, 12, 14, 16, 22, 102}), Arrays.toString(a));

        // Test med to tall, splitting av partall og oddetall
        a = new int[]{2, 1};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(a));

        // Full test
        a = new int[]{2, 1, 3, 4, 19, 16};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(new int[]{1, 3, 19, 2, 4, 16}), Arrays.toString(a));

        // Full test med negative tall
        a = new int[]{2, 1, 3, -4, 19, 16, -1};
        Oblig1.delsortering(a);
        assertEquals(Arrays.toString(new int[]{-1, 1, 3, 19, -4, 2, 16}), Arrays.toString(a));
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        // Tester oppgave 5
        char[] a = {'A', 'B', 'C'};
        Oblig1.rotasjon(a);

        assertEquals(Arrays.toString(new char[]{'C', 'A', 'B'}), Arrays.toString(a));

        // Tester oppgave 6
        char[] b = {'A', 'B', 'C', 'D', 'E'};
        Oblig1.rotasjon(b, 2);

        System.out.println(Arrays.toString(b));
        assertEquals(Arrays.toString(new char[]{'D', 'E', 'A', 'B', 'C'}), Arrays.toString(b));

        char[] c = {'A', 'B', 'C', 'D', 'E'};
        Oblig1.rotasjon(c, -2);
        assertEquals(Arrays.toString(new char[]{'C', 'D', 'E', 'A', 'B'}), Arrays.toString(c));

        // Test tid
        char[] x = new char[100_000];
        long tid = System.currentTimeMillis();
        Oblig1.rotasjon(x, 50_000);
        tid = System.currentTimeMillis() - tid;

        System.out.println("rotasjon brukte " + tid + "ms.");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        assertEquals(true, false, "Implementer inneholdt og denne testen");
    }
}