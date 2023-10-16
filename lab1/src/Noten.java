import java.util.Arrays;

public class Noten {

    public int[] array;

    public Noten(int[] arr)
    {

        this.array = arr;
    }

    public int[] nichtAusreichend(){

        int[] arrNotfinal={};
        int[] nichtAusreichend={};
        for(int i = array.length-1; i > -1; i--){
            int mult= ((array[i]/5)*5)+5;
            arrNotfinal = Arrays.copyOf(arrNotfinal, arrNotfinal.length + 1);
            if(array[i]-mult<3){
                arrNotfinal[arrNotfinal.length-1] = mult ;
            }
            else
                arrNotfinal[arrNotfinal.length-1] = array[i] ;
        }
        for (int i = arrNotfinal.length-1; i > -1; i--){
            if(arrNotfinal[i]<40){
                nichtAusreichend = Arrays.copyOf(nichtAusreichend, nichtAusreichend.length + 1);
                nichtAusreichend[nichtAusreichend.length-1] = arrNotfinal[i] ;
            }
        }
        return nichtAusreichend;
    }

    public int duchschnitt(){

        int[] arrNotfinal={};
        int wertfinal=0;
        for(int i = array.length-1; i > -1; i--){
            int mult= ((array[i]/5)*5)+5;
            arrNotfinal = Arrays.copyOf(arrNotfinal, arrNotfinal.length + 1);
            if(array[i]-mult<3){
                arrNotfinal[arrNotfinal.length-1] = mult ;
            }
            else
                arrNotfinal[arrNotfinal.length-1] = array[i] ;
        }
        for (int i = arrNotfinal.length-1; i > -1; i--) {
            wertfinal=wertfinal+arrNotfinal[i];
        }
        wertfinal=wertfinal/arrNotfinal.length;
        return wertfinal;
    }

    public int[] gerundeteNoten(){
        int[] arrNotfinal={};
        for(int i = array.length-1; i > -1; i--){
            int mult= ((array[i]/5)+1)*5;
            arrNotfinal = Arrays.copyOf(arrNotfinal, arrNotfinal.length + 1);
            if(((array[i]-mult)<3)&&(array[i]>38)){
                arrNotfinal[arrNotfinal.length-1] = mult ;
            }
            else
                arrNotfinal[arrNotfinal.length-1] = array[i] ;
        }
        return arrNotfinal;
    }

    public int grossteGerundete(){
        int[] arrNotfinal={};
        int grosste=-1;
        for(int i = array.length-1; i > -1; i--){
            int mult= ((array[i]/5)*5)+5;
            arrNotfinal = Arrays.copyOf(arrNotfinal, arrNotfinal.length + 1);
            if(array[i]-mult<3){
                arrNotfinal[arrNotfinal.length-1] = mult ;
            }
            else
                arrNotfinal[arrNotfinal.length-1] = array[i] ;
        }
        for(int i = arrNotfinal.length-1; i > -1; i--){
            if(arrNotfinal[i]>grosste){
                grosste=arrNotfinal[i];
            }
        }
        return grosste;
    }
}
