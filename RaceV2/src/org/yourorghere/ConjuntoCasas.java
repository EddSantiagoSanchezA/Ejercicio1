
package org.yourorghere;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GL;
/**
 *
 * @author Eddy Sanchez
 * Generador de Casas
 */

public class ConjuntoCasas {
    
    public float x;
    public float y;
    public float z;
    public float w;
    public float h;
    public float d;
    public GL gl;
    public ArrayList<House> casas,casas2;
   
    public ConjuntoCasas(float x1, float y1, float z1, float w1,float h1, float d1,GL gl1){
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        casas2 = new ArrayList<House>();
        for(int i=0;i<5;i++){
            try { 
                casas2.add(new House(-8f +(i*4),0f,-15f,1f,1f,1f, gl, 0,1));
            } catch (IOException ex) {
                Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void DrawConjunto()
    {
        gl.glPushMatrix();
        for(House c:casas2)
        {
            c.DrawHouse();
        }
        for(House c:casas2)
        {
            gl.glPopMatrix();
            gl.glPushMatrix();
            gl.glTranslatef(0, 0, -40);
            gl.glRotatef(180, 0, 1, 0);
            c.DrawHouse();
            gl.glPopMatrix();
        }
        gl.glPopMatrix();
    }
    
    
    
   
}
