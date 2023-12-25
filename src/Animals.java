import java.util.Objects;
import java.util.ArrayList;

public class Animals {
    private ArrayList<String> animals;

    public Animals() {
        animals = new ArrayList<String>();
    }

    public void show(){
        for (String animal: animals){
            System.out.print(animal+ ", ");
        }
    }
    public void add(String a){
        animals.add(0, a);
    }
    public String remove(){
        if(animals.size()>0) {
            return animals.remove(animals.size() - 1);
        } else{
            return null;
        }
    }
}
