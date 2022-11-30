package org.tictactoe;

public class TicTacToe {
    private static final int SIZE = 3;

    private Character[][] board = {
        {'\0', '\0', '\0'},
        {'\0', '\0', '\0'},
        {'\0', '\0', '\0'},
    };

    private char lastPlayer = '\0';

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x, y, lastPlayer);

        if (isWin()) {
            return "%s é o vencedor".formatted(lastPlayer);
        }

        return "Sem vencedor";
    }

    private boolean isWin() {
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] + board[1][i] + board[2][i] == (lastPlayer * SIZE)) {
                return true;
            }
        }

        return false;
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("Posicao Invalida");
        }
    }

    private void setBox(int x, int y, char lastPlayer) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Posicao Invalida");
        } else {
            board[x - 1][y - 1] = lastPlayer;
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X') {
            return 'O';
        }

        return 'X';
    }
}
