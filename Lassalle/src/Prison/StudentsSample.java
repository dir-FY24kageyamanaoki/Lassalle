package Prison;

public class StudentsSample {

    public static void main(String[] args) {
        //上のがあるやつからプログラム実行する起点、インスタンス作りますよ
        var floor1 = new Floor("四階", "西", 500000);
        var students1 = new Boarder("川浪", floor1, "寮長", 204);
        
        //みたか引数を使ってメソッドの実行を行います
        students1.rollcall();
        students1.rollcall(7);
        
        //もう一個作ってみる
        var floor2 = new Floor("三階", "東", 400000);
        var students2 = new Boarder("東", floor2, "室長", 546);
        students2.rollcall();

        
        //今までの成果を見せるメソッド実施
        students1.dormitoryMeeting();
        students2.dormitoryMeeting();
    }

}
