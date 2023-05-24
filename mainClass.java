public class mainClass {

    public static void main(String[] args) {

        GameArena game = new GameArena(900, 600, true);

        Rectangle rectangle = new Rectangle(75, 75, 750, 450, "WHITE");
        game.addRectangle(rectangle);
        
        Ball ball = new Ball(450, 300, 24, "BLACK", 6);
        game.addBall(ball);
        
        Ball innerMiddle = new Ball(450, 300, 117, "WHITE", 4);
        game.addBall(innerMiddle);
        
        Ball outerMiddle = new Ball(450, 300, 120, "BLUE", 3);
        game.addBall(outerMiddle);
        
        Ball mallet1 = new Ball(725, 300, 75, "BLUE", 6);
        game.addBall(mallet1);
        
        Ball mallet2 = new Ball(225, 300, 75, "BLUE", 6);
        game.addBall(mallet2);
        
        Line line1 = new Line(75, 75, 825, 75, 30, "BLUE", 9);
        game.addLine(line1);
        
        Line line2 = new Line(75, 75, 75, 525, 30, "BLUE", 9);
        game.addLine(line2);
        
        Line line3 = new Line(75, 525, 825, 525, 30, "BLUE", 9);
        game.addLine(line3);
        
        Line line4 = new Line(825, 75, 825, 525, 30, "BLUE", 9);
        game.addLine(line4);
        
        Line line5 = new Line(810, 188, 810, 412, 9, "GREY", 7);
        game.addLine(line5);
        
        Line line6 = new Line(90, 188, 90, 412, 9, "GREY", 7);
        game.addLine(line6);
        
        Line line7 = new Line(450, 75, 450, 525, 1, "BLUE", 1);
        game.addLine(line7);

        while (true) {
            if (game.upPressed()) {
                
                mallet1.setYPosition(mallet1.getYPosition() - 5);
            }

            if (game.downPressed()) {
                
                mallet1.setYPosition(mallet1.getYPosition() + 5);
            }

            if (game.leftPressed()) {
                
                mallet1.setXPosition(mallet1.getXPosition() - 5);
            }

            if (game.rightPressed()) {
                
                mallet1.setXPosition(mallet1.getXPosition() + 5);
            }

            if (game.letterPressed('W')) {

                mallet2.setYPosition(mallet2.getYPosition() - 5);
            }

            if (game.letterPressed('S')) {

                mallet2.setYPosition(mallet2.getYPosition() + 5);
            }

            if (game.letterPressed('A')) {

                mallet2.setXPosition(mallet2.getXPosition() - 5);
            }

            if (game.letterPressed('D')) {

                mallet2.setXPosition(mallet2.getXPosition() + 5);
            }

            
            game.pause();
            
        }
    }
}
