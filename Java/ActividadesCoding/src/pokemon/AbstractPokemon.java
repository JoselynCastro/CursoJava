package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
    
	public Pokemon createPokemon(String name,int health,String type){
		Pokemon nuevo=new Pokemon(type, health, type);
		return nuevo;
	}
    public String pokemonInfo(Pokemon pok) {
    	return "Nombre: "+pok.getName()+", Salud: "+pok.getHealth()+", tipo: "+pok.getType();
    }
}