public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    java.util.Scanner scan = new java.util.Scanner(System.in);
	    System.out.print("정수를 입력하세요"); //1.문자열 출력
	    int num = scan.nextInt();              //2.블럭상태
	    System.out.println("num = " + num);    //3.값 출력

	    System.out.print("실수를 입력하세요");
	    float f = scan.nextFloat();
	    System.out.println("f = " + f);

	    System.out.println("문자열 입력하세요");
	    String str = scan.next();
	    System.out.println("str = " + str);
	    scan.nextLine(); //버퍼비우기(스트림비우기)

	    System.out.println("문자열 입력하세요");
	    String str1 = scan.nextLine();
	    System.out.println("str1 = " + str1);
	    scan.close(); //연결끊기(스트림초기화)
	}

}