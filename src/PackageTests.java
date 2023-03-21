import java.util.List;

public class PackageTests {
    public static void main(String[] args) {
        System.out.println("Package test");
    }
}


 class Pug {
    public static void main(String[] args) {

        List<String> possibleNames= List.of(args);
        for (String name : possibleNames) {
            System.out.println("Maybe change in test should be called: " + name);   //  <Line 3>
        }
    }
}