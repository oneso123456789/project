import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in));
		 */
		System.out.print("Input Data : ");

		try {// �Է��� ������ �������.
			String inputString = br.readLine();
			System.out.println();
			System.out.println("Output String = " + inputString);
			// br.close();
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
			}
		}
	}// main() end
}
