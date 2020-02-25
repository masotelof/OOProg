package Productos;

public class Reproduccion extends Producto{
    private String Marca;
    private String Modelo;
    private Float Potencia;
    private String Tipo;

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
    public Float getPotencia() {
        return Potencia;
    }
    public void setPotencia(Float potencia) {
        Potencia = potencia;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
