package com.example;

public class calculate {
    public double calculateCircleArea(double radius){
        double answer = (Math.PI * Math.pow(radius, 2));
        return answer;
    }

    public double calculateSquareArea(double squareSide){

        double answer = Math.pow(squareSide, 2);
        return answer;
    }

    public double calculateRightTriangleArea(double base, double height){
        double answer = (base * height) / 2;
        return answer;
    }
}
