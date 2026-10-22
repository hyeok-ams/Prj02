package oper02;

public class Arithmathic01 {

	public static void main(String[] args) {
		int n1 = 3 + 4 * 2;
		System.out.println(n1);
		
		System.out.println(7 / 2);
		//자동형변환되서 7이 7.0이 됨
		System.out.println(7 / 2.0);
		System.out.println(7 % 2);
		
		System.out.println(0 == 0.0);
		
		int n2 = 0 / 3;
		System.out.println(n2);
		
		//예외처리 없을때
		
		//int n3 = 3 / 0;
		//System.out.println(n3);
		//Exception : 예외 , RuntimeError 실행시 발생 오류
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//		at oper02.Arithmathic01.main(Arithmathic01.java:19)
		//이 후 프로그램은 종료되며 실행되지 않는다.(이후 작성된 소스코드 진행 불가)
		//예외처리 try catch로 프로그램 종료 안되게 할 수 있음.
		//데이터나 파일 입출력때는 항상 try catch 쓸 것
		//예외처리 되었을 때
		try {
			int n3 = 3 / 0;
			System.out.println(n3);
			System.out.println("예외발생 안함");
		} catch (ArithmeticException e) {
			System.out.println("계산 예외발생:" + e);
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("예외발생" + e.getMessage());
			
		} finally {
			//파일이나 데이터 처리 연결 종료시킬 부분(close();)
			System.out.println("예외하든 말든 실행");
		}
		
		System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
	}

}
