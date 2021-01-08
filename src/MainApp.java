public class MainApp {
    public static void main(String[] args) {

        int a = 32346;
        int b = 77897;
        int c = 43443;
        int d = 26323;

        int sumAB = a + b;
        int sumDC = c + d;

        if (sumAB % 2 == 0 && sumDC % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Liczby nie są jest parzyste");
        }
    }
}

