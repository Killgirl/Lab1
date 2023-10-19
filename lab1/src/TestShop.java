public class TestShop {

    public static void testBilligsteTastatur() throws Exception{

        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};
        int[] arrShop3 = {};
        ElektronikShop shop2= new ElektronikShop(arrShop3, arrShop2);
        ElektronikShop shop1 =new ElektronikShop(arrShop, arrShop2);
        assert (shop1.billigsteTastatur()==10);
        try {
            shop2.billigsteTastatur();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testTeuersteGegenstand() throws Exception{

        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};
        int[] arrShop3 = {};
        ElektronikShop shop2= new ElektronikShop(arrShop3, arrShop2);
        ElektronikShop shop1 =new ElektronikShop(arrShop, arrShop2);
        assert (shop1.teuersteGegenstand()==80);
        try {
            shop2.teuersteGegenstand();
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testUsbKauf() throws Exception{
        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};
        int[] arrShop3 = {};
        ElektronikShop shop2= new ElektronikShop(arrShop3, arrShop2);
        ElektronikShop shop1 =new ElektronikShop(arrShop, arrShop2);
        assert (shop2.usbKauf(43)==40);
        try {
            shop1.usbKauf(43);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }
    }

    public static void testKauf() throws Exception{
        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};
        int[] arrShop3 = {};
        ElektronikShop shop2= new ElektronikShop(arrShop3, arrShop2);
        ElektronikShop shop1 =new ElektronikShop(arrShop, arrShop2);
        assert (shop2.kauf(43)==40);
        try {
            shop1.kauf(43);
            assert false;
        }
        catch(Exception e)
        {
            assert true;
        }


    }
}
