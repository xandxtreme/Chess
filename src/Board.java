public class Board
{
    final Field board[][] = new Field[8][8];

    public Board()
    {

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; i++)
            {
                board[i][j] = new Field(false);
            }
        }
    }
    /*
    Method that prints the board to user.
     */
    public static void boardStatus()
    {

    }


}
