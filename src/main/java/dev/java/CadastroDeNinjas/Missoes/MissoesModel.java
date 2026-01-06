package dev.java.CadastroDeNinjas.Missoes;

import dev.java.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String missoes;

   private Character dificuldade;

   //@OneToMany -> Uma missao pode ter vários ninjas
   @OneToMany(mappedBy = "missoes")
   private List <NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nomeMissoes, Character dificuldade) {
        this.missoes = nomeMissoes;
        this.dificuldade = dificuldade;
    }

    public String getMissoes() {
        return missoes;
    }

    public void setMissoes(String missoes) {
        this.missoes = missoes;
    }

    public Character getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Character dificuldade) {
        this.dificuldade = dificuldade;
    }
}


