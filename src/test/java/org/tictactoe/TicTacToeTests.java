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
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(5, 2);
        }, "Posicao Invalida");
    }
}
