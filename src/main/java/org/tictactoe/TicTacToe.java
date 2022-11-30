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

        if (isWin(x, y)) {
            return "%s é o vencedor".formatted(lastPlayer);
        } else if (isDraw()) {
            return "O jogo empatou";
        }

        return "Sem vencedor";
    }

    private boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '\0') {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isWin(int x, int y) {
        int playerTotal = lastPlayer * 3;
        char diagonal1, diagonal2, horizontal, vertical;
        diagonal1 = diagonal2 = horizontal = vertical = '\0';

        for (int i = 0; i < SIZE; i++) {
            diagonal1 += board[i][i];
            diagonal2 += board[i][SIZE - i - 1];
            horizontal += board[i][y - 1];
            vertical += board[x - 1][i];
        }

        if (diagonal1 == playerTotal
            || diagonal2 == playerTotal
            || horizontal == playerTotal
            || vertical == playerTotal) {
            return true;
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
