package javacore.interfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission() {  // Com default a partir do java 8 agora podemos criar um método com corpo e não dar o erro porque implementa o método se quiser
        System.out.println("Fazendo checagem de permissões");
    }
}
