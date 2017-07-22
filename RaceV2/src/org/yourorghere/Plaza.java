 
package org.yourorghere;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
/**
 *
 * @author Eddy Sanchez
 * Generador de Plaza
 */
public class Plaza {
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
    public GLUquadric disco,disco1,disco2,disco3,cilindro,cilindro2;
    public float angulo;
    Material material,material1,material2;
    //creamos un constructor
    public Plaza(float x1,float y1,float z1,float w1,float h1,float d1,GL gl1, float angulo1, float eje){
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
        material=new Material(0.5f,0.5f,0.5f,0.41f,0.41f,0.41f,0,0,0,128,gl);
        material1=new Material(0.5f,0.5f,0.5f,0.44f,0.50f,0.56f,0f,0f,0,128,gl);
        material2=new Material(0.5f,0.5f,0.5f,0.27f,0.51f,0.71f,0.1f,0.1f,1,1,gl);
//        
    }
    public void DrawPlaza(){
        
        gl.glPushMatrix();
        gl.glTranslatef(x, y-1, z);
        gl.glRotatef(90, 1, 0, 0);
        
        //Nivel 1
        RaceV2.textura.textura6.enable();
        RaceV2.textura.textura6.bind();
        
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 3, 20, 20);
        RaceV2.textura.textura6.disable();
        
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y-0.98f, z);
        gl.glRotatef(90, 1,0 , 0);
        
        RaceV2.textura.textura1.enable();
        RaceV2.textura.textura1.bind();
        
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 3f, 3f, 0.30, 30, 50);
        RaceV2.textura.textura1.disable();
        
        gl.glPopMatrix();
        
        //Nivel 2
        gl.glPushMatrix();
        gl.glTranslatef(x, y-0.80f, z);
        gl.glRotatef(90, 1, 0, 0);
        
        RaceV2.textura.textura6.enable();
        RaceV2.textura.textura6.bind();
        
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 2.5, 20, 20);
        RaceV2.textura.textura6.disable();
        
        
        
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y-0.78f, z);
        gl.glRotatef(90, 1,0 , 0);
        
        RaceV2.textura.textura1.enable();
        RaceV2.textura.textura1.bind();
        
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 2.5f, 2.5f, 0.30, 30, 50);
        RaceV2.textura.textura1.disable();
        
        gl.glPopMatrix();
        
        //nivel 3
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(angulo, 0, 1, 0);
        gl.glRotatef(180, 0, 1, 0);
        gl.glScalef(1f, 1f, 1f);
        material2.DrawMaterial();
        glut.glutSolidTeapot(w);
        
        gl.glPopMatrix();
        
    }
}
