package Model;

public class Card{
	
	private int id;
	private String name;
	private int setId;
	private String effect;
	private int cost;
	private int type;
	private int value;
	
	
	public Card(int id, String name, int setId, String effect, int cost, int type, int value){
		this.id = id;
		this.name = name;
		this.setId = setId;
		this.effect = effect;
		this.cost = cost;
		this.type = type;
		this.value = value;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public int getType(){
		return this.type;
	}
	
	public int getValue(){
		return this.value;
	}
}
