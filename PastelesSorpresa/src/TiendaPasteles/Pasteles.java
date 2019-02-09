
package TiendaPasteles;
//todos piden piden la masa, el sabor, la harina, el tipo que puede ser frías o normal, la dirección de  envío
public class Pasteles {
   public double masa;
   public String sabor;
   public String harina;
   public String tipo;
   public String direccionEnvio;
   public double costo;
   public double precioVenta;
   public double utilidad;

    public Pasteles(double masa, String sabor, String harina, String tipo, String direccionEnvio, double costo, double precioVenta, double utilidad) {
        this.masa = masa;
        this.sabor = sabor;
        this.harina = harina;
        this.tipo = tipo;
        this.direccionEnvio = direccionEnvio;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.utilidad = utilidad;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getHarina() {
        return harina;
    }

    public void setHarina(String harina) {
        this.harina = harina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    
   
   
}
