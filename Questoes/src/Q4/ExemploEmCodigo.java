package Q4;

public class ExemploEmCodigo {

    public static void main(String[] args) {

        // letra a)
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + " ");
        }

        // letra b)
        for (int i = 2; i <= 150; i *= 2) {
            System.out.print(i + " ");
        }

        // letra c)
        for (int i = 0; i < 8; i++) {
            System.out.print(i * i + " ");
        }

        // letra d)
        for (int i = 2; i < 12; i += 2) {
            System.out.print(i * i + " ");
        }

        //  letra e)
        int a = 1;
        int b = 1;
            for (int i = 1; i < 8; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }

        // letra f)
        // Contém elementos na sequência que começa com a letra D.
    }
}
