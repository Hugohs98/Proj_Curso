/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_curso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugoh
 */
public class Curso {
    private int numero;
    private String nome;
    private List<Disciplina> lista;
    
    public Curso (int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        lista = new ArrayList<Disciplina>();
    }
    
    public void adicionaDisciplina(Disciplina disciplina) {
        lista.add(disciplina);
    }
    
    public void imprimir(){
        System.out.println("Curso:" + nome);
        System.out.println("Numero:" + numero);
        
        System.out.println("Disciplinas:");
        for (int i = 0; i < lista.size(); i++) {
            Disciplina disciplina = lista.get(i);
            System.out.print("*");
            disciplina.imprime();                    
        }
    }
    
    public int calculaTotalHora() {
        int total = 0;
        for (int i = 0; i<lista.size(); i++) {
            Disciplina disciplina = lista.get(i);
            total = total + disciplina.calcularHora();     
        }
        System.out.println("A carga horária total é:" + total);
        return total;
    }
    
    public int exibeMaiorCargaHoraria() {
        int max = 0;
        for (Disciplina disciplina : lista) {
            if(disciplina.calcularHora() > max) {
                max = disciplina.calcularHora();
            }    
        }
        System.out.println("A maior carga horária é de:" + max);
        return max;    
    }
}