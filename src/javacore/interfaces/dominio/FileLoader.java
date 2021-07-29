package javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissões do arquivo");
    }
}
