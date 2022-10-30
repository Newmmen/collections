package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUndoneHomeWork {

    ArrayList<String> listUndoneHomeWork = new ArrayList<String>();

    public void searchHomeWorkInList(String homeWorkName) {
        if (listUndoneHomeWork.contains(homeWorkName)) {
            System.out.println("Home work " + homeWorkName + " is undone yet");
        } else {
            System.out.println("This homework is not in set");
        }
    }

    public void addHomeWorktoList(String homeWorkName) {
        listUndoneHomeWork.add(homeWorkName);
    }

    public void removeHomeWorkFromList(String homeWorkName) {
        Iterator itr = listUndoneHomeWork.iterator();
        while (itr.hasNext()) {
            String el = (String) itr.next();
            if (el.equals(homeWorkName)) {
                itr.remove();
            }

        }
    }

    public void printAllElements() {
        int i = 0;
        do {
            System.out.println(listUndoneHomeWork.toArray()[i]);
            i++;
        } while (i < listUndoneHomeWork.toArray().length);
    }
}
