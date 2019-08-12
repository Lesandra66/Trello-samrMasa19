package com.telran.tests.test;

import com.telran.tests.model.Board;
import com.telran.tests.model.Team;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> teams() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/teamdata.csv")));
        String line = reader.readLine();
        while (line!=null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Team().setCommandName(split[0]).setCommandDescription(split[1])
            });
            line = reader.readLine();
        }
        return list.iterator();
    }
@DataProvider
    public Iterator<Object[]> boards() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader((new File("src/test/resources/boarddata.csv"))));
        String line = reader.readLine();
        while (line!=null){
            String[] split = line.split(",");
            list.add(new Object[] {new Board().setBoardName(split[0])});
            line = reader.readLine();
        }
        return list.iterator();

    }

}
