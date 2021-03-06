package pokemon;
public class Pokemon {
    private int hp;
    private int level;
    private String name;

    public Pokemon(int hp, int level, String name) {
        this.hp = hp;
        this.level = level;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
