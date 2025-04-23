package factory;

import model.Cores;
import model.Moto;

public abstract class MotoFactory {

    public static Moto criarMoto(String marca, String modelo, int ano, Cores cor, String cilindrada) {
        return new Moto(marca, modelo, ano, cor, cilindrada);
    }
}
