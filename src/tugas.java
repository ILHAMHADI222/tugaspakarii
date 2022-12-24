import java.util.ArrayList;

public class tugas {
    public static void main(String[] args) {
        ArrayList<int[]> Stopgo = new ArrayList<int[]>();
        Stopgo.add(new int[]{10,0});
        Stopgo.add(new int[]{3,5});
        Stopgo.add(new int[]{2,5});

        System.out.println(getPassenger(Stopgo));

    }
    public static int getPassenger( ArrayList< int[]>biskota){
        int totalpenumpang =0;
        for ( int i = 0; i<biskota.size(); i++){
            totalpenumpang += biskota.get(i)[0]-biskota.get(1)[0];
        }
        return  totalpenumpang;
    }

    }


