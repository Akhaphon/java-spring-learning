package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class StockFortuneService implements FortuneService {

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array.
		List<String> stockNameList = new StockFortuneService().readStockFromFile();
		int index = myRandom.nextInt(stockNameList.size());
		String resultStockName = stockNameList.get(index);
		return resultStockName;
	}

	public List<String> readStockFromFile() {

		List<String> stockName = new ArrayList<String>();

		try {
			File file = ResourceUtils.getFile("classpath:./static/stock-name.txt");
			try (Scanner scanner = new Scanner(file)) {
				while (scanner.hasNextLine()) {
					stockName.add(scanner.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return stockName;

	}

}
