import java.util.ArrayList;
import java.util.Scanner;

public class ManagePod extends PodSystem{
    Scanner scanner = new Scanner(System.in);
    static ArrayList<PodSystem> arrayList = new ArrayList<>();
    static {
        arrayList.add(new PodSystem("JellyBox",590000,"Rincoe","Jellytank Atomizer",100000,true,true));
        arrayList.add(new PodSystem("Xlim",390000,"Oxva","OXVA Xlim",100000,true,true));
        arrayList.add(new PodSystem("Origin",490000,"Oxva","OXVA Origin",80000,true,true));
        arrayList.add(new PodSystem("XZ",790000,"Rincoe","Jellytank Atomizer",120000,true,true));
    }
    public void show(){
        for(PodSystem y2k : arrayList){
            System.out.println(y2k);
        }
    }
    public void add(){
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà sản xuất");
        String publisher = scanner.nextLine();
        System.out.println("Nhập tên tank/coil");
        String tankSystem = scanner.nextLine();
        System.out.println("Nhập giá tank/coil");
        int tankPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tình trạng pod");
        boolean podCondition = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập tình trạng tank/coil");
        boolean tankCondition = Boolean.parseBoolean(scanner.nextLine());
        arrayList.add(new PodSystem(name,price,publisher,tankSystem,tankPrice,podCondition,tankCondition));
    }
    public void edit(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        arrayList.remove(id - 1);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà sản xuất");
        String publisher = scanner.nextLine();
        System.out.println("Nhập tên tank/coil");
        String tankSystem = scanner.nextLine();
        System.out.println("Nhập giá tank/coil");
        int tankPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tình trạng pod");
        boolean podCondition = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập tình trạng tank/coil");
        boolean tankCondition = Boolean.parseBoolean(scanner.nextLine());
        arrayList.add(id -1,new PodSystem(name,price,publisher,tankSystem,tankPrice,podCondition,tankCondition));
    }

    public void delete(){
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        arrayList.remove(id -1);
    }
}
