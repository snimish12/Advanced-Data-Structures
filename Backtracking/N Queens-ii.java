class Solution {
    public int count=0;
    public void solve(int row, int n, char[][]board, Set<Integer> cols,Set<Integer> diag,Set<Integer> adiag){
        if(row == n){
            count++;
            return;
        }
        for(int col =0; col<board.length;col++){
            if(cols.contains(col) || diag.contains(row-col) || adiag.contains(row+col))
                {
                    continue;
                }
                board[row][col] = 'Q';
                cols.add(col);
                diag.add(row-col);
                adiag.add(row+col);
                solve(row+1,n, board, cols, diag, adiag);
                board[row][col] = '.';
                cols.remove(col);
                diag.remove(row-col);
                adiag.remove(row+col);
            }
        
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char b[]:board){
            Arrays.fill( b ,'.');
        }
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> adiag = new HashSet<>();
        solve(0, n, board, cols, diag, adiag);
    return count;
    }
}
