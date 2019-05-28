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
public class Professor_Integral extends Professor{
    private double Salario_Professor_Integral;
    
    public double getSalario_Professor_Integral(){
        return this.Salario_Professor_Integral;
    }
    
    public void setSalario_Professor_Integral(double s){
        this.Salario_Professor_Integral = s;
    }
    
    public Professor_Integral(String n, int i, int m, double s){
        super(n, i, m);
        this.setSalario_Professor_Integral(s);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome_Professor());
        System.out.println("Idade: " + this.getIdade_Professor());
        System.out.println("Matricula: " + this.getMatricula_Professor());
        System.out.println("Salário: " + this.getSalario_Professor_Integral());
    }
}
