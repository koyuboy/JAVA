package castingtest;
/**
 *
 * @author koyuboy the dark one
 */

class Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog extends Animal 
{ 
    @Override
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}


public class CastingTest {

    
    public static void main(String[] args) {
        
        Animal mamal = new Animal();
        Dog pug = new Dog();
        mamal.callme();
        pug.callme();
        pug.callme2();
        System.out.println("----------------------------");
        Animal ucPug = new Dog();
        ucPug.callme();
       // ucPug.callme2();       sadece referans tipindeki override edilmiş fonksyonlar değişir ,, bu error verir
       ((Dog)ucPug).callme2();      // üstteki sorun böyle giderilebilir
       System.out.println("----------------------------");
       Dog dcPug= (Dog)ucPug;       // downCast de new kullanılmaz
       dcPug.callme();
       dcPug.callme2();
    
}

}
/*
                OUTPUT

                
                In callme of Animal
                In callme of Dog
                In callme2 of Dog
                ----------------------------
                In callme of Dog
                ----------------------------
                In callme of Dog
                In callme2 of Dog
               

*/