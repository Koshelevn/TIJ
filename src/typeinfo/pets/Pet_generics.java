package typeinfo.pets;

public class Pet_generics<Individual> {
    private Individual individual;
    public Pet_generics(Individual individual){
        this.individual = individual;
    }

    public static void main(String[] args) {
        Pet_generics<Mutt> mutt= new Pet_generics<>(new Mutt());
    }
}
