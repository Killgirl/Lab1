import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {3,3,6};
        int[] array2 = {0,5,4};
        ArrZahlen arr = new ArrZahlen(array);

        System.out.println(arr.maximZahl());
        GrosseZahlen arr3 = new GrosseZahlen(array);
        GrosseZahlen arr4 = new GrosseZahlen(array);
        System.out.println(Arrays.toString(arr3.SummeArr(arr4)));
        GrosseZahlen arr5 = new GrosseZahlen(array2);
        System.out.println(Arrays.toString(arr3.DifferenzArr(arr5)));
        System.out.println(Arrays.toString(arr3.MultiplikationArr(3)));
        System.out.println(Arrays.toString(arr3.DivisionArr(2)));
    }
}