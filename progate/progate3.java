package progate;

public class progate3 {
	public static void main(String[] args) {
	    // Personクラスのインスタンスを生成し、変数person1に代入してください
	    Person person1 = new Person();
	    // person1に対して、helloメソッドを呼び出してください
	    // インスタンスメソッドを使用
	    person1.hello();
	     
	    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
	    person1.name = "Kate Jones";
	    // person1のインスタンスフィールドnameの値を出力してください
	    System.out.println(person1.name);
	    
	}
}

//Personクラスを定義してください
class Person {
	// インスタンスメソッドhelloを定義してください
	public void hello() {
	  System.out.println("こんにちは");
	}
	// インスタンスフィールドnameを定義してください
	public String name;
}