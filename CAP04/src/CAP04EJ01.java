public class CAP04EJ01 {
    public static void main(String[] args) throws Exception {
    String dia;
    System.out.println("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = System.console().readLine(); 
    dia = dia.toLowerCase();
    switch(dia) {
    case "lunes":     
    case "jueves":
        System.out.println("Programación");
    break;
    case "martes":
    case "miércoles":       
        System.out.println("Lenguaje de Marcas");
    break;
    case "viernes":
        System.out.println("FOL");
    break;
    case "sábado":
    case "domingo":
        System.out.println("¡Ese día no hay clase!");
    break;
    default:
        System.out.println("El día introducido no es correcto.");
        }
    }
}