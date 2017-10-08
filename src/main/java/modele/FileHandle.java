package modele;

import java.io.InputStream;


/**
 *
 * @author soul
 */
public class FileHandle {

    public static InputStream inputStreamFromFile(String path) {
        InputStream inputStream = null;

        try {
            inputStream = FileHandle.class.getResourceAsStream(path);
        } catch (Exception e) {
            System.out.println("Fichier introuvable sur ce chemin");
        }

        return inputStream;
    }

//    public static void outputStreamToFile(Class obj, Object jsonObject) {
//
//        File file = new File(obj.getSimpleName() + ".json");//
//        System.out.println("======================");
////                System.out.println(file);
////        FileWriter fw;
//        ObjectMapper mapper=new ObjectMapper();
//        try {
//            if (file.exists()) {
////                System.out.println( file.getAbsolutePath());
////                fw = new FileWriter(jsonObject);//if file exists append to file. Works fine.
////                
////                fw.close();
//                mapper.writeValue(file, jsonObject);
//            } else {
////                System.out.println( file.getAbsolutePath());
//                file.createNewFile();
////                fw = new FileWriter(jsonObject);
////                fw.close();
//                mapper.writeValue(file, jsonObject);
//                System.out.println("======================");
//            
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getStackTrace());
//        }

//    }
}
