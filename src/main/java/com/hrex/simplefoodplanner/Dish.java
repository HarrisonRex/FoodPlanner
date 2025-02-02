package com.hrex.simplefoodplanner;
import java.util.ArrayList;
import java.util.List;

public class Dish {
	private List<Ingreadient> ingreeds;
	private String name;
		
		
		public Dish(String name){
			this.name = name;
			this.ingreeds = new ArrayList<Ingreadient>();
		}

		public void addIng(Ingreadient ingToAdd){
			//TODO: This requires checks
			this.ingreeds.add(ingToAdd);
		}

		public String getName(){
			return this.name;
		}



	}
