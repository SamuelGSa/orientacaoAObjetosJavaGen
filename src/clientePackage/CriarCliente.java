package clientePackage;

public class CriarCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Pedro","Bino", 35, "cargapesada@email.com");
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Sobrenome : " + cliente1.getSobrenome());
		System.out.println("Idade: " + cliente1.getIdade());
		System.out.println("Email: " + cliente1.getEmail());
		
	}

}
