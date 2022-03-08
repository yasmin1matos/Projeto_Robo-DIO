package one.digitalinnovation.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author Yasmin
 *
 */

public class SingletonEager {
    private static SingletonEager  instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }

}

