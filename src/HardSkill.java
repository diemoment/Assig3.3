public class HardSkill extends Skill {
    String name;
    String type;
    int skillLevel;

    public HardSkill(String name, String type, int skillLevel) {

        super(name, type, skillLevel);

        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    public void identifySkill() {
        System.out.println(type + " Skill of " + name + " has a level of " + skillLevel);
    }
}
