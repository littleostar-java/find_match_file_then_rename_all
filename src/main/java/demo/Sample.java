package demo;

import util.StaticUtilTool;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.LinkedList;

public class Sample {

    public static void main(String[] args) throws IOException {
        String root_path = "C:" + File.separator + "WebstormProjects" + File.separator + "dir_md";

        StaticUtilTool tool = new StaticUtilTool();
        tool.do_rename_by_path(root_path, ".md","-", "_");
    }

}
