import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {


        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Ilosc liczb parzystych: "+even);
        System.out.println("Ilosc liczb nieparzystych: "+odd);


    }
}

