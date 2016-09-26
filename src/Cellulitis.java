/**
 * Cellulitis
 * by Thomas Willems
 * and Thomas den Boer
 */

import java.util.*;


public class Cellulitis {
    boolean[] currentGeneration;
    boolean[] newGeneration;
    Scanner sc = new Scanner ( System.in );

    public void readGeneral() {
        //TODO read the general input (up to the initial configuration)

        String rule = sc.next();
        int l = sc.nextInt();
        int g = sc.nextInt();        
        int k = 1; // Counts the cells (skips the first because it's always false
        
        currentGeneration = new boolean[l];
        
        //Add 2 extra cells to the generation and set both as false
        l = l+2; 
        currentGeneration[0] = false;
        currentGeneration[l-1] = false;
        
        
        
        if (rule.equals ("A")) {
            readInitial();
            while (g>0) {
                while (k<l) {
                    newCellValueByA(k);
                    k++
                }
                computeNextGeneration();
                g--;
            }
            
        } 
        else if (rule.equals("B")) {
            readInitial();
            while (g>0) {
                while (k<l) {
                    newCellValueByB(k);
                    k++;
                }
                computeNextGeneration();
                g--;
            }
            
        } else {
            System.out.println("Invalid ruleset");
            System.exit(0);
        }
        
        if (l<0) {
            System.out.println("Invalid value for L");
            System.exit(0);
        }
        
        if (g<0) {
            System.out.println("Invalid value for G");
            System.exit(0);
        }
        
        





        //END TODO
    }


    public void readInitial() {
        //TODO read the initial configuration (build the first currentGeneration)
            
        
            while (sc.hasNextInt() == true) {
                int k = sc.nextInt();
                k = k-1;
                currentGeneration[k] = true;
                }

        //END TODO
    }


    public void readRules() {
        //TODO read the ruleset (only implement in case of an universal automaton)

        //END TODO
    }

    boolean newCellValueByA(int k) {
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the rules of A
        if (currentGeneration[k] == true) {
                    
        }
        
        

        return false;

        //END TODO
    }

    boolean newCellValueByB(int k) {
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the rules of B
        if (currentGeneration[k] == true) {
            
        }
        

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
        
        int k = currentGeneration.length;



        //END TODO
    }

    public void run() {
        //TODO implement the procedure for the assignment
        readGeneral();
        



        //END TODO
    }

    //TODO more methods if nescessairy

    //END TODO


    public static void main(String[] args) {
        (new Cellulitis()).run();
    }
}