package pokemon;
public class Pokemon {
    private int hp;
    private int level;
    private int damage;
    private String name;

    public Pokemon(int hp, int level, int damage, String name) {
        this.hp = hp;
        this.level = level;
        this.name = name;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nhp: " + hp + "\nlevel: " + level + "\ndamage: " + damage;
    }
}
