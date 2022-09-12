public class Hero {
	private String name;
	private int hp;

	public Hero(String name, int hp){
		this.name = name;
		this.hp = hp;
	}

	public void attack(Matango m){
		System.out.println(this.getName() + "の攻撃!");
		m.setHp(m.getHp() - 5);
		System.out.println("5ポイントのダメージをあたえた！");
	}

	public void run(){
		System.out.println(this.getName() + "は逃げ出した。");
	}

	public final void slip(){
		this.setHp(this.getHp() - 5);
		System.out.println(this.getName() + "は転んだ！");
		System.out.println("5のダメージ");
	}

	public String getName(){
		return this.name;
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	@Override
	public String toString(){
		return "{Name= " + this.getName() + ",HP= " + this.getHp() + "}";
	}

}
