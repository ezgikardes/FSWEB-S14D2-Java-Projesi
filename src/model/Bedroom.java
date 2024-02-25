package model;

public class Bedroom extends Room{

    private String name;
    private Wardrobe wardrobe;
    private Bed bed;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, String name, Wardrobe wardrobe, Bed bed) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.name = name;
        this.wardrobe = wardrobe;
        this.bed = bed;
    }

    public String getName() {
        return name;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
    }

    @Override
    public String toString() {
        String room = super.toString();
        return "Bedroom{" +
                 room +
                "name='" + name + '\'' +
                ", wardrobe=" + wardrobe +
                ", bed=" + bed +
                '}';
    }
}
