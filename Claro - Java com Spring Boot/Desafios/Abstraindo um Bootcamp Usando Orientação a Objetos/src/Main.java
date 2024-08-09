import java.time.LocalDate;
import java.util.Set;

import br.com.banco.dominio.Bootcamp;
import br.com.banco.dominio.Conteudo;
import br.com.banco.dominio.Curso;
import br.com.banco.dominio.Dev;
import br.com.banco.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {   

        Curso curso = new Curso();
        curso.setTitulo("Java Básico");
        curso.setDescricao("Sintaxe da linguagem Java e estruturas condicionais");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Estruturas de repetição e orientação a objetos");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Boot");
        mentoria.setDescricao("Spring Boot com Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp Java Developer com Spring Boot");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("José");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev.getConteudosIncritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos inscritos: " + dev.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        
        System.out.println("-----------------------------------------------------");

        Dev dev2 = new Dev("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        
    }
}
