//Author: Vivi
package SimHandler;

import Display.Display;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Simulator {
    private Display display;
    private boolean isRunning = false;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private String title;
    private int width, height;
    private Thread thread;
    
    private World world;
    
    public Simulator(String name, int height, int width){
        
    }
}