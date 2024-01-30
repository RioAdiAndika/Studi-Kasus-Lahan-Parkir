package ModelData;


import ModelJSON.ModelJSONParkir;
import NodeData.NodeParkir;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Date;


public class ModelParkir {
    private ArrayList<NodeParkir> parkirList;
    private ModelJSONParkir modelJSONParkir;

    public ModelParkir() {
        parkirList = new ArrayList<NodeParkir>();
        modelJSONParkir = new ModelJSONParkir("src/Database/StrukParkir.json");
        LoadParkir();
    }

    public void LoadParkir() {
        parkirList = modelJSONParkir.readFromFile(new TypeToken<ArrayList<NodeParkir>>() {
        }.getType());
    }

    public void AddParkir(NodeParkir parkir) {
        parkirList.add(parkir);
    }

    public void commit() {
        modelJSONParkir.writeToFile(parkirList);
    }

    public Date GetCheckIn(String platNomor) {
        for (NodeParkir parkir : parkirList) {
            if (parkir != null && parkir.getPlatNomor().equals(platNomor)) {
                return parkir.getCheckIn();
            } else {
                System.out.println("Mobil dengan plat nomor " + platNomor + " tidak ditemukan.");
            }
        }
        return null;
    }

    public Date GetCheckOut(String platNomor) {
        for (NodeParkir parkir : parkirList) {
            if (parkir != null && parkir.getPlatNomor().equals(platNomor)) {
                return parkir.getCheckOut();
            } else {
                System.out.println("Mobil dengan plat nomor " + platNomor + " tidak ditemukan.");
            }
        }
        return null;
    }

    public int GetHarga(String platNomor) {
        for (NodeParkir parkir : parkirList) {
            if (parkir != null && parkir.getPlatNomor().equals(platNomor)) {
                return parkir.getHarga();
            } else {
                System.out.println("Mobil dengan plat nomor " + platNomor + " tidak ditemukan.");
            }
        }
        return 0;
    }

}