import java.util.Arrays;
public class GrosseZahlen {
    public int[] array;

    public GrosseZahlen(int[] arr)
    {
        this.array = arr;
    }
    public int[] SummeArr(GrosseZahlen other){
        int[] arrfinal={};
        int[] arrSumme={};
        for(int i = array.length-1; i > -1; i--){
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
            arrfinal[arrfinal.length-1] = array[i]+other.array[i];
        }
        for(int i=0; i<arrfinal.length; i++){
            if (arrfinal[i]>=10){
                if(arrfinal.length==i+1) {
                    arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
                    arrfinal[arrfinal.length-1] = arrfinal[i] / 10;
                    arrfinal[i] = arrfinal[i] % 10;
                }
                else {
                    arrfinal[i+1] = (arrfinal[i] / 10)+arrfinal[i+1];
                    arrfinal[i] = arrfinal[i] % 10;
                }
            }
        }
        for(int i=arrfinal.length-1; i > -1; i--){
            arrSumme = Arrays.copyOf(arrSumme, arrSumme.length + 1);
            arrSumme[arrSumme.length-1] = arrfinal[i];
        }
        return arrSumme;
    }



}
