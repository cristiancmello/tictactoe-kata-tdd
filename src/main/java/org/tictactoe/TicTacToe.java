package org.tictactoe;

public class TicTacToe {
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

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == lastPlayer
                && board[1][i] == lastPlayer
                && board[2][i] == lastPlayer
            ) {
                return "%s é o vencedor".formatted(lastPlayer);
            }
        }

        return "Sem vencedor";
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
