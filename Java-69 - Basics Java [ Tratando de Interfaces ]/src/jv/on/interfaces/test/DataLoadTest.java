package jv.on.interfaces.test;

import jv.on.interfaces.domain.LoadDataBase;
import jv.on.interfaces.domain.LoadFile;

public class DataLoadTest {
    public static void main(String[] args) {
        LoadFile loadFile = new LoadFile();
        LoadDataBase loadDataBase = new LoadDataBase();
        loadFile.load();
        loadDataBase.load();
    }
}
