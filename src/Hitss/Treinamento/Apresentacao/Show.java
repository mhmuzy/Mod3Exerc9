package Hitss.Treinamento.Apresentacao;



public class Show {
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
	}
		public static void main(String[] args) {
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println();
		System.out.println("Segue a sequência do Fibinacci");
		System.out.println("");
		Integer fib, num, res;
		
		num = 0;
		fib = 0;
		res = 1;
		System.out.println(1);
		/*do {
			
			num = num + res;
			
			fib = fib + num;
			
			System.out.println(fib);
			
			if (fib == 55) {
				System.out.println("Fim do Programa.");
			}
			
		} while (fib != 55);*/
		
		// teste do programa. Imprime os 30 primeiros termos
		int i = 1;
		do {
			i = i +1;
			System.out.println(fibo(i) );
			if (i == 10) {
				System.out.println("");
				System.out.println("Fim do programa.");
			}
		}while(i != 10);
			
		/*for (int i = 2; i < 11; i++) {
	            
	        }*/
	}
}
