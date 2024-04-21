
/**
 * This class defines a basic Mountain.
 *
 * @Cristopher Encarnacion
 * @4/12/2024
 */

public class Mountain extends Terrain
{
    private int number;

    public Mountain(int l, int w, int n)
    {
        super(l,w);
        number = n;
    }

    public String getMountainSize()
    {
        return ("Mountain " + getTerrainSize() + " and has " + number + " mountains");
    }
}