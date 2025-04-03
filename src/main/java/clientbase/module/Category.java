package clientbase.module;

import lombok.Getter;

@Getter
public enum Category {
    OTHER("Other", "Modules that control the client and only the client"),
    COMBAT("Combat", "Modules that give you advantages in combat"),
    RENDER("Render", "Modules that create objects on the screen for an advantage"),
    MOVEMENT("Movement", "Modules that alter your movement"),
    PLAYER("Player", "Modules that alter your players actions"),
    MISC("Misc", "Miscellaneous modules that offer some quality of life");

    private final String names;
    private final String description;

    Category(String name, String description) {
        this.names = name;
        this.description = description;
    }
}
