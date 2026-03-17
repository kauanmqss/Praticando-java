import java.util.Date;
//Classe Aluno

class Aluno extends Pessoa {
    private int matricula;

    //Construtor
    public Aluno(String nome, String cpf, Date dataDeNascimento, int matricula){
        super(nome, cpf, dataDeNascimento);
        this.matricula = matricula;
    }

    // Getter e Setter específico para matrícula
    public int getMatricula (){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}