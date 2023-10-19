import java.util.Arrays;

public class TestNoten {

    public static void testNichtAusreichend() throws Exception{

        int[] arrNoten = {39, 44, 57, 76, 80, 99, 17};
        Noten noten = new Noten(arrNoten);
        int[] arr2Noten = {};
        Noten noten1 = new Noten(arr2Noten);

        assert Arrays.equals(noten.nichtAusreichend(), new int[]{20});
        try {
            noten1.nichtAusreichend();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }

    public static void testGerundeteNoten() throws Exception{
        int[] arrNoten = {39, 44, 57, 76, 80, 99, 17};
        Noten noten = new Noten(arrNoten);
        int[] arr2Noten = {};
        Noten noten1 = new Noten(arr2Noten);

        assert Arrays.equals(noten.gerundeteNoten(), new int[]{17, 100, 85, 80, 60, 45, 40});
        try {
            noten1.gerundeteNoten();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testGrossteGerundete() throws Exception{
        int[] arrNoten = {39, 44, 57, 76, 80, 99, 17};
        Noten noten = new Noten(arrNoten);
        int[] arr2Noten = {};
        Noten noten1 = new Noten(arr2Noten);
        assert (noten.grossteGerundete()==100);
        try {
            noten1.grossteGerundete();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testDurchschnitt() throws Exception{
        int[] arrNoten = {39, 44, 57, 76, 80, 99, 17};
        Noten noten = new Noten(arrNoten);
        int[] arr2Noten = {};
        Noten noten1 = new Noten(arr2Noten);
        assert (noten.duchschnitt()==61);
        try {
            noten1.duchschnitt();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }
}
