public class TableAndChairs {
    private String[] mytablechair = {
            "X                      X",
            "X                      X",
            "X      XXXXXXXXXX      X",
            "XXXXX  X        X  XXXXX",
            "X   X  X        X  X   X",
            "X   X  X        X  X   X"
    };

    public TableAndChairs() {
    }

    public static void main(String[] args) {
        TableAndChairs myobject = new TableAndChairs();
        for(int i=0;i<6;i++) {
            System.out.println(myobject.mytablechair[i]);
        }
    }
}
