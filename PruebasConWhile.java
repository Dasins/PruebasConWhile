
/**
 * Crea objetos para experimentar con los bucles while
 *
 * @author (DaSins)
 * @version (16/01/2018)
 */
public class PruebasConWhile
{
    /**
     * Imprime por la terminal los multiplos de 5, entre 10 y 95 (incluidos). 
     */
    public void multiplosDe5() {
        int num = 10;
        while (95 >= num) {
            System.out.println(num);
            num += 5;
        }
    }
    
    /**
     * Imprime por la terminal la suma de los valores comprendidos entre 1 y 10
     * (incluidos).
     */
    public void sumaEntre1y10() {
        int num = 1, aux = num, i = 1;
        while ((i + num) <= 10) {
            aux = aux + (num + i);
            i++;
        }
        System.out.println(aux);
    }
}
