import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println(Files.exists(Paths.get("libs/sqldelight-compiler-1.5.0-SNAPSHOT.jar")));
    }
}
