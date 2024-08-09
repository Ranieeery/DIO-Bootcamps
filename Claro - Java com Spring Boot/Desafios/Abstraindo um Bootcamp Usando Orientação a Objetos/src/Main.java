import java.time.LocalDate;

import br.com.banco.dominio.Curso;
import br.com.banco.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Bootcamp Java");
        curso.setDescricao("Bootcamp Java Developer com Spring Boot");
        curso.setCargaHoraria(40);

        System.out.println(curso);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Boot");
        mentoria.setDescricao("Spring Boot com Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
