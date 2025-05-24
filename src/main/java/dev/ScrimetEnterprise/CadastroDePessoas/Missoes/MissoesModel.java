package dev.ScrimetEnterprise.CadastroDePessoas.Missoes;

import dev.ScrimetEnterprise.CadastroDePessoas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String missionName;
    private String dificudade;
    private String descricao;
    //uma missao pode ter varios ninjas, mapeamento de tabelas para a conexao entre tabelas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
