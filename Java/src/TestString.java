
public class TestString {
	public static void main(String[] args){
		String s1 = "a";
		String s2 = new String("a");
		String s3 = s1;
		System.out.println(s1==s2);
		s3 = "b";
		System.out.println(s1);
		
		String str = "abcdefghijhk";
		String rev = reverse(str);
		System.out.println(rev);
	}
	public static String reverse(String str){

		System.out.println(Integer.toHexString(Integer.MIN_VALUE));
		System.out.println(Integer.toHexString(-1));
		
		//空指针检查
		if(str == null)
			return str;
		StringBuilder sb = new StringBuilder();
		//return sb.reverse().toString();
		//逆序输出
		for(int i = str.length()-1; i >= 0; i--)
			sb.append(str.charAt(i));
		return sb.toString();
	}
}
