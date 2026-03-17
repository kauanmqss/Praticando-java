import java.util.Date;

//Classe Pessoa

class Pessoa{
    private String nome;
    private String cpf;
    private Date dataDeNascimento;

    //Construtor

    public Pessoa(String nome, String cpf, Date dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Date getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}