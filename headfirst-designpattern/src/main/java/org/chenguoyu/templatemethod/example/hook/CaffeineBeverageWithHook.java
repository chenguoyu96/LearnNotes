package org.chenguoyu.templatemethod.example.hook;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
