package org.example.lesson4;

public class Box {
    private Integer ballsCount;

    public Box() {
        this.ballsCount = 0;
    }


    public Integer getBallsCount() {
        return ballsCount;
    }



    public void shuffleBalls() throws NullPointerException{
        if (ballsCount <= 0) throw new NullPointerException("Нельзя перемешать пустую коробку");
    }

    public void addBall() {
        ballsCount++;
    }

    public void removeBall() throws BallsCountZeroException {
        if (ballsCount == 0) throw new BallsCountZeroException();
        ballsCount--;
    }
}
