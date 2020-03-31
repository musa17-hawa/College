public class RobotQA {  //Simple Ex1 tester by Refael. Caution: Doesn't test getters.
    public static void main(String[] args) {
        Robot bot1=new Robot("Bot1");
        Robot bot2=new Robot("Bot2",2,6,2);
        Robot bot3=new Robot("MisplacedBot",-3,-4,5);
       
        System.out.println(bot1);
        System.out.println(bot2);
        System.out.println(bot3);
        System.out.println("");
       
        SpecialRobot sbot1=new SpecialRobot("Sbot1");
        SpecialRobot sbot2=new SpecialRobot("Sbot2", 3, 5, 5);
        SpecialRobot sbot3=new SpecialRobot("SbotO", -435, -2, 3);
       
        System.out.println(sbot1);
        System.out.println(sbot2);
        System.out.println(sbot3);
        System.out.println("");
       
        MoreSpecialRobot bbot1=new MoreSpecialRobot("Lbot1");
        MoreSpecialRobot bbot2=new MoreSpecialRobot("Lbot2", 23, -7, 4);
       
        System.out.println(bbot1);
        System.out.println(bbot2);
        System.out.println("");
       
        bot2.turnLeft();
        bot2.move();
        bot2.move();
        sbot2.turnRight();
        sbot2.move();
        bbot2.turnRight();
        bbot2.move();
       
        System.out.println(bot2);
        System.out.println(sbot2);
        System.out.println(bbot2);
       
        for (int i=98; i>0; i--)
            bbot2.move();
        System.out.println(bbot2);
        bbot2.turnRight();
        bbot2.turnRight();
        for (int i=5; i>0; i--)
            bbot2.move();
        System.out.println(bbot2);
       
//      Output should be:
//      Robot Bot1 at (0,0) facing north
//      Robot Bot2 at (2,6) facing east
//      Robot MisplacedBot at (0,0) facing north
//
//      Robot Sbot1 at (0,0) facing north
//      Robot Sbot2 at (3,5) facing north
//      Robot SbotO at (0,0) facing south
//
//      Robot Lbot1 at (0,0) facing north. Battery at: 100%.
//      Robot Lbot2 at (23,0) facing west. Battery at: 100%.
//
//      Robot Bot2 at (2,8) facing north
//      Robot Sbot2 at (4,5) facing east
//      Robot Lbot2 at (23,1) facing north. Battery at: 99%.
//      Robot Lbot2 at (23,99) facing north. Battery at: 1%.
//      Robot Lbot2 at (23,98) facing south. Battery at: 0%.
    }
}