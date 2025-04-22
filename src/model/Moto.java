package model;

public final class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, int ano, Cores cor, String cilindrada) {
        super(marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }
    @Override
    public String mover() {
        return null;
    }
    private String empinar(){
        return "moto " +marca+ " " +modelo+ " " + "esta empinando ";
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", ano=" + ano + ", cor="
                + cor + ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca() + ", getModelo()="
                + getModelo() + ", getAno()=" + getAno() + ", getCor()=" + getCor() + "]";
    }

    
    
}
