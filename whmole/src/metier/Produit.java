package metier;
import java.io.Serializable;
public class Produit implements Serializable{
private Long idProduit;
private String nomProduit;
private double prix;
public Produit() {
super();
}
public Produit(String nomProduit, double prix) {
super();
this.nomProduit = nomProduit;
this.prix = prix;
}
public Long getIdProduit() {
return idProduit;
}
public void setIdProduit(Long idProduit) {
this.idProduit = idProduit;
}
public String getNomProduit() {
return nomProduit;
}
public void setNomProduit(String nomProduit) {
this.nomProduit = nomProduit;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
}
