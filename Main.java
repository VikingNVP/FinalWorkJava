import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("Laptop 1", 8, "Windows10", 80000, "HP"));
        set.add(new Laptop("Laptop 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Laptop("Laptop 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Laptop("Laptop 4", 64, "linux", 90000, "Lenovo"));
        OperationWithLaptop operation = new OperationWithLaptop(set);
        operation.start();
    }
}