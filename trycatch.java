import java.util.Random;
public class trycatch{
    public static void main(String[] args){
        //例外処理を使ったプログラムを書いてみる。例外クラスを自作してthrowしてみる。
        Random R = new Random();
        int num = R.nextInt(10);
        try {
             if (num<5) {
                 throw new Exception();
                }
        } catch (Exception e) {
        System.out.println("例外をキャッチしました");
    }
  }
}


