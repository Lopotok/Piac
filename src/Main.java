import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Aru> aruk = new ArrayList<>();
        List<String> lines =FileReader.fileReadHandler("src/piac.txt");

 /*       tobb iz eseten:
        Flavor flavor;
        switch ((linesAsArray[4]){
            case "sos"->flavor = Izek.SOS;
            case "edes"->flavor = Izek.EDES;
 */

        for (String line:lines){
            String[] linaAsArray= line.split(";");

            aruk.add(new Aru(linaAsArray[0],linaAsArray[1],Integer.parseInt(linaAsArray[2]),
                    Boolean.parseBoolean(linaAsArray[3]), linaAsArray[4].equals("sós") ? Izek.SOS :Izek.EDES));

            // tobb iz eseten
        }
        int hatosagiaras = 0;

        for ( var actual : aruk){
            if (actual.isGovermentPrice()){
             //   if(actual.flavour().equals(Flavor.SALT))
                hatosagiaras++;
            }
            System.out.println(actual);

        }
        System.out.println("Ennyi darab hatosagi aras termek van "  + hatosagiaras);




            


    }
}