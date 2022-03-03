import java.util.*;
public class LaptopMaker {
    public static void main(String[] args){
        System.out.println("What kind of Laptop do you want to make?");
        System.out.println(" 1.Acer \n 2.Asus \n 3.HP \n 4.Lenovo \n 5.Mac \n");
        LaptopFactory laptopFactory = new LaptopFactory();
        Scanner option = new Scanner(System.in);
        String brand = option.nextLine();
        Laptop laptop = laptopFactory.createLaptop(brand);
        laptop.LaptopName();
    }
}
