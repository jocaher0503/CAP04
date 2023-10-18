public class CAP04EJ11 {
    public static void main(String[] args) {
    System.out.println("Introduzca una hora del día, primero la hora y luego los minutos.");
    System.out.print("Hora: ");
    int Horas = Integer.parseInt(System.console().readLine());  
    System.out.print("Minuto: ");
    int Minutos = Integer.parseInt(System.console().readLine());
    int Segundos = (Horas * 3600) + (Minutos * 60);
    int SegundosHastaMedianoche = (24 * 3600) - Segundos;
    System.out.println("Desde las " + Horas + ":" + Minutos + " hasta la medianoche faltan " + SegundosHastaMedianoche + " segundos.");
  }
}
