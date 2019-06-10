package 常用类;

import java.util.Arrays;

public class test {
private static String str="this is a test of java";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
		test5();

	}
	private static void test5() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());

		StringBuffer sb2 = new StringBuffer();
		for (int i = str.length()-1; i >=0; i--) {
		sb.append(str.charAt(i));}
		System.out.println("--"+sb2);
	}
	
	private static void test4() {
		// TODO Auto-generated method stub
		String[] ss = str.split(" ");//其実用空格并不准确，应该使用正则表达式
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ss.length; i++) {
		String s = ss[i].substring(0,1).toUpperCase()+ss[i].substring(1);
		sb.append(s);}
		System.out.println(sb);
	}
	private static void test3() {
		// TODO Auto-generated method stub
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
		ch[i] = str.charAt(i);}

	System.out.println(Arrays.toString(ch));

	char[] ch2 = str.toCharArray();
	System.out.println(Arrays.toString(ch2));
	}
	private static void test2() {
		// TODO Auto-generated method stub
		int start = str.indexOf("test");
		String s = str.substring(start,start+5);
		System.out.println("取出"+s);
	}
	private static void test1() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		if('s'==str.charAt(i)){
		count++;
		}
		}
		System.out.println("s出现的次数"+count);
	}
}
