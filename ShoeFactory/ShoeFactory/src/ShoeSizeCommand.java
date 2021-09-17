
public class ShoeSizeCommand implements Command {

	Shoe shoe;
	public ShoeSizeCommand(Shoe shoe)
	{
		this.shoe = shoe;
	}
	@Override
	public void execute() {
		shoe.shoeSize();
	}
}
