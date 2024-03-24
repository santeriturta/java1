package com.example;

public class Main {
    public int[] dot1 = {0,0};
    public int[] dot2 = {0,3};

    int[][] matrix = {
        {1, 5, 7},
        {9, 3, 1},
        {0, 1, 1}
        };

    int[] array = {8, 3, 2, 7};

    public static void main(String[] args) {
        Main myMain = new Main();
        myMain.runTask();
    }
    
    public void runTask(){
        teht1 objektiTeht1 = new teht1();
       // System.out.println(objektiTeht1.calculateDistance(dot1, dot2));
       //objektiTeht1.drawTriangle(5);
      // objektiTeht1.largestNumOf2DMatrix(matrix);
      //System.out.println(objektiTeht1.sortArraySmallToBig(array));
     // objektiTeht1.sortArraySmallToBig(array);
        //System.out.println(objektiTeht1.isPalindrome("saippuakauppiaS"));
        objektiTeht1.secondsIntoHMS(219821894);
    }
}
