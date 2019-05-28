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
public class Professor {
    
    private String Nome_Professor;
    private int Idade_Professor;
    private int Matricula_Professor;
    
    public String getNome_Professor(){
        return this.Nome_Professor;
    }
    
    public int getIdade_Professor(){
        return this.Idade_Professor;
    }
    
    public int getMatricula_Professor(){
        return this.Matricula_Professor;
    }
    
    public void setNome_Professor(String n){
        this.Nome_Professor = n;
    }
    
    public void setIdade_Professor(int i){
        this.Idade_Professor = i;
    }
    
    public void setMatricula_Professor(int m){
        this.Matricula_Professor = m;
    }
    
    public Professor(String n, int i, int m){
        this.setNome_Professor(n);
        this.setIdade_Professor(i);
        this.setMatricula_Professor(m);
    }
}
