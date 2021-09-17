
public class ShoeFactoryDemo {

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		CommandExecuter command=new CommandExecuter();
		command.setCommand(new ShoeTypeCommand(shoe));
		command.executeCommand();
		
		command.setCommand(new ShoeForMenCommand(shoe));
		command.executeCommand();
		
		command.setCommand(new ShoeForWomenCommand(shoe));
		command.executeCommand();
		
		command.setCommand(new ShoeSizeCommand(shoe));
		command.executeCommand();		
	}
}
