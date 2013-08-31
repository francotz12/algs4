public class Percolation {
    private boolean[] grid;
    private int N;
    
    public Percolation(int N) {
        this.N = N;
        grid = new boolean[N*N + 1];
        // create N-by-N grid, with all sites blocked
        for (int i = 0; i <= N*N + 1; i++) {
            grid[i] = false;
        }
    }

    private void checkBounds(int i, int j) {
        if (i < 1 || i > N) throw new IndexOutOfBoundsException("row index i out of bounds");
        if (j < 1 || j > N) throw new IndexOutOfBoundsException("column index j out of bounds");
    }
    
    public void open(int i, int j) {
        checkBounds(i, j);
        // open site (row i, column j) if it is not already
    }
    
    public boolean isOpen(int i, int j) {
        checkBounds(i, j);
        // is site (row i, column j) open?
        return grid[i*N + j*N] == true;
    }
    
    public boolean isFull(int i, int j) {
        checkBounds(i, j);
        // is site (row i, column j) full?
        return grid[i*N + j*N] == false;
    }
    
    public boolean percolates() {
        // does the system percolate?
        return false;
    }
}