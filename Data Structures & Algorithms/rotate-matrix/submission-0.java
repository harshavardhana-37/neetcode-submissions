class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;

            }
        }
        
    }
}
