import edu.uci.ics.crawler4j.url.WebURL;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

@Data
public class FetchedDataUtils {
    private static List<String> fetchedHTMLs = new ArrayList<>();
    private static List<WebURL> fetchedLinked = new ArrayList<>();

    public static void saveHtml(String content) {
        fetchedHTMLs.add(content);
    }

    public static void saveURL(Set<WebURL> urls) {
        fetchedLinked.addAll(urls);
    }

    @SneakyThrows
    public static void creatHtmlFile() {
        System.out.println("start creating files");
        for (int i = 0; i < fetchedHTMLs.size(); i++) {
            System.out.println("creating file number : " + i);
            FileWriter fileWriter = new FileWriter("items/crawled/temp" + i + ".html");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(fetchedHTMLs.get(i));
            printWriter.close();
        }
        System.out.println("creating files finished");
    }
}


