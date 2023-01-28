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
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }
    public int getId() {
        return this.id;
    }
}  
class MyStreamAPIUsage {  
    public static void start() {
        System.out.println("Inside Stream API Module");
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Sachin",100f));
        products.add(new Product(2,"Sourav",200f));
        products.add(new Product(3,"Virat",300f));
        products.add(new Product(4,"Dhone",400f));
        products.add(new Product(5,"Rohit",500f));
        System.out.println(products.stream().filter(p -> p.price >300).map(p->p.price).collect(Collectors.toList()));
        System.out.println(products.stream().filter(p -> p.name == "B" || p.name == "C").map(p->p.id + " " +p.name + " " + p.price).collect(Collectors.toList()));
        System.out.println(products.stream().sorted(Comparator.comparing(Product::getName).reversed()).map(p->p.id + " " +p.name + " " + p.price).collect(Collectors.toList()));
        System.out.println(products.stream().sorted(Comparator.comparing(Product::getId)).map(p->p.id + " " +p.name + " " + p.price).collect(Collectors.toList()));
        System.out.println(products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).map(p->p.id + " " +p.name + " " + p.price).collect(Collectors.toList()));  
    }
}
