package leetcode;

public class LargestValueInMatrix_2373 {
  public static void main(String[] args) {
    int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
    int[][] ints = new LargestValueInMatrix_2373().largestLocal(grid);
  }

  public int[][] largestLocal(int[][] grid) {
    System.out.println(grid[3][0]);
    System.out.println(grid.length);
    for (int i=0; i< grid.length; i++){
      for (int[] j :grid){
        for (int k :j){
          System.out.print(k+"   ");
        }
      }
    }
    return new int[][]{};
  }
}
