
public class ShoeTypeCommand implements Command {

	Shoe shoe;
	public ShoeTypeCommand(Shoe shoe)
	{
		this.shoe = shoe;
	}
	@Override
	public void execute() {
		shoe.shoeTypes();		
	}
}
