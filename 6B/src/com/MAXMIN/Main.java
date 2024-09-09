package com.MAXMIN;

public class Main {
	public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 8, 2};
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array - Max: " + intMinMax.findMax(intArray));
        System.out.println("Integer Array - Min: " + intMinMax.findMin(intArray));

        String[] strArray = {"banana", "apple", "cherry", "date"};
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array - Max: " + strMinMax.findMax(strArray));
        System.out.println("String Array - Min: " + strMinMax.findMin(strArray));

        Character[] charArray = {'z', 'a', 'm', 'b'};
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array - Max: " + charMinMax.findMax(charArray));
        System.out.println("Character Array - Min: " + charMinMax.findMin(charArray));

        Float[] floatArray = {3.5f, 2.1f, 5.5f, 1.2f};
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array - Max: " + floatMinMax.findMax(floatArray));
        System.out.println("Float Array - Min: " + floatMinMax.findMin(floatArray));
    }
}
