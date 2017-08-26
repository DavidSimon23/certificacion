public class SayHello{
	public static void main(String[] args){
	try{
	System.out.println("Hola " + args[0]);
	}catch (Exception e){
		System.out.println("tienes que darme parametros");
	} 
	}
}