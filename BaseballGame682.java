package leetcode;

import java.util.List;
import java.util.ArrayList;

public class BaseballGame682 {

    public void BaseballGame682() {
        String[] ops = {"5", "2", "C", "D", "+"};
        List<Integer> lList = new ArrayList();
        int iContPoints = 0;
        for (String op : ops) {
            if (op.equals("D")) {
                iContPoints = iContPoints + (2 * (lList.get(lList.size() - 1)));
                lList.add(2 * (lList.get(lList.size() - 1)));
            } else if (op.equals("C")) {
                iContPoints = iContPoints - (lList.get(lList.size() - 1));
                lList.remove(lList.size() - 1);
            } else if (op.equals("+")) {
                iContPoints = iContPoints + (lList.get(lList.size() - 1) + lList.get(lList.size() - 2));
                lList.add(lList.get(lList.size() - 1) + lList.get(lList.size() - 2));
            } else {
                lList.add(Integer.parseInt(op));
                iContPoints = iContPoints + Integer.parseInt(op);
            }
        }
        System.out.println(iContPoints);
    }
}
