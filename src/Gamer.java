import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private final String nameGamer;
    private int numberPoints;

    public Gamer(String nameGamer, int numberPoints) {
        this.nameGamer = nameGamer;
        this.numberPoints = numberPoints;
    }

    public String getNameGamer() {
        return nameGamer;
    }

    public int getNumberPoints() {
        return numberPoints;
    }

    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }

    @Override
    public String toString() {
        return " Игрок " +
                nameGamer + '\'' +
                ", количество очков = " + numberPoints;
    }

    public static void calculateTheWinner (String[] arr) {
        int maxPoints = 0;
        String nameWinner = null;

        List<Gamer> listGamer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int firstIndexSpace = arr[i].indexOf(" ");
            String nameGamerArr = arr[i].substring(0, firstIndexSpace);
            int numberPointsArr = Integer.parseInt(arr[i].substring(firstIndexSpace + 1));

            if (!listGamer.isEmpty()) {
                for(int j = 0; j < listGamer.size(); j++){
                    if (listGamer.get(j).getNameGamer().equalsIgnoreCase(nameGamerArr)) {
                        numberPointsArr = numberPointsArr + listGamer.get(j).getNumberPoints();
                        listGamer.get(j).setNumberPoints(numberPointsArr);
                        break;
                    } else if (!listGamer.get(j).getNameGamer().equalsIgnoreCase(nameGamerArr) && j == listGamer.size()-1){
                        Gamer gamer = new Gamer(nameGamerArr, numberPointsArr);
                        listGamer.add(gamer);
                        break;
                    }
                }
            } else {
                Gamer gamer = new Gamer(nameGamerArr, numberPointsArr);
                listGamer.add(gamer);
            }
        }
        for (Gamer g : listGamer) {
            maxPoints = g.getNumberPoints();

            for (int z = 0; z < listGamer.size(); z++) {
                if (listGamer.get(z).getNumberPoints() > g.getNumberPoints()) {
                    maxPoints = listGamer.get(z).getNumberPoints();
                    nameWinner = listGamer.get(z).getNameGamer();
                    break;
                }
                else if (listGamer.get(z).getNumberPoints() == g.getNumberPoints()){
                    maxPoints = listGamer.get(z).getNumberPoints();
                    nameWinner = listGamer.get(z).getNameGamer();
                    break;
                }
            }
        }
        System.out.println("Имя победителя - " + nameWinner + "," + " количество очков = " + maxPoints);
    }
}

