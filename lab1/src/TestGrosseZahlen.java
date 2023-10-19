import java.util.Arrays;

public class TestGrosseZahlen {

    public static void testSumme() throws Exception{

        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array2);
        assert Arrays.equals(arr3.SummeArr(arr4), new int[]{2, 5, 0, 3});
        try {
            arr3.SummeArr(arr4);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testDifferenz() throws Exception{

        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array2);
        assert Arrays.equals(arr3.DifferenzArr(arr4), new int[]{2,2,1});
        try {
            arr3.DifferenzArr(arr4);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testMultiplikation() throws Exception{

        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array2);
        assert Arrays.equals(arr3.MultiplikationArr(9), new int[]{1, 2, 2, 5, 8});
        try {
            arr3.MultiplikationArr(9);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testDivision() throws Exception{
        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array2);
        assert Arrays.equals(arr3.DivisionArr(2), new int[]{6, 8, 1});
        try {
            arr3.DivisionArr(2);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }
}
