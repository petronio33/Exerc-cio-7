/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest4;

/**
 *
 * @author Petrônio
 */
public class Automovel extends Terrestres{
    
    private String Nome;
    private String Cor;
    private int Portas;
    private String Placa;
    
    public String getNome(){
        return this.Nome;
    }
    
    public String getCor(){
        return this.Cor;
    }
    
    public int getPortas(){
        return this.Portas;
    }
    
    public String getPlaca(){
        return this.Placa;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setCor(String co){
        this.Cor = co;
    }
    
    public void setPortas(int p){
        this.Portas = p;
    }
    
    public void setPlaca(String pl){
        this.Placa = pl;
    }
    
    public Automovel(double c, int r, String n, String co, int p, String pl){
        super(c, r);
        this.setNome(n);
        this.setCor(co);
        this.setPortas(p);
        this.setPlaca(pl);
    }
}
