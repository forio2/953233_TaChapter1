package model.Character;

import model.DamageType;
import model.Item.Armor;
import model.Item.Weapon;

public class BasedCharacter {
    protected String name, imgpath;
    protected DamageType type;
    protected Integer fullHp, basedDef, basedRes, basedPow;
    protected Integer hp, power, defense, resistance;
    protected Weapon weapon;
    protected Armor armor;
    public String getName () { return name; }
    public String getImagepath() { return imgpath; }
    public Integer getHp() { return hp; }
    public Integer getFullHp() { return fullHp; }
    public Integer getPower() { return power; }
    public Integer getDefense() { return defense; }
    public Integer getResistance() { return resistance; }
    public DamageType getType() { return type; }
    @Override
    public String toString() { return name; }
}