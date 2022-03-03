public class LaptopFactory {
    public Laptop createLaptop(String name){
        if (name.equals("Acer")){
            return new Acer();
        }
        else if (name.equals("HP")){
            return new HP();
        }
        else if (name.equals("Asus")){
            return new Asus();
        }
        else if (name.equals("Mac")){
            return new Mac();
        }
        else if (name.equals("Lenovo")){
            return new Lenovo();
        }
        else{
            return null;
        }
    }
}
