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
        // Chegou a hora de refatorar.
        // Podemos generalizar os ifs "if (x < 1 || x > 3)" e "if (y < 1 || y > 3)" para checkAxis() -> ELIMINAR DUPLICAÇÃO
        // Os ifs "if (board[x - 1][y - 1] != '\0')" e ação no else "board[x - 1][y - 1] = 'X'" indica uma responsabilidade. Qual?
        // Bem, parece com algo que diz respeito a "posicionar a jogada no tabuleiro". Chamamos isso de "setBox".
        // O método play agora se apresenta de uma forma mais elegante e bem compreendida em suas menores partes
        // Os testes continuam passando. É o dente da catraca segurando o balde. Podemos soltar a mão.
        var tictactoe = new TicTacToe();

        assertThrows(RuntimeException.class, () -> {
            tictactoe.play(1, 1);
            tictactoe.play(1, 1);
        }, "Posicao Invalida");
    }
}
