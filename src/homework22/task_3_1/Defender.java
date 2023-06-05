package homework22.task_3_1;



abstract class Defender {

    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
