import java.util.ArrayList;
import java.util.Collections;

public class no3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 12, 9, 13, 6, 10, 4, 7, 2);
        System.out.println("n = " + removeThree(arr));
    }

    public static ArrayList<Integer> removeThree(ArrayList<Integer> n) {
        ArrayList<Integer> container = new ArrayList<>();
        for (Integer integer : n) {
            if (integer % 3 != 0) {
                container.add(integer);
            }
        }
        Collections.sort(container);
        return container;
    }
}
