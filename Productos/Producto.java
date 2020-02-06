class Producto{
    private String CodBarras, Nombre, Categoria;
    private Float Costo, Precio;
    private Integer Stock;

    public void setCodBarras(String value){
        CodBarras = value;
    }
    public String getCodBarras(){
        return CodBarras;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float costo) {
        Costo = costo;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float precio) {
        Precio = precio;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }
    
}