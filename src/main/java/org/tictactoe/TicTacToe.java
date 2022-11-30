package org.tictactoe;

public class TicTacToe {
    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("Posicao Invalida");
        }

        if (y < 1 || y > 3) {
            throw new RuntimeException("Posicao Invalida");
        }
    }
}
