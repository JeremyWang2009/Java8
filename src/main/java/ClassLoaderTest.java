import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by shanguang.wang on 18/3/29.
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/a1/data.class");
        URL[] urls = {file.toURL()};
        URLClassLoader urlClassLoader = new URLClassLoader(urls,ClassLoaderTest.class.getClassLoader());
        Thread.sleep(1000000);
    }

}
