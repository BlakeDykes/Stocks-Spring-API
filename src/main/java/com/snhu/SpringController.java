package snhu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SpringController {
	
	/*
	 * Index
	 */
	@RequestMapping("/")
	public String index() {
		return "Hello there!";
	}

	/*
	 * Spring method to create a stock document
	 */
	@RequestMapping(value = "/createStock", method = RequestMethod.POST)
	public ResponseEntity<?> CreateStock(@RequestBody String stock)
	{
		BasicDBObject dbO = ((BasicDBObject) JSON.parse(stock));
		try {
			MongoConnect.coll.insert(dbO);
		}catch(MongoException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		System.out.println("Successful!");
		System.out.println(dbO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/*
	 * Spring method to get a stock document
	 */
	@GetMapping(value = "/getStock/{Ticker}")
	public ResponseEntity<?> GetStock(@PathVariable("Ticker") String ticker)
	{
		DBObject stock = new BasicDBObject("Ticker", ticker);
		try {
			stock = MongoConnect.coll.findOne(stock);
			if(stock == null) {
				System.out.println("Unsuccessful");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}catch(MongoException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Successful!");
		System.out.println(stock);
		return new ResponseEntity<>(HttpStatus.OK);
		}
	
	/*
	 * Spring method to update a stock document
	 */
	@RequestMapping(value = "/updateStock/{Ticker}", method = RequestMethod.PUT)
	public ResponseEntity<?> UpdateStock(@PathVariable("Ticker") String ticker, 
							@RequestBody String jsonStr)
	{
		BasicDBObject q = new BasicDBObject("Ticker", ticker);
		BasicDBObject update = ((BasicDBObject) JSON.parse(jsonStr));
		DBObject result = new BasicDBObject();
		try {
			DBObject found = MongoConnect.coll.findOne(q);
			if(found == null)
			{
				System.out.println("Stock Not Found");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			MongoConnect.coll.update(found, update);
			result = MongoConnect.coll.findOne(update);
		}catch(MongoException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Successful!");
		System.out.println(result);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/*
	 * Spring method to delete a stock document
	 */
	@RequestMapping(value = "/deleteStock/{Ticker}", method = RequestMethod.DELETE)
	public ResponseEntity<?> DeleteStock(@PathVariable("Ticker") String ticker)
	{
		String jResult;
		DBObject dbO = new BasicDBObject("Ticker", ticker);
		try {
			jResult = MongoConnect.coll.findAndRemove(dbO).toString();
		}catch(MongoException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Successful!");
		System.out.println(jResult);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/stockReport", method = RequestMethod.POST)
	public ResponseEntity<?> StockReport(@RequestBody ArrayList<String> tickers)
	{
		ArrayList<DBObject> stocks = new ArrayList<DBObject>();
		
		// Get requested stock documents
		for(int i = 0; i < tickers.size(); i++)
		{
			DBObject q = new BasicDBObject("Ticker",tickers.get(i));
			DBObject found = MongoConnect.coll.findOne(q);
			if(found == null)
			{
				System.out.println(tickers.get(i) + " Not Found");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			stocks.add(found);
		}
		//Print requested stock documents
		for(int i = 0; i < stocks.size(); i++)
			System.out.println(stocks.get(i));
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "industryReport/{Industry}")
	public ResponseEntity<?> IndustryReport(@PathVariable("Industry") String industry)
	{
		DBObject q = new BasicDBObject("Industry", industry);
		DBObject sort = new BasicDBObject();
		sort.put("P/B", -1);
		sort.put("P/S",-1);
		sort.put("PEG", -1);
		
		List<DBObject> stocks = new ArrayList<DBObject>();
		
		try {
			stocks = MongoConnect.coll.find(q).sort(sort).limit(5).toArray();
			if (stocks == null)
			{
				System.out.println("No Stocks Found");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			System.out.println(stocks.size());
		}catch(MongoException e){
			e.printStackTrace();
			System.out.println("Unsuccessful");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		for(int i = 0; i < stocks.size(); i++)
			System.out.println(stocks.get(i));
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	}

