package clientbase.friend;

import clientbase.managers.Manager;
import clientbase.managers.Types;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FriendManager extends Manager {

    public final List<Friend> friends = new ArrayList<>();

    public FriendManager() {
        super("Friends", "A manager that manages your friends.", Types.MINECRAFT);
    }

    @Override
    public void initialize() {

    }
}
