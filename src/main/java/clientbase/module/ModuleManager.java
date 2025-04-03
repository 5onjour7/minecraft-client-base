package clientbase.module;

import clientbase.managers.Manager;
import clientbase.managers.Types;

public class ModuleManager extends Manager {

    public ModuleManager() {
        super("Modules", "A manager that helps you register all of your features", Types.CLIENT);
    }

    @Override
    public void initialize() {
        
    }
}
