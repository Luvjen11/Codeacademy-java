/*
 * Program that prints out a continent and it's largest city
 * based on value of the integer
 */

public class Continents {
    public static void main(String[] args) {
         
        int continent = 4;

        switch (continent) {
            case 1:
                System.out.println("America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: San Paulo, Brazil");
                break;        
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Oceania: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antartica: McMurdo Station, US");
                break;
            default:
                break;
        }



    }
}
