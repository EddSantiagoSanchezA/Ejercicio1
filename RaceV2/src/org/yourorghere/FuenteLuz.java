/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class FuenteLuz {
    public static int luz;
    private GL gl;
//    float [] position;
    public FuenteLuz(int luz1,GL gl1){
        luz=luz1;
        gl=gl1;
    }
    public void luz(){
        if(luz==1){
        float [] position={0,10,10,1};
//        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={1f,1f,1f,1};
        float [] diffuse={1f,1f,1f,1};
        float [] specular={1,1,1,1};
        
        
//        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }
        else if(luz==2){
        float [] position={0,10,-10,1};
//        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={1,1,1,1};
        float [] diffuse={1f,1f,1f,1};//ultimo valor = transparencia
        float [] specular={1,1,1,1};
        
        
//        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }
        else if(luz==3){
        float [] position={0,10,0,1};
//        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={0.5f,0.5f,0.5f,1};
        float [] diffuse={1f,1f,1f,1};//ultimo valor = transparencia
        float [] specular={1,1,1,1};
        
        
//        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }else if(luz==4){
        float [] position={-30,5,-30,1};
//        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={0.5f,0.5f,0.5f,1};
        float [] diffuse={1f,1f,1f,1};//ultimo valor = transparencia
        float [] specular={1,1,1,1};
        
        
//        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }else if(luz==5){
        float [] position={30,5,-30,1};
//        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={0.5f,0.5f,0.5f,1};
        float [] diffuse={1f,1f,1f,1};//ultimo valor = transparencia
        float [] specular={1,1,1,1};
        
        
//        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }
            else if(luz==6){
        float [] position={0,10,0,1};
        float [] global_ambiental={0,0,0,1};//eleiminar componente
        float [] ambiental={0,0,0,1};
        float [] diffuse={1f,1f,1f,1};//ultimo valor = transparencia
        float [] specular={1,1,1,1};
        
        
        gl.glLightModelfv(GL.GL_LIGHT_MODEL_AMBIENT,global_ambiental,0);//para eliminar la luz ambiental por completo
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambiental,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, specular,0);
        }
        
        
    }
    public void CambioLuz()
    {
        if(luz==5)
        {
            luz=1;
        }else
        {
            luz=luz+1;
        }
    }
    public float  Getl()
    {
        return luz;
    }
    
    public void Update()
    {
        luz=luz;
    }
    
}
