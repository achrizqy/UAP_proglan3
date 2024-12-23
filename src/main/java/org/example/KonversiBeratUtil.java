package org.example;

public class KonversiBeratUtil {

    public static double konversi(double berat, String satuanAsal, String satuanTujuan) {
        double beratDalamKg = 0;

        // Konversi ke kilogram
        switch (satuanAsal) {
            case "ton":
                beratDalamKg = berat * 1000;
                break;
            case "kg":
                beratDalamKg = berat;
                break;
            case "g":
                beratDalamKg = berat / 1000;
                break;
            case "mg":
                beratDalamKg = berat / 1000000;
                break;
            case "µg":
                beratDalamKg = berat / 1000000000;
                break;
            case "pound":
                beratDalamKg = berat * 0.453592;
                break;
            case "ons":
                beratDalamKg = berat * 0.0283495;
                break;
            case "stone":
                beratDalamKg = berat * 6.35029;
                break;
            case "ton (imperial)":
                beratDalamKg = berat * 1016.05;
                break;
        }

        // Konversi dari kilogram ke satuan tujuan
        switch (satuanTujuan) {
            case "ton":
                return beratDalamKg / 1000;
            case "kg":
                return beratDalamKg;
            case "g":
                return beratDalamKg * 1000;
            case "mg":
                return beratDalamKg * 1000000;
            case "µg":
                return beratDalamKg * 1000000000;
            case "pound":
                return beratDalamKg / 0.453592;
            case "ons":
                return beratDalamKg / 0.0283495;
            case "stone":
                return beratDalamKg / 6.35029;
            case "ton (imperial)":
                return beratDalamKg / 1016.05;
            default:
                throw new IllegalArgumentException("Satuan tujuan tidak valid.");
        }
    }
}
