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
    int g;
    String rule;
    
    public void readGeneral() {
        //TODO read the general input (up to the initial configuration)

        rule = sc.next();
        int l = sc.nextInt();
        g = sc.nextInt();
        int h = g;        
        int k = 1; // Counts the cells (skips the first because it's always false

        currentGeneration = new boolean[l+2];
        newGeneration = new boolean [l+2];
        
        for (int i = 0; i<currentGeneration.length; i++) {
            currentGeneration[i] = false;
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
        String start = sc.next();
        if (!start.equals("init_start")) {
            System.exit(0);
        } else {
            while (sc.hasNextInt()) {
                int k = sc.nextInt();
                currentGeneration[k] = true;
            }
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
        if (currentGeneration[k]) {
            if (currentGeneration[k-1] ^ currentGeneration[k+1]) {
                return true;
            } else {
                return false;
            }
        }
            
        if (!currentGeneration[k]) {
            if (!currentGeneration[k-1] && !currentGeneration[k+1]) {
                return false;
            } else {
                return true;
            }
        }
        
        return false;

        //END TODO
    }

    boolean newCellValueByB(int k) {
        // TODO return the value {true, false} of cell number k
        // for the next generation according to the rules of B
        if (currentGeneration[k]) {
            if (!currentGeneration[k+1]) {
                return true;
            } else {
                return false;
            }
        }
            
        if (!currentGeneration[k]) {
            if (currentGeneration[k-1] ^ currentGeneration[k+1]) {
                return true;
            } else {
                return false;
            }
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
        int k = 0;
        int l = currentGeneration.length;
        
        for (int i = 0; i<g; i++) {
            for (int j = 0; j<l; j++) {
                if (currentGeneration[j]) {
                System.out.print("*");
                } else {
                System.out.print(" ");  
                } 
            }
            computeNextGeneration();
            System.out.println("");
            
        }
        


        //END TODO
    }


    public void computeNextGeneration() {
        //TODO compute the nextGeneration and update the currentGeneration.
        
        int k = 1;
        int l = currentGeneration.length;
        l = l - 1;
        
        
        if (rule.equals ("A")) {
            while (k<l) {
            newGeneration[k] = newCellValueByA(k);
            k++;
            }
        } else if (rule.equals("B")) {
            while (k<l) {
            newGeneration[k] = newCellValueByB(k);
            k++;
            }  
        } else {
            System.out.println("Invalid ruleset");
            System.exit(0);
        }

        k = 1;
        
        while (k<(l)) {
            currentGeneration[k] = newGeneration[k];
            k++;
        }



        //END TODO
    }

    public void run() {
        //TODO implement the procedure for the assignment
        readGeneral();
        readInitial();
        draw();
        computeNextGeneration();
        //END TODO
    }

    //TODO more methods if nescessairy

    //END TODO


    public static void main(String[] args) {
        (new Cellulitis()).run();
    }
}