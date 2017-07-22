/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import java.io.IOException;
import javax.media.opengl.GL;

/**
 *
 * @author Eddy Sanchez
 */
public class House {
    //atributos
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public GLUT glut;
    public float angulo;
    public Cubo casa, vent1,vent2,vent3,vent4,puerta;
    Material material,material1,material2;
    //creamos un constructor
    public House(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        glut=new GLUT();
        angulo=angulo1;
        casa= new Cubo(0, 1, 0, 3, 6, 3, 0, gl1, d1, d1, d1, 2f,1f);
        vent1=new Cubo(-0.6f, 1, 1.1f, 1, 1, 1, 0, gl1, 0.25f, d1, d1, 4f,4f);
        vent2=new Cubo(0.6f, 1f, 1.1f, w1, h1, d1, 0, gl1, 0.25f, d1, d1, 4f,4f);
        vent3=new Cubo(-0.6f, 3f, 1.1f, 1, 1, 1, 0, gl1, 0.25f, d1, d1, 4f,4f);
        vent4=new Cubo(0.6f, 3f, 1.1f, w1, h1, d1, 0, gl1, 0.25f, d1, d1, 4f,4f);
        puerta=new Cubo(0f, -1.5f, 1.1f, w1, 1, d1, 0, gl1, 1, 0.25f, 0, 3f,1f);
        material=new Material(0f,0f,0f,0.49f,0f,0f,0,0,0,128,gl);
        material1=new Material(0.5f,0.5f,0.5f,0f,0f,0f,0f,0f,0.25f,1,gl);
        material2=new Material(0.5f,0.5f,0.5f,0.55f,0.25f,0.06f,0f,0f,0f,128,gl);
//        
    }


    public void DrawHouse(){
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(angulo, 0, 1, 0);
//        gl.glScaled(w, h, d);
        
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        material.DrawMaterial();
        casa.DrawCube();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_MODULATE);
        material1.DrawMaterial();
        vent1.DrawCube();
        vent2.DrawCube();
        vent3.DrawCube();
        vent4.DrawCube();
        material2.DrawMaterial();
        puerta.DrawCube();
        
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
