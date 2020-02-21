package homeworks.Homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void greetPet() {
        System.out.println("Привет, " + pet.getNickname());
    }

    public void describePet() {
        String v;
        if (pet.getTrickLevel() > 50) {
            v = " очень хитрый";
        } else {
            v = " почти не хитрый";
        }
        System.out.println("У меня есть " + pet.getSpecies() + ", ему " + pet.getAge() + "  лет, он" + v);
    }

    public int countOfFamily() {
        System.out.print("Count of Family is ");
        return 2 + children.length;
    }

    //method for adding child(Human) to array of Children
    public static Human[] addChild(Human child[], Human newChild) {
        int n = child.length;
        Human[] newChildArray = new Human[n + 1];
        for (int i = 0; i < newChildArray.length; i++) {
            if (i != n) {
                newChildArray[i] = child[i];
            } else {
                newChildArray[i] = newChild;
            }
        }
        return newChildArray;
    }

    //method for deleting child(Human) from array of Children
    public static Human[] deleteChild(Human child[], Human pointedChild) {
        int n = child.length;
        int count = 0;
        Human[] newChildArray = new Human[n - 1];
        for (int i = 0, k = 0; i < child.length; i++) {
            if (child[i] != pointedChild) {
                newChildArray[k++] = child[i];
                count++;
            }
        }
        return newChildArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
