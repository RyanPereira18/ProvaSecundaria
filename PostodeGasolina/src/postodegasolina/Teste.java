/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postodegasolina;

import java.util.Scanner;

/**
 *
 * @author 15894822637
 */
public class Teste {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
         Cliente cli = new Cliente();
         Produto pro = new Produto();
         Veiculo veiculo = new veiculo();
         
         System.out.println("Insira o nome do Cliente:");
         cli.setNome(entrada.nextLine());
         System.out.println("Insira o nome do Produto:");
         pro.setNome(entrada.next());
         System.out.println("Insira o nome do Veiculo:");
         veiculo.setTipoVeiculo(entrada.next());
    }
}
