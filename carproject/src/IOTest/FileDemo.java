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
		// 判断文件是否存在
		if(file.exists()) {
			// 存在
			// 判断是否是文件,文件的可读性
			if(file.isFile() && file.canRead()) {
				// 获取文件的大小
				System.out.println("log.php的大小是:"+file.length());
				// 获取文件夹的最后修改时间
				Date date = new Date(file.lastModified());
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = simpleDateFormat.format(date);
				System.out.println("log.php的最后修改时间是:"+time);
				System.out.println(file.lastModified());
				// 设置最后修改时间
				
				String time1 = simpleDateFormat.format(file.lastModified());
				System.out.println("log.php的最后修改时间是:"+time1);
				file.delete();
			}
		}else {
			// 不存在则创建新的文件
			System.out.println("文件log.php不存在,正在创建中......");
			try {
				file.createNewFile();
				System.out.println("文件log.php创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
