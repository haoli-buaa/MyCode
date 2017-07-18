package ReverseSentence;
import java.util.*;

public class Solution {
	public String ReverseSentence(String str) {
		if(str == null)
			return null;
		Stack<String> stk = new Stack<String>();		
		boolean isSpace = false;
		int last = 0;
        for(int i = 0; i < str.length(); i++){
        	char temp = str.charAt(i);
        	if(i != 0){
        		if(isSpace ^ temp == ' '){
        			stk.add(str.substring(last, i));
        			last = i;        			
        		}
        	}
        	isSpace = (temp == ' ' ? true : false);
        }
        stk.add(str.substring(last,str.length()));
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
        	sb.append(stk.pop());
        }
		return sb.toString();        
    }
	public static void main(String[] args){
		//String str = "";
		//String str = "I am a student.";
		//String str = " ";
		String str = null;
		Solution sol = new Solution();
		String result = new String();
		result = sol.ReverseSentence(str);
		System.out.println(result);
	}
}
