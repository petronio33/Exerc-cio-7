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
public class Alunos_Especiais extends Alunos{
    
    private String disciplina_Graduacao;
    private String disciplina_PosGraduacao;
    
    public String getDisciplina_Graduacao() {
        return this.disciplina_Graduacao;
    }
    
    public String getDisciplina_PosGraduacao() {
        return this.disciplina_PosGraduacao;
    }
    
    public void setDisciplina_Graduacao(String g) {
        this.disciplina_Graduacao = g;
    }

    public void setDisciplina_PosGraduacao(String p) {
        this.disciplina_PosGraduacao = p;
    }
    
    public Alunos_Especiais(int m, String n, int i,String g, String p){
        super(m, n, i);
        this.setDisciplina_Graduacao(g);
        this.setDisciplina_PosGraduacao(p);
    }
}

