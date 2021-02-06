class Solution {
    Stack<Character> s=new Stack<>();

    public boolean isValid(String str) {
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(a== '{' || a== '(' || a=='['){
                s.push(a);
                continue;
            }
            if(s.size()==0 || str.length()==0){
                return false;
            }
            
            if(a=='}'){
                if(s.pop()!='{'){
                    return false;
                }
            }
            if(a==']'){
                if(s.pop()!='['){
                    return false;
                }
            }
            if(a==')'){
                if(s.pop()!='('){
                    return false;
                }
            }
        }
        if(s.size()!=0){
            return false;
        }
        return true;
    }
}
