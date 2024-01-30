package ModelJSON;
import com.google.gson.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

    public class ModelJSONMobil {
        private final String fname;

        public ModelJSONMobil(String fname) {
            this.fname = fname;
            setupFile();
        }

        public boolean checkFile() {
            boolean status = false;
            if (new java.io.File(fname).exists()) {
                status = true;
            }
            return status;
        }

        public void setupFile() {
            try {
                if (checkFile() == false) {
                    File file = new File(fname);
                    if (file.createNewFile()) {
                        try (FileWriter fileWriter = new FileWriter(file, true);
                             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                            bufferedWriter.write("[]");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }
        }

        public JsonArray convertListToJsonArray(ArrayList list) {
            return new Gson().toJsonTree(list).getAsJsonArray();
        }

        private ArrayList convertJsonArrayToList(JsonArray jsonArray, Type type) {
            Gson gson = new Gson();
            return gson.fromJson(jsonArray, type);
        }

        public void writeToFile(ArrayList menuList) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(menuList);
            try (FileWriter file = new FileWriter(fname)) {
                file.write(json);
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }
        }

        public ArrayList readFromFile(Type type) {
            ArrayList list = new ArrayList<>();
            try (Reader reader = new FileReader(fname)) {
                JsonArray jsonArray = new JsonParser().parse(reader).getAsJsonArray();
                list = convertJsonArrayToList(jsonArray, type);
            } catch (Exception e) {
                System.out.println("Error.");
                e.printStackTrace();
            }
            return list;
        }

    }
