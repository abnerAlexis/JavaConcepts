package concepts.innerClass;

public class App {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.show();
        Pet.IdNumber petId = pet.new IdNumber();
        petId.config();
    }
}
/*
        If you make IdNumber classd, You call it like so;
        Pet.IdNumber petId = new Pet.IdNumber();
        pedId..config();
 */