import Academico.Aluno;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Kauan", LocalDate.of(2004, 5,4));
        System.out.println("Nome: " + aluno.getNome());
    }
}
