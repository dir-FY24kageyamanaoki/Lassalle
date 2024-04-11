package Prison;

import java.nio.file.FileSystemLoopException;
import java.security.PublicKey;

public class Floor {
    private final String name;
    private final String direction;
    private int budget;
    
    //上がいつものフィールド、すなわち属性、下はコンストラクター、すなわちなんか初期化するやつ
    public Floor (String name, String direction, int budget) {
        this.name = name;
        this.direction = direction;
        this.budget = budget;
    }
    
    //寮内会議メソッドを作るお
    public void dormitorymeeting() {
        System.out.println(name + direction + "寮会議を行います。予算は" + budget + "円です。よろしく！");
    }
     //nameのgetter,多分private修飾しているからつけるんだと思います。多分
    public String getName() {
        return name;
    }
    
    //direction getter
    public String getDirection() {
        return direction;
    }
    
    //budget getter
    public int getBudget() {
        return budget;
    }
    
    //direction setter 変なの入れたときに対策出来ます。ということでよろしいですかね？
    public void setDirection(String direction) {
        if (!direction.equals("East") && !direction.equals("West")) {
          throw new IllegalArgumentException("方角は西か東です。");  
        }
    }
    //予算にマイナスという概念はない　budget setter
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算にマイナスという概念はない");
            
        }
        this.budget = budget;
    
        
            
    }
}
