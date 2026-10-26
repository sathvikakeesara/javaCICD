public class AppTest {
    public static void main(String[] args) {
        if (App.add(10, 20) == 30) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.exit(1);
        }
    }
}