import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestSolution {
    @Test
    public void findSmallestSetOfVerticesTest1() {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(3);
        List<List<Integer>> edges = new ArrayList<>(List.of(
                List.of(0, 1),
                List.of(0, 2),
                List.of(2, 5),
                List.of(3, 4),
                List.of(2, 5)
        ));
        Assert.assertEquals(result, new Solution().findSmallestSetOfVertices(6, edges));
    }
}
