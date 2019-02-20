import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort{
    public static void main(String[] args){
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(4);
        integerList.add(9);
        integerList.add(1);

        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
            randomList.add(randomNum);
        }

        ArrayList<Integer> tenList = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--){
            tenList.add(i);
        }

        System.out.println(insertionSort(integerList));

        System.out.println(randomList + "Is the randomList");

        System.out.println(insertionSort(randomList));

        System.out.println(insertionSort(tenList));

    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        System.out.println(array);
        for(int i = 1; i < array.size(); i++){
            for(int j = i ; j > 0; j--){
                int firstNum = array.get(j-1);
                int secondNum = array.get(j);
                if(firstNum > secondNum){
                    array.set(j-1, secondNum);
                    array.set(j, firstNum);
                    System.out.println("All the magic: " + array);
                }
            }
        }
        return array;
    }
}