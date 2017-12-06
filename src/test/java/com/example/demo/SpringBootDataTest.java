package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class SpringBootDataTest {

	@Autowired
    private TestEntityManager entityManager;
	
	/*@Autowired
    private StockRepository stockTestRepository;*/
	
	@Test
	public void savePersisttoDB() throws Exception {
		System.out.println("1 saving stock in SpringBootDataTest");
		Stock stock = new Stock();
		stock.setStockId(5);
		stock.setSymbol("JB");
		stock.setCompanyName("Java Beans");
		stock.setPrice(7.00d);
		
		Stock newStock = this.entityManager.persistAndFlush(stock);
		assertThat(newStock.getSymbol()).isEqualTo("JB");
		assertThat(newStock.getStockId()).isEqualTo(5);
		System.out.println("2 saving stock in SpringBootDataTest");
	}
	/*public void contextLoads() {
	}*/

}
