package org.yourorghere;


import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.GLUT;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy Sanchez
 * Clase Principal
 */
/**
 * 
 * @brief Clase principal
 */
public class RaceV2 implements GLEventListener {
    
    /**
 * 
 * @brief declaracion de variables a utilizarce
 */
    
    public static Cubo piso,cielo, partida,cielo1,cielo2,cielo3;
    Pista pista;
    public static Vector<Float> caminox,caminoz,caminox1,caminoz1,caminox2,caminoz2;
    public static ConjuntoCasas conjunto;
    public  static Auto Enemigo,Enemigo1,Enemigo2,Enemigo3;
    public  static AutoFperson car;
    public ArrayList<Building> edificio;
    public static ArrayList<Poste> posteE;
    public ArrayList<House> casas,casas2;
    public static ArrayList<Auto> carenemi;
    public static FuenteLuz luz;
    public static Poste poste1,poste2,poste3,poste4,poste5,poste6; 
    CentralPark parque,parque1,parque2,parque3,parque4;
    float eje[]={-3,-4f,-5,-4f,-3}; 

    boolean esfera;
    public static Texturas textura,textura1,textura2,textura3,textura4;
    public static boolean velocidad=false,camara=false;
    
    public static void main(String[] args) {
        
        /**
 * 
 * @brief creacion del lienzo o panall de juego
 */
        Frame frame = new Frame("RaceV2");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new RaceV2());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
        /**
 * 
 * @brief se llama al canves para que sea visible
 */
        canvas.addGLEventListener(new RaceV2());
        /**
 * 
 * @brief Se activa el escuchador de eventos
 */
        JoglKeyListener klistener=new JoglKeyListener(canvas);
        canvas.addKeyListener(klistener);
        
    }

    public void init(GLAutoDrawable drawable) {
       
        GL gl = drawable.getGL();
        GLUT glut=new GLUT();
/**
 * 
 * @brief Se activa las Luces
 */
        gl.glEnable(GL.GL_DEPTH_TEST);//permite q se vean las caras de las cosas sin importar el orden
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_TEXTURE_2D);
        
