package LibraryHomeWork;

import java.util.ArrayList;

public class Visitor {
    private String name;
    private Integer id = null;
    private static ArrayList<Integer> allVisitorsId = new ArrayList<>();

    public Visitor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void rename(String name) {
        this.name = name;
    }



    private void generateVisitorId() {
        Integer generatedID;
        while (true){
            generatedID = (int)(Math.random()*1001);
            if (!allVisitorsId.contains(generatedID))
                break;
        }
        allVisitorsId.add(generatedID);
        this.id = generatedID;
    }
}
