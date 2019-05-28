/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest2;

/**
 *
 * @author Petrônio
 */

public class TestarProfessor {
    
    public static void main(String[] args) {
        Professor_Integral p1 = new Professor_Integral("Emerson", 37, 200, 10000.00);
        Professor_Horista p2 = new Professor_Horista("Flávia", 30, 400, 10, 4.50);
        
        p2.Mostrar();
        p1.Mostrar();
        
    }
    
}