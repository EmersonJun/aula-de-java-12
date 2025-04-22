package model;

public final class Carro extends Veiculo {
    private String modelo;

    public Carro(String marca, String modelo, int ano, Cores cor, String modelo2) {
        super(marca, modelo, ano, cor);
        modelo = modelo2;
    }
    @Override
    public String mover(){
        return "carro se movendo";
    }
    private String arrancar(){
        return "carro " +marca+ " " +modelo+ " " + "esta arrancando ";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", getModelo()="
                + getModelo() + ", getMarca()=" + getMarca() + ", getAno()=" + getAno() + ", getCor()=" + getCor()
                + "]";
    }

 
}
