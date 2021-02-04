package pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	private static int numeroPokemones=0;
	
	public Pokemon(String name, int health, String type) {
		super();
		this.name = name;
		this.health = health;
		this.type = type;
		setNumeroPokemones(getNumeroPokemones() + 1);
	}

	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(getHealth()-10);
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
	
}
