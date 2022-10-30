package collections;


import java.util.HashMap;
import java.util.Map;

public class MapOfUndoneHomeWork {

    Map<String, Integer> mapOfUndoneHomeWork = new HashMap<String, Integer>();

    public void addNewHomeWork(String homeWorkName, Integer homeWorkComplexity) {
        mapOfUndoneHomeWork.put(homeWorkName, homeWorkComplexity);
    }

    public void searchHomeWorkInMapByKeyWithoutLoop(String homeWorkName) {
        if (mapOfUndoneHomeWork.containsKey(homeWorkName)) {
            System.out.println("Home work " + homeWorkName + " is undone yet");
        } else {
            System.out.println("This homework is not in map");
        }
    }

    public void deleteHomeWorkFromMap(String homeWorkName) {
        mapOfUndoneHomeWork.remove(homeWorkName);

    }

    public void printAllKeys() {
        for (String keys : mapOfUndoneHomeWork.keySet()) {
            System.out.println(keys);
        }
    }


}
