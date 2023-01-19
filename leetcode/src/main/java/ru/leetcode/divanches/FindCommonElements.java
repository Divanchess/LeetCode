package ru.leetcode.divanches;

import java.util.*;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] array3 = {3, 6, 9, 12, 15};
        System.out.println(search(array1, array2, array3));
        System.out.println(findCommonElements(array1, array2, array3));
    }

    public static List<Integer> search(int[] array1, int[] array2, int[] array3) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mapKeyCount = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            mapKeyCount.put(array1[i], mapKeyCount.getOrDefault(array1[i], 0) + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            mapKeyCount.put(array2[i], mapKeyCount.getOrDefault(array2[i], 0) + 1);
        }
        for (int i = 0; i < array3.length; i++) {
            mapKeyCount.put(array3[i], mapKeyCount.getOrDefault(array3[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mapKeyCount.entrySet()) {
            if (entry.getValue() == 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2, int[] array3) {
        List<Integer> common = new ArrayList<>();

        // индексы для прохода по массивам
        int i = 0, j = 0, k = 0;

        // Пока не достигнут конец одного из массивов
        while (i < array1.length && j < array2.length && k < array3.length) {
            // Если текущие элементы во всех массивах равны, то это общий элемент
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                common.add(array1[i]);
                i++;
                j++;
                k++;
            } else {
                // иначе нужно перейти к следующему элементу в массиве с наименьшим элементом
                if (array1[i] <= array2[j] && array1[i] <= array3[k]) {
                    i++;
                } else if (array2[j] <= array1[i] && array2[j] <= array3[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }

        return common;
    }
}

/**
 * Дано 3 отсортированных массива по возрастанию. Нужно вернуть список их общих элементов.
 */


/**
 * {1 , 3 , 5,  7,  9};
 * {1 , 6,  7 , 9,  10}
 * {1 , 4 , 6,  7,  12}
 *
 *
 *
 */