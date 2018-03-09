package javainterview.practicequestion.forseelenium;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfromfilelinebyline {
	
	public static void readline() throws IOException {
	
		File file=new File("C:\\SeleniumTestdata\\FileInputstream.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null){
			sb.append(line);
			sb.append("\n");
			System.out.println("\n");
			System.out.println("Reading the contents from File:"+sb.toString());
		}
		br.close();
	}
		

	public static void main(String[] args) {
		try {
			readline();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
