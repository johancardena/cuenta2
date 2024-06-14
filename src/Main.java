import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear 5 instancias de la clase (quemar los valores)
        Hotel[] hoteles = new Hotel[5];
        hoteles[0] = new Hotel("Hotel1", "Dirección1", 100, 3, "123456789");
        hoteles[1] = new Hotel("Hotel2", "Dirección2", 150, 4, "987654321");
        hoteles[2] = new Hotel("Hotel3", "Dirección3", 200, 5, "456123789");
        hoteles[3] = new Hotel("Hotel4", "Dirección4", 120, 3, "321654987");
        hoteles[4] = new Hotel("Hotel5", "Dirección5", 180, 4, "789456123");

        // Crear dos objetos con valores nulos y posteriormente setear sus valores
        Hotel hotelNulo1 = new Hotel(null, null, 0, 0, null);
        Hotel hotelNulo2 = new Hotel(null, null, 0, 0, null);

        Scanner scanner = new Scanner(System.in);

        // Modificar los objetos previamente creados
        modificarHoteles(hoteles, scanner);

        // Imprimir todos los objetos
        imprimirHoteles(hoteles);

        // Modificar todos los atributos de al menos tres objetos con el valor de NULL y mostrar su nuevo valor
        modificarAtributosNulos(hoteles, scanner);

        // Imprimir todos los objetos nuevamente
        imprimirHoteles(hoteles);

        scanner.close();
    }

    // Método para modificar los objetos previamente creados
    public static void modificarHoteles(Hotel[] hoteles, Scanner scanner) {
        for (int i = 0; i < hoteles.length; i++) {
            System.out.println("Modificando Hotel " + (i + 1));
            System.out.print("Nuevo Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Nueva Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Nuevas Estrellas: ");
            int estrellas = Integer.parseInt(scanner.nextLine());
            System.out.print("Nuevo Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Nuevo Precio por Noche: ");
            double precioNoche = Double.parseDouble(scanner.nextLine());

            // Modificar el hotel con los nuevos valores
            hoteles[i].setNombre(nombre);
            hoteles[i].setDireccion(direccion);
            hoteles[i].setEstrellas(estrellas);
            hoteles[i].setTelefono(telefono);
            hoteles[i].setPrecioNoche(precioNoche);
        }
    }

    // Método para imprimir todos los objetos
    public static void imprimirHoteles(Hotel[] hoteles) {
        System.out.println("Imprimiendo todos los hoteles:");
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
    }

    // Método para modificar todos los atributos de al menos tres objetos con el valor de NULL
    public static void modificarAtributosNulos(Hotel[] hoteles, Scanner scanner) {
        int contador = 0;
        for (Hotel hotel : hoteles) {
            if (hotel.getNombre() == null || hotel.getDireccion() == null || hotel.getTelefono() == null) {
                System.out.println("Modificando atributos del Hotel " + (contador + 1));
                System.out.print("Nuevo Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Nueva Dirección: ");
                String direccion = scanner.nextLine();
                System.out.print("Nuevo Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Nuevo Precio por Noche: ");
                double precioNoche = Double.parseDouble(scanner.nextLine());

                // Modificar el hotel con los nuevos valores
                hotel.setNombre(nombre);
                hotel.setDireccion(direccion);
                hotel.setTelefono(telefono);
                hotel.setPrecioNoche(precioNoche);

                contador++;

                if (contador >= 3) {
                    break;
                }
            }
        }
    }
}
