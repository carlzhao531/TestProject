package com.tij.innerclass.controller;

public class GreenhouseController extends Controller{
	
	public static void main(String[] args) {
		GreenhouseController gc = new GreenhouseController();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000,eventList));
		if(args.length == 1) {
			gc.addEvent(
					new GreenhouseController.Terminate(new Integer(args[0]))
					);
		}
		gc.run();
	}
	
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			light = true;
		}
		
		public String toString() {return "Light is on!";}
	}
	
	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			light = false;
		}
		
		public String toString() {return "light if off!";}
	}
	
	private boolean water = false;
	
	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			water = true;
		}
		
		public String toString() {return "Greenhouse water is on!";}
	
	}
	
	public class WaterOff extends Event {

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			water = false;
		}
		
		public String toString() {return "Greenhouse water is off!";}
	}
	
	private String thermostat = "Day";
	
	public class ThermostatDay extends Event {

		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			thermostat = "Day";
		}
		
		public String toString() {return "Thermostat on day setting!";}
	}
	
	public class ThermostatNight extends Event {

		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			thermostat = "Night";
		}
		
		public String toString() {return "Thermostat on night setting!";}
	}
	
	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			//adds a new bell to the event list so it will ring again later
			addEvent(new Bell(delayTime));
		}
		
		public String toString() {return "Bing!";}
	}
	
	public class Restart extends Event {
		
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e : eventList) {
				addEvent(e);
			}
		}

		@Override
		void action() {
			for(Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		public String toString() {return "Restarting system!";}
	}
	
	public static class Terminate extends Event {

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		void action() {
			System.exit(0);
		}
		
		public String toString() {
			return "Terminating!";
		}
	}
}
