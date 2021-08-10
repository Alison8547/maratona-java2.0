package javacore.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeEUA = Locale.US;
        Locale localeJapao = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeItaly);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeEUA);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeJapao);

        double valor = 100_000_000.4654;

        for (NumberFormat nf : numberFormats) {
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(valor));
        }

        String valorString = "$1000.230";

        try {
            System.out.println(numberFormats[2].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
