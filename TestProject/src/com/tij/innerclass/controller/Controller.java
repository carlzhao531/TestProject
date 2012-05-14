package com.tij.innerclass.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event e){eventList.add(e);}
	
	public void run() {
		while(eventList.size() > 0) {
			//make a copy so you're not modifying the list
			//while you're selecting the elements in it
			for(Event e : new ArrayList<Event>(eventList)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
