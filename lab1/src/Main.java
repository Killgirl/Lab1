import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = {1,3,6,2};
        int[] array2 = {1,1,4,1};
        int[] arrShop = {10, 60, 25, 80};
        int[] arrShop2 = {15, 30, 20, 40, 50};

        TestNoten.testNichtAusreichend();
        TestNoten.testGerundeteNoten();
        TestNoten.testDurchschnitt();
        TestNoten.testGrossteGerundete();
        TestArrZahlen.testMinZahl();
        TestArrZahlen.testMaxZahl();
        TestArrZahlen.testMinSumme();
        TestArrZahlen.testMaxSumme();
        TestGrosseZahlen.testSumme();
        TestGrosseZahlen.testDifferenz();
        TestGrosseZahlen.testMultiplikation();
        TestGrosseZahlen.testDivision();

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