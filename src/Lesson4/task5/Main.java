package Lesson4.task5;
//створити ArrayList зі словами на 15-20 елементів.
//– відсортувати його за алфавітом.
//– відфільтрувати слова довжиною менше ніж 4 символи

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("grapefruit");
        arrayList.add("mango");
        arrayList.add("kiwi");
        arrayList.add("strawberry");
        arrayList.add("blueberry");
        arrayList.add("watermelon");
        arrayList.add("peach");
        arrayList.add("cherry");
        arrayList.add("pineapple");
        arrayList.add("coconut");
        arrayList.add("papaya");
        arrayList.add("orange");
        arrayList.add("plum");
        arrayList.add("raspberry");
        arrayList.add("blackberry");
        arrayList.add("melon");
        arrayList.add("fig");
        arrayList.add("dragonfruit");

        arrayList.sort((String::compareTo));
        System.out.println("Після сортування:");
        System.out.println(arrayList);



        ArrayList<String> filtered = new ArrayList<>();

        for (String word : arrayList) {
            if (word.length() >= 4) {
                filtered.add(word);
            }
        }
        System.out.println("Після фільтрації:");
        System.out.println(filtered);
            }
        }




