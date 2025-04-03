package clientbase.friend;

import lombok.Getter;
import net.minecraft.entity.player.PlayerEntity;

@Getter
public class Friend {
    public String name;
    public String displayName;
    public PlayerEntity player;

    public Friend(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public Friend(PlayerEntity player, String displayName) {
        this(player.getName().getString(), displayName);
        this.player = player;
    }
}
