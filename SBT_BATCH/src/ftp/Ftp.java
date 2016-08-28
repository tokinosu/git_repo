package ftp;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class Ftp {

	public static void main(String[] args) {
		FileOutputStream ostream = null;

		// FTPClientの生成
		FTPClient ftpclient = new FTPClient();

		try {
			// サーバに接続
			ftpclient.connect("192.168.20.1");
			int reply = ftpclient.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				System.err.println("connect fail");
				System.exit(1);
			}

			// ログイン
			if (ftpclient.login("ftpuser", "password") == false) {
				System.err.println("login fail");
				System.exit(2);
			}

			// バイナリモードに設定
			ftpclient.setFileType(FTP.BINARY_FILE_TYPE);

			// ファイル受信
			ostream = new FileOutputStream("D:\\temp\\ftp_local\\ftp.csv");
			ftpclient.retrieveFile("ftp.csv", ostream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ftpclient.isConnected())
				try {
					ftpclient.disconnect();
				} catch (IOException e1) {
					// TODO 自動生成された catch ブロック
					e1.printStackTrace();
				}

			if (ostream != null) {
				try {
					ostream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
