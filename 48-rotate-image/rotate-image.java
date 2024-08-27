class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] image = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = image[i][j];
            }
        }
    }
}