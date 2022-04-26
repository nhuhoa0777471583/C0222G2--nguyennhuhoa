package ss19_String_Regex.thuc_hanh.CrawlDanhSachBaiHat;

import javafx.scene.transform.Scale;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

public class CrawlSongExample {
    public static void main(String[] args) {

        try {
            //khởi tạo đối tương url rồi truyền đường dẫn của file vào
            URL url = new URL(" https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            //useDelimiter dùng là kí tự phân cách
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
