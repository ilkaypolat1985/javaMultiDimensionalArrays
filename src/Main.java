public class Main {

    public static void main(String[] args) {

        String[][] cities = new String[3][2];

        // Marmara District in Turkey
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";

        // Ege District in Turkey
        cities[1][0] = "İzmir";
        cities[1][1] = "Manisa";

        // Karadeniz District in Turkey
        cities[2][0] = "Samsun";
        cities[2][1] = "Giresun";


        for(int i = 0; i < 3; i++){
            System.out.println("\n####################");
            System.out.println("District");
            for(int j = 0; j < 2; j++){
                System.out.println("City : " + cities[i][j]);
            }
        }
    }
}
