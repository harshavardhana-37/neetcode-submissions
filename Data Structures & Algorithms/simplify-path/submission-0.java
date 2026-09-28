class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack= new Stack<>();
        StringBuilder curr= new StringBuilder();
        for(char ch:(path+'/').toCharArray()){
            if(ch=='/'){
                if( curr.toString().equals("..")){
               if(!stack.isEmpty()) stack.pop();
            }
            else if(!curr.toString().equals("")&& !curr.toString().equals(".")) stack.push(curr.toString()); 
        
        curr.setLength(0);
            }
        
        else curr.append(ch);
        }
        return "/"+String.join("/",stack);
    }
}