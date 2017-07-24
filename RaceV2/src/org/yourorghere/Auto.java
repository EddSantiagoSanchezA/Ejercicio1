
package org.yourorghere;

import java.io.IOException;
import java.util.Vector;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JOptionPane;
//Clase Auto para generar un automovil
    
public class Auto {
    public float x;
    public float y;
    public float z;
    public float w;
    public float h;
    public float d;
    public GL gl;
    public GLU glu;
    public float r;
    public float g;
    public float b;
    public float texta;
    public float textb;
    public float speed;
    public float umbralx;
    public float umbralz;
    public float angulo;
    public Vector<Float> caminox,caminoz;
    public int indice;
    public Cubo carroceria,capot, puntos;
    public GLUquadric disco,disco1,disco2,disco3,cilindro,cilindro2;
    
    //Creacion del constructor
    public Auto( float x1, float y1,float z1, float w1, float h1,float d1, float speed1,Vector caminox1,Vector caminoz1, GL gl1,float r1,float g1,float b1, float texta1,float textb1) throws IOException{
        x=x1;
        y=y1;
        z=z1;
        w=w1;
        h=h1;
        d=d1;
        speed=speed1;
        caminox=caminox1;
        caminoz=caminoz1;
        umbralx=speed1;
        umbralz=speed1;
        gl=gl1;
        glu=new GLU();
        r=r1;
        g=g1;
        b=b1; 
        texta=texta1;
        textb=textb1;
        indice=1;
        
        carroceria=new Cubo(0, 0.5f, 0, w1, h1, d1+0.05f, 0,gl1, r1, g1, b1,texta,textb);
        capot=new Cubo(0, -0.1f, 0, w1*3.5f, h1-0.3f, d1+0.1f, 0,gl1, r1-1, g1+0.3f, b1+0.3f,textb,texta);
       angulo=90;
        
    }
    public void DrawAuto(){
        
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        gl.glPushMatrix();
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(angulo, 0, 1, 0);
        gl.glScaled(1, 1, 1);
        carroceria.DrawCube();
        capot.DrawCube();
        
        gl.glRotatef(capot.angulo, 0, 1, 0);
        Drawllantas();
        
        gl.glPopMatrix();
        
    }
    public void Drawllantas(){
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, 0.5f);
        
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, 0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, 0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 1f, 1f, 0.5, 30, 50);
        
        gl.glPopMatrix();
        //llanta 2
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, 0.5f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, 0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, 0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 1f, 1f, 0.5, 30, 50);
        
        gl.glPopMatrix();
        
        //Llanta 3
        
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, -0.5f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, -0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(1, -0.5f, -0.5f);
        gl.glScaled(0.5, 0.5, 0.5);
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 1f, 1f, 0.5, 30, 50);
        
        gl.glPopMatrix();
        
        //Lanta 4
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, -0.5f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, -0.3f);
        gl.glScaled(0.5, 0.5, 0.5);
        disco=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(disco, GLU.GLU_FILL);
        glu.gluQuadricTexture(disco, true);
        glu.gluQuadricNormals(disco, GLU.GLU_SMOOTH);
        glu.gluDisk(disco, 0, 1f, 20, 20);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        
        gl.glTranslatef(-1, -0.5f, -0.5f);
        gl.glScaled(0.5, 0.5, 0.5);
        cilindro=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluQuadricTexture(cilindro, true);
        glu.gluQuadricNormals(cilindro, GLU.GLU_SMOOTH);
        glu.gluCylinder(cilindro, 1f, 1f, 0.5, 30, 50);
        
        gl.glPopMatrix();
        
        
        
    }
    public void Avanzar(float f){
        z+=f;
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
    
    public void Ruta(){
        
     if(indice!=16){
         if(x<caminox.elementAt(indice)){
            x=x+speed*2;
        }else{
            x=x-speed*2;
        }
        
        if(z<caminoz.elementAt(indice)){
            z=z+speed;
        }else{
            z=z-speed;
        }
        if(Math.abs(x-caminox.elementAt(indice))<umbralx && Math.abs(z-caminoz.elementAt(indice))<umbralz){
            if(indice<caminox.size()){
                indice++;
            }else{
                indice=1;
            }
        }
        
        if(indice==2){
            angulo=45;
        }
        if(indice==4){
            angulo=180;
        }
        if(indice==5){
            angulo=-45;
        }
        if(indice==6){
            angulo=-135;
        }
        if(indice==7){
            angulo=-180;
        }
        if(indice==8){
            angulo=45;
        }
        if(indice==9){
            angulo=135;
        }
        if(indice==10){
            angulo=180;
        }
        if(indice==11){
            angulo=-45;
        }
        if(indice==13){
            angulo=-135;
        }
        if(indice==14){
            angulo=-180;
        }
        if(indice==15){
            angulo=-45;
        }
        
     }else {
         indice=1;
         JOptionPane.showMessageDialog(null, "Game Over¡¡ Ultimo Lugar");
            System.exit(0);
     }   
        
    }
    public boolean Colision(float nx, float nz)
    {
        float umbral;
        boolean salida=false;
       for(Auto e:RaceV2.carenemi)
        {
            salida=salida || (Math.abs(nx-e.Getx())<1.5f && Math.abs(nz-e.Getz())<1.5f);
        } 
       return salida; 
    }
    
    public boolean ColisionP(float nx, float nz)
    {
        float umbral;
        boolean salida1=false;
       
       for(Poste e:RaceV2.posteE)
        {
            salida1=salida1 || (Math.abs(nx-e.Getx())<1.5f && Math.abs(nz-e.Getz())<1.5f);
        } 
       return salida1; 
    }
    
    public boolean Meta(float nx, float nz, float mx, float mz){
        boolean meta=false;
        meta=(Math.abs(nx-mx)<1.5f && Math.abs(nz-mz)<1.5f);
        
        return meta;
    }
    
    
}
