class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        List<Integer> res= new ArrayList();
        int right=matrix[0].length;
        int top=0;
        int bot=matrix.length;
        while(left<right && top<bot){
        for(int i=left;i<right;i++){
            res.add(matrix[top][i]);
        }
        top+=1;
        for(int i=top;i<bot;i++){
            res.add(matrix[i][right-1]);
        }
        right-=1;
        if(!(left<right && top<bot) )
        break;
        for(int i=right-1;i>=left;i--){
            res.add(matrix[bot-1][i]);
        }
        bot-=1;
        for(int i=bot-1;i>=top;i--)
        res.add(matrix[i][left]);
        left+=1;
        }
        return res;
    }
    
}