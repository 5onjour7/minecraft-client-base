package clientbase.managers;

public abstract class Manager {
    public String manager_name;
    public String manager_description;
    public Types manager_type;

    public Manager(String name, String description, Types type) {
        manager_name = name;
        manager_description = description;
        manager_type = type;
    }

    public abstract void initialize();
}
