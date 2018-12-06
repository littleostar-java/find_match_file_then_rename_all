
---

- find_match_file_then_rename_all

```
public class Sample {

    // 1 need a root_path
    // 2 default match name is ".md"
    // 3 rename file --> "-" to "_"

    public static void main(String[] args) throws IOException {
        String root_path = "C:" + File.separator + "WebstormProjects" + File.separator + "dir_md";

        StaticUtilTool tool = new StaticUtilTool();
        tool.do_rename_by_path(root_path, "-", "_");

//        tool.do_rename_by_path(root_path,".md", "-", "_");

    }

}

```

---

end