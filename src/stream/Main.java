import java.io.*;
public class Main{
public static void main(String[] args)throws IOException{
FileInputStream fis = new FileInputStream("d:/java/text/test.txt");

System.out.println(fis.read());//65
System.out.println(fis.read());//13
System.out.println(fis.read());//10
System.out.println(fis.read());//66
System.out.println(fis.read());//-1
byte[] array = new byte[2];
int n1 = fis.read(array);
int n2 = fis.read(array);

System.out.println("읽어온갯수:"+n1);
System.out.println("읽어온갯수:"+n2);
fis.close();
}
}