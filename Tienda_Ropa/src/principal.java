import java.util.Scanner;

public class principal {
    /**
     * Método principal a ejecutar.
     * @param args parametros pasados desde linea de comandos.
     */
    public static void main(String... args){
        /**
         * Declaramos e inicializamos leer de tipo Scanner para introducir
         * la información desde el teclado. Lo configuramos para que separe
         * la información cada vez que se le da un enter (\n), esto evitara
         * que cuando queramos leer una cadena con un espacio lo separe en dos
         * variables.
         */
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");

        /**
         * Declaramos e inicializamos un arreglo de productos, el cual puede
         * tener un máximo de 10 productos, esto por los requerimentos del
         * programa.
         */
        Producto productos[] = new Producto[10];

        /**
         * Ponemos todos y cada uno de los elementos del arreglo de productos en null,
         * usamos la propiedad .lenght para saber cuantos elementos tiene un arreglo
         */
        for (int i=0; i<productos.length; i++){
            productos[i]=null;
        }

        while(true){
            System.out.println("1.- Introducir Productos");
            System.out.println("2.- Modificar Productos");
            System.out.println("3.- Eliminar Produtos");
            System.out.println("4.- Lista de Productos");
            System.out.println("0.- Salir");
            Integer resp = leer.nextInt();

            /**
             * verifica si el usuario se quiere salir del sistema, la opción del break
             * permite terminar el ciclo anterior
             */
            if (resp==0){
                break;
            }

            switch (resp){
                case 1: // Introducir
                    Integer posI = PosicionDisponible(productos);
                    if (posI == -1){
                        System.out.println("No hay espacio disponible para dar de alta un producto");
                    } else {
                        productos[posI] = LeerProducto(leer);
                    }
                    break;
                case 2: // Modificar
                    System.out.print("Introduzca el Codigo a Modificar: ");
                    String CodigoM = leer.next();
                    Integer posM = BuscarProducto(productos, CodigoM);
                    if (posM==-1){
                        System.out.println("No existe un producto con ese Codigo");
                    } else {
                        productos[posM] = LeerProducto(leer);
                    }
                    break;
                case 3: // Eliminar
                    System.out.print("Introduzca el Codigo a Eliminar: ");
                    String CodigoE = leer.next();
                    Integer posE = BuscarProducto(productos, CodigoE);
                    if (posE==-1){
                        System.out.println("No existe un producto con ese Codigo");
                    } else {
                        productos[posE] = null;
                    }
                    break;
                case 4: // Mostrar
                    ImprimirElementos(productos);
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }

    }

    /**
     * Función que permite leer desde el teclado el Producto, lo que regresa es un objeto de tipo
     * producto con la información valida
     * @param teclado
     * @return
     */
    public static Producto LeerProducto(Scanner teclado){
        System.out.print("Introduzca el Codigo: ");
        String Codigo = teclado.next();
        System.out.print("Introduzca el Marca: ");
        String Marca = teclado.next();
        System.out.print("Introduzca el Modelo: ");
        String Modelo = teclado.next();
        System.out.print("Introduzca el Color: ");
        String Color = teclado.next();
        System.out.print("Introduzca el Talla: ");
        String Talla = teclado.next();
        System.out.print("Introduzca el Precio: ");
        Float Precio = teclado.nextFloat();

        return new Producto(Codigo, Marca, Modelo, Color, Talla, Precio);
    }

    /**
     * Función que permite determinar la primer posición vacia del arreglo de productos
     * @param elementos
     * @return
     */
    public static Integer PosicionDisponible(Producto[] elementos){
        for (int i=0; i<elementos.length; i++){
            if (elementos[i]==null)
                return i;
        }
        return -1;
    }

    /**
     * Función que permite buscar un producto mediante su codigo en un arreglo de elementos,
     * regresa la posición en la que se encuentra y en caso de que no exista regresa un -1
     * @param elementos
     * @param Codigo
     * @return
     */
    public static Integer BuscarProducto(Producto[] elementos, String Codigo){
        for (int i=0; i<elementos.length; i++){
            if (elementos[i]!=null){
                // Usamos el metodo equals en la comparación de Cadenas
                if (elementos[i].getCodigo().equals(Codigo)){
                    return i;
                }
            }
        }
        return -1;
    }
    /**
     * Función que permite imprimir los productos que estan en un arreglo, omite aquellos que estan
     * marcados como null
     * @param elementos
     */
    public static void ImprimirElementos(Producto[] elementos){
        for (int i=0; i<elementos.length; i++){
            if (elementos[i]!=null){
                System.out.printf("Codigo: %s \t Marca: %s \t Modelo: %s \t Color: %s \t Talla: %s \t Precio: %.2f\n", elementos[i].getCodigo(), elementos[i].getMarca(), elementos[i].getModelo(), elementos[i].getColor(), elementos[i].getTalla(), elementos[i].getPrecio());
            }
        }
    }


}
