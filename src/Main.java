public class Main {
    public static void main(String[] args) {

        CalculadoraCientifica calcCientifica = new CalculadoraCientifica("Casio", "FX-991");


        calcCientifica.mostrarInfo();


        calcCientifica.encender();

        // calculadorabasica
        System.out.println("Suma: " + calcCientifica.sumar(5, 3));
        System.out.println("Resta: " + calcCientifica.restar(5, 3));
        System.out.println("Multiplicación: " + calcCientifica.multiplicar(5, 3));
        System.out.println("División: " + calcCientifica.dividir(5, 3));

        // calculadoracientifica
        System.out.println("Seno de 45 grados: " + calcCientifica.seno(45));
        System.out.println("Coseno de 45 grados: " + calcCientifica.coseno(45));
        System.out.println("Tangente de 45 grados: " + calcCientifica.tangente(45));
        System.out.println("Logaritmo de 100: " + calcCientifica.logaritmo(100));
        System.out.println("Factorial de 5: " + calcCientifica.factorial(5));

        // finalizacion
        calcCientifica.apagar();
    }
}
