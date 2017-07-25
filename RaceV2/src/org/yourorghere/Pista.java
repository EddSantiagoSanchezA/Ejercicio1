
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import java.io.IOException;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
/**
 *
 * @author Eddy Sanchez
 * Generador de Pista de Carreras
 */
    /**
     * 
 * @brief Generador de Pista de Carreras
 * @brief Posicion
 * @param x Posicion x
 * @param y Posicion y
 * @param z Posicion z
 * @brief Atributos
 * @param w Altura
 * @param h Ancho
 * @param d Profundidad
 */

public class Pista {
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public GLUT glut;
    public GLU glu;
    public Cubo pista1,pista2,pista3,pista4,pista5;
    public GLUquadric disco,disco1,disco2,disco3,cilindro,cilindro2;
    public Pista(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        glu=new GLU();
        pista1=new Cubo(5, -0.05f, -31, 52, 0.25f, 8, 0, gl1, d1, d1, d1, 4, 3);
        pista2=new Cubo(0, -0.05f, -10, 50, 0.25f, 8, 0, gl1, d1, d1, d1, 4, 3);
        pista3=new Cubo(0, -0.05f, 10, 50, 0.25f, 8, 0, gl1, d1, d1, d1, 4, 3);
        pista4=new Cubo(4, -0.05f, 31, 52, 0.25f, 8, 0, gl1, d1, d1, d1, 4, 3);
        pista5=new Cubo(40, -0.05f, 0, 7, 0.25f, 50, 0, gl1, d1, d1, d1, 4, 3);
    }
    public void DrawPista(){
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(0, 0, 1, 0);
        pista1.DrawCube();
        pista2.DrawCube();
        pista3.DrawCube();
        pista4.DrawCube();
        pista5.DrawCube();
        DrawCurvas();
        
        gl.glPopMatrix();
    }
    public void DrawCurvas(){
        
        RaceV2.textura.textura2.enable();
        RaceV2.textura.textura2.bind();
        gl.glPushMatrix();
        
        gl.glTranslatef(-20, 0.09f, -20);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, 180, 180);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(20, 0.09f, -0);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, -180, -180);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-20, 0.09f, 20);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, 180, 180);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-20, 0.09f, 20);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, 180, 180);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(29, 0.09f, 20);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, 0, 90);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(29, 0.09f, -20);
        gl.glScaled(0.5, 0.5, 0.5);
        gl.glRotatef(90, 1, 0, 0);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluPartialDisk(disco, 15, 29f, 20, 20, 90, 90);
        gl.glPopMatrix();
        
         RaceV2.textura.textura2.disable();
       
        
        
        
    }
}
