
/**
 * This class defines a basic Winter Mountain.
 *
 * @Cristopher Encarnacion
 * @4/12/2024
 */

public class WinterMountain extends Mountain
{
    private double temperature;

    public WinterMountain(int l, int w, int n, double temp)
    {
        super(l,w,n);
        temperature = temp;
    }

    public String getWinterMountainSize()
    {
        return ("Winter " + getMountainSize() + " and temperature " + temperature + " degrees");
    }
}