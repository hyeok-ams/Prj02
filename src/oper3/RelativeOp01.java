package oper3;

public class RelativeOp01 {

	public static void main(String[] args) {
		// 관계연산자 : < , <= , > , >= , == , !=
		// < : less than, > : greater then
		int age = 20;
		System.out.println(age < 19);
		if (age < 19)
		{
			//if뒤 내용이 true일때 실행
			System.out.println("미성년자");
		}else {
			//false일때 실행
			System.out.println("성인!");
		}
		
	}

}
