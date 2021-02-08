package pokemon;


public class Pokemon{
	private String name;
	private int health;
	private String type;
	
	private static int numeroPokemones=0;
	
	public Pokemon(String name, int health, String type) {
		super();
		this.name = name;
		this.health = health;
		this.type = type;
		numeroPokemones++;
	}

	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
		System.out.println("La vida actual de tu pokemon "+pokemon.getName()+" es "+ pokemon.getHealth());
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getNumeroPokemones() {
		return numeroPokemones;
	}

	public static void setNumeroPokemones(int numeroPokemones) {
		Pokemon.numeroPokemones = numeroPokemones;
	}

	public static int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
