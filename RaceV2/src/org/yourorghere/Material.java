/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Eddy Sanchez
 * Generador de Materiales
 */
/**
     * 
     * @brief Clase manejadora de colores y materiales
     */
public class Material {
    private float[] rgbaa;
    private float[] rgbad;
    private float[] rgbas;
    private float sh;
    public GL gl;

    public Material(float ra,float ga,float ba,float rd,float gd,float bd,float rs,float gs,float bs,float sh1,GL gl1)
    {
        rgbaa =  new float[]{ra,ga,ba};
        rgbad =  new float[]{rd,gd,bd};
        rgbas =  new float[]{rs,gs,bs};
        sh = sh1;
        gl=gl1;
    }
    /**
     * 
     * @brief Definicion de materiales con sus atributos 
     */
    public void DrawMaterial(){
        float [] ambient={rgbaa[0],rgbaa[1],rgbaa[2],1};
        float [] difuse={rgbad[0],rgbad[1],rgbad[2],1};//ultimo valor = transparencia
        float [] especular={rgbas[0],rgbas[1],rgbas[2],1};
/**
     * 
     * @brief Prpiedades del material
     */
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, ambient,0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, difuse,0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, especular,0);
        //ultimo valor define la intensidad de brillo desde 1-128
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS,sh);
    }
    
}
