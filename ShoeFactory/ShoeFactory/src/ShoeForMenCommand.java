
public class ShoeForMenCommand implements Command {

	Shoe shoe;
	public ShoeForMenCommand(Shoe shoe)
	{
		this.shoe = shoe;
	}
	@Override
	public void execute() {
		shoe.menshoes();		
	}
}
