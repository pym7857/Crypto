import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		 try{
	            //파일 객체 생성
	            File file = new File("C:\\excelExample\\ciphertext.txt");
	            //입력 스트림 생성
	            FileReader fr = new FileReader(file);
	            int singleCh = 0;
	            while((singleCh = fr.read()) != -1){ // fr.read() : FileReader에 저장된 내용을 int형 ASCII 코드로 한 문자씩 읽어온다.
	            	//System.out.println((char)singleCh);
	            	char alphabet = (char)singleCh;
	            	if( (singleCh >= 65 && singleCh <= 90) || (singleCh >= 97 && singleCh <= 122)) {
	            		int temp = (int)singleCh;
	            		temp = temp - 5;
	            		alphabet = (char)temp;
	            	}
	            	System.out.print(alphabet); // int형 ASCII코드를 문자로 
	            }
	            fr.close();
	        }catch (FileNotFoundException e) {
	        	System.out.println(e);
	        }catch(IOException e){
	            System.out.println(e);
	        }
	
	}
}
