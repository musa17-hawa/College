public class Tester{
public static void main(String[] args) {
			
			         SpecialRobot a1 = new SpecialRobot ("A");
			         SpecialRobot a2 = new SpecialRobot ("B", 5, 10, 3);
			         //1
			         if (a2.getFacing() == 3 && a2.getName() == "B" && a2.getPositionX() == 5 && a2.getPositionY() == 10)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //2
			         if (a1.getFacing() == 1 && a1.getName() == "A" && a1.getPositionX() == 0 && a1.getPositionY() == 0)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad.");
			         //3
			         a1.move();
			         if (a1.getPositionY() == 1 && a1.getPositionX() == 0)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //4
			         a1.turnRight();
			         if (a1.getFacing() == 2)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //5
			         a1.move();
			         if (a1.getPositionY() == 1 && a1.getPositionX() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //6
			         a1.turnRight();
			         if (a1.getFacing() == 3)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         System.out.println(a1);
			         //7
			         a1.move();
			         if (a1.getPositionY() == 0 && a1.getPositionX() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         
			         //8
			         a1.move();
			         if (a1.getPositionY() == 0 && a1.getPositionX() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //9
			         
			         a1.turnRight();
			         if (a1.getFacing() == 4)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         
			         //10
			         a1.move();
			         if (a1.getPositionY() == 0 && a1.getPositionX() == 0)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //11
			         a1.move();
			         if (a1.getPositionY() == 0 && a1.getPositionX() == 0)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //12
			         a1.turnRight();
			         if (a1.getFacing() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //13
			         a1.turnLeft();
			         if (a1.getFacing() == 4)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //15
			         a1.turnLeft();
			         if (a1.getFacing() == 3)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //16
			         a1.turnLeft();
			         if (a1.getFacing() == 2)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //17
			         a1.turnLeft();
			         if (a1.getFacing() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //18
			         MoreSpecialRobot a3 = new MoreSpecialRobot("C");
			         if (a3.getFacing() == 1 && a3.getName() == "C" && a3.getPositionX() == 0 && a3.getPositionY() == 0 && a3.getBattery() == 100)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //19
			         MoreSpecialRobot a4 = new MoreSpecialRobot("D", 5, 10, 3);
			         if (a4.getFacing() == 3 && a4.getName() == "D" && a4.getPositionX() == 5 && a4.getPositionY() == 10 && a4.getBattery() == 100)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //20
			         a3.move();

			         if (a3.getPositionY() == 1 && a3.getPositionX() == 0 && a3.getBattery() == 99)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //21
			         a3.turnRight();
			         if (a3.getFacing() == 2)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //22
			         a3.move();
			         if (a3.getPositionY() == 1 && a3.getPositionX() == 1 && a3.getBattery() == 98)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //23
			         a3.turnRight();
			         if (a3.getFacing() == 3)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //24
			         a3.move();
			         if (a3.getPositionY() == 0 && a3.getPositionX() == 1 && a3.getBattery() == 97)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //25
			         a3.move();
			         if (a3.getPositionY() == 0 && a3.getPositionX() == 1 && a3.getBattery() == 97)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("25 Bad");
			         //26
			         a3.turnRight();
			         if (a3.getFacing() == 4)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //27
			         a3.move();
			         if (a3.getPositionY() == 0 && a3.getPositionX() == 0 && a3.getBattery() == 96)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("27 Bad");
			         //28
			         a3.move();
			         if (a3.getPositionY() == 0 && a3.getPositionX() == 0 && a3.getBattery() == 96)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("28 Bad");
			         //29
			         a3.turnRight();
			         if (a3.getFacing() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //30
			         a3.turnLeft();
			         if (a3.getFacing() == 4)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //31
			         a3.turnLeft();
			         if (a3.getFacing() == 3)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //32
			         a3.turnLeft();
			         if (a3.getFacing() == 2)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //33
			         a3.turnLeft();
			         if (a3.getFacing() == 1)
			             System.out.println("Good. Next!");
			         else
			             System.out.println("Bad");
			         //34

			         for (; a3.getBattery() > 0; a3.move());
			         a3.move();
			         if (a3.getPositionY() == 96 && a3.getPositionX() == 0)
			             System.out.println("Good!");
			         else
			            System.out.println("Bad");
			     }
			 }