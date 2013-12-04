import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/Users/chenliang/t.txt");
		char[] cs = {'你'};
		
		System.out.printf("%xd\n", Character.codePointAt(cs, 0));
		System.out.println("------------------");
		System.out.println('\u4f60');
		System.out.println('\uFDFA');
		System.out.println('\u269a');
		System.out.println('\u0e5b');
		System.out.println("------------------");
		
		String s = String.valueOf('你');
		byte[] ss = s.getBytes("UTF-8");
		System.out.println(ss.length);
		
		d(ss);
		
		fos.write(ss);
		
		d("你".getBytes("UTF-8"));
		
		fos.flush();
		fos.close();
		
		FileInputStream fis = new FileInputStream("/Users/chenliang/t.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int v = -1;
		while((v = fis.read()) != -1)
		{
			baos.write(v);
		}
		
		byte[] bs = baos.toByteArray();
		System.out.println(new String(bs, "UTF-8"));
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		d(bs);
		
		fis.close();
	}

	public static void d(byte[] ss)
	{
		System.out.println("***************************************************");
		for (int i = 0; i < ss.length; i++) 
		{
			System.out.printf("%x\n", ss[i]&0xff);
		}
	}
}
