package JavaMain;

import collections.ArrayListUndoneHomeWork;
import collections.MapOfUndoneHomeWork;
import collections.SetUndoneHomeWork;
import collections.VectorOfUndoneHomeWork;

public class Main {
    public static void main(String[] args) {
        MapOfUndoneHomeWork mapOfUndoneHomeWork = new MapOfUndoneHomeWork();

        mapOfUndoneHomeWork.addNewHomeWork("Unit12", 4);
        mapOfUndoneHomeWork.addNewHomeWork("Unit12", 4);
        mapOfUndoneHomeWork.addNewHomeWork("Unit14", 6);
        mapOfUndoneHomeWork.addNewHomeWork("Unit15", 7);
        mapOfUndoneHomeWork.searchHomeWorkInMapByKeyWithoutLoop("Unit14");
        mapOfUndoneHomeWork.deleteHomeWorkFromMap("Unit12");
        mapOfUndoneHomeWork.printAllKeys();

        VectorOfUndoneHomeWork vectorOfUndoneHomeWork = new VectorOfUndoneHomeWork();

        vectorOfUndoneHomeWork.addHomeWork("Unit13");
        vectorOfUndoneHomeWork.addHomeWork("Unit13");
        vectorOfUndoneHomeWork.addHomeWork("Unit12");
        vectorOfUndoneHomeWork.addHomeWork("Unit11");
        vectorOfUndoneHomeWork.addHomeWork("Unit13");
        vectorOfUndoneHomeWork.searchHomeWorkInVector("Unit17");
        vectorOfUndoneHomeWork.removefromHomeWorkFromVector("Unit13");
        vectorOfUndoneHomeWork.printAll();

        ArrayListUndoneHomeWork listUndoneHomeWork = new ArrayListUndoneHomeWork();

        listUndoneHomeWork.addHomeWorktoList("Unit15");
        listUndoneHomeWork.addHomeWorktoList("Unit11");
        listUndoneHomeWork.addHomeWorktoList("Unit11");
        listUndoneHomeWork.addHomeWorktoList("Unit11");
        listUndoneHomeWork.addHomeWorktoList("Unit11");
        listUndoneHomeWork.searchHomeWorkInList("Unit17");
        listUndoneHomeWork.removeHomeWorkFromList("Unit10");
        listUndoneHomeWork.printAllElements();

        SetUndoneHomeWork setUndoneHomeWork = new SetUndoneHomeWork();

        setUndoneHomeWork.addHomeWork("Unit11");
        setUndoneHomeWork.addHomeWork("Unit12");
        setUndoneHomeWork.addHomeWork("Unit14");
        setUndoneHomeWork.addHomeWork("Unit16");
        setUndoneHomeWork.searchHomeWork("Unit16");
        setUndoneHomeWork.deleteHomeWork("Unit14");

        setUndoneHomeWork.printAllUndoneHomeWork();


    }

}
