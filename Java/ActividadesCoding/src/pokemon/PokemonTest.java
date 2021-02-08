package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		    Pokedex pdx = new Pokedex();
	        Pokemon pok= new Pokemon("Bulbasaur", 100, "Hierba");
	        Pokemon pok2= new Pokemon("Charmander", 100, "Fuego");
	        Pokemon pok3= new Pokemon("Pikachu", 200,"Electrico");
           
	        System.out.println(pdx.pokemonInfo(pok3));
	        System.out.println(pdx.pokemones);
	        System.out.println(pdx.mypokemones);
	        pok2.attackPokemon(pok);
	        pok3.attackPokemon(pok);
	        pok.attackPokemon(pok3);

	    }

}
