
public class ShoeForWomenCommand implements Command {

	Shoe shoe;
	public ShoeForWomenCommand(Shoe shoe)
	{
		this.shoe = shoe;
	}
	@Override
	public void execute() {
		shoe.womenshoes();	
	}
}
