/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import java.io.IOException;
import java.util.ArrayList;
import javax.media.opengl.GL;

/**
 *
 * @author Eddy Sanchez
 */
public class Building {
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public GLUT glut;
    public float angulo;
    public Cubo edif1,edif2, vent1,vent2,vent3,vent4,puerta;
    public ArrayList<Cubo> ventana,ventana1,ventana2,ventana3,ventana4,ventana5;
    
    //variables auxiliares
    float aux1=0f;
    float aux2=0.5f;
    float aux3=7f;
    
    Material material,material1,material2,material3,material4;
    //creamos un constructor
    public Building(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        glut=new GLUT();
        angulo=angulo1;
        edif1= new Cubo(0f, 2f, 0f, 4f, 8f, 4f, 0f, gl1, d1, d1, d1, 1f,4f);
        edif2= new Cubo(0, 6, 0, 3f, 14, 3f, 0, gl1, d1, d1, d1, 3f,1f);
        puerta=new Cubo(0f, -1.5f, 0.5f, w1, h1, d1, 0, gl1, 1, 0.25f, 0, 3f,1f);
        ventana = new ArrayList<Cubo>();
        ventana1 = new ArrayList<Cubo>();
        ventana2 = new ArrayList<Cubo>();
        ventana3 = new ArrayList<Cubo>();
        ventana4 = new ArrayList<Cubo>();
        ventana5 = new ArrayList<Cubo>();
        for(int i=1;i<5;i++){
            ventana.add(new Cubo(1f, aux1, 0, w1, h1, 4.1f, 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux1=aux1+1.5f;
        }
        for(int i=1;i<5;i++){
            ventana1.add(new Cubo(-1f, aux2, 0, w1, h1, 4.1f, 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux2=aux2+1.5f;
        }
        for(int i=1;i<4;i++){
            ventana2.add(new Cubo(0f, aux3, 0, w1, 1.5f, 3.1f, 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux3=aux3+2f;
        }
        aux1=0f;
        aux2=0.5f;
        aux3=7f;
        for(int i=1;i<5;i++){
            ventana3.add(new Cubo(0, aux1, 1, 4.1f, h1, d1, 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux1=aux1+1.5f;
        }
        for(int i=1;i<5;i++){
            ventana4.add(new Cubo(0, aux2, -1, 4.1f, h1, d1, 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux2=aux2+1.5f;
        }
        for(int i=1;i<4;i++){
            ventana5.add(new Cubo(0f, aux3, 0, 3.1f, 1.5f,d1 , 0, gl1, 0.25f, d1, d1, 4f,4f)); 
            aux3=aux3+2f;
        }
        material=new Material(0.5f,0.5f,0.5f,0.49f,0f,0f,0,0,0,128,gl);
        material1=new Material(0.5f,0.5f,0.5f,0.49f,0.11f,0f,0,0,0,128,gl);
        material2=new Material(0.5f,0.5f,0.5f,0f,0f,0f,0f,0f,0.25f,1,gl);
        material3=new Material(0.5f,0.5f,0.5f,0.55f,0.25f,0.06f,0f,0f,0f,128,gl);
        
//        
    }


    public void DrawBuilding(){
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(0, 0, 1, 0);
        gl.glScaled(w, h, d);
        
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        material.DrawMaterial();
        edif1.DrawCube();
        material1.DrawMaterial();
        edif2.DrawCube();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_MODULATE);
        material2.DrawMaterial();
        for(Cubo c:ventana)
        {
            c.DrawCube();
        }
        for(Cubo c:ventana1)
        {
            c.DrawCube();
        }
        for(Cubo c:ventana2)
        {
            c.DrawCube();
        }
        for(Cubo c:ventana3)
        {
            c.DrawCube();
        }
        for(Cubo c:ventana4)
        {
            c.DrawCube();
        }
        for(Cubo c:ventana5)
        {
            c.DrawCube();
        }
        
        
        gl.glPopMatrix();
  
        
        
    }  
    
    
    public float  Getx()
    {
        //float a=x-(w/7);
        return x;
    }
    public float  Gety()
    {
        //float a=x-(w/7);
        return y;
    }
    
    public float  Getz()
    {
        //float a=x-(w/7);
        return z;
    }
    public float  Getw()
    {
        //float a=x-(w/7);
        return w;
    }
    public float  Geth()
    {
        //float a=x-(w/7);
        return h;
    }
    public float  Getd()
    {
        //float a=x-(w/7);
        return d;
    }
    
}
