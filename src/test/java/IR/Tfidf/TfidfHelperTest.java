package IR.Tfidf;

import IR.TFIDF.TfidfHelper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by n0daft on 16.12.2014.
 */
public class TfidfHelperTest {

    @Test
    public void calculateTFIDFTest(){
        int corpusSize = 806791;
        int termFrequency = 20;
        int documentFrequency = 18165;

        double tfidf = TfidfHelper.calculateTFIDF(corpusSize, termFrequency, documentFrequency);
        assertTrue(tfidf == 32.87);
    }

    @Test
    public void calculateIDFTest(){
        int corpusSize = 806791;
        int documentFrequency = 18165;

        double idf = TfidfHelper.calculateIDF(corpusSize, documentFrequency);
        assertTrue(idf == 1.65);
    }
}
