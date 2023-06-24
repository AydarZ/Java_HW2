package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class hw2_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger log = Logger.getLogger(hw2_2.class.getName());
        FileHandler fh = new FileHandler("loggg.xml");
        log.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] arr = new int[] { 1000, 900, 800, 5, 1, 2, 300, -142, 123, 12, 32, -300, -400, -500 };
        for (int i = arr.length - 1; i >= 1; i--) {
            int[] arr2 = arr.clone();
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int shift = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = shift;
                }
            }
            arr = arr2.clone();
            System.out.println(Arrays.toString(arr));
            log.log(Level.INFO, "logg");
        }
    }
}
