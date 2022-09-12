public class PoisonMatango extends Matango{

    public PoisonMatango(char suffix, int hp){
        super(suffix,hp);
    }

	private int poisonTimes = 5;

    public void attack(Hero h){
    	super.attack(h);
    	if(poisonTimes > 0){
    		System.out.println("さらに毒をばらまいた！");
    		int point = (int) h.getHp()/5;
    		h.setHp(h.getHp() - point);
    		System.out.println(point + "ポイントのダメージ！");
    		this.setPosionTimes(this.getPosionTimes() - 1);
    	}
    }

    public void setPosionTimes(int times){
    	this.poisonTimes = times;
    }

    public int getPosionTimes(){
    	return this.poisonTimes;
    }

    @Override
    public String toString(){
    	return "{SUFFIX= " + this.getSuffix()  + ",HP= " + this.getHp() + ",PosionTimes= " + this.getPosionTimes() + "}";
    }
}
