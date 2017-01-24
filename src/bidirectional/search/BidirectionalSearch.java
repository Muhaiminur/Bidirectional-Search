/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidirectional.search;

/**
 *
 * @author nabil
 */
public class BidirectionalSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CITY c=new CITY();
        c.setGraph();
        c.Bidirectional_Search();
    }
    
}
