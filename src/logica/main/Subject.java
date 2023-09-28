/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 */
package logica.main;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public interface Subject  {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    
}
