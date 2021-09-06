package javacore.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 15;  // public static final nem precisa colocar porque por padrão ele já é assim.
    void load();

    default void checkPermission() {  // Com default a partir do java 8 agora podemos criar um método com corpo e não dar o erro porque implementa o método se quiser
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){   // aqui também por padrão ele já é public
        System.out.println("Dentro do retrieveMaxDataSize interface");
    }
}
