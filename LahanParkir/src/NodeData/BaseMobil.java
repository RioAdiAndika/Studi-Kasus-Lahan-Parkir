package NodeData;

public abstract class BaseMobil {
    protected String platNomor;

    public BaseMobil(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }
}
