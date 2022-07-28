package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        int favorOfX = 0;
        if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){
            favorOfX = 1;
        }
       else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'){
            favorOfX = 1;
        }
       else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'){
            favorOfX = 1;
        }
       else if(board[0][2] == 'X' && board[0][1] == 'X' && board[0][0] == 'X'){
            favorOfX = 1;
        }
       else if(board[1][2] == 'X' && board[1][1] == 'X' && board[1][0] == 'X'){
            favorOfX = 1;
        }
       else if(board[2][2] == 'X' && board[2][1] == 'X' && board[2][0] == 'X'){
            favorOfX = 1;
        }
       else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){
            favorOfX = 1;
        }
       else if(board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == 'X'){
            favorOfX = 1;
        }
       else {
            favorOfX = 0;
        }
        return favorOfX == 1;
    }

    public Boolean isInFavorOfO() {
        int favorOfO = 0;
        if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){
            favorOfO = 1;
        }
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){
            favorOfO = 1;
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){
            favorOfO = 1;
        }
        else if(board[0][2] == 'O' && board[0][1] == 'O' && board[0][0] == 'O'){
            favorOfO = 1;
        }
        else if(board[1][2] == 'O' && board[1][1] == 'O' && board[1][0] == 'O'){
            favorOfO = 1;
        }
        else if(board[2][2] == 'O' && board[2][1] == 'O' && board[2][0] == 'O'){
            favorOfO = 1;
        }
        else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
            favorOfO = 1;
        }
        else if(board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == 'O'){
            favorOfO = 1;
        }
        else {
            favorOfO = 0;
        }
        return favorOfO == 1;
    }

    public Boolean isTie() {
        //if both X and O
        return null;
    }

    public String getWinner() {
        return null;
    }

}
