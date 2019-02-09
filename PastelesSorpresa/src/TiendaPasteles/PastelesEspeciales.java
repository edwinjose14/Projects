
package TiendaPasteles;

public class PastelesEspeciales extends Pasteles {
    //los especiales solicitan además número de pisos, color y decoración que puede ser lisa o con figuras
    public int numeroPiso;
    public String color;
    public String decoracion;

    public PastelesEspeciales(int numeroPiso, String color, String decoracion, double masa, String sabor, String harina, String tipo, String direccionEnvio, double costo, double precioVenta, double utilidad) {
        super(masa, sabor, harina, tipo, direccionEnvio, costo, precioVenta, utilidad);
        this.numeroPiso = numeroPiso;
        this.color = color;
        this.decoracion = decoracion;
    }







    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }
    
    
    
    
}
