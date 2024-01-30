package NodeData;

import java.util.Date;

public class NodeMobil extends BaseMobil {
        Date checkInTime;

        public NodeMobil (String platNomor, Date checkInTime) {
            super(platNomor);
            this.platNomor = platNomor;
            this.checkInTime = checkInTime;
        }
    public String getPlatNomor() {
        return platNomor;
    }
    public Date getCheckInTime() {
        return checkInTime;
    }

}

