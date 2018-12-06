package util;//package util;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class Tools {
//    public static Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    public static void writeJsonToFile(String fileName, String text) {
//        try {
//            String dir = System.getProperty("user.dir") + File.separator + "json_" + File.separator + fileName;
//            File file = new File(dir);
//            FileWriter fileWriter = new FileWriter(file);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.print(text);
//            printWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//        }
//    }
//
////    public static void writeJson_toFile(LinkedList<String> list, HashMap<String, LinkedList<MdBean>> hashMap) {
////        String json_array = gson.toJson(list);
////        String json_map = gson.toJson(hashMap, new TypeToken<HashMap<String, LinkedList<MdBean>>>() {
////        }.getType());
////
//////        System.out.println(json_array);
//////        System.out.println(json_map);
////        writeJsonToFile("md-array.json", json_array);
////        writeJsonToFile("md-map.json", json_map);
////    }
//
//}
