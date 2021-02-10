package pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
	ArrayList<Pokemon> pokemones= new ArrayList<>();
	public Pokemon createPokemon(String name,int health,String type){
		Pokemon nuevo=new Pokemon(name, health, type);
		pokemones.add(nuevo);
		return nuevo;
	}
    public String pokemonInfo(Pokemon pok) {
    	return "Nombre: "+pok.getName()+", Salud: "+pok.getHealth()+", tipo: "+pok.getType();
    }
    
}