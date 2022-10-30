package collections;

import java.util.HashSet;
import java.util.Set;

public class SetUndoneHomeWork {

    Set<String> setOfUndoneHomeWork = new HashSet<>();

    public void addHomeWork(String newHomeWork) {
        setOfUndoneHomeWork.add(newHomeWork);
    }

    public void searchHomeWork(String homeWorkName) {
        if (setOfUndoneHomeWork.contains(homeWorkName)) {
            System.out.println("Home work " + homeWorkName + "is undone yet");
        } else {
            System.out.println(homeWorkName + " is already done");

        }
    }

    public void deleteHomeWork(String homeWorkName) {
        if (!setOfUndoneHomeWork.contains(homeWorkName)) {
            System.out.println("This homework is not in set");
        }
        setOfUndoneHomeWork.remove(homeWorkName);
    }

    public void printAllUndoneHomeWork() {
        for (int i = 0; i < setOfUndoneHomeWork.toArray().length; i++) {
            System.out.println(setOfUndoneHomeWork.toArray()[i]);

        }

    }

}
