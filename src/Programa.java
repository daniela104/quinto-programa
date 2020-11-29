public class Programa {

		public static void main(String[] args){
			
			String nome = args[0];
			
			int idade = Integer.parseInt(args[1]);
			
		
			if(nome.equals("joao")){
				System.out.println("Entrada liberada");
			} else if (nome.equals("andre") && idade == 30){
				System.out.println("Entrada liberada mas tem que pagar");
			} else {
				System.out.println("Entrada Negada");
			}
		
		
		}
		
	
}