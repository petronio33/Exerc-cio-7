/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest3;

/**
 *
 * @author Petrônio
 */
public class Alunos_Graduacao extends Alunos{
    
    private String disciplina_Graduação;

    public String getDisciplina_Graduacao() {
        return this.disciplina_Graduação;
    }

    public void setDisciplina_Graduacao(String g) {
        this.disciplina_Graduação = g;
    }
    
    public Alunos_Graduacao(int m, String n, int i, String g){
        super(m, n, i);
        this.setDisciplina_Graduacao(g);
    }
    
}