package com.cg.go.dao;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.go.dto.CartDTO;
import com.cg.go.service.CartServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class RemoveFromCartDetailsTest {
@Rule
public VerificationCollector verificationCollector = MockitoJUnit.collector();
@Mock
    private CartDao dao;
@InjectMocks
private CartServiceImpl service;

@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}
@Test
public void getDeleteByOrderIdDetails(){
List<CartDTO> cartList = new ArrayList<CartDTO>();
cartList.add(new CartDTO("u24","p9",3));
cartList.add(new CartDTO("u111","p12",2));
when(dao.findByUserId("u24")).thenReturn(cartList);
//List<OrderProductMapDTO> result = dao.getorderList(null);
assertEquals(2, cartList.size());
}
}