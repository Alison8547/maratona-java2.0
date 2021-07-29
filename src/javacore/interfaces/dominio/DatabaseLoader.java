package javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover { // implements pode implementar várias.
    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() { // Mas se eu quiser mudar eu posso, pra ser específico do banco de dados
        System.out.println("Fazendo checagem de permissões banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize class DatabaseLoader");
    }
}
