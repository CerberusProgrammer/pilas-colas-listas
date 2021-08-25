public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila<String>();

        String s = Pila.invierteCadena("Hola");
        System.out.println(s);

        boolean b = Pila.checkCharacters("{[(]}]");
        System.out.println("{[(]}] = " + b);

        boolean b1 = Pila.checkCharacters("{[()]}");
        System.out.println("{[()]} = " + b1);

        int[] intArray = new int[4];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 1;

        int x = Recursividad.sumaArray(intArray, intArray.length - 1);
        System.out.println("Suma del array: " + x);

        int p = Recursividad.potencia(2, 3);
        System.out.println("Potencia: " + p);
    }
}
