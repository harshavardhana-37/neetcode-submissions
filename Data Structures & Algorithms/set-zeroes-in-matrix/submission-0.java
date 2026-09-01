class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowset= new HashSet<>();
        HashSet<Integer> colset= new HashSet<>();
        
        int i;
        int j;
        int m=matrix.length;
        int n=matrix[0].length;

        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(rowset.contains(i)||colset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
