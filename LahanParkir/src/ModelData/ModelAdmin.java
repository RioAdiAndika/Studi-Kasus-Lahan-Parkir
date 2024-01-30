package ModelData;

import NodeData.NodeAdmin;

    public class ModelAdmin {

    public boolean cekLogin(String id, String pw) {
        NodeAdmin admin = new NodeAdmin();
        if (id.equals(admin.getUsername()) && pw.equals(admin.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
