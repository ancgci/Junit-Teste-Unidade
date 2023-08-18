package one;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Antonio", LocalDate.of(2020,1,1));
        assertEquals(3,pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa garcia = new Pessoa("Garcia", LocalDate.of(2000,1,1));
        assertTrue(garcia.ehMaiorDeIdade());

        Pessoa carlos = new Pessoa("Carlos", LocalDate.now());
        assertFalse(carlos.ehMaiorDeIdade());
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Garcia", LocalDate.now());
        assertNotNull(pessoa);
    }
    @Test
    void validarNome(){
        Pessoa pessoa = new Pessoa("Junior", LocalDate.of(2020,1,1));
        assertEquals("Junior",pessoa.getNome());
    }

    @Test
    void validarNascimento(){
        Pessoa pessoa = new Pessoa("Nicolas", LocalDate.of(2012,3,10));
        assertEquals("2012-03-10" ,pessoa.getNascimento());
    }
}


