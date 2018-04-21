/**
 * Created by shanguang.wang on 18/3/22.
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args)throws Exception {
        long i=0;
        while (true){
            Thread.sleep(50);
            ("This is a very long string, very very long string to test the gc behavior of the string constant pool"+i)
                    .intern();
            i++;
        }
    }

}
