package TBB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TBB {

    private static final Logger LOGGER = LoggerFactory.getLogger(TBB.class);

    private int size;
    private List<String> strings;

    private long timeStart;
    private long timeStop;
    private long sum;
    private long countNumbers;
    private long result;

    public TBB(int size) {
        this.size = size;
        strings = new ArrayList<>(size);
        fillListWithRandomNumbers();
    }

    private void fillListWithRandomNumbers() {
        for (int i = 0; i < size; i++) {
            UUID uuid = UUID.randomUUID();
            strings.add(uuid.toString());
        }
    }
    private long getTime(long timeStop, long timeStart){
        return TimeUnit.NANOSECONDS.toMillis(timeStop - timeStart);
    }

    public void sumParallelStream() {
        timeStart = System.nanoTime();
        sum = this.strings.parallelStream().mapToInt(String::hashCode).sum();
        timeStop = System.nanoTime();
        printResults("Parallel stream SUM", sum);

    }

    public void sortParallelStream() {
        timeStart = System.nanoTime();
        countNumbers = this.strings.parallelStream().sorted().count();
        timeStop = System.nanoTime();
        printResults("Parallel stream SORT", countNumbers);

    }

    public void sumStream() {
        timeStart = System.nanoTime();
        sum = this.strings.stream().mapToInt(String::hashCode).sum();
        timeStop = System.nanoTime();
        printResults("Stream SUM", sum);

    }

    public void streamSort() {
        timeStart = System.nanoTime();
        countNumbers = this.strings
                .stream()
                .sorted()
                .count();
        timeStop = System.nanoTime();
        printResults("Stream SORT", countNumbers);
    }

    private void printResults(String title, long numberResult){
        result = this.getTime(timeStop, timeStart);
        LOGGER.info(title + ": " + numberResult);
        LOGGER.info(title + " TIME: " + result + "ms");
    }
}
