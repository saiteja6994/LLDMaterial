package com.scalar.lld.Concurrency2.MergeSorterMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(3,2,1,7,6,5);
        ExecutorService executorService;
        executorService= Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list,executorService);
        Future<List<Integer>> sortedListFuture=executorService.submit(mergeSorter);
        List<Integer> sotedList=sortedListFuture.get();
        System.out.println(sotedList);
    }
}
