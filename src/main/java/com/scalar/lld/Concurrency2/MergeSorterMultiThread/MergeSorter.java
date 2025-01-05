package com.scalar.lld.Concurrency2.MergeSorterMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService executor;
    MergeSorter(List<Integer> listToSort,ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executor = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n=listToSort.size();
        if(n<=1) return listToSort;
        List<Integer> leftHalf=new ArrayList<>();
        List<Integer> rightHalf=new ArrayList<>();
        for (int i=0;i<n/2;i++) {
            leftHalf.add(listToSort.get(i));
        }
        for (int i=n/2;i<n;i++) {
            rightHalf.add(listToSort.get(i));
        }
        //sort left and right half separately
        MergeSorter leftMergeSorter=new MergeSorter(leftHalf, executor);
        MergeSorter rightMergeSorter=new MergeSorter(rightHalf,executor);
//        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedArrayFuture=executor.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture=executor.submit(rightMergeSorter);

        List<Integer> leftSortedArray=leftSortedArrayFuture.get();
        List<Integer> rightSortedArray=rightSortedArrayFuture.get();

        int i=0,j=0;
        List<Integer> sortedArray=new ArrayList<>();
        while(i<leftSortedArray.size() && j<rightSortedArray.size()) {
            if(leftSortedArray.get(i)<rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j<rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
