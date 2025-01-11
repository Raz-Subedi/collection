package org.example.OptionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        /*Optional<String> name = getName(1);
        if(name.isPresent()){
            System.out.println(name.get());
        }

        name.ifPresent(x -> System.out.println(x));*/

        Optional<String> name = getName(1);
        //String nameTobeUsed = name.orElse("NA");
       // String nameTobeUsed = name.orElseGet(() -> "NA");

        String nameTobeUsed = name.orElseThrow(() -> new NoSuchElementException());

        System.out.println(nameTobeUsed);
    }
    
    private static Optional<String> getName(int id){
      //  return "raz";
        //return null;
       // String name = null;
        //String name = "Raz";

        //return Optional.of(name);
       // return Optional.ofNullable(name); // yedi yeha bata jane value null huna sakxa vane hamle nullable use garne.
       return  Optional.empty();      // returns null
      //  return Optional.of("Raz");
    }
}
