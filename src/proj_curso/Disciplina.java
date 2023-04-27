/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_curso;

/**
 *
 * @author hugoh
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private int cargaHoraria;
    
    public Disciplina (String nome, int codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    public void imprime(){
        System.out.println("Disciplina:" + nome);
        System.out.println("Código:" + codigo);
        System.out.println("Carga Horária:" + cargaHoraria);
    }
    
    public int calcularHora() {
        return cargaHoraria;
    }
}

