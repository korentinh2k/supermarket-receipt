package CyrilMlb.model;

import CyrilMlb.model.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ReceiptItemTest {
	private Product toothbrush = new Product("toothbrush", ProductUnit.Each);
	private double price = 1.0;
	private double totalPrice = 0.9;
	private double quantity = 2.0;
	
	private ReceiptItem receiptItem = new ReceiptItem(toothbrush, quantity, price, totalPrice);
	private ReceiptItem receiptItem2 = new ReceiptItem(toothbrush, quantity, price, totalPrice);
	
	@Test
	public void testReceiptItemGetPrice(){	
        Assertions.assertThat(receiptItem.getPrice()).isEqualTo(price);	
	}
	
	@Test
	public void testReceiptItemGetProduct(){	
        Assertions.assertThat(receiptItem.getProduct()).isEqualTo(toothbrush);	
	}
	
	@Test
	public void testReceiptItemGetQuantity(){	
        Assertions.assertThat(receiptItem.getQuantity()).isEqualTo(quantity);	
	}

	@Test
	public void testReceiptItemGetTotalPrice(){	
        Assertions.assertThat(receiptItem.getTotalPrice()).isEqualTo(totalPrice);	
	}
	
	@Test
	public void testReceiptItemEqualsNULL(){
        Assertions.assertThat(receiptItem.equals(null)).isFalse();
	}
	
	@Test
	public void testReceiptItemEqualsDifferentObject(){
        Assertions.assertThat(receiptItem.equals(toothbrush)).isFalse();
	}

	@Test
	public void testReceiptItemEqualsReceiptItem(){
        Assertions.assertThat(receiptItem.equals(receiptItem)).isTrue();
	}
	
	@Test
	public void testReceiptItemEqualsClone(){
        Assertions.assertThat(receiptItem.equals(receiptItem2)).isTrue();
	}	
	
	@Test
	public void testReceiptItemEqualsDifferentReceiptItem(){	
		Product toothbrush2 = new Product("toothbrush", ProductUnit.Each);

		ReceiptItem notReceiptItem = new ReceiptItem(toothbrush2, quantity, price, totalPrice);
        Assertions.assertThat(receiptItem.equals(notReceiptItem)).isFalse();

		notReceiptItem = new ReceiptItem(toothbrush, quantity + 1.0, price, totalPrice);
        Assertions.assertThat(receiptItem.equals(notReceiptItem)).isFalse();
        
		notReceiptItem = new ReceiptItem(toothbrush, quantity, price + 1.0, totalPrice);
        Assertions.assertThat(receiptItem.equals(notReceiptItem)).isFalse();
        
		notReceiptItem = new ReceiptItem(toothbrush, quantity, price, totalPrice + 1.0);
        Assertions.assertThat(receiptItem.equals(notReceiptItem)).isFalse();
	}
	
	@Test
	public void testReceiptItemHashCode(){		
        Assertions.assertThat(receiptItem.hashCode()).isEqualTo(Objects.hash(toothbrush, price, totalPrice, quantity));
	}
}
