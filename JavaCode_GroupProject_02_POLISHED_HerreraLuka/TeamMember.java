package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
public class TeamMember {
    private String type;
    private String name;
    private String position;
    private String number;
    private String role;

    public TeamMember(String type, String name, String position, String number, String role) {
        this.type = type;
        this.name = name;
        this.position = position;
        this.number = number;
        this.role = role;
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getNumber() { return number; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        if (type.equals("Player")) {
            return name + " - #" + number + " - " + position;
        } else {
            return name + " - " + role;
        }
    }
}