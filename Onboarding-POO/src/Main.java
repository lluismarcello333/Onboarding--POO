import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java DIO");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso de JavaScript DIO");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria JavaScript");
        mentoria.setDescricao("mentoria de JavaScript DIO");
        mentoria.setData(LocalDate.now());


        /*
        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteudos Inscritos de Luiz: " + devLuiz.getConteudosInscritos());
        
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();


        System.out.println("=");

        System.out.println("Conteudos Inscritos de Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXP());

        System.out.println("================================================================");
        
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        
        devMaria.progredir();

        System.out.println("=");
        
        System.out.println("Conteudos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());
    }
}
