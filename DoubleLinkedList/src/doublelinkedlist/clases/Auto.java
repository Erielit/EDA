package doublelinkedlist.clases;

public class Auto {

    private String marca;
    private int modelo;

    public Auto() {
    }

    public Auto(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "" + this.marca;
    }
}
