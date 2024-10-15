public class Weapon {
    private WeaponType type;
    private String nameOfWeapon;

    public Weapon(){}

    public WeaponType getType() {
        return type;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}

