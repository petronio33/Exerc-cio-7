/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest1;

/**
 *
 * @author Petrônio
 */
public class Teste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Petrônio", "Rua Salmerom,690 - Centro Pirapora - MG", "38 3741-0000");
        Fornecedor f1 = new Fornecedor("Sicoob", "Rua Antonio Nascimento, n 179, Centro - Pirapora-MG", "3742-6250", 200.00, 120.00);
        Empregado e1 = new Empregado("Samuel ", "Rua A, 132, centro - Buritizeiro - MG", "38 3742-1661", "c1", 1200, 10);
        

        e1.Mostrar();

    }
}