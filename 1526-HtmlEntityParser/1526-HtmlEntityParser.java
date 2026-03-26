// Last updated: 3/26/2026, 1:48:32 AM
class Solution {
    public String entityParser(String text) {
    /*    StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == '&'){
                int j=i+1;
                StringBuilder temp = new StringBuilder();
                while(j<text.length() && text.charAt(j)!=';'){
                    temp.append(text.charAt(j));
                    j++;
                }
                i=j;
                if(temp.toString().equals("amp")){
                    sb.append("&");
                }
                else if(temp.toString().equals("apos")){
                    sb.append("'");
                }
                else if(temp.toString().equals("quot")){
                    sb.append("\"");
                }
                else if(temp.toString().equals("gt")){
                    sb.append(">");
                }
                else if(temp.toString().equals("lt")){
                    sb.append("<");
                }
                else if(temp.toString().equals("frasl")){
                    sb.append("/");
                }
                else{
                    sb.append("&" + temp + ";");
                }
                
            }
            else{
                    sb.append(text.charAt(i));
                }
        }
        return sb.toString();
     */
         return text.replace("&quot;", "\"")
                   .replace("&apos;", "\'")
                   .replace("&gt;", ">")
                   .replace("&lt;", "<")
                   .replace("&frasl;", "/")
                   .replace("&amp;", "&");
    }
}