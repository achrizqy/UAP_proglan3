package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KonversiBeratUtilTest {

    @Test
    public void testKonversiTonToKg() {
        double hasil = KonversiBeratUtil.konversi(1, "ton", "kg");
        assertEquals(1000.0, hasil, 0.01);
    }

    @Test
    public void testKonversiKgToGram() {
        double hasil = KonversiBeratUtil.konversi(1, "kg", "g");
        assertEquals(1000.0, hasil, 0.01);
    }

    @Test
    public void testKonversiGramToMilligram() {
        double hasil = KonversiBeratUtil.konversi(2, "g", "mg");
        assertEquals(2000.0, hasil, 0.01);
    }

    @Test
    public void testKonversiPoundToKg() {
        double hasil = KonversiBeratUtil.konversi(2, "pound", "kg");
        assertEquals(0.91, hasil, 0.01); // 2 pound ~ 0.91 kg
    }

    @Test
    public void testInvalidUnit() {
        try {
            KonversiBeratUtil.konversi(1, "invalid", "kg");
        } catch (IllegalArgumentException e) {
            assertEquals("Satuan tujuan tidak valid.", e.getMessage());
        }
    }
}
