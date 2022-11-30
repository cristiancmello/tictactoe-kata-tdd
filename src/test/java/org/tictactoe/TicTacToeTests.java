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
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(3, 5);
        }, "Posicao Invalida");
    }
}
