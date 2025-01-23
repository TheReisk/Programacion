public class DoubleRepresentation {
    public static void main(String[] args) {
        // Usaremos un número que ocupe exactamente 50 bits
        double numero = 123456.789;

        // Convertir a binario
        long bits = Double.doubleToLongBits(numero);
        String binario = Long.toBinaryString(bits);

        // Asegurar que tenga 50 bits
        binario = binario.substring(binario.length() - 50);

        System.out.println("Número decimal: " + numero);
        System.out.println("Representación binaria (50 bits): " + binario);

        // Mostrar la longitud de bits para verificación
        System.out.println("Longitud de bits: " + binario.length());

        // Separar el binario en partes para mejor lectura
        String partes = binario.replaceAll("(.{8})", "$1 ");
        System.out.println("Binario separado en bytes: " + partes);
    }
}