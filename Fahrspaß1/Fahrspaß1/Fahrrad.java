import greenfoot.*;

/**
 * Klasse Fahrrad <br>
 * 
 * Kap. 7.3 Arbeitsauftrag 3, Aufgabe 1
 */

public class Fahrrad extends Fahrzeug
{   
    double reifendruck;
    
    Fahrrad()
    {
        hoechstgeschwindigkeit = 5;   // beliebige Einheit
        reifendruck = 3;              // in hPa (= mBar)     
    }
   
    /*
     * Das Fahrrad bewegt sich, jedoch lässt der Reifendruck (unverhältnismäßig stark) nach.
     * Ist der Reifendruck auf 1.5 gesunken, bewegt es sich nicht mehr.
     */
    void fahre()
    {
        if (reifendruck > 1.5)
        {
            move(hoechstgeschwindigkeit);
            reifendruck = reifendruck - 0.02;
        }       
    }
    
    /*
     * Vor Beginn der Fahrt kann der Reifendruck erhöht werden.
     * Damit ist eine längere Fahrt möglich.
     */
    void pumpeAuf()
    {
        reifendruck = reifendruck + 1;
    }
    
    /*
     * Vor Beginn der Fahrt kann die Klingel betätigt werden.
     */
    void gibLaut()
    {
        System.out.println("ring ring");
    }
}
