import java.io.File;
import java.io.IOException;

public class ProcessBuilder {

	public static void main(String[] args) {

		// try {
		// ProcessBuilder builder = new ProcessBuilder("java", "-version");
		// Process process = ((Object) builder).start();
		//
		// InputStream stream = process.getErrorStream();
		// while (true) {
		// int c = stream.read();
		// if (c == -1) {
		// stream.close();
		// break;
		// }
		// System.out.print((char) c);
		// }
		// } catch (IOException ex) {
		// ex.printStackTrace();
		// }
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("SQLLDR USERID=hr/password, CONTROL=D:\\doc\\技術\\SQL-Loader\\load.ctl");
			File file = new File("D:\\doc\\技術\\SQL-Loader\\load.bad");
			if (file.exists()) {
				System.out.println("ファイルは存在します。");
			} else {
				System.out.println("ファイルは存在しません。");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
