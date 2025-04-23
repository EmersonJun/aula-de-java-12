package model;

public abstract class Veiculo {
    protected String marca, modelo;
    protected int ano;
    protected Cores cor;
    
    public Veiculo(String marca, String modelo, int ano, Cores cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    public abstract String mover();
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Cores getCor() {
        return cor;
    }
    public void setCor(Cores cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "\nVeiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + "]";
    }
}
