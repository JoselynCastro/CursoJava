package pokemon;


public class Pokedex extends AbstractPokemon {
	
    int mypokemones;
    
    @Override
    public void listPokemon() {
    	for(int i=0;i<pokemones.size();i++) {
    		Pokemon p = pokemones.get(i);
    		if(i==0) {
    			System.out.println("Los pokemones existentes son:");
    		}
    		System.out.println((i+1)+".-"+p.getName());
    		
    	}
    }
	
	public String getMypokemones() {
		mypokemones=pokemones.size();
		return ("Existen "+mypokemones+" pokemones en tu pokedex");
	}
	public void setMypokemones(int mypokemones) {
		this.mypokemones = mypokemones;
	}
}
