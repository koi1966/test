package WorkingWithFiles;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindFile {
    private static final Path DIRECTORY = Paths.get("c://rsc1840");
    private static final String MASK = "a";

    public static void main(String[] args) throws IOException {

//        final List<Path> result = new ArrayList<>();
//
//        Files.walkFileTree(DIRECTORY, new SimpleFileVisitor<Path>() {
//
//            @Override
//            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                if (FilenameUtils.getBaseName(file.getFileName().toString()).contains(MASK)) {
//                    result.add(file);
//                }
//                return FileVisitResult.CONTINUE;
//            }
//        });
//
//        System.out.println(result);
    }
}
