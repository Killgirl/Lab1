import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};

        ArrZahlen arr = new ArrZahlen(array);
        assert(arr.maximZahl()==6);
        //assert(arr.maximZahl()==2);
        assert (arr.minZahl()==1);
        //assert (arr.minZahl()==2);
        assert (arr.minSumme()==6);
        //assert (arr.minSumme()==12);
        assert (arr.maxSumme()==11);
        //assert (arr.maxSumme()==10);
        System.out.println("Teste Pb2");

        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array);
        assert (arr3.SummeArr(arr4)==new int[]{2, 5, 0, 3});
        //assert (arr3.SummeArr(arr4)==new int[]{2, 4, 10, 3});
        assert (arr3.DifferenzArr(arr4)==new int[]{2,2,1});
        //assert (arr3.SummeArr(arr4)==new int[]{0, 2, 2, 1});
        assert (arr3.MultiplikationArr(9)==new int[]{1, 2, 2, 5, 8});
        //assert (arr3.MultiplikationArr(9)==new int[]{12, 2, 5, 8});
        assert (arr3.DivisionArr(2)==new int[]{6, 8, 1});
        //assert (arr3.DivisionsArr(2)==new int[]{0, 6, 8, 1});
        System.out.println("Teste Pb3");

        ElektronikShop shop1 =new ElektronikShop(arrShop, arrShop2);
        assert (shop1.billigsteTastatur()==10);
        //assert (shop1.billigsteTastatur()==25);
        assert (shop1.teuersteGegenstand()==80);
        //assert (shop1.teuersteGegenstand()==60);
        assert (shop1.usbKauf(43)==40);
        //assert (shop1.usbKauf(43)==50);
        assert (shop1.kauf(43)==40);
        //assert (shop1.kauf(43)==-1);
        System.out.println("Teste Pb4");
        System.out.println("Teste");
    }
}