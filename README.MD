
---

- find_match_file_then_rename_all

```java
public class Sample {

    public static void main(String[] args) throws IOException {
        String root_path = "C:" + File.separator + "WebstormProjects" + File.separator + "dir_md";

        StaticUtilTool tool = new StaticUtilTool();
        tool.do_rename_by_path(root_path, "-", "_");
    }

}

```

---

end