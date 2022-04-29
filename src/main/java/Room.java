import java.util.HashMap;

public class Room {
    public String name;
    public String description;
    public String npc;
    public HashMap<String, String> directions;
    public HashMap<String, String> looking;

    String getName() {
        return this.name;
    }

    String getDescription() {
        return this.description;
    }

    String getNpc() {
        return this.npc;
    }

    String getRoomNameFromDirections(String direction) {
        return directions.get(direction);
    }

    String getLookingDirection(String lookings){
        return looking.get(lookings);
    }
}
