
package org.yourorghere;

import java.io.IOException;
import javax.media.opengl.GL;


public class PrimeraPersona extends Personaje{
    
    public float angulo;

    public PrimeraPersona( float x1, float y1,float z1, float w1, float h1, float speed1, GL gl1,float r1,float g1,float b1) throws IOException{
        super (x1,y1,z1,w1,h1,speed1, gl1, r1,b1,g1);
        angulo=30f;
    }
    
    @Override
    public void fdelan(){
        angulo+=0.05f;
        cabeza.setAngulo(-angulo*(180/3.14f)-90);
        tronco.setAngulo(-angulo*(180/3.14f)-90);
        piernaI.setAngulo(-angulo*(180/3.14f)-90);
        piernaD.setAngulo(-angulo*(180/3.14f)-90);
        brazoD.setAngulo(-angulo*(180/3.14f)-90);
        brazoI.setAngulo(-angulo*(180/3.14f)-90);
    }
    @Override
    public void fatras()
    {
        angulo-=0.05f;
        cabeza.setAngulo(-angulo*(180/3.14f)-90);
        tronco.setAngulo(-angulo*(180/3.14f)-90);
        piernaI.setAngulo(-angulo*(180/3.14f)-90);
        piernaD.setAngulo(-angulo*(180/3.14f)-90);
        brazoD.setAngulo(-angulo*(180/3.14f)-90);
        brazoI.setAngulo(-angulo*(180/3.14f)-90);
    }
    @Override
    public void fd()
    {
        x-=Math.cos(angulo)*speed;
        z-=Math.sin(angulo)*speed;
        //cabeza.x
    }
    @Override
    public void fb()
    {
        x+=Math.cos(angulo)*speed;
        z+=Math.sin(angulo)*speed;
    }
    
    public void MoveLeft()
    {
        x+=speed;
//        z+=Math.sin(angulo)*speed;
    }
    public void MoveRight()
    {
        x-=speed;
//        z+=Math.sin(angulo)*speed;
    }
    public void Avanzar(float f){
        z+=f;
    }
    
    public void GiroDerecha(){
        angulo+=0.05f;
        cabeza.setAngulo(-angulo*(180/3.14f)-90);
        tronco.setAngulo(-angulo*(180/3.14f)-90);
        piernaI.setAngulo(-angulo*(180/3.14f)-90);
        piernaD.setAngulo(-angulo*(180/3.14f)-90);
        brazoD.setAngulo(-angulo*(180/3.14f)-90);
        brazoI.setAngulo(-angulo*(180/3.14f)-90);
    }
    
    public void GiroIzquierda()
    {
        angulo-=0.05f;
        cabeza.setAngulo(-angulo*(180/3.14f)-90);
        tronco.setAngulo(-angulo*(180/3.14f)-90);
        piernaI.setAngulo(-angulo*(180/3.14f)-90);
        piernaD.setAngulo(-angulo*(180/3.14f)-90);
        brazoD.setAngulo(-angulo*(180/3.14f)-90);
        brazoI.setAngulo(-angulo*(180/3.14f)-90);
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
