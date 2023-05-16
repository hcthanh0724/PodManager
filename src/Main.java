import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            ManagePod controllers = new ManagePod();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("MENU");
                System.out.println("1, Them pod");
                System.out.println("2, Hien thi pod");
                System.out.println("3, Xoa pod");
                System.out.println("4, Sua pod");
                System.out.println("5,  Quit");
                int so = Integer.parseInt(scanner.nextLine());
                switch (so) {
                    case 1:
                        controllers.add();
                        break;

                    case 2:
                        controllers.show();
                        break;
                    case 3:
                        controllers.delete();
                        break;
                    case 4:
                        controllers.edit();
                        break;
                    case 5:
                        System.exit(0);
                        break;

            }
    }}
}