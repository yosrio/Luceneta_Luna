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
public class TestDocumentStemming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc = new Document(1, "She is looking on my eyes");
        doc.stemming();
        System.out.println("Real Content: " + doc.getRealContent());
        System.out.println("Content Stemming: " + doc.getContent());
    }
    
}
