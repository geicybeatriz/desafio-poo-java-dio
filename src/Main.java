import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java basico");
        curso1.setDescricao("Descrição do curso java basico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Collections");
        curso2.setDescricao("Descrição do curso java collections");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Introdução ao Java Básico");
        mentoria1.setDescricao("Desbloqueando suas habilidades em java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Seja um dev Java com a DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Beatriz");
        dev1.increverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos dev1" + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---");
        System.out.println("Conteúdos incritos dev1" + dev1.getConteudosIncritos());
        System.out.println("Conteúdos concluidos dev1" + dev1.getConteudosConcluidos());
        System.out.println("XP - " + dev1.calcularTotalXp());


        System.out.println("--------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.increverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos dev2" + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos incritos dev2" + dev2.getConteudosIncritos());
        System.out.println("Conteúdos incritos dev2" + dev2.getConteudosConcluidos());
        System.out.println("XP - " + dev2.calcularTotalXp());
    }
}
