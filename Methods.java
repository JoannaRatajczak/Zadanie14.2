import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class Methods {


    static ArrayList<Integer> createArrayList(File file) throws FileNotFoundException {

        //System.out.println(file.exists());
        Scanner in = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();

        while (in.hasNextLine()) {

            int nextLine = in.nextInt();
            list.add(nextLine);
        }
        in.close();

        System.out.println(list.toString());

        return list;
    }

    static void inOrder(ArrayList<Integer> list) {
        System.out.println("Sortowanie:");
        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
    }

    static void duplicateElements(ArrayList<Integer> list) {

        Set<Integer> set = new HashSet<>(list);
        int quantity = 0;

        for (Integer i : set) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(i)) {
                    quantity++;
                }
            }
            System.out.println(i + "- ilość wystąpień: " + quantity);
            quantity = 0;
        }
    }


}




