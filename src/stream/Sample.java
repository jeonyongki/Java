import java.io.*;
public class Sample {

	public static void main(String[] args) throws IOException{
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		String a = br.readLine();
		System.out.println(a);
		
		//1. InputStream : byte를 읽는다
		//2. InputStreamReader : character(문자)를 읽는다.
		//3. BufferedReader : String(문자열)을 읽는다.
	}

}