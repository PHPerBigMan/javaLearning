package IOTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		Date newdate= new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(simpleDateFormat1.format(newdate.getTime()));
		File file = new File("log.php");
		// �ж��ļ��Ƿ����
		if(file.exists()) {
			// ����
			// �ж��Ƿ����ļ�,�ļ��Ŀɶ���
			if(file.isFile() && file.canRead()) {
				// ��ȡ�ļ��Ĵ�С
				System.out.println("log.php�Ĵ�С��:"+file.length());
				// ��ȡ�ļ��е�����޸�ʱ��
				Date date = new Date(file.lastModified());
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = simpleDateFormat.format(date);
				System.out.println("log.php������޸�ʱ����:"+time);
				System.out.println(file.lastModified());
				// ��������޸�ʱ��
				
				String time1 = simpleDateFormat.format(file.lastModified());
				System.out.println("log.php������޸�ʱ����:"+time1);
				file.delete();
			}
		}else {
			// �������򴴽��µ��ļ�
			System.out.println("�ļ�log.php������,���ڴ�����......");
			try {
				file.createNewFile();
				System.out.println("�ļ�log.php�����ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
