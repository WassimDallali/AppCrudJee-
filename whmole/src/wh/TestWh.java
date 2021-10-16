package wh;


import java.util.List;
import metier.Produit;
public class TestWh {
public static void main(String[] args) {
ProduitWhImp pdao= new ProduitWhImp();
Produit prod= pdao.save(new Produit("iphone 8 plus",2800));
System.out.println(prod);
List<Produit> prods =pdao.produitsParMC("HP");
for (Produit p : prods)
System.out.println(p);
}
}
