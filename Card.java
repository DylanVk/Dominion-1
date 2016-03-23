
public class Card{
	
	private int id;
	private String name;
	private int setId;
	private String effect;
	private int cost;
	
	
	public Card(int id, String name, int setId, String effect, int cost){
		this.id = id;
		this.name = name;
		this.setId = setId;
		this.effect = effect;
		this.cost = cost;
	}
	
	public String getName(){
		return this.name;
	}
	public int getCost(){
		return this.cost;
	}
}
