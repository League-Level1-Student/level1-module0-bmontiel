package extra;

public class IntroToMethods {
public static void main(String[] args) {
	
	WeRock();
	rocker("Bob");
	truth("nancy");
	echo("hello");
	repeat("mayday", 4);
	theBest("theBest");
		int sum= add(2,2);
	System.out.println(sum);
}
static void WeRock() {
	System.out.println("The League rocks");
}
static void rocker(String name) {
	System.out.println(name +" rocks");
}
static void truth(String name){
	if (name.equals("Nancy")) {
		System.out.println(name +" is awesome");
	}
	else {
		System.out.println(name +" is annoying");
	}
}
static void echo(String word) {
	for (int i = 0; i < 2; i++) {
		System.out.println(word);
	}	
}
static void repeat(String word, int times) {
	for (int i = 0; i < times; i++) {
		System.out.println(word);
	}
}
static void theBest(String Best){
	System.out.println("theBest");
}
static void add(int a, int b){
	return a+b;
}
}