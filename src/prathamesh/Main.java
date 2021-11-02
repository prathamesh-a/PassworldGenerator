package prathamesh;

import prathamesh.util.generator;
import prathamesh.util.input;

public class Main {
    public static void main(String[] args){
        input input = new input();
        generator gen = new generator(input);
        System.out.println("Your generated password is: " + gen.getPassword());
    }
}
