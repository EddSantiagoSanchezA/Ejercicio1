
package org.yourorghere;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GL;

/**
 * 
 * @author Eddy Sanchez
 * 
 */
/**
 * 
 * @brief Generador de Detalles, en este caso de monumentos
 * @brief Posicion
 * @param x Posicion x
 * @param y Posicion y
 * @param z Posicion z
 * @brief Atributos
 * @param w Altura
 * @param h Ancho
 * @param d Profundidad
 */
public class CentralPark {
    public float x;
    public float y;
    public float z;
    public float w;
    public float h;
    public float d;
    public GL gl;
    public ArrayList<Arbol> arbol;
    public ArrayList<Poste> poste;
    Plaza plaza;
    Cubo piso,piso2;
    Cerca cerca1,cerca2,cerca3,cerca4;
    float aux =0.5f;
    
    public CentralPark(float x1, float y1, float z1, float w1,float h1, float d1,GL gl1) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        arbol = new ArrayList<Arbol>();
        poste = new ArrayList<Poste>();
        for(int i=1;i<2;i++){
            arbol.add(new Arbol(7.5f, 2f, 7.5f-aux, 1f, 2, 1, gl, 0, 1));
            arbol.add(new Arbol(-7.5f, 2f, 7.5f-aux, 1f, 2, 1, gl, 0, 1));
            arbol.add(new Arbol(-7.5f+aux, 2f, -7.5f, 1f, 2, 1, gl, 0, 1));
            arbol.add(new Arbol(-7.5f+aux, 2f, 9f, 1f, 2, 1, gl, 0, 1));
            aux=aux+3f;
        }
        for(int i=1;i<1;i++){
            poste.add(new Poste(-3f, 0f, 3f, 0.1f, 5, 1, 0,0,gl, 0, 1));
            poste.add(new Poste(3f, 0f, 3f, 0.1f, 5, 1, 0,0,gl, 0, 1));
            poste.add(new Poste(-3f, 0f, -3f, 0.1f, 5, 1 ,0,0,gl, 0, 1));
            poste.add(new Poste(3f, 0f, -3f, 0.1f, 5, 1, 0,0,gl, 0, 1));
            aux=aux+3f;
        }
        piso=new Cubo(0f ,-1.8f,0f,15f,0.125f,15f, 0,gl, 1f,0.12f,0.25f,3f,2f);
        piso2=new Cubo(0f ,-1.9f,0f,20f,0.125f,20f, 0,gl, 1f,0.12f,0.25f,4f,3f);
        plaza=new Plaza(0f, 0f, 0f, 1f, 0.3f, 1, gl, 0, 1);
        cerca1=new Cerca(1, -1, -10.5f, 1, 1, 1, gl, 0, 1);
        cerca2=new Cerca(1, -1, 10.5f, 1, 1, 1, gl, 0, 1);
        cerca3=new Cerca(9.5f, -1, 0f, 1, 1, 1, gl, 90, 1);
        cerca4=new Cerca(-9.5f, -1, 0f, 1, 1, 1, gl, 90, 1);
    }
    
    public void DrawPark(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glScalef(w, d, h);
        piso.DrawCube();
        piso2.DrawCube();
        plaza.DrawPlaza();
//        for(Arbol a:arbol)
//        {
//            a.DrawArbol();
//        }
        for(Poste p:poste)
        {
            p.DrawPoste();
        }
//        cerca1.DrawCerca();
//        cerca2.DrawCerca();
//        cerca3.DrawCerca();
//        cerca4.DrawCerca();
        
        gl.glPopMatrix();
    }
    
    
}
