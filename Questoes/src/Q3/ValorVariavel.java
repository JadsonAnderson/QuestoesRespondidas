package Q3;

public class ValorVariavel {

    public static void main(String[] args) {

        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println(soma);

        // Ao final do processamento, o valor da variável soma será de 77.

    }
    
}
