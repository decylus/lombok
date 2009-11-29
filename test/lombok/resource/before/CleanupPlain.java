//ignore
import lombok.Cleanup;
import java.io.*;
class Cleanup {
	void test() throws Exception {
		@lombok.Cleanup InputStream in = new FileInputStream("in");
		@Cleanup OutputStream out = new FileOutputStream("out");
		if (in.markSupported()) {
			out.flush();
		}
	}
}