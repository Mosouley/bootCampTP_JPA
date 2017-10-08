
package modele;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author soul
 * Classe static pour permettre la conversion d'un object java en json et vis versa
 */
public class JsonUtils {
    private static ObjectMapper mapper;
    
    //block static permettant de créer le mapper une seule fois
    static{
        mapper=new ObjectMapper();
    }
    
    /**
     * 
     * @param file
     * @param object 
     */
    //methode de convertion d'un objet java
    public static void convertJavaToJson(File file,Object object){
       
        try {
             mapper.writeValue(file,object);
            
        } catch (IOException ex) {
            System.out.println("Exception in converting jAVA Object to Json Object" +ex.getMessage());
        }
      
    }
    /**
     * 
     * @return 
     */
    public static <T> T convertJsonToJava(File fichier, Class<T> cls){
        
        T  result=null;
        try {
            
            
            result=mapper.readValue(fichier, cls);
            
            return result;
        } catch (IOException ex) {
            System.out.println("Exception in converting Json File to Java Object" +ex.getMessage());
        }
        return result;
    }
    
    /**
     *
     * @param <T>
     * @param fichier
     * @param cls
     * @return
     */
//    public static <T> List<T>  convertJsonToJava(File fichier,Class<T[]>  cls){
//        
////        List<T>  result=null;
//             
////            result=mapper.readValue(fichier, cls);
//          List<T> result;
//        result = Arrays.asList( mapper.readValue(fichier, cls.class));
//
////        } catch (IOException ex) {
////            System.out.println("Exception in converting Json File to Java Object" +ex.getMessage());
////        }
//        return result;
//    }
}
