public class TestProgram {
    

    public static void main(String[] args) {

        // Creation of Skill objects
        HardSkill h = new HardSkill("Programming", "Hard", 6);
        SoftSkill s = new SoftSkill("Communication", "Soft", 4);
        GiftSkill g = new GiftSkill("Mercy", "Gift", 3);
        TalentSkill t = new TalentSkill("Organization", "Talent", 2);

        // Running the identifySkill method on each object
        h.identifySkill();
        s.identifySkill();
        g.identifySkill();
        t.identifySkill();
    }

}
