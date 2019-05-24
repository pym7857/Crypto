import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		 try{
	            //���� ��ü ����
	            File file = new File("C:\\excelExample\\ciphertext.txt");
	            //�Է� ��Ʈ�� ����
	            FileReader fr = new FileReader(file);
	            int singleCh = 0;
	            while((singleCh = fr.read()) != -1){ // fr.read() : FileReader�� ����� ������ int�� ASCII �ڵ�� �� ���ھ� �о�´�.
	            	//System.out.println((char)singleCh);
	            	char alphabet = (char)singleCh;
	            	if( (singleCh >= 65 && singleCh <= 90) || (singleCh >= 97 && singleCh <= 122)) {
	            		int temp = (int)singleCh;
	            		temp = temp - 5;
	            		alphabet = (char)temp;
	            	}
	            	System.out.print(alphabet); // int�� ASCII�ڵ带 ���ڷ� 
	            }
	            fr.close();
	        }catch (FileNotFoundException e) {
	        	System.out.println(e);
	        }catch(IOException e){
	            System.out.println(e);
	        }
	
	}
}
