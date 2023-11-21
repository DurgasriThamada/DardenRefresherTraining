package streams.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAssignments {

	public static void main(String[] args) {
        
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple", 95, 2, "Red"),
                new Fruit("Banana", 105, 1, "Yellow"),
                new Fruit("Orange", 80, 3, "Orange")
        );

        List<News> newsList = Arrays.asList(
                new News(1, "User1", "User2", "Great news!"),
                new News(2, "User3", "User4", "Interesting article."),
                new News(3, "User5", "User6", "Exciting update.")
        );

        List<Transaction> transactions = Arrays.asList(
                new Transaction(new Trader("John", "New York"), 2021, 5000),
                new Transaction(new Trader("Alice", "London"), 2021, 8000),
                new Transaction(new Trader("Bob", "Paris"), 2021, 3000)
        );
        
        List<String> fruitNamesWithCaloriesLessThan100 = fruits.stream()
        														.filter(f->f.getCalories()<100)
        														.sorted(Comparator.comparingInt(f->f.getCalories()))
        														.map(f->f.getName())
        														.collect(Collectors.toList());
        System.out.println("Low calorie fruits "+fruitNamesWithCaloriesLessThan100);														
	
        System.out.println( fruits.stream()
        	.collect(Collectors.groupingBy(f->f.getColor(),
        			Collectors.mapping(f->f.getName(),Collectors.toList()))));
        
        System.out.println(
        		fruits.stream()
        			.filter(f->f.getColor().equals("Red"))
        			.sorted(Comparator.comparingInt(f->f.getPrice()))
        			.collect(Collectors.toList())
        			);
        
        
        System.out.println(
        		newsList.stream()
        			.max(Comparator.comparingInt(news->news.comment.split("\\s+").length))
        			.map(news->news.newsId)
        			.orElse(-1)
        		);
        
        
		}
	}