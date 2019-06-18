import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/rtaj/Desktop/numbers.txt");
        ArrayList<Integer> list = Methods.createArrayList(file);
        Methods.inOrder(list);
        Methods.duplicateElements(list);

    }
}


