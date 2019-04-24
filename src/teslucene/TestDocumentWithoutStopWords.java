/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teslucene;

import model.Document;

/**
 *
 * @author yosrio
 */
public class TestDocumentWithoutStopWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc = new Document(1, "He was a man with gun");
        System.out.println("With Stop Words");
        System.out.println(doc.getContent());
        System.out.println("Without Stop Words");
        doc.removeStopWords();
        System.out.println(doc.getContent());
    }
    
}
