import java.io.*;
public class Main{
public static void main(String[] args)throws IOException{
FileInputStream fis = new FileInputStream("d:/work/java/text/test.txt");

// System.out.println(fis.read());//65 대문자 'A'
// System.out.println(fis.read());//13 캐리지 리턴 (Carriage Return, '\r')
// System.out.println(fis.read());//10 줄 바꿈 (Line Feed, '\n')
// System.out.println(fis.read());//66 대문자 'B'
// System.out.println(fis.read());//-1 파일의 끝 (End of File, EOF)
byte[] array = new byte[2];
int n1 = fis.read(array);
int n2 = fis.read(array);
int n3 = fis.read(array);

System.out.println("읽어온갯수:"+n1);
System.out.println("읽어온갯수:"+n2);
System.out.println("읽어온갯수:"+n3);
System.out.println(new String(array));
fis.close();
}
}