package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;
import java.text.MessageFormat;

public class teht1 {

    public double calculateDistance(int[] dot1, int[] dot2){
        return Math.sqrt((Math.pow(dot1[0] - dot2[0],2))+(Math.pow(dot1[1] - dot2[1],2)));  
    }

    public void drawTriangle(int height){
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < (height-i)*2; j++) {
                System.out.printf("*");
            }
            System.out.printf("*%n");
        }
    }

    public int[] largestNumOf2DMatrix(int[][] matrix){
        int indexOfLargest = matrix[0][0];
        int[] arr = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if(matrix[row][column] > indexOfLargest)
                {
                    indexOfLargest = matrix[row][column];
                    arr[0] = row;
                    arr[1] = column;
                }
            }
        }

        int[] answer = {arr[0],arr[1]};
        return answer;
    }

    public int[] sortArraySmallToBig(int[] array){
        int[] sortedArray = array;
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(array));
        return sortedArray;
    }

    public boolean isPalindrome(String input){
        input = input.replaceAll("\\s", "");
        input = input.toLowerCase();
    
        int start = 0;
        int end = input.length() - 1;
    
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
    
        return true;
    }

    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
    
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
    
    public ArrayList<Integer> findPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int start = (int) Math.ceil(n / 2.0);
    
        for (int i = start; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String secondsIntoHMS(int seconds){

        int hours = seconds/3600;
        seconds = seconds - (hours * 3600);
        int minutes = seconds/60;
        seconds = seconds - (minutes * 60);

        String formattedTime = MessageFormat.format("{0,number,00}:{1,number,00}:{2,number,00}", hours,minutes,seconds);

        System.out.println(formattedTime);
        return formattedTime;
    }
    
    public static HashMap<String, ArrayList<Integer>> generateNumbers() {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("negative", new ArrayList<>());
        map.put("positive", new ArrayList<>());
        map.put("zero", new ArrayList<>());

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(101) - 50;
            if (num < 0) {
                map.get("negative").add(num);
            } else if (num > 0) {
                map.get("positive").add(num);
            } else {
                map.get("zero").add(num);
            }
        }
        return map;
    }
}
