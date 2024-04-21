
/**
 * This class defines a basic Forest.
 *
 * @Cristopher Encarnacion
 * @4/12/2024
 */

public class Forest extends Terrain
{
    private int trees;

    public Forest(int l, int w, int tree)
    {
        super(l,w);
        trees = tree;
    }

    public String getForestSize()
    {
        return ("Forest " + getTerrainSize() + " and has " + trees + " trees");
    }
}