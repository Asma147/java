public class Produit {
    int id ;
    String nom;
    double prix;
   Produit(){

   }
   Produit(int id,String nom,double prix){
       this.id=id;
       this.nom=nom;
       this.prix=prix;
   }
   int getId(){
       return id;
   }
   String getNom(){
       return nom;
   }
   double getPrix(){
       return prix;
   }
   void setId(int id){
       this.id=id;
   }
   void setNom(String nom){
       this.nom=nom;
   }
   void setPrix(double prix){
       this.prix=prix;
   }
    @Override
    public String toString() {
        return "id: " + id + ", Nom: " + nom + ", prix: " + prix ;
    }



}
