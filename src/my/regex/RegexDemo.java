package my.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) throws Exception {
		String insertSQL = "INSERT INTO dept(deptno-no,dname-no,loc-no) "
				+ " VALUES (#{deptno} ,#{dname} ,#{loc})" ;
		String regex = "#\\{\\w+\\}" ; // 拆分操作
		Pattern pattern = Pattern.compile(regex) ;	// 编译正则
		Matcher matcher = pattern.matcher(insertSQL) ;	// 定义要处理的字符串
		while (matcher.find()) {	// 如果说现在发现有与之匹配的内容，则进行取出
			System.out.println(matcher.group(0).replaceAll("#\\{|\\}", ""));
		}
	}
}

	