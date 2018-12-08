package com.study.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BatchInsert extends BaseActionWithDao {
    @Override
    public String doExecute() {
        try {
            FileInputStream fileInputStream = new FileInputStream("scripts/sql/data.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.startsWith("#")) {
                    continue;
                }
                String[] info = line.split(" ");
                personDao.insertOnePerson(info[0], Integer.parseInt(info[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return SUCCESS;
    }
}
