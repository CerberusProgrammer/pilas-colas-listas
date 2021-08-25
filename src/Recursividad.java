public class Recursividad {

    public static String serieN0(int n) {
        if (n == 0)
            return "0";
        else
            return "" + n + serieN0(n - 1);
    }

    public static int multiplicacion(int n1, int n2) {
        if(n2 == 0)
            return 0;
        else
            return (n1 + multiplicacion(n1, n2 - 1));
    }

    public static int sumaArray(int[] t, int n) {
        if (n == 0)
            return t[n];
        else
            return t[n] + sumaArray(t, n - 1);
    }

    public static int potencia (int m, int n) {
        if (n == 0)
            return 1;
        else
            return m * potencia (m, n - 1);
    }
}
