package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterService {

    public List<String> filterList(List<String> list, Filter filterObject) {
        List<String> finalList =  new ArrayList<>();

        for (String s : list) {
            if(filterObject.filter(s)) {
                finalList.add(s);
            }
        }

        return finalList;
    }

}
