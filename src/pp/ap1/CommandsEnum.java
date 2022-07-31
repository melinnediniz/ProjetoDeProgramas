package pp.ap1;

public enum CommandsEnum {
	UP("/up"), 
	DOWN("/down"), 
	LEFT("/left"), 
	RIGHT("/right"),
	FIRE("/fire"),
	UNKNOWN("unknown");
	
	private String command;
	
	private CommandsEnum(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	public static CommandsEnum from(String command) {
		if(command.equals("/up")) return CommandsEnum.UP;
		if(command.equals("/down")) return CommandsEnum.DOWN;
		if(command.equals("/left")) return CommandsEnum.LEFT;
		if(command.equals("/right")) return CommandsEnum.RIGHT;
		if(command.equals("/fire")) return CommandsEnum.FIRE;
		return CommandsEnum.UNKNOWN;
	}
}	
