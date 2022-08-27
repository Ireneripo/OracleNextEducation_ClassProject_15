public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio del main");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin del main");
    }

    private static void metodo1() throws MiException {
        System.out.println("Inicio del metodo1");
        try {
            metodo2();
        } catch (MiException me) {
            me.printStackTrace();
        }

        System.out.println("Fin del metodo1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio del metodo2");

        /*for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                if(i == 3) {
                    int num = 0;
                    int resultado = i / num;
                    System.out.println(resultado);
                }

                String test = null;
                System.out.println(test.toString());
            } catch (ArithmeticException | NullPointerException exception) {
                System.out.println("Atrapó Excepción");
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }*/

        /*ArithmeticException ae = new ArithmeticException();
        throw ae; */

        throw new MiException("Mi excepción fue lanzada");

        // Ejemplo de StackOverflowError (un método que se llama
        // a sí mismo hasta el infinito)
        // metodo2();
    }
}
