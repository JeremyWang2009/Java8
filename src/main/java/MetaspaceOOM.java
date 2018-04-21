import java.util.ArrayList;
import java.util.List;

/**
 * Created by shanguang.wang on 18/3/27.
 */
public class MetaspaceOOM {

    public static void main(String[] args) throws Exception{
        String str = "asdfadfafadfadfadfasdfad";
        List<String> list = new ArrayList<>();
        int i=0;
        while (true){
            Thread.sleep(5000);
            System.out.println(str);
        }
    }
}
