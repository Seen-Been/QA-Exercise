package test;

import creatures.Amphibian;
import creatures.Animal;
import creatures.LivingBeing;
import creatures.Mammal;
import creatures.Plant;
import creatures.Aquatic;

public class Test
{
	public static void main(String[] args)
	{
		//interface polymorphism
		LivingBeing lb = new LivingBeing();
		Animal an = new Animal();
		//Aquatic aq = new Aquatic(); //<--cannot create object of interface
		Aquatic aq = new Amphibian();
		aq.swim(); //inherits from aquatic
		Mammal ma = new Amphibian();
		ma.walk(); //inherits from mammal

		//class polymorphism
		Animal am = new Amphibian();
		am.breathe(); //inherits from animal
		
		//Super = sub
		LivingBeing lb1 = new Animal();
		lb1.grow(); //inherits from living being
		
		//super = sub(sub)
		LivingBeing lb2 = new Amphibian();
		lb2.grow(); //inherits from living being
		
		
		LivingBeing lb3 = new Plant();
		lb3.grow();
	}
}
