import java.util.Stack;

public class Valid_parentheses {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack<Character>();
      int l = s.length();
      char c;
      for(int i=0; i<l; i++){
        c = s.charAt(i);
        if(c=='(' || c=='{' || c=='['){
            st.push(c);
        }
        else if(c==')' || c=='}' || c==']'){
            if(st.empty()) st.push(c);
            else{
                char top = st.peek();
                if(top=='(' && c==')' || top=='{' && c=='}' || top=='[' && c==']'){
                    st.pop();
                } 
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
      }

      if(st.empty()) return true;
      else return false;  
    }
}
