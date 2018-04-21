import java.util.ArrayList;
import java.util.List;

/**
 * Created by shanguang.wang on 18/2/25.
 */
public class AppleFilter {

    public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple a:inventory){
            if(p.test(a))
                result.add(a);
        }
        return result;
    }

    public static void main(String[] args) {
        AppleFilter appleFilter = new AppleFilter();
        List<Apple> inventory = new ArrayList<Apple>();
        appleFilter.filterApples(inventory,Apple::isGreenApple);
        appleFilter.filterApples(inventory,Apple::isHeavyApple);
        Thread t = new Thread(()-> System.out.println("hello world"));

    }

}
