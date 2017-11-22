package my.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
	public static void main(String[] args) {
		String str = "INSERT INTO member(mid,name,age) VALUES (#{member.mid},#{member.name},#{member.age})";
		String regex = "#\\{[a-zA-Z_0-9\\.]+\\}";//分组依据
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(str);
		while(mat.find()) { //依次进行比较，如果符合取出内容
			System.out.println(mat.group(0));
			
		}
		
	}
}
