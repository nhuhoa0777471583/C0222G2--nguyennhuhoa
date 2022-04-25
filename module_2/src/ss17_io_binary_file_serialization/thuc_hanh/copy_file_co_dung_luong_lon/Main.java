package ss17_io_binary_file_serialization.thuc_hanh.copy_file_co_dung_luong_lon;

import javafx.scene.transform.Scale;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingFileJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest ) throws IOException {
        InputStream is= null;
        OutputStream os=null;
        try {
            is=new FileInputStream(source);
            os=new FileOutputStream(dest);
            byte[] buffer =new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap đường dẫn file: ");
        String sourcePath=scanner.nextLine();
        System.out.println("nhap điểm đến: ");
        String destPath=scanner.nextLine();

        File sourceFile= new File(sourcePath);
        File destFile= new File(destPath);
        try {
            copyFileUsingFileJava7File(sourceFile,destFile);
            System.out.println("copy hoàn thành");
        }catch (Exception ioe){
            System.out.printf("ko the copy file");
            System.out.printf(ioe.getMessage());
        }
    }
}
