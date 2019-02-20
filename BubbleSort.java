import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {
    public static void main(String[] args){
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(4);
        integerList.add(9);
        integerList.add(1);
        System.out.println(bubbleSort(integerList));

        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
            randomList.add(randomNum);
        }

        ArrayList<Integer> tenList = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--){
            tenList.add(i);
        }
        System.out.println(randomList);

        System.out.println(bubbleSort(randomList));

        System.out.println(bubbleSort2(tenList));
    };

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsortedIntegers) {
        for(int j = 0; j < unsortedIntegers.size(); j++)
            for(int i = 0; i < unsortedIntegers.size() - j; i++){
                int firstNum = unsortedIntegers.get(i);
                    if((i + 1) < unsortedIntegers.size()){
                        int secondNum = unsortedIntegers.get(i + 1);
                        if(firstNum > secondNum){
                            unsortedIntegers.set(i, secondNum);
                            unsortedIntegers.set(i + 1, firstNum);
                            System.out.println("unsortedIntegers after a sort: " + unsortedIntegers);
                        }
                    }
            }
        return unsortedIntegers;
    };

    // Nicks bubblesort with one function refactored for testing
    public static ArrayList<Integer> bubbleSort2(ArrayList<Integer> array){
        for(int s = 0; s < array.size()-1; s++){
            int firstNum = array.get(s);
            int secondNum = array.get(s+1);
            System.out.println("In the First part " + firstNum + " " + secondNum);

            if(firstNum > secondNum){
                array.set(s, secondNum);
                array.set(s +1, firstNum);
                System.out.println("In the bubbleSort 2 index of: " + s + " switched with " + secondNum + " index of: " + (s+ 1) + " siwtched with " + firstNum);

                System.out.println("Solo for loop array after a sort: " + array);
            }
        }
        // returning new array
        return array;
    }
}