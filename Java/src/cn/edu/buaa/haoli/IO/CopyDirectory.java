package cn.edu.buaa.haoli.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDirectory {
	public static void main(String[] args){
		copyDir("/home/li/图片","/home/li/copy");
	}
	public static void copyDir(String srcPath, String destPath){
		//input check
		File src = new File(srcPath);
		if(!src.exists()){
			System.out.println("源文件不存在！");
			return;
		}
		File dest = new File(destPath+File.separator+src.getName());
		if(src.isDirectory()){
			for(File tmp : src.listFiles()){
				copyDir(tmp.getAbsolutePath(), destPath+File.separator+src.getName());
			}
		}
		else{
			copyFile(src,dest);
		}
	}
	public static void copyFile(File src, File dest){
		InputStream is = null;
		OutputStream os = null;
		File parent = dest.getParentFile();
		if(!parent.exists())
			parent.mkdirs();
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		byte[] buffer = new byte[16];
		try {
			int len = 0;
			while(-1 != (len = is.read(buffer, 0, 16))){
				os.write(buffer, 0, len);
			}
			os.flush();
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
