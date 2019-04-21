package com.nar.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;//number of disc
        towerOfHanoi(n, 'A', 'B', 'C');

        //https://www.youtube.com/watch?v=q6RicK1FCUs
        //Logic : Consider there is only 2 disc
        // Move 1 (n-1) disc from A to B using C
        // Move disc move disc 2 from A to C (directly to destination)
        // Move 1 disc from B to C using A

        // For 3 Disc
        // Move 2 (n-1) disc from A to B using C (this will be recursive) //position of from to to is changed
        // Move a disc from A to C
        // Move 2 (n-1) disc from B to C using A (this will be recursive)

        /*When unmber of disc increased eg. 3 then we need to consider top 2 disc as
        single disc and perform same operation as above*/


    }

    static void towerOfHanoi(int n, char from, char to, char aux){
        //We are handling two scenario , when only one disc and when only two disc
        if(n == 1){
            System.out.print( n+" "+ from +"->"+ to +", ");// can print disc number also,
            // but its understood that only top disc needs to be moved
            return;
        }

        // Consider only 2 disc in below scenario
        towerOfHanoi( n-1, from, aux, to);//First we moving to aux
        System.out.print(from +" -> " +to+", ");
        towerOfHanoi(n-1, aux, to, from);// au
    }
}
