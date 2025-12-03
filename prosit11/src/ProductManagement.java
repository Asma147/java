import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public abstract class ProductManagement implements Management {
@Override
public void displayProducts(List<Produit> products, Consumer<Produit> con)
{

    for (Produit p : products) {
        con.accept(p);
    }
}
@Override
 public void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre,Consumer<Produit>con)
{
    for (Produit p : products) {
        if(pre.test(p))
            con.accept(p);
    }
}
@Override
public String returnProductsNames(List<Produit> products, Function<Produit, String> fun) {
        return products.stream()
                .map(fun)
                .collect(Collectors.joining(", "));
    }
    @Override
    public Produit createProduct(Supplier<Produit> sup) {
        return sup.get();
    }
    @Override
    public List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com) {
        return products.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }
    @Override
    public Stream<Produit> convertToStream(List<Produit> products) {
        return products.stream();
    }



}

