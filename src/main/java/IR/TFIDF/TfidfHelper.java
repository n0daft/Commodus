package IR.TFIDF;

/**
 * Created by n0daft on 15.12.2014.
 */
public class TfidfHelper {


    /**
     * Return the tfidf weight of the given term.
     * @param corpusSize The amount of documents in the
     * @param termFrequency
     * @param documentFrequency
     * @return
     */
    public static double calculateTFIDF(int corpusSize, int termFrequency, int documentFrequency ){
        double quotient = corpusSize / documentFrequency;
        double idf = Math.log10(quotient);
        double tfidf = termFrequency * idf;

        return Math.round(tfidf * 100.0) / 100.0;
    }

    public static double calculateIDF(int corpusSize, int documentFrequency){
        double quotient = corpusSize / documentFrequency;
        double idf = Math.log10(quotient);

        return Math.round(idf * 100.0) / 100.0;
    }
}
