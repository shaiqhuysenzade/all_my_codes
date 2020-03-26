package homeworks.homework12;

import homeworks.homework12.controller.FamilyController;
import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Man;
import homeworks.homework12.model.Woman;

import java.util.ArrayList;
import java.util.List;

public class GenerateFamily {
    public void  familyGenerate() {
        Man father = new Man("Asiman", "Veliyev", "12/12/1975");
        Woman mother = new Woman("Aysel", "Veliyeva", "12/12/2007");
        Man son = new Man("Vagif", "Huseynov", "12/12/2000");
        Woman daughter = new Woman("Aysel", "Veliyeva", "12/12/2000");
        Man father2= new Man("Kamal","Kamalov","13/12/1980");
        Man son2= new Man("Kerim","Kamalov","13/12/2000");
        Woman mother2= new Woman("Kamala","Kamalova","13/12/1989");
        Woman daughter1 = new Woman("Aysel", "Kamalova", "12/12/2001");
        List<Human> humanList = new ArrayList<>();
        humanList.add(son);
        humanList.add(daughter);
        List<Human> humanList2 = new ArrayList<>();
        humanList2.add(son2);
        humanList2.add(daughter1);
        Family family2 = new Family(mother, father);
        Family family1 = new Family(mother2,father2);
        family1.setChildren(humanList);
        family2.setChildren(humanList2);
        FamilyController fc = new FamilyController();
        fc.saveFamilyController(family1);
        fc.saveFamilyController(family2);
    }
}
