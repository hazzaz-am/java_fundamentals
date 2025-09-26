package Arrays;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<ArrayList<Integer>> multiArr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            multiArr.add(new ArrayList<>());
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                multiArr.get(row).add(col);
            }
        }

        System.out.println(multiArr);
    }
}