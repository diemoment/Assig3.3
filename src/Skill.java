public abstract class Skill {
    String name;
    String type;
    int skillLevel;

    public Skill(String name, String type, int skillLevel) {
        name = this.name;
        type = this.type;
        skillLevel = this.skillLevel;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public int getSkillLevel() {return skillLevel;}

    public abstract void identifySkill();
}
