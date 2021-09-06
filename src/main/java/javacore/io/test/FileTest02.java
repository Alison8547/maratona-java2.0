package javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isCreatedDiretorio = fileDiretorio.mkdir();
        System.out.println("Diretorio criado ? " + isCreatedDiretorio);

        File fileCreated = new File(fileDiretorio, "arquivo.txt");
        boolean isCreatedNewFile = fileCreated.createNewFile();
        System.out.println("Novo file criado ? " + isCreatedNewFile);

        File fileRenamed = new File(fileDiretorio, "arquivoRenomeado.txt");
        boolean isRenamed = fileCreated.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado ? " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado ? " + isDiretorioRenamed);


    }
}
