package Productos;

public class Producto {
    protected String Sku;
    protected Float Precio;

    public String getSku() {
        return Sku;
    }
    public void setSku(String sku) {
        Sku = sku;
    }
    public Float getPrecio() {
        return Precio;
    }
    public void setPrecio(Float precio) {
        Precio = precio;
    }
}
