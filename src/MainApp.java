import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

//        1st resolution
//        int firstIndex = numbers[0];
//        int lastIndex = numbers[numbers.length-1];
//        numbers[0] = lastIndex;
//        numbers[numbers.length-1] = firstIndex;

//        2nd resolution
//        int firstIndex = numbers[0];
//        numbers[0] = numbers[numbers.length-1];
//        numbers[numbers.length-1] = firstIndex;

        //3rd resolution
        numbers[numbers.length-1] = numbers[numbers.length-1] + numbers[0]; //6
        numbers[0] = numbers[numbers.length-1] -  numbers[0]; //5
        numbers[numbers.length-1] = numbers[numbers.length-1] - numbers[0];//1



        for (int number : numbers) {
            System.out.println(number);
        }

    }
}

