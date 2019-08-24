package com.accolite.au;

import java.util.LinkedList;

public class TaxiQueueRunnable implements Runnable {

    private LinkedList<Taxi> taxiQueue;
    private TaxiStand taxiStand;

    public TaxiQueueRunnable(LinkedList<Taxi> tx, TaxiStand lx){
        taxiQueue = tx;
        taxiStand = lx;
    }

    @Override
    public void run() {
        System.out.println("Starting taxiQueue Thread... creating new taxi...\n");
        while(true) {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException ie) {
            	System.out.println("Interruppted Exception Occurred");
            }
            
            Taxi temp = new Taxi(null);
            if(taxiStand.addTaxi(temp))
            	System.out.println("Taxi added to Stand");
            else System.out.println("Taxi added to Queue");
        }
    }
}