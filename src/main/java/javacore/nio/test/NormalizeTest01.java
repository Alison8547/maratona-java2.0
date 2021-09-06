package javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorio = "home/alison/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorio, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./alison/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
