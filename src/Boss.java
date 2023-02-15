public class Boss {
    private int health;
    private int damage;
    private String protection;

    public void setHealth(int bhealth){
        health = bhealth;
    }
    public int getHealth(){
        return health;
    }

    public void setDamage(int bdamage){
        damage = bdamage;
    }
    public int getDamage(){
        return damage;
    }

    public void setProtection(String bprotection){
        protection = bprotection;
    }

    public String getProtection() {
        return protection;
    }
}
