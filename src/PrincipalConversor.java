import java.util.Scanner;

public class PrincipalConversor {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        int opcion = 0;

        String menu = """
                ***************************************************
                Sea bienvenido/a al Conversor de Moneda =)
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                ***************************************************
                """;

        while (opcion != 7) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            if (opcion == 7) break;

            System.out.println("Digite el valor que desea convertir:");
            double valor = lectura.nextDouble();

            String base = "", target = "";

            switch (opcion) {
                case 1 -> { base = "USD"; target = "ARS"; }
                case 2 -> { base = "ARS"; target = "USD"; }
                case 3 -> { base = "USD"; target = "BRL"; }
                case 4 -> { base = "BRL"; target = "USD"; }
                case 5 -> { base = "USD"; target = "COP"; }
                case 6 -> { base = "COP"; target = "USD"; }
                default -> System.out.println("Opción no válida");
            }

            if (!base.isEmpty()) {
                try {
                    DatosConversion conversion = consulta.buscarTasa(base, target, valor);
                    System.out.println("El valor " + valor + " [" + base + "] corresponde al valor final de =>>> "
                            + conversion.conversion_result() + " [" + target + "]\n");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Programa finalizado. ¡Gracias por usar el conversor!");
    }
}