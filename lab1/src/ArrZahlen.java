public class ArrZahlen {
    public int[] array;

    public ArrZahlen(int[] arr)
    {

        this.array = arr;
    }

    public int maximZahl()throws Exception{
        if(array.length==0){
            throw new Exception("Arr empty");
        }
        int a=-1;
        for(int i=0; i<array.length; i++){
            if(array[i]>a)
                a=array[i];
        }
        return a;
    }

    public int minZahl() throws Exception{
        if(array.length==0){
            throw new Exception("Arr empty");
        }
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < a)
                a = array[i];
        }
        return a;
    }

    public int maxSumme()throws Exception{
        if(array.length==0){
            throw new Exception("Arr empty");
        }
        int a= minZahl();
        int summe= 0;
        for(int i=0; i< array.length; i++) {
            if (array[i] !=a)
                summe=summe+array[i];
        }
        return summe;
    }

    public int minSumme()throws Exception{
        if(array.length==0){
            throw new Exception("Arr empty");
        }
        int a= maximZahl();
        int summe= 0;
        for(int i=0; i< array.length; i++) {
            if (array[i] !=a)
                summe=summe+array[i];
        }
        return summe;
    }
}
