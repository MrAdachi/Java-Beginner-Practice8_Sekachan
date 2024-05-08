package execution;

import pack.Student2;

public class StuSample2 {

	public static void main(String[] args) {
		Student2 stu1 = new Student2("菅原");
		Student2 stu2 = new Student2("菅原");
		
		boolean result = stu1.equals(stu2);
		System.out.println(result);
		/* System.out.println(obj); とした時は、
		 * 自動的にtoStringメソッドが呼び出される。
		 */
		System.out.println(stu1);
	}

}
