package NodeData;

import java.util.Date;
import java.util.HashMap;

public class NodeParkir {
    String platNomor;
    Date checkIn;
    Date checkOut;
    int Harga;

    public NodeParkir (String platNomor, Date checkIn, Date checkOut, int Harga) {
        this.platNomor = platNomor;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.Harga = Harga;
    }
    public String getPlatNomor() {
        return platNomor;
    }
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    public int getHarga() {
        return Harga;
    }
    public void setHarga(int harga) {
        Harga = harga;
    }
}
