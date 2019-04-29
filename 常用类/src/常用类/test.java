package 常用类;

public class test {
private static String str="this is a test of java";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		//test3();
		//test4();
		//test5();

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
