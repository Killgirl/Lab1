public class TestArrZahlen {

    public static void testMaxZahl() throws Exception{

        int[] array = {1,3,6,2};
        ArrZahlen arr = new ArrZahlen(array);
        int[] array1 ={};
        ArrZahlen arr2 = new ArrZahlen(array1);
        assert(arr.maximZahl()==6);
        try {
            arr2.maximZahl();
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
        int[] array1 ={};
        ArrZahlen arr2 = new ArrZahlen(array1);
        assert (arr.minZahl()==1);
        try {
            arr2.minZahl();
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
        int[] array1 ={};
        ArrZahlen arr2 = new ArrZahlen(array1);
        assert (arr.minSumme()==6);
        try {
            arr2.minSumme();
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
        int[] array1 ={};
        ArrZahlen arr2 = new ArrZahlen(array1);
        assert (arr.maxSumme()==11);
        try {
            arr2.maxSumme();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }

    }
}
