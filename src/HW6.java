public class HW6 {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.STAFF);
        bossWeapon.setNameOfWeapon("Shadow staff");
        boss.setWeapon(bossWeapon);

        boss.printInfo();

        Skeleton skeletonNumber1 = new Skeleton();
        skeletonNumber1.setHealth(200);
        skeletonNumber1.setDamage(50);
        skeletonNumber1.setArrowCount(10);

        Weapon skeletonWeaponNumber1 = new Weapon();
        skeletonWeaponNumber1.setType(WeaponType.BOW);
        skeletonWeaponNumber1.setNameOfWeapon("Strong bow");
        skeletonNumber1.setWeapon(skeletonWeaponNumber1);

        Skeleton skeletonNumber2 = new Skeleton();
        skeletonNumber2.setHealth(200);
        skeletonNumber2.setDamage(25);
        skeletonNumber2.setArrowCount(20);

        Weapon skeletonWeaponNumber2 = new Weapon();
        skeletonWeaponNumber2.setType(WeaponType.BOW);
        skeletonWeaponNumber2.setNameOfWeapon("Weak bow");
        skeletonNumber2.setWeapon(skeletonWeaponNumber2);

        skeletonNumber1.printInfo();
        System.out.println("------------------------------------------------");
        skeletonNumber2.printInfo();
    }
}