/**
 * 
 * @brief Se declara las texturas a usarce
 */
        try {
            textura=new Texturas("Fondo.jpg","text1.jpg","text2.jpg","text3.jpg","text4.jpg","text5.jpg","text6.jpg");
            
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        textura.textura.disable();
        textura.textura1.disable();
        textura.textura2.disable();
        textura.textura3.disable();
        textura.textura4.disable();
        textura.textura5.disable();
        textura.textura6.disable();
        
        
        try {
            pista=new Pista(-6, -2f, 0, 1, 1, 1, gl, 0, 1);
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            car=new  AutoFperson(31, 0, -15, 1, 1, 1,0.01f,new Vector(0),new Vector(0), 30,gl, 0.25f, 0.30f, 0.35f,2,1);
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**
 * 
 * @brief Declaracion de guia para los rivales automaticos
 */
        caminox= new Vector(16);    
        caminox.add(33f);
        caminox.add(33f);
        caminox.add(28f);
        caminox.add(20f);
        caminox.add(-28f);
        caminox.add(-35f);
        caminox.add(-30f);
        caminox.add(20f);
        caminox.add(25f);
        caminox.add(20f);
        caminox.add(-30f);
        caminox.add(-35f);
        caminox.add(-35f);
        caminox.add(-25f);
        caminox.add(25f);
        caminox.add(33f);
        caminox.add(34f);
        
        caminoz= new Vector(16);
        caminoz.add(0f);
        caminoz.add(20f);
        caminoz.add(28f);
        caminoz.add(30f);
        caminoz.add(30f);
        caminoz.add(20f);
        caminoz.add(10f);
        caminoz.add(10f);
        caminoz.add(0f);
        caminoz.add(-10f);
        caminoz.add(-10f);
        caminoz.add(-15f);
        caminoz.add(-25f);
        caminoz.add(-30f);
        caminoz.add(-30f);
        caminoz.add(-20f);
        caminoz.add(-0f);
        
        caminox1= new Vector(16);   caminoz1= new Vector(16);
        caminox1.add(31f);          caminoz1.add(0f);
        caminox1.add(31f);          caminoz1.add(20f);
        caminox1.add(26f);          caminoz1.add(26f);
        caminox1.add(19f);          caminoz1.add(28f);
        caminox1.add(-28f);         caminoz1.add(28f);
        caminox1.add(-35f);         caminoz1.add(18f);
        caminox1.add(-30f);         caminoz1.add(8f);
        caminox1.add(20f);          caminoz1.add(8f);
        caminox1.add(23f);          caminoz1.add(0f);
        caminox1.add(20f);          caminoz1.add(-8f);
        caminox1.add(-32f);         caminoz1.add(-8f);
        caminox1.add(-37f);         caminoz1.add(-15f);
        caminox1.add(-37f);         caminoz1.add(-25f);
        caminox1.add(-25f);         caminoz1.add(-32f);
        caminox1.add(25f);          caminoz1.add(-32f);
        caminox1.add(31f);          caminoz1.add(-20f);
        caminox1.add(31f);          caminoz1.add(0f);
        
        caminox2= new Vector(16);   caminoz2= new Vector(16);
        caminox2.add(35f);          caminoz2.add(0f);
        caminox2.add(35f);          caminoz2.add(20f);
        caminox2.add(20f);          caminoz2.add(30f);
        caminox2.add(20f);          caminoz2.add(32f);
        caminox2.add(-30f);         caminoz2.add(32f);
        caminox2.add(-37f);         caminoz2.add(20f);
        caminox2.add(-30f);         caminoz2.add(10f);
        caminox2.add(20f);          caminoz2.add(12f);
        caminox2.add(27f);          caminoz2.add(0f);
        caminox2.add(20f);          caminoz2.add(-12f);
        caminox2.add(-30f);         caminoz2.add(-12f);
        caminox2.add(-33f);         caminoz2.add(-15f);
        caminox2.add(-33f);         caminoz2.add(-25f);
        caminox2.add(-25f);         caminoz2.add(-28f);
        caminox2.add(25f);          caminoz2.add(-28f);
        caminox2.add(35f);          caminoz2.add(-22f);
        caminox2.add(35f);          caminoz2.add(0f);
        /**
 * 
 * @brief se inicializa todos los componentes del juego: objetos, autos, etc
 */
        
        try {
            Enemigo= new Auto(33, 0,-12, 1, 1,1, 0.11f,caminox,caminoz, gl,1,0,0,4,1);
            Enemigo1= new Auto(31, 0,-9, 1, 1,1, 0.11f,caminox1,caminoz1, gl,1,0,0,4,1);
            Enemigo2= new Auto(34, 0,-6, 1, 1,1, 0.11f, caminox2,caminoz2,gl,1,0,0,4,1);
            carenemi=new ArrayList<Auto>();
            carenemi.add(Enemigo);
            carenemi.add(Enemigo1);
            carenemi.add(Enemigo2);
            
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        poste1=new Poste(-25, 0, -35, 1, 1, 1, -35,-25,gl, 0, 1);
        poste2=new Poste(25, 0, -28, 1, 1, 1,-35,-25, gl, 0, 1);
        poste3=new Poste(10, 0, 30, 1, 1, 1,35,25, gl, 0, 1);
        poste4=new Poste(-15, 0, 28, 1, 1, 1, 35,25,gl, 0, 1);
        poste5=new Poste(10, 0, 5, 1, 1, 1,5,15, gl, 0, 1);
        poste6=new Poste(-15, 0, -5, 1, 1, 1,-15,-5, gl, 0, 1);
        
        posteE= new ArrayList<Poste>();
         posteE.add(poste1);
         posteE.add(poste2);
         posteE.add(poste3);
         posteE.add(poste4);
         posteE.add(poste5);
         posteE.add(poste6);
        try {
            parque= new CentralPark(18, -1f, -20,0.5f ,0.5f,0.5f,gl);
            parque1= new CentralPark(-18, -1f, -20,0.5f ,0.5f,0.5f,gl);
            parque2= new CentralPark(18, -1f, 20,0.5f ,0.5f,0.5f,gl);
            parque3= new CentralPark(-15, -1f, 20,0.5f ,0.5f,0.5f,gl);
            parque4= new CentralPark(0, -1f, 0f,0.5f ,0.5f,0.5f,gl);
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            piso=new Cubo(0f ,-2f,1f,90f,0.125f,85f, 0,gl, 1f,0.12f,0.25f,4f,1f);
            partida=new Cubo(34, -1.5f, -20, 7, 0.25f,2, 0, gl, 0.23f, 0.13f, 0.12f, 4, 4);
            cielo=new Cubo(0,10f,-43,90f,30f,0.25f,0,gl,0,0.25f,0.60f,1f,1f);
            cielo1=new Cubo(0,10f,+43,90f,30f,0.25f,0,gl,0,0.25f,0.60f,1f,1f);
            cielo2=new Cubo(45,10f,0,0.25f,30f,90,0,gl,0,0.25f,0.60f,1f,1f);
            cielo3=new Cubo(-44,10f,0,0.25f,30f,90,0,gl,0,0.25f,0.60f,1f,1f);
        } catch (IOException ex) {
            Logger.getLogger(RaceV2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        luz=new FuenteLuz(1, gl);
        
        
        

        
        
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        gl.setSwapInterval(1);
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        
        
    }
    
     
    public void display(GLAutoDrawable drawable) {
        /**
 * 
 * @brief Se llama a los objetos creados e inicializados para que se muestren en las escenas
 */
        if(velocidad){
            car.Avanzar(0);
            for(Poste e:posteE)
            {
                e.Movimiento();
            }

            for(Auto e:carenemi)
            {
                e.Ruta();
            }
            
        }
        
        GL gl = drawable.getGL();//contiene las primitivas mas basicas
        GLU glu = new GLU();//contiene metodos mas avanzados
        GLUT glut=new GLUT();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);//limpia los buffer a sus valores predeterminados
        
        //guarda y recuperada la matriz 
        gl.glMatrixMode(GL.GL_MODELVIEW);//especifica que matriz es la matriz actual
        gl.glLoadIdentity();// reemplaza la matriz actua por la identidad
        if(camara){
            glu.gluLookAt(car.Getx()+(Math.cos(car.angulo)*6), car.Gety()+3, car.Getz()+(Math.sin(car.angulo)*6), car.Getx(), car.Gety(), car.Getz(), 0, 1f, 0);
        }else{
            glu.gluLookAt(0f,  60f, 0, 0, 0,  -3, 0,  1,  0);
        }     
        gl.glPushMatrix();
        gl.glTexEnvf(GL.GL_TEXTURE_ENV,GL.GL_TEXTURE_ENV_MODE,GL.GL_REPLACE);
        cielo.DrawCube();
        cielo1.DrawCube();
        cielo2.DrawCube();
        cielo3.DrawCube();
        piso.DrawCube();
        pista.DrawPista();
        partida.DrawCube();
            parque.DrawPark();
            parque1.DrawPark();
            parque2.DrawPark();
            parque3.DrawPark();
            parque4.DrawPark();
        
        for(Poste e:posteE)
        {
            e.DrawPoste();
        }
        for(Auto e:carenemi)
        {
            e.DrawAuto();
        }
                car.DrawAuto();
        /*for(Building e:edificio)
        {
            e.DrawBuilding();
        }*/
        /*for(Building e:edificio)
        {
            gl.glPopMatrix();
            gl.glPushMatrix();
            gl.glRotatef(90, 0, 1, 0);
            e.DrawBuilding();
            gl.glPopMatrix();
        }*/
        
        /*gl.glColor3f(1,1,1) ;
        gl.glLineWidth(2.0f);
        gl.glBegin(GL.GL_LINE_STRIP);
        gl.glVertex3f (33,1,0);
        gl.glVertex3f (33,1,20);
        gl.glVertex3f (28,1,28);
        gl.glVertex3f (20,1,30);
        gl.glVertex3f (-28,1,30);
        gl.glVertex3f (-35,1,20);
        gl.glVertex3f (-30,1,10);
        gl.glVertex3f (20,1,10);
        gl.glVertex3f (25,1,0);
        gl.glVertex3f (20,1,-10);
        gl.glVertex3f (-30,1,-10);
        gl.glVertex3f (-35,1,-15);
        gl.glVertex3f (-35,1,-25);
        gl.glVertex3f (-25,1,-30);
        gl.glVertex3f (25,1,-30);
        gl.glVertex3f (33,1,-20);
        gl.glVertex3f (33,1,-0);
        gl.glEnd();*/

        
        gl.glPopMatrix();
        luz.luz();
        
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(70f, 640/480, 1, 80.0);
        
        
        gl.glFlush();
        
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

}

