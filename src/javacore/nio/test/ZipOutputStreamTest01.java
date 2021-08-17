package javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta2/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta/subsubpasta");
        zip(arquivoZip, arquivosParaZipar);

    }

    private static void zip(Path arquivoZip, Path arquivoParaZipar) {
        try (ZipOutputStream streamZip = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)) {

            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                streamZip.putNextEntry(zipEntry);
                Files.copy(file, streamZip);
                streamZip.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
