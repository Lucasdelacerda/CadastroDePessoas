package dev.ScrimetEnterprise.CadastroDePessoas.Ninjas;

import dev.ScrimetEnterprise.CadastroDePessoas.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
//criação de tabela
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    //Ele vai gerar o id como sequencial (auto_increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //um ninja tem uma unica missao
    @ManyToOne
    //enquanto na outra tabela e feito o mapeamento nessa anotation ela junta as 2 colunas
    @JoinColumn(name = "missoes_id")// foreing key ou chave estrangeira, ao juntar 2 tabelas se cria uma terceira com o nome de missoes_id
    private MissoesModel missoes;

    //vamos criar essa tabela, nela vai ter id nome da missão e dificuldade, uma tablea tem que se unir a outra para poder atribuir a missão, lembrar que cada missão pode ter mais de um ninja mas cada ninja só pode ser uma missão


    public NinjaModel() {
        //relacionamento entre tabelas de ninja e missão ultilizado as anotações OneToMay e o ManyToOne.


    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
