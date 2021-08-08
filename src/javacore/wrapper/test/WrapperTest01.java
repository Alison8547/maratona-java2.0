package javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        int intP = 457;
        double doubleP = 15d;
        float floatP = 544f;
        long longP = 4564L;
        short shortP = 12;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 1;
        Integer intW = 457;
        Double doubleW = 15d;  // Autoboxing
        Float floatW = 544f;
        Long longW = 4564L;
        Short shortW = 12;
        Character charW = 'A';
        Boolean booleanW = true;

        int i = intW; // boxing
        Integer int2W = Integer.parseInt("15");
        System.out.println(int2W);
        Boolean verdadeiro = Boolean.parseBoolean(null);
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('S'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.toLowerCase('G'));


    }
}
