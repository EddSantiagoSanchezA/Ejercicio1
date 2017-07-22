 
package org.yourorghere;
import com.sun.opengl.util.GLUT;
import java.io.IOException;
import java.util.ArrayList;
import javax.media.opengl.GL;

public class Cerca {
    //atributos
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public GLUT glut;
    private ArrayList<Cubo> cubos;
    public float angulo;
    Material material,material1,material2;
    float aux1=0.5f;
    //creamos un constructor
    public Cerca(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        glut=new GLUT();
        angulo=angulo1;
        material=new Material(0.5f,0.5f,0.5f,1f,1f,1f,0,0,0,128,gl);
        material1=new Material(0.5f,0.5f,0.5f,0.44f,0.50f,0.5f,0,0,0,128,gl); 
        cubos = new ArrayList<Cubo>();
        for(int i=1;i<5;i++){
            cubos.add(new Cubo(aux1, 0f,0f , w1, h1, d1, 0, gl1, 0.25f, d1, d1, 3f,4f)); 
            aux1=aux1+2.5f;
            cubos.add(new Cubo(-aux1, 0f, 0f, w1, h1, d1, 0, gl1, 0.25f, d1, d1, 3f,4f));   
        }
        
    }
    public void DrawCerca(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(angulo, 0, 1, 0);
        gl.glScalef(1f, 2f, 0.25f);
        material.DrawMaterial();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);

        for(Cubo c:cubos)
        {
            c.DrawCube();
        }
        
//        
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