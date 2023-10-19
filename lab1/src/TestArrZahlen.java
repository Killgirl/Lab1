public class TestArrZahlen {

    public static void testMaxZahl() throws Exception{

        int[] array = {1,3,6,2};
        ArrZahlen arr = new ArrZahlen(array);
        assert(arr.maximZahl()==6);
        try {
            arr.maximZahl();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testMinZahl() throws Exception{
        int[] array = {1,3,6,2};
        ArrZahlen arr = new ArrZahlen(array);
        assert (arr.minZahl()==1);
        try {
            arr.minZahl();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }

    public static void testMinSumme() throws Exception{
        int[] array = {1,3,6,2};
        ArrZahlen arr = new ArrZahlen(array);
        assert (arr.minSumme()==6);
        try {
            arr.minSumme();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }

    public static void testMaxSumme() throws Exception{
        int[] array = {1,3,6,2};
        ArrZahlen arr = new ArrZahlen(array);
        assert (arr.maxSumme()==11);
        try {
            arr.maxSumme();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }
}
