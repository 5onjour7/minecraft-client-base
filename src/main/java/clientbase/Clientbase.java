package clientbase;

import clientbase.commands.CommandManager;
import clientbase.managers.Manager;
import clientbase.module.ModuleManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clientbase {
    public Clientbase INSTANCE;
    // Client metadata
    public final String MOD_NAME = Metadata.MOD_NAME;
    public final String MOD_VERSION = Metadata.MOD_VERSION;
    public final String MOD_ID = Metadata.MOD_ID;
    public final String MINECRAFT_VERSION = Metadata.MINECRAFT_VERSION;

    // Logger
    public Logger LOGGER = LogManager.getLogger(MOD_NAME);

    // Managers
    public final List<Manager> managers = new ArrayList<>();
    public final CommandManager COMMAND_MANAGER = new CommandManager();
    public final ModuleManager MODULE_MANAGER = new ModuleManager();

    public Clientbase() {
        INSTANCE = this;
        registerAll(COMMAND_MANAGER, MODULE_MANAGER);

        for (Manager manager : managers) {
            manager.initialize();
        }

        LOGGER.info("{} {} for {} has been initialized", MOD_NAME, MOD_VERSION, MINECRAFT_VERSION);
    }

    public void registerAll(Manager... manager) {
        Collections.addAll(managers, manager);
    }
}
