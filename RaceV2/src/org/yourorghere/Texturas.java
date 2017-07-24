
package org.yourorghere;


import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author Eddy Sanchez
 * Generador de Texturas y materiales
 */
public class Texturas {
    public Texture textura,textura1,textura2,textura3,textura4,textura5,textura6;
    public Texturas (String file1,String file2,String file3,String file4,String file5,String file6,String file7) throws IOException{
        textura= TextureIO.newTexture(new File(file1),true);
        textura1= TextureIO.newTexture(new File(file2),true);
        textura2= TextureIO.newTexture(new File(file3),true);
        textura3= TextureIO.newTexture(new File(file4),true);
        textura4= TextureIO.newTexture(new File(file5),true);
        textura5= TextureIO.newTexture(new File(file6),true);
        textura6= TextureIO.newTexture(new File(file7),true);
    }
    public Texture gettextura(){
		return textura;

	}
    
}
