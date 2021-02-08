package pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<Pokemon> pokemones= new ArrayList<>();
    int mypokemones;
    
    @Override
    public void listPokemon() {
    	createPokemon(null, mypokemones, null);
    	mypokemones++;
    }
	
	public int getMypokemones() {
		return mypokemones;
	}
	public void setMypokemones(int mypokemones) {
		this.mypokemones = mypokemones;
	}
}
