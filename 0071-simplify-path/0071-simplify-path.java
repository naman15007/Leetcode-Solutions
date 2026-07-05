class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
       Stack <String> st = new Stack<String> ();
       for(String i : str){
        if(i.equals("..") && !st.empty()){
            st.pop();  //" .."
        }else if(!i.equals("..") && !i.equals(".") && !i.equals("")){
            st.push(i);  // "/"  // "/"
        }
       }
       if(st.isEmpty()) return "/";
       StringBuilder sb = new StringBuilder();
       for(String s : st){
        sb.append("/");
        sb.append(s);
       }
       return sb.toString();
    }
}

