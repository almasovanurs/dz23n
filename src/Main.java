import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       /* ArrayList тузунуз
        1ден 100го чейинки 50 сан менен толтурунуз
        Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
        Аларды консольго чыгарыныз*/

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
            if (numbers.get(i) % 2 == 1) {
                oddNumbers.add(numbers.get(i));
            } else {
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println("Random numbers: " + numbers);
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
    }

}

