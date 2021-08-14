package javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pasta = Files.createDirectory(pastaPath);
        }
        Path pathsSub = Paths.get("pasta/subpasta/subsubpasta");
        Path filePath = Files.createDirectories(pathsSub);

        Path pathToString = Paths.get(pathsSub.toString(), "file.txt");
        if (Files.notExists(pathToString)) {
            Path file = Files.createFile(pathToString);
        }
        Path source = pathToString;
        Path target = Paths.get(pathToString.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
