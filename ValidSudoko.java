

public class ValidSudoko {
    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '8', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board[i].length; j++) {
        //         System.out.print(board[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        boolean [][] rows=new boolean[9][9];
        boolean [][] cols=new boolean[9][9];
         boolean [][] boxes=new boolean[9][9];
        // for (int i = 0; i < rows.length; i++) {
        //     for (int j = 0; j < rows[i].length; j++) {
        //         System.out.print(rows[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<9;i++){
            for( int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                 int num=board[i][j]-'1';
                 int boxIndex = (i / 3) * 3 + (j / 3);

                 if(rows[i][num]){System.out.println(false);  break;
                 }
                   
                 rows[i][num]=true;
                 

                 if(cols[j][num]){System.out.println(false);  break;
                 }
                 cols[j][num]=true;

                 if(boxes[boxIndex][num]) {System.out.println(false);  break;
                 }
                 boxes[boxIndex][num]=true;
            }
        }
        System.out.println(true);
    }
}
