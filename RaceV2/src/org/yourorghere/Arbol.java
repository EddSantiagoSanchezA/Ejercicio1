package org.yourorghere;


import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import org.yourorghere.Material;
//clase Arbol

public class Arbol {
    //atributos
    public float x;
    public float y;
    public float z;
    public float w;//altura 
    public float h;//anchura
    public float d;//profundidad
    public GL gl;
    public GLUT glut;
    public GLU glu;
    public GLUquadric cilindro,cilindro1,cilindro2;
    public float angulo;
    Material material,material1,material2;
    //creamos un constructor
    public Arbol(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje){
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        gl=gl1;
        glut=new GLUT();
        glu=new GLU();
        angulo=angulo1;
        material=new Material(0.1f,0.1f,0.1f,0.0f,0.1f,0.0f,0,0,0,128,gl);
        material1=new Material(0.5f,0.5f,0.5f,0.44f,0.50f,0.56f,0f,0f,0,128,gl);
        material2=new Material(0.5f,0.5f,0.5f,0.27f,0.51f,0.71f,0.1f,0.1f,1,1,gl);
//        
    }
    public void DrawArbol(){
        //aplicacion de Transormaciones de OpenGL
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(90, 1,0 , 0);
        
        //Llamamos a los metodos de texturizado
        RaceV2.textura.textura1.enable();
        RaceV2.textura.textura1.bind();
        //Graficamos las formas deseadas
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 0.25f, 0.25f, 3, 30, 50);
        RaceV2.textura.textura1.disable();
        
        gl.glPopMatrix();
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y+1, z);
        gl.glRotatef(90, 1,0 , 0);
        
        RaceV2.textura.textura2.disable();
        RaceV2.textura.textura2.enable();
        RaceV2.textura.textura2.bind();
        
        cilindro1=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro1, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro1, true);
        glu.gluQuadricNormals(cilindro1, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro1, 0f, 0.75f, 2, 30, 50);
        
        RaceV2.textura.textura2.disable();
        
        gl.glPopMatrix();
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(90, 1,0 , 0);
        
        RaceV2.textura.textura2.disable();
        RaceV2.textura.textura2.enable();
        RaceV2.textura.textura2.bind();
        
        cilindro1=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro1, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro1, true);
        glu.gluQuadricNormals(cilindro1, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro1, 0f, 1f, 2, 30, 50);
        
        RaceV2.textura.textura2.disable();
        gl.glPopMatrix();
        
    }
}