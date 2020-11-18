import javax.swing.JOptionPane;

public class PilasYColas {
    public static void main(String[] args){
        funciones fun = new funciones();

        while (true){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de pilas y colas\n"
                    +"1. agregar\n"
                    +"2. Imprimir Pilas\n"
                    +"3. Imprimir Cola\n"
                    +"4. salir"));
            switch (opcion){
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese un numero");
                    nodo nodP = new nodo();
                    nodP.nombre = nombre;

                    fun = new funciones();
                    fun.pila(nodP);

                    nodo nodC = new nodo();
                    nodC.nombre = nombre;
                    fun.cola(nodC);
                    break;
                case 2:
                    System.out.println("impresion por pilas");
                    fun.imprimirPila();
                    break;
                case 3:
                    System.out.println("imprimir por cola");
                    fun.imprimirCola();
                    break;
                default:
                    System.exit(0);
                    break;
            }

        }


    }
}
