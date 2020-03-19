package homeworks.homework6;

import homeworks.homework6.Human;
import homeworks.homework6.Pet;

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
    public  Human[] addChild(Human child[], Human newChild) {
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

    //method for deleting child(Human) from array of Children by index
    public boolean deleteChildByIndex(int i) {
        int n = children.length - 1;
        if (children != null) {
            Human[] newChildArray = new Human[n];
            for (int k = 0; k < children.length; k++) {
                if (k < i) {
                    newChildArray[k] = children[k];
                } else if (k > i) {
                    System.out.print(k + " ");
                    newChildArray[k - 1] = children[k];
                }
            }
            children = newChildArray;
            return true;
        }
        return false;
    }

    public int deleteChildByObject1(Human human) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(human)) {
                deleteChildByIndex(i);
                return 1;
            }
        }
        return 0;
    }

    //method for deleting child(Human) from array of Children by object
    public boolean deleteChildByObject2(Human child[], Human pointedChild) {
        int n = child.length;
        int count = 0;
        Human[] newChildArray = new Human[n - 1];
        for (int i = 0, k = 0; i < child.length; i++) {
            if (child[i] != pointedChild) {
                newChildArray[k++] = child[i];
//                count++;
            }
            children=newChildArray;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children);
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object of FAMILY was deleted");
    }
}
