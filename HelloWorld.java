public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!!");
		System.out.println(args);
		System.out.println(args.length);
		subMain(args);
	}

	public static void subMain(String[] args){
		System.out.println(args);
	}
}
