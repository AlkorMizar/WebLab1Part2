package by.bsuir.lab.part2;

import by.bsuir.lab.part2.classes.Ball;
import by.bsuir.lab.part2.classes.Basket;
import by.bsuir.lab.part2.classes.Color;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Basket basket=new Basket();
        Scanner sc=new Scanner(System.in);
        try {
            do {
                System.out.println("Enter 'F' if you want exit.");
                basket.addBall(new Ball(getColor(sc), getWeight(sc)));
            } while (true);
        }catch (Exception ignored){}
        System.out.println("Weight: "+basket.getWeightOfBalls());
        System.out.println("Amount of blue balls: "+basket.countBallsWithColor(Color.BLUE));
    }

    public static float getWeight(Scanner sc){
        System.out.println("Enter weight of ball");
        while (!sc.hasNextFloat()){
            if (sc.next().matches("[Ff]")){
                throw new UnsupportedOperationException("Shutdown");
            }
            System.out.println("Enter number");

        }
        return sc.nextFloat();
    }

    public  static Color getColor(Scanner sc){
        System.out.println("Enter color of ball\nVariants:"+ Arrays.toString(Color.values()));
        Color result=null;
        do{
            String color=sc.next();
            try{
                result=Color.valueOf(color);
            }catch (Exception e){
                if (color.matches("[Ff]")){
                    throw new UnsupportedOperationException("Shutdown");
                }
                System.out.println("You can choose colors from list.");
            }
        }while (result==null);
        return result;
    }
}
