import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
