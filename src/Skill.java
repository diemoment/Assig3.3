public abstract class Skill {
    String name;
    String type;
    int skillLevel;

    // Constructor for establishing a skill.
    public Skill(String name, String type, int skillLevel) {
        name = this.name;
        type = this.type;
        skillLevel = this.skillLevel;
    }

    // Getter methods
    public String getName() {return name;}
    public String getType() {return type;}
    public int getSkillLevel() {return skillLevel;}
    
    // Method used to identify a skill defined in subclasses.
    public abstract void identifySkill();
}
