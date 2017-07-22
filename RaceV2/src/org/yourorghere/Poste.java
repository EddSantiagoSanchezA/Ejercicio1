 
package org.yourorghere;
import com.sun.opengl.util.GLUT;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Poste {
    //atributos
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public float limita;
    public float limitb;
    public GL gl;
    public GLUT glut;
    public GLU glu;
    public GLUquadric cilindro,esfera,cilindro2;
    public float angulo;
    public float speed=0.08f;
    Material material,material1,material2;
    //creamos un constructor
    public Poste(float x1,float y1,float z1,float w1,float h1,float d1,float limita1, float limitb1,GL gl1, float angulo1, float eje){
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        limita=limita1;
        limitb=limitb1;
        glut=new GLUT();
        glu=new GLU();
        angulo=angulo1;
        material=new Material(0.5f,0.5f,0.5f,1f,1f,1f,0,0,0,1,gl);//poste
        material1=new Material(0.5f,0.5f,0.5f,1f,1f,0f,1f,1f,0,1,gl);//foco
        
//        
    }
    public void DrawPoste(){
                        
        gl.glPushMatrix();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        gl.glTranslatef(x, y, z);
        gl.glRotatef(90, 1,0 , 0);
        
        RaceV2.textura.textura3.enable();
        RaceV2.textura.textura3.bind();
        
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 0.5f, 0.5f, 3, 30, 50);
        RaceV2.textura.textura1.disable();
        
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(0, 1,0 , 0);
        
        RaceV2.textura.textura4.enable();
        RaceV2.textura.textura4.bind();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_MODULATE);
        material1.DrawMaterial();
        esfera=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(esfera, GLU.GLU_FILL);
        glu.gluQuadricTexture(esfera, true);
        glu.gluQuadricNormals(esfera, GLU.GLU_SMOOTH);
        glu.gluSphere(esfera, 1f, 30, 50);
        RaceV2.textura.textura4.disable();
        
        gl.glPopMatrix();
        
        
    }
    
    public void Movimiento(){
        z=z+speed;
        if(z<limita && z>(limita-1)){
            speed=speed*(-1);
        } 
        if(z>limitb&&z<(limitb+1)){
            speed=speed*(-1);
        }
    }
    
    public float Getx(){
        return x; 
    }
    public float Getz(){
        return z; 
    }
}
