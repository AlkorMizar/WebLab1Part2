package by.bsuir.lab.part2.classes;

import java.util.Stack;

public class Basket {
    Stack<Ball> balls;
    float weight;

    public  Basket(){
        balls=new Stack<>();
        weight=0;
    }

    public  void addBall(Ball ball){
        balls.add(ball);
        weight+=ball.getWeight();
    }

    public  float getWeightOfBalls(){
        return weight;
    }

    public  int countBallsWithColor(Color color){
        int count=0;
        for (var ball:balls) {
            count+=ball.getColor()==color?1:0;
        }
        return count;
    }
}

