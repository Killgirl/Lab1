public class ElektronikShop {

    public int[] tastatur;
    public int[] usb;

    public ElektronikShop(int[] tastatur, int[] usb)
    {
        this.tastatur = tastatur;
        this.usb = usb;
    }

    public int billigsteTastatur(){
        int billigste= -1;
        for(int i=0; i<tastatur.length;i++){
            if(tastatur[i]<billigste)
                billigste=tastatur[i];
        }
        return billigste;
    }
}
