public class CAP04EJ06 {
    public static void main(String[] args) {
    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());
    final double g = 9.81;
    Double t = Math.sqrt(2*h/g);
    System.out.printf("El objeto tarda %.2f segundos en caer.\n", t);
  }
}