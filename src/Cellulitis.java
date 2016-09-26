/**
 * Cellulitis
 * by Thomas Willems
 * and Thomas den Boer
 */

public class Cellulitis {
    boolean[] currentGeneration;

    public void readGeneral() {
        //TODO read the general input (up to the initial configuration)
        


        //END TODO
    }


    public void readInitial() {
        //TODO read the initial configuration (build the first currentGeneration)



        //END TODO
    }


    public void readRules() {
        //TODO read the ruleset (only implement in case of an universal automaton)

        //END TODO
    }

    boolean newCellValueByA(int k) {
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the rules of A

        return false;

        //END TODO
    }

    boolean newCellValueByB(int k) {
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the rules of B

        return false;

        //END TODO
    }

    boolean newCellValueByRules(int k){
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the universal automatons rules

        return false;

        //END TODO
    }


    public void draw() {
        //TODO draw the current state of the automaton; in other words: print currentGeneration



        //END TODO
    }


    public void computeNextGeneration() {
        //TODO compute the nextGeneration and update the currentGeneration.



        //END TODO
    }

    public void run() {
        //TODO implement the procedure for the assignment



        //END TODO
    }

    //TODO more methods if nescessairy

    //END TODO


    public static void main(String[] args) {
        (new Cellulitis()).run();
    }
}
0
