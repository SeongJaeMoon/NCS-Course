public class ConsoleTest{
	public static void main(String[]args){
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		if(args.length < 2 || args == null){
			System.out.println("The value is not enough");
			System.exit(0);
		}else{
			for(int i = 0; i < args.length; i++){
				sb.append(String.format("option : %s%n", args[i]));
				sum += Integer.parseInt(args[i]); 
			}
		}
		System.out.print(sb.toString());
		System.out.printf(String.format("%n sum : %d", sum));
	}
}