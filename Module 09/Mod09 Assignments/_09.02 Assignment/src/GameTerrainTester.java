
/**
 * This class is a tester for Terrain objects.
 *
 * @Cristopher Encarnacion
 * @4/12/2024
 */

public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(150,240);
        System.out.println(terrain.getTerrainSize());

        Forest forest = new Forest(400, 400, 180);
        System.out.println(forest.getForestSize());

        Mountain mountain = new Mountain(600, 200, 12);
        System.out.println(mountain.getMountainSize());

        WinterMountain winterMountain = new WinterMountain(500, 500, 30, 12.34);
        System.out.println(winterMountain.getWinterMountainSize());
    }
}
