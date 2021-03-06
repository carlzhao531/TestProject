package com.tij.innerclass.controller;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime) {
		this.delayTime = delayTime;
	}
	
	public void start() {
		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	abstract void action();
}
