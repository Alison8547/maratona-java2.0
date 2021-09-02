package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.dominio.Country;
import javacore.padroesdeprojeto.dominio.Currency;
import javacore.padroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
