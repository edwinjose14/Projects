
package TiendaPasteles;

// contenido sorpresa, número de porciones.
public class PastelesSorpresa extends Pasteles {
   public String contedidoSorpresa;
   public int numeroPorciones;

    public PastelesSorpresa(String contedidoSorpresa, int numeroPorciones, double masa, String sabor, String harina, String tipo, String direccionEnvio, double costo, double precioVenta, double utilidad) {
        super(masa, sabor, harina, tipo, direccionEnvio, costo, precioVenta, utilidad);
        this.contedidoSorpresa = contedidoSorpresa;
        this.numeroPorciones = numeroPorciones;
    }

 





    public String getConedidoSorpresa() {
        return contedidoSorpresa;
    }

    public void setConedidoSorpresa(String conedidoSorpresa) {
        this.contedidoSorpresa = conedidoSorpresa;
    }

    public int getNumeroPorciones() {
        return numeroPorciones;
    }

    public void setNumeroPorciones(int numeroPorciones) {
        this.numeroPorciones = numeroPorciones;
    }

    
   
   
    
    
}
