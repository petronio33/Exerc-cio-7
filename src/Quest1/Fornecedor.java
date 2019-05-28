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
public class Fornecedor extends Pessoa{
    
    private double ValorCredito;
    private double ValorDivida;
    
    public double getValorCredito(){
        return this.ValorCredito;
    }
    
    public double getValorDivida(){
        return this.ValorDivida;
    }
    
    public void setValorCredito(double c){
        this.ValorCredito = c;
    }
    
    public void setValorDivida(double d){
        this.ValorDivida = d;
    }
    
    public double ObterSaldo(double s){
        s = this.getValorCredito()- this.getValorDivida();
        return s;
    }
     
    public Fornecedor(String n, String e, String t, double c, double d){
        super(n, e, t);
        this.setValorCredito(c);
        this.setValorDivida(d);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome_Pessoa());
        System.out.println("Endereço: " + this.getEndereço_Pessoa());
        System.out.println("Telefone: " + this.getTelefone_Pessoa());
       
        System.out.println("Valor Crédito: " + this.getValorCredito());
        System.out.println("Valor Dívida: " + this.getValorDivida());
        System.out.println("Saldo: " + this.ObterSaldo(ValorDivida));
    }
}
