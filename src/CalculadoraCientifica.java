// claseno1
public class CalculadoraCientifica extends Calculadora {
    public CalculadoraCientifica(String marca, String modelo) {
        super(marca, modelo);
    }

    public double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double coseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public double logaritmo(double numero) {
        if (numero > 0) {
            return Math.log10(numero);
        } else {
            System.out.println("Error: El logaritmo no está definido para números no positivos");
            return Double.NaN;
        }
    }

    public double factorial(int n) {
        if (n < 0) {
            System.out.println("Error: No se puede calcular el factorial de un número negativo");
            return Double.NaN;
        }
        double resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Calculadora Científica");
    }
}
