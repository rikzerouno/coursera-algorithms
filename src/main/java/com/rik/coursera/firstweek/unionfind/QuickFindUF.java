package com.rik.coursera.firstweek.unionfind;

/**
 * Quick Find algorithm class representation
 * O(n2) -> it takes N2 array accesses to process
 * a sequence of N union commands on N objects
 */
public class QuickFindUF extends UnionFind{

    public QuickFindUF(int N){
        super(N);
    }

    public boolean connected(int p, int q){
        return objects[p] == objects[q];
    }

    /**
     * Links an integer q with an integer p
     * in the objects array
     * @param p
     * @param q
     */
    public void union(int p, int q){
        int pId = objects[p];
        int qId = objects[q];
        for(int i = 0; i < objects.length; i++){
            if(objects[i] == pId){
                objects[i] = qId;
            }
        }
    }
}
