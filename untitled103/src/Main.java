import java.util.*;
import java.util.Arrays;
import java.util.Iterator;


class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int i : intList) {
            Collections.sort(intList);
        }
        Iterator<Integer> i = intList.iterator();
        while (i.hasNext()) {
            int j = i.next();
            if (j > 0 & j % 2 == 0) {
                Collections.sort(intList);
                System.out.println(j);
            }
        }

        System.out.println();

        StreamMain streamMain = new StreamMain();
        streamMain.getStream();
    }
}
