// clasecalculadora
public class Calculadora {
    protected String marca;
    protected String modelo;
    protected boolean encendida;

    public Calculadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Calculadora encendida");
        } else {
            System.out.println("La calculadora ya está encendida");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Calculadora apagada");
        } else {
            System.out.println("La calculadora ya está apagada");
        }
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
            return Double.NaN;
        }
    }

    public void mostrarInfo() {
        System.out.printf("Calculadora %s, Modelo: %s%n", marca, modelo);
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public void reiniciar() {
        if (encendida) {
            System.out.println("Reiniciando calculadora...");
            apagar();
            encender();
        } else {
            System.out.println("Encienda la calculadora para reiniciar");
        }
    }
}
