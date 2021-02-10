package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		    Pokedex pdx = new Pokedex();
	        Pokemon pok= pdx.createPokemon("Bulbasaur", 100, "Hierba");
	        Pokemon pok2= pdx.createPokemon("Charmander", 100, "Fuego");
	        Pokemon pok3= pdx.createPokemon("Pikachu", 200,"Electrico");
           
	        System.out.println(pdx.pokemonInfo(pok3));
	        pdx.listPokemon();
	        System.out.println(pdx.getMypokemones());
	        pok2.attackPokemon(pok);
	        pok3.attackPokemon(pok);
	        pok.attackPokemon(pok3);

	    }

}
