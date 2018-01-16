
/**
 * Crea objetos para experimentar con los bucles while
 *
 * @author (DaSins)
 * @version (16/01/2018)
 */
public class PruebasConWhile
{
    /**
     * Imprime por pantalla los multiplos de 5, menores o iguales que el limite.
     * @param limit El numero limite. Si es multiplo de 5 se incluye.
     */
    public void multiplesOfFive(int limit) {
        int num = 5;
        while (limit >= num) {
            System.out.println(num);
            num += 5;
        }
    }
}
