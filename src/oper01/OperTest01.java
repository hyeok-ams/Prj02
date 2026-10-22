package oper01;

public class OperTest01 {

	public static void main(String[] args) {
		// n1++는 실행 이후 +1 함
		// n1++ == n1 = n1 + 1
		// ++n1은 실행 전 +1 함
		int n1 = 3;
		int n2 = 0 ;

		//1.
		//n2 = n1++; //4,3
		//n2 = n1;
		//n1 = n1 + 1;
		//n1을 n2에 입력 후 n1이 1증가
		System.out.println("n1=" + n1 + " n2=" + n2);
		
		//2.
		//n2 = ++n1; //4,4
		//n1 = n1 + 1;
		//n2 = n1;
		//n1이 1증가 한 후 n2에 n1을 입력
		System.out.println("n1=" + n1 + " n2=" + n2);
		
	}

}
