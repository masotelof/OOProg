public class Producto {
    private String Codigo;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Talla;
    private Float Precio;

    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getTalla() {
        return Talla;
    }
    public void setTalla(String talla) {
        Talla = talla;
    }
    public Float getPrecio() {
        return Precio;
    }
    public void setPrecio(Float precio) {
        Precio = precio;
    }

    public Producto(String codigo, String marca, String modelo, String color, String talla, Float precio) {
        Codigo = codigo;
        Marca = marca;
        Modelo = modelo;
        Color = color;
        Talla = talla;
        Precio = precio;
    }

}
