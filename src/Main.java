import enums.Direction;
import enums.LampType;
import enums.PaintColor;
import model.*;

public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        //lamp1.turnOn();
        System.out.println("*****************************");

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        //ceiling.create();
        System.out.println("*****************************");

        Bed bed = new Bed("Double", 2, 2, 2, 2);
        System.out.println(bed.toString());
        System.out.println("*****************************");

        Wall northWall = new Wall(Direction.NORTH);
        Wall southWall = new Wall(Direction.SOUTH);
        Wall eastWall = new Wall(Direction.EAST);
        Wall westWall = new Wall(Direction.WEST);

        Wall[] walls = {northWall, southWall, eastWall, westWall};
        System.out.println("*****************************");

        Bedroom bedroom = new Bedroom(northWall, southWall, eastWall, westWall,
                ceiling, lamp1, new Carpet(2, 3, PaintColor.BLUE),
                "Ebeveyn", new Wardrobe(1, 3, 20), bed );

        System.out.println(bedroom);
        bedroom.createBedroom();


    }
}
