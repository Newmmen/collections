package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorOfUndoneHomeWork {
    Vector<String> vectorUndoneHomeWork = new Vector<>();

    public void addHomeWork(String homeWork) {
        vectorUndoneHomeWork.add(homeWork);
    }

    public void printAll() {
        for (String homeWork : vectorUndoneHomeWork) {
            System.out.println(homeWork);
        }
    }

    public void searchHomeWorkInVector(String homeWork) {
        if (vectorUndoneHomeWork.contains(homeWork)) {
            System.out.println("Home work " + homeWork + " is undone yet");
        } else {
            System.out.println("This homework done already");
        }
    }

    public void removefromHomeWorkFromVector(String homeWorkName) {
        Iterator itr = vectorUndoneHomeWork.iterator();
        while (itr.hasNext()) {
            String el = (String) itr.next();
            if (el.equals(homeWorkName)) {
                itr.remove();
            }

        }

    }
}
