package controller;
import java.lang.classfile.ClassFile.Option;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class VeiculoController {
    private List<Veiculo> veiculos;

    public VeiculoController(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public Optional<Veiculo> buscaVeiculo(String modelo){
        return veiculos.stream()
            .filter(v -> v.getModelo().equalsIgnoreCase(modelo))
            .findFirst();
            //.orElse(null);
    }
    public boolean alterarVeiculo(String modelo, Veiculo novoVeiculo){
        Optional<Veiculo> veiculoEncontrado = buscaVeiculo(modelo);
        if (veiculoEncontrado.isPresent()) {
            //Veiculo teste = veiculoEncontrado.get();
            veiculos.remove(veiculoEncontrado.get());
            veiculos.add(novoVeiculo);
            return true;
        }
        return false;
    }

    public void ordernarPorANo(){
        veiculos = veiculos.stream()
            .sorted(Comparator.comparingInt(Veiculo::getAno).reversed())
            .collect(Collectors.toList());

        //Collection.sort(veiculos, comparingInt(Veiculo::getAno));
    }

    public boolean excluirVeiculo(String modelo){
        Optional<Veiculo> veiculoEncotrado = buscaVeiculo(modelo);
        return veiculoEncotrado.map(veiculos::remove).orElse(false);
    }
    public List<Veiculo> listarVeiculos(){
        return veiculos;
    }

    public List<Moto> listarMotos(){
        return veiculos.stream()
            .filter(v -> v instanceof Moto)
            .map(m -> (Moto) m)
            .collect(Collectors.toList());
    }
    public List<Carro> listarCarro(){
        return veiculos.stream()
            .filter(v -> v instanceof Carro)
            .map(c -> (Carro) c)
            .collect(Collectors.toList());
    }
}
