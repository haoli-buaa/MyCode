package findRepeatedDnaSequences;
import java.util.*;
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < s.length() - 9; i++){   
        	String a = s.substring(i,i+10);
            if(!map.containsKey(a))
            	map.put(a, 1);
            else{
            	map.put(a, map.get(a)+1);
            	if(map.get(a) == 2)
            		res.add(a);
            }            
        }
        return res;
    }
    public List<String> findRepeatedDnaSequencesCoding(String s) {
        List<String> res = new ArrayList<String>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < s.length() - 9; i++){   
        	StringBuilder sb = new StringBuilder();
        	for(int j = i; j < i+10; j++){
        		switch(s.charAt(j)){
        		case 'A':
        			sb.append("00");
        			break;
        		case 'C':
        			sb.append("01");
        			break;
        		case 'G':
        			sb.append("10");
        			break;
        		default:
        			sb.append("11");
        			break;
        		}
        	}
        	int code = Integer.valueOf(sb.toString(), 2);
            if(!map.containsKey(code))
            	map.put(code, 1);
            else{
            	map.put(code, map.get(code)+1);
            	if(map.get(code) == 2)
            		res.add(s.substring(i,i+10));
            }            
        }
        return res;
    }
    public List<String> findRepeatedDnaSeq(String s) {
        List<String> res = new ArrayList<String>();
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> repeated = new HashSet<Integer>();
        int[] map = new int[26];
        map['A'-'A'] = 0;
        map['C'-'A'] = 1;
        map['G'-'A'] = 2;
        map['T'-'A'] = 3;
        for(int i = 0; i < s.length() - 9; i++){
        	int v = 0;
        	for(int j = i; j < i+10; j++){
        		v |= map[s.charAt(j)-'A'];
        		v <<= 2;
        	}
        	if(!set.add(v) && repeated.add(v))
        		res.add(s.substring(i,i+10));
        }
        return res;
    }
    public static void main(String[] args){
    	String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    	//String str = "AAAAAAAAAAAAAAA";
    	Solution sol = new Solution();
    	//List<String> res = sol.findRepeatedDnaSequences(str);
    	//List<String> res = sol.findRepeatedDnaSequencesCoding(str);
    	List<String> res = sol.findRepeatedDnaSeq(str);
    	System.out.println(res.toString());
    }
}
