package view;

import java.util.ArrayList;

import controller.VeiculoController;
import factory.CarroFactory;
import factory.MotoFactory;
import model.Carro;
import model.Cores;
import model.Moto;
import model.Veiculo;

public class VeiculoView {
    public static void main(String[] args) {
        VeiculoController controller = new VeiculoController(new ArrayList<Veiculo>());

        Moto moto1 = MotoFactory.criarMoto("Honda", "CG", 2018, Cores.AZUL,"160cc");
        Moto moto2 = MotoFactory.criarMoto("Kawasaki", "Vulcan S", 2016, Cores.VERMELHO,"650cc");
        Moto moto3 = MotoFactory.criarMoto("Yamaha", "Mt-07", 2022, Cores.BRANCO,"600cc");

        Carro carro1 =  CarroFactory.criarCarro("Honda", "Fit", 2025, Cores.BRANCO, "1.5");
        Carro carro2 =  CarroFactory.criarCarro("VolksWagen", "Passat CC", 2020, Cores.VERMELHO, "3.0 V6");
        Carro carro3 =  CarroFactory.criarCarro("BMW", "M3 Competition", 2025, Cores.AZUL, "3.6 V6 BiTurbo");

        controller.adicionarVeiculo(carro1);
        controller.adicionarVeiculo(carro2);
        controller.adicionarVeiculo(carro3);
        controller.adicionarVeiculo(moto1);
        controller.adicionarVeiculo(moto2);
        controller.adicionarVeiculo(moto3);

        System.out.println("\nCarros");
        controller.listarCarro().forEach(System.out::println);
        
        System.out.println("\nMotos");
        controller.listarMotos().forEach(System.out::println);



    }
}
