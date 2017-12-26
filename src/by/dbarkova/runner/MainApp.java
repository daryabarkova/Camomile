package by.dbarkova.runner;

import by.dbarkova.bean.Flower;
import by.dbarkova.logic.BotanicEncyclopedia;
import by.dbarkova.logic.Fortuneteller;

public class MainApp {

	public static void main(String[] args) {
		
		Flower flower = new Flower("Camomile", 10, 1);
		
		//BotanicEncyclopedia botanicEncyclopedia = new BotanicEncyclopedia();
		
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		//flower.grow(25, 3, 5);
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		flower.bloom(30, "Yellow");
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		//flower.wither(2, "Grey", 20, 2);
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		Fortuneteller fortuneteller = new Fortuneteller();
		
		//Flower flowerFortune = new Flower("Camomile", 10, 1);
		//flowerFortune.bloom(30, "Yellow");
		
		//fortuneteller.readLoveFortune(flowerFortune);
		
		fortuneteller.predictionRequest(3, flower);
		

	}

}
