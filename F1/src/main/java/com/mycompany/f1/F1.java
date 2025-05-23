package com.mycompany.f1;

import java.util.*;

public class F1 {

    public static void main(String[] args) {
        String[] words = {
            "Aaron", "Caleb", "Alice", "Daniel", "Emma", "Alexander", "Benjamin", "Brianna", "Diana", "Elijah", "Joshua", "Katherine", "Gabriel", "Leah",
            "Grace", "Kevin", "Charlotte", "Hannah", "Isaac", "Liam", "Penelope", "Patrick", "Jacob", "Isabella", "Matthew", "Jasmine", "Lucas", "Maddison", "Owen", "Noah", "Olivia",
            "Samuel", "Steven", "Thomas", "Tristan", "Quentin", "Rachel", "Sarah", "Yasmine", "Sophia", "Zachary", "Mia", "Uriel", "Xander", "Vanessa", "Zoe", "Nathan", "Victor", "William"
        };

        String[] bubbleSorted = Arrays.copyOf(words, words.length);
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(bubbleSorted));

        String[] selectionSorted = Arrays.copyOf(words, words.length);
        selectionSort(selectionSorted);
        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(selectionSorted));

        String[] insertionSorted = Arrays.copyOf(words, words.length);
        insertionSort(insertionSorted);
        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(insertionSorted));
    }

    public static void bubbleSort(String[] names) {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (names[j].compareTo(names[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = names[minIdx];
            names[minIdx] = names[i];
            names[i] = temp;
        }
    }

    public static void insertionSort(String[] names) {
        int n = names.length;
        for (int i = 1; i < n; i++) {
            String key = names[i];
            int j = i - 1;
            while (j >= 0 && names[j].compareTo(key) > 0) {
                names[j + 1] = names[j];
                j--;
            }
            names[j + 1] = key;
        }
    }
}

   

