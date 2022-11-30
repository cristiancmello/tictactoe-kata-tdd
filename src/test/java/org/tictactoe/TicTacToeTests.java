package org.tictactoe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTests {
    @Test
    void quandoPecaColocadaLugarForaEixoX_entaoPosicaoInvalida() {
        // Primeiro passo: criar um objeto? Não, criar um teste, uma asserção. Recomendado por Kent Beck.
        // Kent Beck criou o JUnit...
        // STEP RED: teste precisa falhar obrigatoriamente. Teste criado já passando pode estar indicando falso positivo
        // ou confirmando vieses de implementação
        // STEP GREEN: teste precisa agora passar a qualquer custo. Sacrifique padrões, "Dirty hands".
        // STEP REFACTORING: o teste, agora passando, precisa ser refatorado de maneira a eliminar duplicações,
        // aplicar clean code, padrões de projeto e etc... "limpar as mãos". Tenha um equilíbrio.
        // Sugiro começar a refatorar pelo método play
        // Terminou? EXECUTE TODOS OS TESTES. PRECISAM PASSAR SEM EXCEÇÃO!
        // Posso continuar refatorando? Faça o necessário sem exageros, pois faltam outras histórias.
        // CUIDADO: EXAGEROS TORNAM O CÓDIGO POUCO FLEXÍVEL NO INÍCIO DE UM PROJETO.
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(5, 2);
        }, "Posicao Invalida");
    }

    @Test
    void quandoPecaColocadaLugarForaEixoY_entaoPosicaoInvalida() {
        // STEP RED: teste deve falhar
        // STEP GREEN: teste deve passar. No entanto, devido a similaridade com a implementação anterior,
        // podemos optar por "deixar as mãos mais limpas"
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(3, 5);
        }, "Posicao Invalida");
    }

    @Test
    void quandoPecaoColocadaLugarOcupado_entaoPosicaoInvalida() {
        // Fazer este teste passar vai ser mais complexo
        // Precisamos criar a estrutura de dados que representará o tabuleiro (board)
        // Espaço ocupado no tabuleiro: caractere diferente de '\0' (NULL)
        // Finja uma jogada qualquer. Lembre-se, suje as mãos, faça o sacrifício em nome do teste.
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(1, 1);
            tictactoe.play(1, 1);
        }, "Posicao Invalida");
    }
}
