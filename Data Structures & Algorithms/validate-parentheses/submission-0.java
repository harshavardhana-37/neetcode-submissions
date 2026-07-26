class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack <Character> stack= new Stack<>();
        int n=s.length();
        int i;
        for(i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='['|| ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()|| stack.peek()!=map.get(ch))
                return false;
            
            else{
                stack.pop();
            }
            }
        }
        return stack.isEmpty();
    }
}
