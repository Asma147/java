import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public interface Management {
    void displayProducts(List<Produit> products, Consumer<Produit> con);
    void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre, Consumer<Produit> con);
    String returnProductsNames(List<Produit> products, Function<Produit, String> fun);
    Produit createProduct(Supplier<Produit> sup);
    List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com);
    Stream<Produit> convertToStream(List<Produit> products);
}
