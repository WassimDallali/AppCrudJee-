package wh;


import java.sql.ResultSet;
import java.util.List;
import metier.Produit;
public interface ProduitWh {
public Produit save(Produit p);
public List<Produit> produitsParMC(String mc);
public Produit getProduit(Long id);
public Produit updateProduit(Produit p);
public void deleteProduit(Long id);
}
