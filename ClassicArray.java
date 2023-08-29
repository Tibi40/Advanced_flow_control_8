import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicArray {

    public static void main(String[] args) {
        int[] classicArray = {1, 2, 3};
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new ArrayList<>();

        /* Intr-un Arraylist, poti sa setezi cate numere vrei
        intr-un LinkedList, ai un numar presetat,
        deci daca avem un numer presetat de valori,
        v-om folosi LinkedList, deoarece ocupa mai putin spatiu in memoria RAM
        (folosita pentru procesare), decat ArrayList => LinkedList
        va fi compilat mai rapid
         */
        myArrayList.add("value1");
        myArrayList.add("value2");

        //int[] classicArray = {1, 2, 3};
        //                    0  1  2
        System.out.println("array length: " + classicArray.length);
        System.out.println("array value from index 1: " + classicArray[1]);














        for(int i = 0; i < classicArray.length; i++) {
            //code goes here
            System.out.println("array value from index " + i + "is" + classicArray[i]);
        }

        for(int arrayValue : classicArray){
            String arrayValue;
            System.out.println("Print from for-each loop: " + arrayValue);
        }

















        List<String> anotherArrayList = new ArrayList<>();
        Random random = new Random();

            for(int i = 0; i < 100; i++) {
            String listValue = "ion" + random.nextInt(1,200) + "@gmail.com";
            anotherArrayList.add(listValue);
            System.out.println(listValue);

        }
        System.out.println("end");

    }
}
