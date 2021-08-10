package javacore.formatacao;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCount : isoCountries) {
            System.out.print(isoCount + " ");
        }
        System.out.println();
        for (String isoLan : isoLanguages) {
            System.out.print(isoLan + " ");
        }
    }
}
