package ie;

import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.search.similarities.BM25Similarity;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

import java.io.IOException;

public class Main {
    public static void main(String []arg) throws IOException {
        indexer indexer = new indexer();

        indexer.buildDocsIndex();
    }
}
