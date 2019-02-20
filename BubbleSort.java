import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args){
        ArrayList<Integer> integarList = new ArrayList<Integer>();
        for(int i = 10; i > 0; i--){
            integarList.add(i);
        }
        System.out.println(bubbleSort(integarList));
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsortedIntegars) {
        for(int j = unsortedIntegars.size(); j > 0; j--)
            for(int i = 0; i < unsortedIntegars.size(); i++){
                int firstNum = unsortedIntegars.get(i);
                // for(int j = i + 1; j < unsortedIntegars.size(); j++){
                    if((i + 1) < unsortedIntegars.size()){
                        int secondNum = unsortedIntegars.get(i + 1);
                        if(firstNum > secondNum){
                            // int temp = firstNum;
                            unsortedIntegars.set(i, secondNum);
                            unsortedIntegars.set(i + 1, firstNum);
                            System.out.println("unsortedIntegars after a sort: " + unsortedIntegars);
                        }
                    }
                    
                //}
            }
        return unsortedIntegars;
    }
}