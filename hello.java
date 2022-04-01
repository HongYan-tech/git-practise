public class hello {//変数greetingをString型で定義して、そこに値を代入してから表示する事。 
	public static void main(String[] args){
	String greeting = "Hello World";
	System.out.println(greeting);
	
	plus();
	
    }
	public static void plus() {//コンソールに1～10まで足した結果を表示してみよう。
	    for (int i = 1; i <= 10; i++){
	      System.out.println(i);}	    
    }
 }
