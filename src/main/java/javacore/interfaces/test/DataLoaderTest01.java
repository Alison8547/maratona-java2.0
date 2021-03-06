package javacore.interfaces.test;

import javacore.interfaces.dominio.DataLoader;
import javacore.interfaces.dominio.DatabaseLoader;
import javacore.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
        System.out.println(DataLoader.MAX_DATA_SIZE);

    }
}
