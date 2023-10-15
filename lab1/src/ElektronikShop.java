public class ElektronikShop {

    public int[] tastatur;
    public int[] usb;

    public ElektronikShop(int[] tastatur, int[] usb)
    {
        this.tastatur = tastatur;
        this.usb = usb;
    }

    public int billigsteTastatur(){
        int billigste= tastatur[0];
        for(int i=1; i<tastatur.length;i++){
            if(tastatur[i]<billigste)
                billigste=tastatur[i];
        }
        return billigste;
    }
}
