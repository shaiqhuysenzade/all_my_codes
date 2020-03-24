package homeworks.homework8;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;
//    private Pet p;

    public Family(Human mother, Human father, Set<Pet> p) {
        this.mother = mother;
        this.father = father;
        this.pet = p;
        mother.setFamily(this);
        father.setFamily(this);
    }
    public Family(){}

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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }
    public boolean addChild(Human human){
        if(human!=null){
        children.add(human);
        return true;
        }
        return false;
    }
    public boolean deleChildByObject(Human human){
        if(human!=null && human.getName()!=null){
            children.remove(human);
            return true;
        }
        return false;
    }

    public boolean deleteChildByIndex(int index){
        if(index>=0){
            children.remove(index);
            return true;
        }
        return false;
    }
    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

//    public void greetPet() {
//        System.out.println("Привет, " + p.getNickname());
//    }

//    public void describePet() {
//        String v;
//        if (p.getTrickLevel() > 50) {
//            v = " очень хитрый";
//        } else {
//            v = " почти не хитрый";
//        }
//        System.out.println("У меня есть " + p.getSpecies() + ", ему " + p.getAge() + "  лет, он" + v);
//    }

    public int countOfFamily() {
        System.out.print("Count of Family is ");
        return 2 + children.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object of FAMILY was deleted");
    }
}
