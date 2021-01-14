public class MainApp {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 8, 5, 8};

        int max;

        for(int i = 0;i<numbers.length;i++ ){
            max = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[j] > max){
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;

                }

            }

        }




        for (int number : numbers) {
            System.out.println(number);
        }


    }
}

