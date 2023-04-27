/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_curso;

/**
 *
 * @author hugoh
 */
public class Proj_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disciplina d1, d2, d3, d4;
        d1 = new Disciplina("Linguagens de programação", 100, 20);
        d2 = new Disciplina("Matemática discreta", 102, 40);
        d3 = new Disciplina("Calculo", 103, 40);
        d4 = new Disciplina("Engenharia de Software", 104, 60);
        
        Curso ads = new Curso(1234, "Análise de Sistemas");
        
        ads.adicionaDisciplina(d1);
        ads.adicionaDisciplina(d2);
        ads.adicionaDisciplina(d3);
        ads.adicionaDisciplina(d4);
        ads.imprimir();
        ads.calculaTotalHora();
        ads.exibeMaiorCargaHoraria();
        
        // TODO code application logic here
    }
    
}
