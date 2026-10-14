public class HelloTest {
    public static void main(String[] args) {
        if (!"Hello, World!".equals(Hello.message())) {
            throw new AssertionError("unexpected: " + Hello.message());
        }
        System.out.println("OK");
    }
}
