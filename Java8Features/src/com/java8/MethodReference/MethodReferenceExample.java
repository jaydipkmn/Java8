package com.java8.MethodReference;

public class MethodReferenceExample {

    public static void speakSomething(){  
        System.out.println("Hello, this is static method.");  
    } 
    
    public void speakMoreThing(){  
        System.out.println("Hello, this is no - static method.");  
    } 
    public static void main(String[] args) {
        // 1. Reference to static method
        
        Speakar speakar = MethodReferenceExample::speakSomething;
        speakar.speak();
        // 2. Reference to not-static method
        
        // 2.1 Referring Using reference 
        MethodReferenceExample mre = new MethodReferenceExample();
        Speakar speakar2 = mre::speakMoreThing;
        speakar2.speak();
        
        // 2.2 Referring Using anonymous object   
        Speakar speakar3 = new MethodReferenceExample()::speakMoreThing;
        speakar3.speak();
        
        // 3 Reference to a Constructor
        AnotherSpeakar speakar4 = MethodReferenceExample::new;
        speakar4.speak("Hello , I am another speakar ");
    }

    public MethodReferenceExample() {
    }
    
    public MethodReferenceExample(String speech) {
        System.out.println(speech);
    }

}
