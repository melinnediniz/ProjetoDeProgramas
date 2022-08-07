package pp.ap1;

public enum CommandsEnum {
	UP("w"), 
	DOWN("s"), 
	LEFT("a"), 
	RIGHT("d"),
	FIRE("f"),
	UNKNOWN("unknown");
	
	private String command;
	
	private CommandsEnum(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	public static CommandsEnum from(String command) {
		if(command.equals("w")) return CommandsEnum.UP;
		if(command.equals("s")) return CommandsEnum.DOWN;
		if(command.equals("a")) return CommandsEnum.LEFT;
		if(command.equals("d")) return CommandsEnum.RIGHT;
		if(command.equals("f")) return CommandsEnum.FIRE;
		return CommandsEnum.UNKNOWN;
	}
}	
