class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int count=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int myans[]=new int [n*m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                myans[count++]=matrix[i][j];
            }
        }
        for(int i=0;i<myans.length;i++){
            if(myans[i]==target) return true;
        }
        return false;
    }
}
