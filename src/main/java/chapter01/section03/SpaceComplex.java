package chapter01.section03;

import java.util.HashMap;
import java.util.Map;


/**
 * @author: deng
 * @datetime: 2020/6/4 2:57 下午
 * @desc: 空间复杂度
 */
public class SpaceComplex {
    void fun1(int n) {
        int var = 3;
        //do something
    }


    void fun2(int n) {
        int[] array = new int[n];
        //do something
    }

    void fun3(int n) {
        int[][] matrix = new int[n][n];
        //do something
    }

    void fun4(int n) {
        if (n <= 0) {
            return;
        }
        fun4(n - 1);
        //do something
    }

    public static void main(String[] args) {
        int[] intArray = {3, 1, 2, 5, 4, 9, 7, 2, 9};
        Map map = new HashMap<>();
        System.out.println(map);
        int value = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (map.containsKey(intArray[i])) {
                value = (int) map.get(intArray[i]);
            }

            if (value < 1) {
                map.put(intArray[i], 1);
            } else {
                map.put(intArray[i], value + 1);
            }

        }
        map.forEach((k, v) -> {
            if ((int) v > 1) {
                System.out.println(k);
            }
        });


    }
}

