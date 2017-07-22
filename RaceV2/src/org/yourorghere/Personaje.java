
package org.yourorghere;

import java.io.IOException;
import javax.media.opengl.GL;


public class Personaje {
    public float x;
    public float y;
    public float z;
    public float w;
    public float h;
    public GL gl;
    public float r;
    public float g;
    public float b;
    public float speed;
    public Cubo cabeza,tronco, piernaI,piernaD,brazoD,brazoI;
    
    public Personaje( float x1, float y1,float z1, float w1, float h1, float speed1, GL gl1,float r1,float g1,float b1) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        gl=gl1;
        r=r1;
        g=g1;
        b=b1; 
        speed=speed1;
        
        cabeza=new Cubo(x, y1+h1/1.5f, z1, w1/5, h1/3, w1/5, 0,gl1, r1, g1, b1,1f,1f);
        tronco=new Cubo(x, y1, z1, w1/3, h1, w1/3, 0,gl1, r1-1, g1+0.3f, b1+0.3f,1f,1f);
        brazoI=new Cubo(x-(w1/3)/1.5f, y1, z1, w1/7, w1/1.5f, w1/7, 0,gl1, r1, g1+0.5f, b1,1f,1f);
        brazoD=new Cubo(x+(w1/3)/1.5f, y1, z1, w1/7, w1/1.5f, w1/7, 0,gl1, r1, g1+0.5f, b1,1f,1f);
        piernaI=new Cubo(x-(w1/3)/3f, y1-h1/1.4f, z1, w1/8, h1/2, w1/7, 0,gl1, r1, g1, b1+0.3f,1f,1f);
        piernaD=new Cubo(x+(w1/3)/3f, y1-h1/1.4f, z1, w1/8, h1/2, w1/7, 0,gl1, r1, g1, b1+0.3f,1f,1f);
    }
    public void DrawPj(){
          
                
        gl.glBegin(GL.GL_QUADS);//Cuerpo
        
        gl.glColor3f(r, g-0.5f, b);
        gl.glVertex3f(x-(w/7),y-(h/7),z);
        gl.glVertex3f(x-(w/7),y+(h/2),z);
        gl.glVertex3f(x+(w/7),y+(h/2),z);
        gl.glVertex3f(x+(w/7),y-(h/7),z);

        gl.glEnd();
        
        
        gl.glBegin(GL.GL_QUADS);//Cabeza
        gl.glColor3f(r-1, g+0.5f, b);
        gl.glVertex3f(x-(w/5),y+(h/2),z);
        gl.glVertex3f(x-(w/5),y+h,z);
        gl.glVertex3f(x+(w/5),y+h,z);
        gl.glVertex3f(x+(w/5),y+(h/2),z);

        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);//Piernas
        
        gl.glColor3f(r-1, g+0.5f, b);
        gl.glVertex3f(x-(w/7),y-(h/7),z);
        gl.glVertex3f(x-(w/7),y-(h),z);
        gl.glVertex3f(x+(w/7),y-(h),z);
        gl.glVertex3f(x+(w/7),y-(h/7),z);

        gl.glEnd();
        
        
        
        
        //Brazos
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(r,g, b);
        gl.glVertex3f(x-(w/7)-0.1f,y-(h/4),z);
        gl.glVertex3f(x-(w/7)-0.1f,y+(h/2)-0.1f,z);
        gl.glVertex3f(x-(w/7),y+(h/2)-0.1f,z);
        gl.glVertex3f(x-(w/7),y-(h/4),z);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(r, g, b);
        gl.glVertex3f(x+(w/7)+0.1f,y-(h/4),z);
        gl.glVertex3f(x+(w/7)+0.1f,y+(h/2)-0.1f,z);
        gl.glVertex3f(x+(w/7),y+(h/2)-0.1f,z);
        gl.glVertex3f(x+(w/7),y-(h/4),z);
        gl.glEnd();
        
    }
    
    public void DrawPj3D(){
        cabeza.DrawCubo(0);
        tronco.DrawCubo(0);
        brazoI.DrawCubo(0);
        brazoD.DrawCubo(0);
        piernaI.DrawCubo(0);
        piernaD.DrawCubo(0);
    }
    public void Avanzar(float f){
        x-=f;
    }
    public void fd(){
        x-=speed;
    }
    public void fb(){
        x+=speed;
    }
    public void fatras(){
        z+=speed;
    }
    public void fdelan(){
        z-=speed;
    }
    public void upheath(){
        y+=speed;
    }
    public void downheath(){
        y-=speed;
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
    
 public void Update()
 {
     cabeza.x=x;
     cabeza.y=y+0.2f;
     cabeza.z=z;
     tronco.x=x;
     tronco.y=y;
     tronco.z=z;
     brazoI.x=x-w/4;
     brazoI.y=y-0.01f;
     brazoI.z=z;
     brazoD.x=x+w/4;
     brazoD.y=y-0.01f;
     brazoD.z=z;
     piernaI.x=x-w/7;
     piernaI.y=y-h/1.5f-0.03f;
     piernaI.z=z;
     piernaD.x=x+w/7;
     piernaD.y=y-h/1.5f-0.03f;
     piernaD.z=z;

 }
}

