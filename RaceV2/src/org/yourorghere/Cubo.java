 
package org.yourorghere;
import com.sun.opengl.util.GLUT;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;
import javax.media.opengl.GL;
/**
 *
 * @author Eddy Sanchez
 * Generador de Cubos basicos
 */
public class Cubo {
    //atributos
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public float r;
    public float g;
    public float b;
    public float angulo;
    public float eje;
    public GLUT glut;
    public float fa,fb;
    
    
    Material material;
    public Texture texturaF,texturaA,texturaI,texturaD,texturaT,texturaB;
    //creamos un constructor
    public Cubo(float x1,float y1,float z1,float w1,float h1,float d1, float angulo1, GL gl1, float r1,float g1,float b1,float f1,float f2) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        angulo=angulo1;
        r=r1;
        g=g1;
        b=b1;
        fa=f1;
        fb=f2;
        glut=new GLUT();
        material=new Material(0.5f,0.5f,0.5f,r,g,b,r,g,b,1,gl);
        eje=2;

    }
    public Cubo(float x1,float y1,float z1,float w1,float h1,float d1, float angulo1,float eje1, GL gl1, float r1,float g1,float b1,float f1,float f2) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        angulo=angulo1;
        eje=eje1;
        r=r1;
        g=g1;
        b=b1;
        fa=f1;
        fb=f2;
        glut=new GLUT();
        material=new Material(0.5f,0.5f,0.5f,r,g,b,r,g,b,1,gl);

    }

    public void DrawCubo(float a){
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        gl.glPushMatrix();
        float w1=w/2;
        float h1=h/2;
        float d1=d/2;
        RaceV2.textura.textura.enable();
        RaceV2.textura.textura.bind();
        gl.glTranslatef(x, y, z);  
        if(eje==1){
            gl.glRotatef(angulo, 1,0,0);
        }else if(eje ==2){
            gl.glRotatef(angulo, 0,1,0);
        }else if(eje ==3){
            gl.glRotatef(angulo, 0,0,1);
        }
         

       
        gl.glBegin(GL.GL_QUADS);
        
        //frontal
        
        gl.glNormal3f(0, 0, 1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0-w1,0+h1,0+d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0-h1,0+d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0-h1,0+d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0+w1,0+h1,0+d1);
        gl.glEnd();
        
        //trasero

        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(0, 0, -1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0-w1,0+h1,0-d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0+w1,0+h1,0-d1);
        gl.glEnd();

        //Left
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(-1, 0,0);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0-w1,0+h1,0-d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0-h1,0+d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0-w1,0+h1,0+d1);
        gl.glEnd();

        //Right
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(1, 0,0);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0+w1,0+h1,0-d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0-h1,0+d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0+w1,0+h1,0+d1);
        gl.glEnd();

        //Top
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(0, 1,0);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0-w1,0+h1,0+d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0+h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0+h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0+w1,0+h1,0+d1);
        gl.glEnd();
           
        //Bottom
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(0, -1,0);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4));
        gl.glVertex3f(0-w1,0-h1,0+d1);
        gl.glTexCoord2d((fa/4)-0.25f,(fb/4)-0.25f);
        gl.glVertex3f(0-w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4)-0.25f);
        gl.glVertex3f(0+w1,0-h1,0-d1);
        gl.glTexCoord2d((fa/4),(fb/4));
        gl.glVertex3f(0+w1,0-h1,0+d1);
        gl.glEnd();

        
        RaceV2.textura.textura.disable();
        
        gl.glPopMatrix();
    }  
    
    
    public void DrawCube(){
        DrawCubo(0);
    }
    
    public float setAngulo(float a)
    {
        angulo=a;
        return angulo;
    }
    
    public float  Getx()
    {
        return x;
    }
    public float  Gety()
    {
        return y;
    }
    public float  Getz()
    {
        return z;
    }
    public float  Getw()
    {
        return w;
    }
    public float  Geth()
    {
        return h;
    }
    public float  Getd()
    {
        return d;
    }
}
