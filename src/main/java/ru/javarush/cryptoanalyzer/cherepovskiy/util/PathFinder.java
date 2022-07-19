package ru.javarush.cryptoanalyzer.cherepovskiy.util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFinder {
    public static String getRoot(){
        String root = System.getProperty("user.dir");
        return root + File.separator + "text" + File.separator;
    }


}
