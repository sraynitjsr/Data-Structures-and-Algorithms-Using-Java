import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    public int compareTo(Product p) {
        return id - p.id ;
    }
}  
class MyStreamAPIUsage {  
    public static void start() {
        System.out.println("Inside Stream API Module");
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"A",100f));
        products.add(new Product(2,"B",200f));
        products.add(new Product(3,"C",300f));
        products.add(new Product(4,"D",400f));
        products.add(new Product(5,"E",500f));
        System.out.println(products.stream().filter(p -> p.price >300).map(p->p.price).collect(Collectors.toList()));
        System.out.println(products.stream().filter(p -> p.name == "B" || p.name == "C").map(p->p.id + " " +p.name + " " + p.price).collect(Collectors.toList()));
        System.out.println(products.stream().sorted((p1, p2) -> p1.compareTo(p2)).collect(Collectors.toList()));
    }
}
