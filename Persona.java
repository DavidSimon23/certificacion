public class Persona{
	
	String name;
	String sexo;
	int edad;
	
	public void caminar(){
		System.out.println(name + " Esta caminando");
	}
	
	public void estudiar(){
		System.out.println(name + " Esta estudiando");
	}
	
	public void comer(String comida){
		System.out.println("Esta comiendo : " + comida);
	}
	
	public void tomar(){
		if(edad<18){
			System.out.println("no puedes tomar");
		} else{
			System.out.println("tU SI puedes tomar");
		}
		
	}

}

class Curso{
	
	public static void main(String[] args){
		Persona juan = new Persona();
		juan.name = "Juan Perez";
		juan.sexo="M";
		juan.edad=18;
		
		juan.caminar();
		juan.estudiar();
		
		Persona bety = new Persona();
		bety.name = "Beatriz";
		bety.sexo = "F";
		bety.edad = 17;
		
		bety.caminar();
		bety.estudiar();
		bety.comer("Torta cubana con guacamole");
		
		juan.tomar();
		
		bety.tomar();
		
		
	}
}