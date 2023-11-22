 class diloo { 
    public static void main(String args[]) 
    { 
        Animal a = new Horse(); 
        Mammal m = new Human(); 
  
        // This compiles without any error 
        // because mammal is also an animal, 
        // subtype reference variable m 
        // is assigned to the super type 
        // reference variable  a 
        a = m; 
    } 
} public interface Animal { 
    // body 
} 
  
// Mammal interface which extends 
// the Animal interface 
public interface Mammal extends Animal { 
    // body 
} 
  
// Horse which implements the 
// Animal 
class Horse implements Animal { 
    // body 
} 
  
// Human which implements the 
// mammal 
class Human implements Mammal { 
    // body 
} 
  
