//Author: Vivi
package ecosim;

import SimHandler.Simulator;

public class EcoSimLauncher {

    public static void main(String[] args) {
        System.out.println("Booting...");
        Simulator sim = new Simulator("Eco Sim!", 500,500);
        sim.start();
        System.out.println("Complete.");
    }   
}