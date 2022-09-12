public class SuperHero extends Hero{
	private boolean flying;

	public SuperHero(String name, int hp){
		super(name,hp);
	}

	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}

	public boolean getFlying(){
		return this.flying;
	}

	public void fly(){
		this.flying = true;
		System.out.println(this.getName() + "飛び上がった！");
	}

	public void land(){
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run(){
		System.out.println(this.getName() + "は撤退した。");
	}
}
