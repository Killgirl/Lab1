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

    public int teuersteGegenstand(){
        int teuerste=tastatur[0];
        for(int i=1; i<tastatur.length;i++) {
            if (tastatur[i] > teuerste)
                teuerste = tastatur[i];
        }
        for(int i=0; i<usb.length;i++) {
            if (usb[i] > teuerste)
                teuerste = usb[i];
        }
        return teuerste;
    }

    public int usbKauf(int budget){
        int kaufen=-1;
        for(int i=0; i<usb.length;i++){
            if((usb[i]>kaufen)&&(usb[i]<budget)){
                kaufen=usb[i];
            }
        }
        return kaufen;
    }

    public int kauf(int budget){
        int kaufen=-1;
        for (int i=0;i<tastatur.length;i++){
            for (int j=0;j<usb.length;j++){
                if((tastatur[i]+usb[j]<budget)&&(tastatur[i]+usb[j]>kaufen))
                    kaufen=tastatur[i]+usb[j];
            }
        }
        return kaufen;
    }
}
