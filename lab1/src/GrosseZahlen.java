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

    public int[] DifferenzArr(GrosseZahlen other) {
        int[] arrfinal = {};
        int[] arrDiff = {};
        for(int i = array.length-1; i > -1; i--){
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
            arrfinal[arrfinal.length-1] = array[i]-other.array[i];
        }
        for(int i=0; i<arrfinal.length; i++) {
            if (arrfinal[i] < 0) {
                if (arrfinal.length != i + 1) {
                    arrfinal[i+1] = arrfinal[i+1]-1;
                    arrfinal[i] = 10+arrfinal[i];
                }
                else
                    i++;
            }
        }
        if(arrfinal[arrfinal.length-1]==0)
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length - 1);
        for(int i=arrfinal.length-1; i > -1; i--){
            arrDiff = Arrays.copyOf(arrDiff, arrDiff.length + 1);
            arrDiff[arrDiff.length-1] = arrfinal[i];
        }
        return arrDiff;
    }

    public int[] MultiplikationArr(int a) {
        int[] arrfinal = {};
        int[] arrMultiplik = {};
        for(int i = array.length-1; i > -1; i--){
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
            arrfinal[arrfinal.length-1] = array[i]*a;
        }
        for(int i=0; i<arrfinal.length; i++) {
            if (arrfinal[i] >= 10) {
                if (arrfinal.length == i + 1) {
                    arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
                    arrfinal[arrfinal.length - 1] = arrfinal[i] / 10;
                    arrfinal[i] = arrfinal[i] % 10;
                }
                else {
                    arrfinal[i + 1] = (arrfinal[i] / 10) + arrfinal[i + 1];
                    arrfinal[i] = arrfinal[i] % 10;
                }
            }
        }
        for(int i=arrfinal.length-1; i > -1; i--){
            arrMultiplik = Arrays.copyOf(arrMultiplik, arrMultiplik.length + 1);
            arrMultiplik[arrMultiplik.length-1] = arrfinal[i];
        }
        return arrMultiplik;
    }

    public int[] DivisionArr(int a) {
        int[] arrfinal = {};
        int[] arrDiv = {};
        int r=0;
        for(int i = 0; i < array.length; i++){
            arrfinal = Arrays.copyOf(arrfinal, arrfinal.length + 1);
            arrfinal[arrfinal.length - 1] =(10*r+array[i] )/ a;
            r=array[i]%a;
        }
        return arrfinal;
    }

}
