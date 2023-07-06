package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class HW_3 {
    public static void main(String[] args) {
        List<Integer> MainList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            MainList.add(rnd.nextInt(11));
        }
        System.out.println(MainList);
        Integer max = MainList.get(0);
        Integer min = MainList.get(0);
        for (int itm: MainList) {
            if(max < itm){
                max = itm;
            }
            if(min > itm){
                min = itm;
            }
        }
        System.out.printf("Максимальное: " + max + "\n");
        System.out.printf("Минимальное: " + min + "\n");
        Integer sred = MainList.get(Math.round(MainList.size()/2));
        System.out.printf("Среднее в массиве: " + sred + "\n");
        for (int i = 0; i < MainList.size(); i++) {
                if (MainList.get(i) % 2 == 0) {
                    System.out.println();
                    MainList.remove(i);
                }
            }
        System.out.println(MainList);
    }
}
