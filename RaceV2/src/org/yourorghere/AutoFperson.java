
package org.yourorghere;

import java.io.IOException;
import java.util.Vector;
import javax.media.opengl.GL;
import javax.swing.JOptionPane;



public class AutoFperson extends Auto{
    public float angulo;
    public AutoFperson(float x1, float y1,float z1, float w1, float h1,float d1, float speed1,Vector<Float> caminox1, Vector<Float> caminoz1,float angulo1, GL gl1,float r1,float g1,float b1,float texta1,float textb1) throws IOException{
        super (x1, y1,z1, w1, h1,d1,speed1, caminox1,caminoz1,gl1,r1,g1,b1, texta1, textb1);
        angulo=angulo1;
    }
    
    @Override
    public void fdelan(){
        angulo+=0.05f;
        carroceria.setAngulo(-angulo*(180/3.14f)-90);
        capot.setAngulo(-angulo*(180/3.14f)-90);
    }
    @Override
    public void fatras()
    {
        angulo-=0.05f;
        carroceria.setAngulo(-angulo*(180/3.14f)-90);
        capot.setAngulo(-angulo*(180/3.14f)-90);
    }
    @Override
    public void fd()
    {
        //speed=speed+acel;
        x-=Math.cos(angulo)*speed;
        z-=Math.sin(angulo)*speed;
        
    }
    @Override
    public void Avanzar(float f){
        if(!ColisionP((x+(float)Math.cos(angulo)*speed), z+(float)Math.sin(angulo)*speed)){
            
            x-=Math.cos(angulo)*speed;
            z-=Math.sin(angulo)*speed;
            
        }else{
            JOptionPane.showMessageDialog(null, "Has Chocado　　　 Game Over");
            System.exit(0);
        }
        
        if(!Colision((x+(float)Math.cos(angulo)*speed), z+(float)Math.sin(angulo)*speed)){
            
            x-=Math.cos(angulo)*speed;
            z-=Math.sin(angulo)*speed;
            
        }else{
            JOptionPane.showMessageDialog(null, "Has Chocado　　　 Game Over");
            System.exit(0);
        }
        
        if(!Meta((x+(float)Math.cos(angulo)*speed), z+(float)Math.sin(angulo)*speed, RaceV2.partida.Getx(),RaceV2.partida.Getz())){
            
            x-=Math.cos(angulo)*speed;
            z-=Math.sin(angulo)*speed;
            
        }else{
            JOptionPane.showMessageDialog(null, "WINNER　　　");
            System.exit(0);
        }
    }
    @Override
    public void fb()
    {
//        speed=speed+0.005f;
//        if(!Colision((x+(float)Math.cos(angulo)*speed), z+(float)Math.sin(angulo)*speed)){
//            
            x+=Math.cos(angulo)*speed;
            z+=Math.sin(angulo)*speed;
//        }else
//        {
//            JOptionPane.showMessageDialog(null, "Has Chocado　　　 Game Over");
//            System.exit(0);
//        }
    }
    public void MoveLeft()
    {
        x+=0.02f;
    }
    public void MoveRight()
    {
        x-=0.02f;
    }
    public void GiroDerecha(){
        angulo+=0.05f;
        carroceria.setAngulo(-angulo*(180/3.14f)-90);
        capot.setAngulo(-angulo*(180/3.14f)-90);
        
    }
    
    public void GiroIzquierda()
    {
        angulo-=0.05f;
        carroceria.setAngulo(-angulo*(180/3.14f)-90);
        capot.setAngulo(-angulo*(180/3.14f)-90);
        
    }
}
