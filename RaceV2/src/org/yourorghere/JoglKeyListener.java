
package org.yourorghere;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.GLCanvas;

//import static org.yourorghere.Practica1.proyeccion;
/**
 *
 * @author Eddy Sanchez
 * Escuchador de eventos
 */
/**
     * 
     * @brief Clase manejadora de eventos de escuhcha de teclado
     */

public class JoglKeyListener implements KeyListener {
    
    private GLCanvas canvas;
    public boolean[] keyBuffer;
    
    
    public JoglKeyListener(GLCanvas canvas)
    {
        this.canvas=canvas;
        keyBuffer=new boolean[256];
    }
    public void keyTyped(KeyEvent e)
    {
        /**
     * 
     * @brief Teclas de Accion y opciones
     */
        e.getKeyChar();
        if(keyBuffer['w'])
        {
            RaceV2.car.fd();
            RaceV2.velocidad=true;
            RaceV2.car.speed=RaceV2.car.speed+0.01f;
            
        }
        if(keyBuffer['s'])
        {
           RaceV2.car.fb();
           
        }
        if(keyBuffer[' '])
        {
           System.out.println("hola Guapo");
           RaceV2.car.speed=0.01f;
           
        }
        if(keyBuffer['a'])
        {
            RaceV2.car.GiroIzquierda();
        }
        if(keyBuffer['d'])
        {
            RaceV2.car.GiroDerecha();
        }
        
        if(keyBuffer['e'])
        {
            RaceV2.car.MoveLeft();
        }
        if(keyBuffer['q'])
        {
            RaceV2.car.MoveRight();
        }
        if(keyBuffer['l'])
        {
            RaceV2.luz.CambioLuz();
        }
        if(keyBuffer['c'])
        {
            if(RaceV2.camara){
                RaceV2.camara=false;
            }else{
                RaceV2.camara=true;
            }
        }    
               
    }
    
    /**
     * 
     * @brief Escuchador de eventos de teclado
     */
    public void keyPressed(KeyEvent e)
    {
        keyBuffer[e.getKeyChar()]=true;
    }
    public void keyReleased(KeyEvent e)
    {
        keyBuffer[e.getKeyChar()]=false;
    }
    
}

