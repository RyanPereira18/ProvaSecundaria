/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postodegasolina;

/**
 *
 * @author 15894822637
 */
public class Venda {
    private double valor;
    private double totalVenda;
    private Cliente cli;
    private Produto pro;
    private Veiculo veiculo;
    
    private static int id = 0;
    private int identificador;
    
    public Venda(double valor, double totalVenda, Cliente cli, Produto pro, Veiculo veiculo){
        this.valor = valor;
        this.totalVenda = totalVenda;
        this.cli = cli;
        this.pro = pro;
        this.veiculo = veiculo;
        id++;
        this.identificador = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Produto getPro() {
        return pro;
    }

    public void setPro(Produto pro) {
        this.pro = pro;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Venda.id = id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    

    
    
}
