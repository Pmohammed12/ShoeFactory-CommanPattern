
public class CommandExecuter {
    
	Command command;
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
}
