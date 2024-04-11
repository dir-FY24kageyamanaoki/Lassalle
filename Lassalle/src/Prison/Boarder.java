package Prison;

public class Boarder {
    //フィールド(属性)作成
    protected String name ;
    private final Floor floor ;
    protected String position;
    int boarderId;
    
    //コンストラクター(初期化するあれ)
    public Boarder(String name, Floor floor,String position, int boarderId) {
        this.name = name;
        this.floor = floor;
        this.position = position;
        this.boarderId = boarderId;
    }
    
    //点呼メソッド
    public void rollcall(int members) {
        System.out.println(members + "名、異常なし。名前:" + name + position);
    }
    //点呼メソッド(オーバーロードとかいうやつ)
    public void rollcall() {
        rollcall(8);
    }
        
        //ここで新たな寮会議メソッドを追加するぜ
        public void dormitoryMeeting() {
            floor.dormitorymeeting();
            System.out.println("俺も混ぜろよ" + floor.getName() + floor.getDirection() + name);
            
        
    }
}
