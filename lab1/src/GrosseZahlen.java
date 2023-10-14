import java.util.Arrays;
public class GrosseZahlen {
    public int[] array;

    public GrosseZahlen(int[] arr)
    {
        this.array = arr;
    }
    public int[] SummeArr(GrosseZahlen other){
        int[] arrfinal={};
        for(int i=0; i< array.length; i++){
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
            arrfinal[arrfinal.length - 1] = array[i]+other.array[i];
        }
        return arrfinal;
    }



}
