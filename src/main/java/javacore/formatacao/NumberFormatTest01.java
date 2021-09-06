package javacore.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeEUA = Locale.US;
        Locale localeJapao = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeItaly);
        numberFormats[2] = NumberFormat.getInstance(localeEUA);
        numberFormats[3] = NumberFormat.getInstance(localeJapao);

        double valor = 100_000.4654;

        for (NumberFormat nf : numberFormats) {
            System.out.println(nf.format(valor));
        }

        String valorString = "1000.230";

        try {
            System.out.println(numberFormats[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
