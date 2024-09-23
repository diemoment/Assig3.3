public class TalentSkill extends Skill{
    String name;
    String type;
    int skillLevel;

    // Constructor for a Talent Skill
    public TalentSkill(String name, String type, int skillLevel) {

        super(name, type, skillLevel);

        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    // Prints to terminal the attributes of a Talent Skill object
    public void identifySkill() {
        System.out.println(type + " Skill of " + name + " has a level of " + skillLevel);
    }
}
