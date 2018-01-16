
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
    
    /**
     * Imprime por la terminal la suma de todos los numeros enteros entre a y b
     * (incluidos). Importante!! a debe ser menor que b
     * @param a El numero inicial.
     * @param b El numero al que se quiere llegar.
     */
    public void sum(int a, int b) {
        int aux = a, i = 1;
        while((a + i) <= b) {
            aux = aux + (a + i);
            i++;
        }
        System.out.println(aux);
    }
    
    /**
     * @n El numero que se quiere saber si es primo.
     * @return Devuelve true si n es primo. Falso si no lo es.
     */
    public boolean isPrime(int n) {
        // Mientras se crea que n es primo, verdadero.
        boolean isPrime = true;
        int i = 2;
        while(i < n && isPrime) {
            if((n % i) == 0){
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}

