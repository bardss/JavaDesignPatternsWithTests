package TBB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParallelApp {

    private static TBB tbb;

    public static void main(String[] args) {

        tbb = new TBB(1000000);

        tbb.streamSort();
        tbb.sumStream();
        tbb.sortParallelStream();
        tbb.sumParallelStream();

    }

}