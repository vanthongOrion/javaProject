public class Main {
    public static void main(String[] args){
        SuperHero sh = new SuperHero("ミナト",100);
        sh.fly();

//        Matango m = new Matango('A',20);
//        sh.attack(m);
//        System.out.println(m);

        PoisonMatango p = new PoisonMatango('A',20);
        p.attack(sh);

        System.out.println(sh);
        System.out.println(p);


    }
}
