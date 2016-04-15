package inforhid;

import java.io.IOException;

/** */
/**
 * Title: LoonFramework Description:利用bmp文件隐藏数据 Copyright: Copyright (c) 2007
 * Company: LoonFramework
 * 
 * @author chenpeng
 * @email：ceponline@yahoo.com.cn
 * @version 0.1
 */
public class BMPHiedData {
	public static void main(String[] args) {
		// 导出为bmp

		try {
			// 参数分别为：
			// 1.要隐藏的数据
			// 2.隐藏数据用图
			// 3.导出位置

			BitmapExecute.DataSourceToBMP("/Users/ashin/Documents/myWorkspace/inforhid/test/test.txt", "/Users/ashin/Documents/myWorkspace/inforhid/test/12193.BMP", "/Users/ashin/Documents/myWorkspace/inforhid/test/temp.bmp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 导出bmp中隐藏的数据

		try {
			// 参数分别为：
			// 1.隐藏数据用图
			// 2.导出数据位置

			BitmapExecute.BMPToDataSource("/Users/ashin/Documents/myWorkspace/inforhid/test/temp.bmp", "/Users/ashin/Documents/myWorkspace/inforhid/test/txt_temp.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
