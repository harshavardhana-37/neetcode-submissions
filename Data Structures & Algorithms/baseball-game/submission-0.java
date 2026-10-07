class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s:operations){
            if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("C"))
            stack.pop();
            else if(s.equals("+")){
                int sec=stack.pop();
                int first=stack.pop();
                stack.push(first);
                stack.push(sec);
                stack.push(first+sec);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}