package factory;
import model.Carro;
import model.Cores;
public abstract class CarroFactory {
    public static Carro criarCarro(String marca, String modelo, int ano, Cores cor, String motor){
        return new Carro(marca, modelo, ano, cor, motor);
    }
}
