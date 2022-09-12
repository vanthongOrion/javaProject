public class Matango {
	private int hp;
	final private int level = 10;
	private char suffix;

	public Matango(char suffix, int hp){
		this.suffix = suffix;
		this.hp = hp;
	}

	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

	public int getHp(){
		return this.hp;
	}

	public char getSuffix(){
		return this.suffix;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public void setSuffix(char suffix){
		this.suffix = suffix;
	}

	@Override
	public String toString(){
		return "{SUFFIX= " + this.getSuffix() + ",HP= " + this.getHp() + "}";
	}
}
