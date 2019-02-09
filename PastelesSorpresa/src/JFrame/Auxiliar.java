
package JFrame;

import TiendaPasteles.*;

public class Auxiliar {
    protected static int total=0;
    protected static int totalT=0;
    protected static int totalE=0;
    protected static int totalS=0;
    protected static double costoT=0;
    protected static double costoE=0;
    protected static double costoS=0;
    protected static double utilidadT=0;
    protected static double utilidadE=0;
    protected static double utilidadS=0;
    protected static double ventaTotal=0;
    
    
    public static void proceso(Pasteles pastel){
        
        if(pastel instanceof PastelesTradicionales){
            totalT++;
            costoT+=pastel.getCosto();
            utilidadT+=pastel.getUtilidad();
                    
        }else if(pastel instanceof PastelesEspeciales){
            
            totalE++;
            costoE+=pastel.getCosto();
            utilidadE+=pastel.getUtilidad();
        }else{
            
            totalS++;
            costoS+=pastel.getCosto();
            utilidadS+=pastel.getUtilidad();
        }
        total++;
        ventaTotal+=pastel.getPrecioVenta();
        
    }
    
    public static Double costos(String masa){
        double costo;
        costo=(14950)*Double.parseDouble(masa)+800;
        return costo;
    }
    public static Double venta(double costo, int num){
        double venta=0;
        
        if(num==1){
            venta=costo+costo*0.5;
        return venta;
        }
        
        if(num==2){
            venta=costo+costo*0.7;
        return venta;
        }
        if(num==3){
            venta=costo+costo*0.9;
            return venta;
        }
        return venta;
    }
    
}
