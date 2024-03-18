import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows<=0){
            return triangle;
        }
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);

        for(int rownum=1;rownum<numRows;rownum++){
            List<Integer> preRow = triangle.get(rownum-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j =1;j<rownum;j++){
                row.add(preRow.get(j-1)+preRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
