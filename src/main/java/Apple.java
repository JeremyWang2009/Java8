/**
 * Created by shanguang.wang on 18/2/25.
 */
public class Apple {

    private String color;

    private int weight;

    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>150;
    }

    public String getColor(){
        return this.color;
    }

    public int getWeight(){
        return this.weight;
    }

}
