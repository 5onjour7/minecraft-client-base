package clientbase.commands;

import clientbase.managers.Manager;
import clientbase.managers.Types;

public class CommandManager extends Manager {

    public CommandManager() {
        super("Commands", "A manager to register all of your commands.", Types.CLIENT);
    }

    @Override
    public void initialize() {

    }
}
