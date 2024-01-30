import Controller.MenuController;
import ModelData.ModelAdmin;
import ModelData.ModelMobil;
import ModelData.ModelParkir;
import View.View;

public class Main {
    public static void main(String[] args) {
        MenuController controller1 = new MenuController(new ModelAdmin(),new ModelMobil(),new ModelParkir());
        View viewMenu = new View(controller1);
        viewMenu.ParkirOnline();
    }
}