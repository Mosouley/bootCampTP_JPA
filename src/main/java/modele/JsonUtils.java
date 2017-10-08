package modele;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soul Classe static pour permettre la conversion d'un object java en
 * json et vis versa
 */
public class JsonUtils {

    private static ObjectMapper mapper;

    //block static permettant de créer le mapper une seule fois
    static {
        mapper = new ObjectMapper();
    }

    /**
     *
     * @param file
     * @param object
     */
    //methode de convertion d'un objet java
    public static void convertJavaToJson(File file, Object object) {

        try {
            mapper.writeValue(file, object);

        } catch (IOException ex) {
            System.out.println("Exception in converting jAVA Object to Json Object" + ex.getMessage());
        }

    }

    /**
     *
     * @return
     */
    public static <T> T convertJsonToJava(File fichier, Class<T> cls) {

        T result = null;
        try {

            result = mapper.readValue(fichier, cls);

            return result;
        } catch (IOException ex) {
            System.out.println("Exception in converting Json File to Java Object" + ex.getMessage());
        }
        return result;
    }

    /**
     *
     * @param <T>
     * @param fichier
     * @param obj
     * @param cls
     * @return
     */
    public static <T> List<T> convertArrayJsonToJava(File fichier, Class<T> obj) {

//        List<T> result = null;
        List<T> lstT = null;
        try {
            JsonFactory f = new JsonFactory();
            
            JsonParser jp = f.createJsonParser(fichier);
            TypeReference<List<T>> tRef = new TypeReference<List<T>>() {
            };
            lstT = mapper.readValue(jp, tRef);
//            for (T objT : lstT) {
//                System.out.println(objT.toString());
//            }

        } catch (JsonGenerationException | JsonMappingException e) {
            System.out.println("Impossible de convertir en un objet java " +e.getMessage());
        } catch (IOException e) {
             System.out.println("Impossible de convertir en un objet java " +e.getMessage());
        }
//        try {
//            List<T> myObjects = Arrays.asList(mapper.readValue(jsonInput,T[].class); // new TypeReference<List<T>>()
//            result = Arrays.asList(mapper.readValue(fichier, obj));
//        } catch (IOException ex) {
//           System.out.println("Impossible de convertir en un objet java " +ex.getMessage());
//        }
//
        return lstT;

    }
}
